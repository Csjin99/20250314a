import React, { useEffect, useState } from 'react';
import { useForm } from 'react-hook-form';
import { useNavigate } from 'react-router-dom';
import styled from 'styled-components';
import axios from 'axios';

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
  margin-bottom: 20px;
  border: 1px solid #ddd;
  border-radius: 8px;
  font-size: 14px;
`;
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

function MyPage() {
  const { register, handleSubmit, setValue } = useForm();
  const [gender, setGender] = useState('');
  const navigate = useNavigate();

  useEffect(() => {
    const sessionUser = sessionStorage.getItem('user');
    if (sessionUser) {
      const user = JSON.parse(sessionUser);
      setValue('userId', user.userId);
      setValue('userPwd', user.userPwd);
      setValue('userName', user.userName);
      setValue('age', user.age);
      setValue('email', user.email);
      setGender(user.gender);
    }
  }, [setValue]);

  const handleGender = (value) => {
    setGender(value);
    setValue('gender', value);
  };

  const onSubmit = async (data) => {
    data.gender = gender;

    const sessionUser = JSON.parse(sessionStorage.getItem('user'));
    const userId = sessionUser.id;

    try {
      const response = await axios.put(`http://localhost:3001/users/${userId}`, data);
      if (response.status === 200) {
        alert('회원 정보가 성공적으로 수정되었습니다.');
        sessionStorage.setItem('user', JSON.stringify(response.data));
        navigate('/MainHome');
      } else {
        alert('수정에 실패했습니다.');
      }
    } catch (error) {
      console.error(error);
      alert('오류가 발생했습니다.');
    }
  };

  return (
    <Cantainer>
      <LoginBox>
        <Title>회원 가입</Title>
        <Loginfrom>
          <Div>
            <IdInputBox>
              <Input {...register('userId')} placeholder="아이디를 입력해주세요" />
            </IdInputBox>

            <InputBox>
              <Input type="password" {...register('userPwd')} placeholder="비밀번호를 입력해주세요" />
            </InputBox>

            <InputBox>
              <Input type="text" {...register('userName')} placeholder="이름을 입력해주세요" />
            </InputBox>

            <InputBox>
              <Input type="number" {...register('age')} placeholder="나이를 입력해주세요" />
            </InputBox>

            <InputBox>
              <Input type="email" {...register('email')} placeholder="이메일을 입력해주세요" />
            </InputBox>

            <BtnBox>
              <MBtn onClick={() => handleGender('남')} selected={gender === '남'}>
                남
              </MBtn>
              <WBtn onClick={() => handleGender('여')} selected={gender === '여'}>
                여
              </WBtn>
            </BtnBox>
          </Div>
        </Loginfrom>
        <ButtonBox>
          <Btn onClick={handleSubmit(onSubmit)}>수정하기</Btn>
          <HomeBtn onClick={() => navigate('/MainHome')}>뒤로가기</HomeBtn>
        </ButtonBox>
      </LoginBox>
    </Cantainer>
  );
}

export default MyPage;
