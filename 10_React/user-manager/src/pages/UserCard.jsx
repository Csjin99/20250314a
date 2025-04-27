import React from 'react'
import styled from 'styled-components'
import { useNavigate } from "react-router-dom";
<style>
    @import url('https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap');
    @import url('https://fonts.googleapis.com/css2?family=Gugi&family=Nanum+Pen+Script&display=swap');
</style>

const Container = styled.div`
    width: 500px;
    height: 300px;
    background: #aabdfc;
    padding: 10px;
    display:flex;
    justify-content: center;
    align-items:center;
`
const User = styled.div`
    width: 100%;
    height: 30%;
    margin-right: 12px;
`

const UserName = styled.h3`
  font-size: 30px;
  margin: 0 0 4px 0;
  line-height: 1.4;
  color: black;
  font-family: "Nanum Pen Script", cursive;
  font-weight: 400;
  font-style: normal;

`

const UserAge = styled.p`
  font-size: 25px;
  color: black;
  margin: 0 0 4px 0;
`
const UserOnline = styled.p`
  color: #1b1b1b;
  margin-top: 4px;
  font-weight: 400;
  background: #31e9f7;
  font-family: "Gugi", sans-serif;
  font-style: normal;
`

const UserOffline = styled.p`
  color: #606060;
  margin-top: 4px;
  font-weight: 400;
  background: #f83862;
  font-family: "Gugi", sans-serif;
  font-style: normal;
`


const UserCard = ({users}) => {

    const navigate = useNavigate();

    return (
        <Container onClick={() => navigate(`/user/${users.id}`)}>
            <User>
                <UserName>이름: {users.name}</UserName>
                <UserAge>나이: {users.age}</UserAge>
                {users.isOnline === "on" ? (
                    <UserOnline>🟢 온라인 상태입니다.</UserOnline>
                ) : (
                    <UserOffline>🔴 오프라인 상태입니다.</UserOffline>
                )}
            </User>
        </Container>
    );
}

export default UserCard