import React, { useState } from 'react';
import styled from 'styled-components';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import { useForm } from 'react-hook-form';
import { yupResolver } from '@hookform/resolvers/yup';
import * as yup from 'yup';

const Cantainer = styled.div`
  display: block;
  justify-content: center;
  align-items: center;
`;
const LoginBox = styled.div`
  height: 650px;
  width: 500px;
  background: #ad8ce0;
  border-radius: 10px;
  box-shadow: 0px 2px 2px 2px rgb(0 0 0 / 0.2);
`;
const Title = styled.h2`
  height: 10%;
  margin: 0;
  padding: 0;
  padding-top: 20px;
  display: flex;
  align-items: center;
  justify-content: center;
  color: white;
`;
const Loginfrom = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  height: 75%;
`;
const InputBox = styled.div`
  gap: 10px;
  margin-bottom: 10px;
  display: flex;
`;
const Input = styled.input`
  width: 100%;
  padding: 14px;
  margin-bottom: 5px;
  border: 1px solid #ddd;
  border-radius: 8px;
  font-size: 14px;
`

const Error = styled.p`
  font-size: 14px;
  color: #ff0000;
  padding: 0;
  padding-bottom: 10px;
  margin: 0;
  font-weight: bold;
`
const Div = styled.div`
  width: 90%;
`;
const IdBtn = styled.button`
  height: 45px;
  width: 140px;
`;
const IdInputBox = styled.div`
  gap: 10px;
  margin-bottom: 10px;
  width: 100%;
  display: flex;
`;
const BtnBox = styled.div`
  display: flex;
  gap: 15px;
  align-items: center;
  justify-content: center;
`;
const ButtonBox = styled.div`
  height: 8%;
`;
const Btn = styled.button`
  width: 30%;
  background: #b8ff7b;
  font-weight: bold;
`;
const HomeBtn = styled.button`
  background: #ff6767;
  height: 45px;
  width: 140px;
  margin-left: 15px;
  font-weight: bold;
`;

const MBtn = styled.button`
  background-color: ${(props) => (props.selected ? '#007BFF' : 'white')};
  color: ${(props) => (props.selected ? '#fff' : '#000')};
  border: 1px solid #ccc;
  padding: 8px 16px;
  border-radius: 4px;
  cursor: pointer;
`;

const WBtn = styled.button`
  background-color: ${(props) => (props.selected ? '#FF69B4' : 'white')};
  color: ${(props) => (props.selected ? '#fff' : '#000')};
  border: 1px solid #ccc;
  padding: 8px 16px;
  border-radius: 4px;
  cursor: pointer;
`;

const schema = yup.object().shape({
  user_id: yup
    .string()
    .required('아이디를 입력하지않았습니다.')
    .test('checkDuplication', '이미 사용 중인 아이디입니다.', async (value) => {
      if (!value) return false;
      const res = await axios.get(`http://localhost:8888/api/members?userId=${value}`);
      return res.data === false;
    }),
  user_pwd: yup.string().required('비밀번호를 입력해주세요.'),
  user_name: yup.string().required('이름을 입력해주세요.'),
  age: yup.number().typeError('숫자만 입력해주세요'),
});

function UserAdd() {
  const navigate = useNavigate();
  const [gender, setGender] = useState(null);

   const {
    register,
    handleSubmit,
    formState: { errors },
    trigger,
  } = useForm({
    resolver: yupResolver(schema),
  });

  const onSubmit = async (data) => {
    try {
      const isUserIdValid = await trigger('user_id');
      if (!isUserIdValid) {
        alert(errors.user_id?.message || '아이디 중복 검사에 실패했습니다.');
        return;
      }

      await axios.post('http://localhost:8888/api/members', { ...data, gender });
      alert('회원가입이 완료되었습니다.');
      navigate('/');
    } catch (err) {
      console.error(err);
      alert('회원가입 중 오류가 발생했습니다. 다시 시도해주세요.');
    }
  };

  const handleGender = (selectedGender) => {
    setGender((prev) => (prev === selectedGender ? null : selectedGender));
  };

  const handleIdCheck = async () => {
    const isValid = await trigger('user_id');
    if (isValid) {
      alert('사용가능한 아이디입니다.');
    } else {
      alert(errors.user_id?.message || '아이디를 다시 확인해주세요.');
    }
  };

  return (
    <Cantainer>
      <LoginBox>
        <Title>회원 가입</Title>
        <Loginfrom>
          <Div>
            <IdInputBox>
              <Input {...register('user_id')} placeholder="아이디를 입력해주세요" />
              <IdBtn onClick={handleIdCheck}>중복확인</IdBtn>
            </IdInputBox>
            {errors.user_id && <Error>{errors.user_id.message}</Error>}
            <InputBox>
              <Input type="password" {...register('user_pwd')} placeholder="비밀번호를 입력해주세요" />
            </InputBox>
            {errors.user_pwd && <Error>{errors.user_pwd.message}</Error>}
            <InputBox>
              <Input type="text" {...register('user_name')} placeholder="이름을 입력해주세요" />
            </InputBox>
            {errors.user_name && <Error>{errors.user_name.message}</Error>}
            <InputBox>
              <Input type="number" {...register('age')} placeholder="나이를 입력해주세요" />
            </InputBox>
            <InputBox>
              <Input type="email" {...register('email')} placeholder="이메일을 입력해주세요" />
            </InputBox>
            <BtnBox>
              <MBtn onClick={() => handleGender('M')} selected={gender === 'M'}>
                남
              </MBtn>
              <WBtn onClick={() => handleGender('F')} selected={gender === 'F'}>
                여
              </WBtn>
            </BtnBox>
          </Div>
        </Loginfrom>
        <ButtonBox>
          <Btn onClick={handleSubmit(onSubmit)}>완료</Btn>
          <HomeBtn onClick={() => navigate('/')}>취소</HomeBtn>
        </ButtonBox>
      </LoginBox>
    </Cantainer>
  );
}

export default UserAdd;
