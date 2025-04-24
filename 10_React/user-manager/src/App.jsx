import { BrowserRouter, Link, Route, Routes } from 'react-router-dom'
import UserList from './pages/UserList'
import NotFound from './pages/NotFound'
import './App.css'


const userList=[{
  name: '최성진',
  age: 20,
  isOnline: 'off',
},{
  name: '이지은',
  age: 31,
  isOnline: 'on',
},{
  name: '최강록',
  age: 35,
  isOnline: 'off',
},{
  name: '급식대가',
  age: 48,
  isOnline: 'on',
}]

function App() {

  return (
    <>
      <BrowserRouter>
        <nav style={{marginBottom: 20}}>
          {/* Link : a태그와 동일한 역할을 하지만 react-router-dom을 활용해 spa방식으로 자연스럽게 화면전횐 */}
          <Link to="/" style={{marginRight: 12}}>유저목록보기</Link>
          <Link to="/about" style={{marginRight: 12}}>소개</Link>
          <Link to="/profile/최지원">프로필</Link>
        </nav>
        <Routes>
          <Route path='/' element ={<UserList usercardList = {userList}/>}/>
          <Route path='*' element={<NotFound />}/>
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
