import React, { useEffect, useState } from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import axios from 'axios';
import styled from 'styled-components';

const MainBox = styled.div`
  width: 300px;
  height: 400px;
  background: #ad8ce0;
  border-radius: 10px;
  box-shadow: 0px 2px 2px 2px rgb(0 0 0 / 0.2);
`;
const Boxing = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  height: 85%;
`;

const Div = styled.div`
  width: 90%;
`;
const ButtonBox = styled.div`
  height: 10%;
`;
const Btn = styled.button`
  width: 40%;
  background: #b8ff7b;
  font-weight: bold;
`;
const HomeBtn = styled.button`
  background: #ff6767;
  width: 40%;
  margin-left: 15px;
  font-weight: bold;
`;

function ListDetail() {
  const { restaurant } = useParams();
  const [list, setList] = useState(null);
  const navigate = useNavigate();

  useEffect(() => {
    if (restaurant) {
      const encodedRestaurant = encodeURIComponent(restaurant);
      axios
        .get(`http://localhost:3001/List?restaurant=${encodedRestaurant}`)
        .then((res) => {
          if (res.data.length > 0) {
            console.log('불러온 식당 데이터:', res.data[0]);
            setList(res.data[0]);
          } else {
            alert('해당 식당을 찾을 수 없습니다.');
          }
        })
        .catch((err) => {
          console.error('식당 상세 정보 조회 실패:', err);
        });
    }
  }, [restaurant]);

  const handleDelete = () => {
    if (window.confirm('정말 삭제하시겠습니까?')) {
      axios
        .delete(`http://localhost:3001/List/${list.id}`)
        .then(() => {
          alert('삭제되었습니다.');
          navigate('/MainHome');
        })
        .catch((err) => {
          console.error('삭제 실패:', err);
          alert('삭제에 실패했습니다.');
        });
    }
  };

  if (!list) return <p>식당 정보를 불러오는 중입니다...</p>;

  return (
    <MainBox style={{ padding: '20px' }}>
      <Boxing>
        <Div>
          <h2>{list.restaurant}</h2>
          <p>
            <strong>위치:</strong> {list.location}
          </p>
          <p>
            <strong>메인 메뉴:</strong> {list.mainFood} {list.mainPrice}원
          </p>
          <p>
            <strong>사이드 메뉴:</strong> {list.sideFood} {list.sidePrice}원
          </p>
        </Div>
      </Boxing>
      <ButtonBox>
        <Btn onClick={() => navigate('/MainHome')}>홈으로</Btn>
        <HomeBtn onClick={handleDelete}>삭제하기</HomeBtn>
      </ButtonBox>
    </MainBox>
  );
}

export default ListDetail;
