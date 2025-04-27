import React from 'react';
import styled from 'styled-components';
import { useParams, useNavigate } from 'react-router-dom';
import NotFound from './NotFound';

const Container = styled.div`
  width: 500px;
  height: 300px;
  background: #aabdfc;
  padding: 10px;
  display: flex;
  justify-content: center;
  align-items: center;
`;
const User = styled.div`
  width: 100%;
  height: 80%;
  margin-right: 12px;
`;
const UserName = styled.h3`
  font-size: 30px;
  margin: 0 0 4px 0;
  line-height: 1.4;
  color: black;
  font-family: "Nanum Pen Script", cursive;
  font-weight: 400;
  font-style: normal;
`;
const UserAge = styled.p`
  font-size: 25px;
  color: black;
  margin: 0 0 4px 0;
`;
const UserOnline = styled.p`
  color: #1b1b1b;
  margin-top: 4px;
  font-weight: 400;
  background: #31e9f7;
  font-family: "Gugi", sans-serif;
  font-style: normal;
`;
const UserOffline = styled.p`
  color: #606060;
  margin-top: 4px;
  font-weight: 400;
  background: #f83862;
  font-family: "Gugi", sans-serif;
  font-style: normal;
`;

const Userbtn = styled.button`
  width: 50%;
  margin-top: 4px;
  background:rgb(209, 252, 56);
`

const UserDetail = ({ userList, setUserList }) => {
  const { id } = useParams();
  const navigate = useNavigate()

  const user = userList.find(user => user.id === id);

  if (!user) {
    return <NotFound/>;
  }

  const handleDelete = () => {
    const updatedUserList = userList.filter(user => user.id !== id);
    setUserList(updatedUserList);
    navigate('/');
  };
  

  return (
    <>
    <Container>
      <User>
        <UserName>이름: {user.name}</UserName>
        <UserAge>{user.id}</UserAge>
        <UserAge>나이: {user.age}</UserAge>
        <UserAge>이메일: {user.email}</UserAge>
        {user.isOnline === "on" ? (
          <UserOnline>🟢 온라인 상태입니다.</UserOnline>
        ) : (
          <UserOffline>🔴 오프라인 상태입니다.</UserOffline>
        )}
      </User>
    </Container>
    <div>
      <Userbtn type='button' onClick={() => navigate('/')}>뒤로 이동</Userbtn>
      <Userbtn type='button' onClick={handleDelete}>유저 삭제</Userbtn>
    </div>
  </>
  );
};

export default UserDetail;