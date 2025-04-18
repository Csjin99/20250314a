import React from 'react'
import styled from 'styled-components'
import ProfileCard from './ProfileCard'

const Container = styled.div`
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-start;
  gap: 16px;
`

const ProfileList = ({userCardList}) => {
  return (
    <Container>
        {userCardList.map((user)=><ProfileCard key={user.name} users={user}/>)}
    </Container>
  )
}

export default ProfileList