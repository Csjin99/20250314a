import './App.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import LoginHome from './pages/LoginHome'
import UserAdd from './pages/UserAdd'
import GlobalStyle from './GlobalStyle';

function App() {

  return (
    <>
      <BrowserRouter>
        {/* <GlobalStyle /> */}
        <Routes>
          <Route path="/" element={<LoginHome />}/>
          <Route path="/SignUp" element={<UserAdd/>}/>
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
