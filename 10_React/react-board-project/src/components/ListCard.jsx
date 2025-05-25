import React, { useEffect, useState } from 'react';
import styled from 'styled-components';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const MainBox = styled.div`
  width: 300px;
  height: 300px;
  background: #ad8ce0;
  border-radius: 10px;
  box-shadow: 0px 2px 2px 2px rgb(0 0 0 / 0.2);
`;
const Boxing = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  height: 95%;
`;

const Div = styled.div`
  width: 90%;
  font-size: 20px;
`;

function ListCard({ userId, search }) {
  const [listData, setListData] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    if (userId) {
      axios
        .get(`http://localhost:8888/api/restaurants/user/${userId}`)
        .then((res) => {
          setListData(res.data);
        })
        .catch((err) => {
          console.error('List 가져오기 실패:', err);
        });
    }
  }, [userId]);

  const filteredData = listData.filter(
    (item) =>
      item.main_food.toLowerCase().includes(search.toLowerCase()) ||
      item.side_food.toLowerCase().includes(search.toLowerCase())
  );

  return (
    <>
      {filteredData.length === 0 ? (
        <p>등록된 식당이 없습니다.</p>
      ) : (
        filteredData.map((item, index) => (
          <MainBox key={index} onClick={() => navigate(`/MainHome/${item.restaurant_no}`)}>
            <Boxing>
              <Div>
                <p>
                  <strong>식당명:</strong> {item.restaurant_name}
                </p>
                <p>
                  <strong>위치:</strong> {item.location}
                </p>
                <p>
                  <strong>메인 메뉴:</strong> {item.main_food}
                </p>
              </Div>
            </Boxing>
          </MainBox>
        ))
      )}
    </>
  );
}

export default ListCard;
