import React, { useState } from 'react';
import styled from 'styled-components';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';


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
    justify-content: center;
    align-items: center;
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

function ListAdd() {
    const navigate = useNavigate();
    const sessionUser = JSON.parse(sessionStorage.getItem('user'));

    const [restaurant, setRestaurant] = useState('');
    const [location, setLocation] = useState('');
    const [mainFood, setMainFood] = useState('');
    const [mainPrice, setMainPrice] = useState('');
    const [sideFood, setSideFood] = useState('');
    const [sidePrice, setSidePrice] = useState('');
  
    const handleSubmit = () => {
      if (!restaurant || !location || !mainFood) {
        alert("(식당명, 위치, 메인메뉴)을 입력해주세요.");
        return;
      }
  
      const newData = {
        userId: sessionUser.userId,
        restaurant,
        location,
        mainFood,
        mainPrice,
        sideFood,
        sidePrice
      };
  
      axios.post('http://localhost:3001/List', newData)
        .then(() => {
          alert("맛집이 추가되었습니다!");
          navigate('/Mainhome');
        })
        .catch(err => {
          console.error("추가 실패:", err);
          alert("등록 중 오류가 발생했습니다.");
        });
    };
  
    return (
      <Cantainer>
        <LoginBox>
          <Title>맛집 등록</Title>
          <Loginfrom>
            <Div>
              <InputBox>
                <Input
                  type="text"
                  placeholder="가게 이름을 입력해주세요"
                  value={restaurant}
                  onChange={(e) => setRestaurant(e.target.value)}
                />
              </InputBox>
  
              <InputBox>
                <Input
                  type="text"
                  placeholder="위치를 입력해주세요"
                  value={location}
                  onChange={(e) => setLocation(e.target.value)}
                />
              </InputBox>
  
              <InputBox>
                <Input
                  type="text"
                  placeholder="메인 메뉴를 입력해주세요"
                  value={mainFood}
                  onChange={(e) => setMainFood(e.target.value)}
                />
                <Input
                  type="number"
                  placeholder="가격을 입력해주세요"
                  value={mainPrice}
                  onChange={(e) => setMainPrice(e.target.value)}
                />
              </InputBox>
  
              <InputBox>
                <Input
                  type="text"
                  placeholder="사이드 메뉴를 입력해주세요"
                  value={sideFood}
                  onChange={(e) => setSideFood(e.target.value)}
                />
                <Input
                  type="number"
                  placeholder="가격을 입력해주세요"
                  value={sidePrice}
                  onChange={(e) => setSidePrice(e.target.value)}
                />
              </InputBox>
            </Div>
          </Loginfrom>
          <ButtonBox>
            <Btn onClick={handleSubmit}>완료</Btn>
            <HomeBtn onClick={() => navigate('/Mainhome')}>취소</HomeBtn>
          </ButtonBox>
        </LoginBox>
      </Cantainer>
    );
  }
  
export default ListAdd;
