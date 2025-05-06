import React, { useEffect, useState } from 'react';
import styled from 'styled-components';
import { useNavigate } from 'react-router-dom';
import { IoLogOut } from 'react-icons/io5';
import ListCard from '../components/ListCard';

const OutBtn = styled.button`
  position: fixed;
  top: 80px;
  right: 150px;
  background: #ff6a6a;
`;
const MyBtn = styled.button`
  position: fixed;
  top: 80px;
  right: 20px;
  background: #afffa5;
`;
const Container = styled.div`
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 20px;
`;
const Header = styled.div`
  display: flex;
  align-items: center;
  justify-content: right;
  gap: 5px;
  margin-bottom: 10px;
`;
const ManuSearch = styled.input`
  width: 300px;
  padding: 14px;
  border: 1px solid #ddd;
  border-radius: 8px;
  font-size: 14px;
`;

const SerchBtn = styled.button`
  background: rgb(94, 162, 250);
`;

const AddRestaurant = styled.button`
  background: rgb(240, 250, 94);
`;

function MainHome() {
  const [user, setUser] = useState(null);
  const navigate = useNavigate();
  const [searchInput, setSearchInput] = useState('');
  const [search, setSearch] = useState('');

  useEffect(() => {
    const sessionUser = sessionStorage.getItem('user');
    if (sessionUser) {
      setUser(JSON.parse(sessionUser));
    }
  }, []);

  const handleLogout = () => {
    sessionStorage.removeItem('user');
    navigate('/');
  };

  const handleSearch = () => {
    setSearch(searchInput);
  };

  if (!user) return <p>로그인 후 이용해주시기 바랍니다.</p>;

  return (
    <>
      <OutBtn onClick={handleLogout}>
        {' '}
        <IoLogOut />
        로그아웃
      </OutBtn>
      <MyBtn onClick={() => navigate('/MyPage')}>마이페이지</MyBtn>
      <h2>나만의 맛집들!</h2>
      <Header>
        <ManuSearch
          type="text"
          placeholder="메인메뉴 or 사이드메뉴 검색"
          value={searchInput}
          onChange={(e) => setSearchInput(e.target.value)}
        />
        <SerchBtn onClick={handleSearch}>검색하기</SerchBtn>
        <AddRestaurant onClick={() => navigate('/Mainhome/restaurantAdd')}>맛집추가</AddRestaurant>
      </Header>
      <Container>
        <ListCard userId={user.userId} search={search} />
      </Container>
    </>
  );
}

export default MainHome;
