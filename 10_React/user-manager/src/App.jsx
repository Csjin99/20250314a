import { BrowserRouter, Link, Route, Routes, useLocation } from 'react-router-dom'
import { useState } from 'react'
import UserList from './pages/UserList'
import NotFound from './pages/NotFound'
import UserRegistration from './pages/UserRegistration'
import './App.css'

function App() {
  const [userList, setUserList] = useState([
    { name: '최성진', id: 'user01', age: 20, email: 'user01@naver.com', isOnline: 'off' },
    { name: '이지은', id: 'user02', age: 31, email: 'user02@naver.com', isOnline: 'on' },
    { name: '최강록', id: 'user03', age: 35, email: 'user03@naver.com', isOnline: 'off' },
    { name: '급식대가', id: 'user04', age: 48, email: 'user04@naver.com', isOnline: 'on' },
  ])

  const addUser = (newUser) => {
    setUserList(prev => [...prev, newUser])
  }

  return (
    <BrowserRouter>
      <LocationComponent userList={userList} addUser={addUser} />
    </BrowserRouter>
  )
}

function LocationComponent({ userList, addUser }) {
  const location = useLocation()

  return (
    <>
      <h1>유저 목록</h1>
      {location.pathname === '/' && (
        <nav style={{ marginBottom: 20 }}>
          <Link to="/user" style={{ marginRight: 12 }}>유저 추가하기</Link>
        </nav>
      )}

      <Routes>
        <Route path="/" element={<UserList usercardList={userList} />} />
        <Route path="/user" element={<UserRegistration addUser={addUser} />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </>
  )
}

export default App