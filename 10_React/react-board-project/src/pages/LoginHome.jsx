import React from 'react'
import styled from 'styled-components'
import { MdLogin } from "react-icons/md";
import { FaUserPlus } from "react-icons/fa";
import { useNavigate } from 'react-router-dom';

const Cantainer = styled.div`
    display: block;
    justify-content: center;
    align-items: center;
`
const LoginBox = styled.div`
    height: 400px;
    width: 500px;
    background: #ad8ce0;
    border-radius: 10px;
    box-shadow: 4px 4px 10px 2px rgb(0 0 0 / 0.4);
    
`
const Loginfrom = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    height: 55%;
`

const LoginInput = styled.div`
    gap: 10px;
    margin-bottom: 0px;
    width: 100%;
`

const ButtonBox = styled.div`
    height: 10%;
`

const Btn = styled.button`
    width: 30%;
    background: #b8ff7b;
    margin-left: 25px;
`
const LBtn = styled.button`
    width: 30%;
`
const Input = styled.input`
    width: 90%;
    padding: 14px;
    margin-bottom: 20px;
    border: 1px solid #ddd;
    border-radius: 8px;
    font-size: 14px;
    background: #fff;
`
const Title = styled.h2`
    height: 15%;
    margin: 0;
    padding: 0;
    padding-top: 20px;
    display: flex;
    align-items: center;
    justify-content:center;
    color: #fff;
`
const Div = styled.div`
    width: 90%;
`

function LoginHome(){
    const navigate = useNavigate();

  return (
    <Cantainer>  
        <LoginBox>
            <Title>나만의 비밀 맛집리스트에 어서와!!</Title>
            <Loginfrom>
                <Div>
                    <LoginInput>
                        <Input type="text" placeholder='아이디를 입력해주세요'/>
                    </LoginInput>
                    <LoginInput>
                        <Input type="password" placeholder='비밀번호를 입력해주세요'/>
                    </LoginInput>
                </Div>
                
            </Loginfrom>
            <ButtonBox>
                <LBtn><MdLogin /> 로그인</LBtn>
                <Btn onClick={() => navigate("/SignUp")}><FaUserPlus /> 회원가입</Btn>
            </ButtonBox>
        </LoginBox>
        
    </Cantainer>
    
  )
}

export default LoginHome