import React, { useState } from 'react';
import styled from 'styled-components';
import { MdLogin } from 'react-icons/md';
import { FaUserPlus } from 'react-icons/fa';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import { useForm } from 'react-hook-form';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import ClipLoader from 'react-spinners/ClipLoader';

const Cantainer = styled.div`
  display: block;
  justify-content: center;
  align-items: center;
`;
const LoginBox = styled.div`
  height: 300px;
  width: 500px;
  background: ${(props) => (props.theme === 'dark' ? '#333' : '#ad8ce0')};
  border-radius: 10px;
  box-shadow: 4px 4px 10px 2px rgb(0 0 0 / 0.4);
`;
const Loginfrom = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  height: 85%;
`;

const LoginInput = styled.div`
  gap: 10px;
  margin-bottom: 0px;
  width: 100%;
`;

const ButtonBox = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 20px;
  margin-top: 10px;
`;

const Btn = styled.button`
  width: 120px;
  background: #b8ff7b;
  padding: 10px;
  border-radius: 8px;
  border: none;
  cursor: pointer;
`;

const LBtn = styled.button`
  width: 120px;
  background: #ffffff;
  padding: 10px;
  border-radius: 8px;
  border: none;
  cursor: pointer;
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 5px;
`;
const Input = styled.input`
  width: 90%;
  padding: 14px;
  margin-bottom: 20px;
  border: 1px solid #ddd;
  border-radius: 8px;
  font-size: 14px;
  background: #fff;
`;
const Title = styled.h2`
  height: 15%;
  margin: 0;
  padding: 0;
  padding-top: 20px;
  display: flex;
  align-items: center;
  justify-content: center;
  color: #fff;
`;
const Div = styled.div`
  width: 90%;
`;

function LoginHome() {
  const navigate = useNavigate();
  const { register, handleSubmit } = useForm();
  const [loading, setLoading] = useState(false);

  const onSubmit = async (data) => {
    if (!data.userId || !data.userPwd) {
      toast.warning('아이디와 비밀번호는 필수입니다.');
      return;
    }

    try {
      setLoading(true);
      const response = await axios.get('http://localhost:3001/users', {
        params: {
          userId: data.userId,
          userPwd: data.userPwd,
        },
      });

      if (response.data.length > 0) {
        const user = response.data[0];
        sessionStorage.setItem('user', JSON.stringify(user));
        toast.success('로그인 성공!');
        setTimeout(() => {
          navigate('/MainHome');
        }, 1000);
      } else {
        toast.error('아이디 또는 비밀번호가 틀렸습니다.');
      }
    } catch (err) {
      console.error(err);
      toast.error('로그인 중 오류가 발생했습니다.');
    } finally {
      setLoading(false);
    }
  };

  return (
    <Cantainer>
      <ToastContainer position="top-right" autoClose={2000} />
      <LoginBox>
        <Title>나만의 비밀 맛집리스트에 어서와!!</Title>
        <Loginfrom>
          <Div>
            <form onSubmit={handleSubmit(onSubmit)}>
              <LoginInput>
                <Input type="text" placeholder="아이디를 입력해주세요" {...register('userId')} />
              </LoginInput>
              <LoginInput>
                <Input type="password" placeholder="비밀번호를 입력해주세요" {...register('userPwd')} />
              </LoginInput>
              <ButtonBox>
                <LBtn type="submit" disabled={loading}>
                  {loading ? (
                    <ClipLoader size={16} color="#000" />
                  ) : (
                    <>
                      <MdLogin /> 로그인
                    </>
                  )}
                </LBtn>
                <Btn type="button" onClick={() => navigate('/SignUp')}>
                  <FaUserPlus /> 회원가입
                </Btn>
              </ButtonBox>
            </form>
          </Div>
        </Loginfrom>
      </LoginBox>
    </Cantainer>
  );
}

export default LoginHome;
