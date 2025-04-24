import React from 'react'
import styled from 'styled-components'
import UserCard from './UserCard'

const Container = styled.div`
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-start;
  gap: 16px;
`

const UserList = ({usercardList}) => {
  return (
    <Container>
        {usercardList.map((user)=><UserCard key={user.name} users={user}/>)}
    </Container>
  )
}

export default UserList