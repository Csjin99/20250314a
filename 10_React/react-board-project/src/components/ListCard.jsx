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

function ListCard({ search }) {
  const [listData, setListData] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    const sessionUser = sessionStorage.getItem('user');
    if (sessionUser) {
      const { userId } = JSON.parse(sessionUser);
      axios
        .get(`http://localhost:3001/List?userId=${userId}`)
        .then((res) => {
          setListData(res.data);
        })
        .catch((err) => {
          console.error('List 가져오기 실패:', err);
        });
    }
  }, []);

  const filteredData = listData.filter((item) => item.mainFood.includes(search) || item.sideFood.includes(search));

  return (
    <>
      {filteredData.length === 0 ? (
        <p>등록된 식당이 없습니다.</p>
      ) : (
        filteredData.map((item, index) => (
          <MainBox key={index} onClick={() => navigate(`/MainHome/${item.restaurant}`)}>
            <Boxing>
              <Div>
                <p>
                  <strong>식당명:</strong> {item.restaurant}
                </p>
                <p>
                  <strong>위치:</strong> {item.location}
                </p>
                <p>
                  <strong>메인 메뉴:</strong> {item.mainFood}
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
