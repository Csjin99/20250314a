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
    height: 650px;
    width: 500px;
    background: #ad8ce0;
    border-radius: 10px;
    box-shadow: 0px 2px 2px 2px rgb(0 0 0 / 0.2);
    
`
const Title = styled.h2`
    height: 10%;
    margin: 0;
    padding: 0;
    padding-top: 20px;
    display: flex;
    align-items: center;
    justify-content:center;
    color: white;
`

const Loginfrom = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    height: 75%;
`

const InputBox = styled.div`
    gap: 10px;
    margin-bottom: 10px;
    display: flex;
`




const Input = styled.input`
    width: 100%;
    padding: 14px;
    margin-bottom: 20px;
    border: 1px solid #ddd;
    border-radius: 8px;
    font-size: 14px;
`

const Div = styled.div`
    width: 90%;
`
const IdBtn = styled.button`
    height: 45px;
    width: 140px;
`
const IdInputBox = styled.div`
    gap: 10px;
    margin-bottom: 10px;
    width: 100%;
    display: flex;
`

const BtnBox = styled.div`
    display: flex;
    gap: 15px;
    align-items: center;
    justify-content: center;
`

//맨 밑에 버튼

const ButtonBox = styled.div`
    height: 8%;
`

const Btn = styled.button`
    width: 30%;
    background: #b8ff7b;
    font-weight: bold;
`

const HomeBtn = styled.button`
    background: #ff6767;
    height: 45px;
    width: 140px;
    margin-left: 15px;
    font-weight: bold;
`

const MBtn = styled.button`
    background-color: white;
`

const WBtn = styled.button`
    background-color: white;
`

function UserAdd(){
    const navigate = useNavigate();

    const hendleMen = () => {};

    return (
        <Cantainer>  
            <LoginBox>
                <Title>회원 가입</Title>
                <Loginfrom>
                    <Div>
                        <IdInputBox>
                            <Input type="text" placeholder='아이디를 입력해주세요' required/> <IdBtn>중복확인</IdBtn>
                        </IdInputBox>
                        <InputBox>
                            <Input type="password" placeholder='비밀번호를 입력해주세요' required/>
                        </InputBox>
                        <InputBox>
                            <Input type="text" placeholder='이름을 입력해주세요'/>
                        </InputBox>
                        <InputBox>
                            <Input type="number" placeholder='나이를 입력해주세요'/>
                        </InputBox>
                        <InputBox>
                            <Input type="email" placeholder='이메일을 입력해주세요' required/>
                        </InputBox>
                        <BtnBox>
                            <MBtn onClick={hendleMen}>남</MBtn>
                            <WBtn>여</WBtn>
                        </BtnBox>
                    </Div>
                </Loginfrom>
                <ButtonBox>
                    <Btn>완료</Btn>
                    <HomeBtn onClick={()=> navigate("/")}>취소</HomeBtn>
                </ButtonBox>
            </LoginBox>
            
        </Cantainer>
        
    )
}

export default UserAdd