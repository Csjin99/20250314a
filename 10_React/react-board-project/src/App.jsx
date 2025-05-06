import './App.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import LoginHome from './pages/LoginHome';
import UserAdd from './pages/UserAdd';
import GlobalStyle from './GlobalStyle';
import { ThemeProvider } from 'styled-components';
import { lightTheme, darkTheme } from './themes';
import styled from 'styled-components';
import { useState } from 'react';
import Change from './components/Change';
import MainHome from './pages/MainHome';
import NotFound from './pages/NotFound';
import MyPage from './pages/MyPage';
import ListDetail from './pages/ListDetail';
import ListAdd from './pages/ListAdd';

function App() {
  const [isDark, setIsDark] = useState(false);

  const toggleTheme = () => setIsDark((prev) => !prev);

  return (
    <ThemeProvider theme={isDark ? darkTheme : lightTheme}>
      <GlobalStyle />
      <BrowserRouter>
        <Header>
          <Change onToggleTheme={toggleTheme} />
        </Header>
        <Routes>
          <Route path="/" element={<LoginHome />} />
          <Route path="/Signup" element={<UserAdd />} />
          <Route path="/Mainhome" element={<MainHome />} />
          <Route path="*" element={<NotFound />} />
          <Route path="/Mypage" element={<MyPage />} />
          <Route path="/Mainhome/:restaurant" element={<ListDetail />} />
          <Route path="/Mainhome/restaurantAdd" element={<ListAdd />} />
        </Routes>
      </BrowserRouter>
    </ThemeProvider>
  );
}

export default App;

// 오른쪽 상단 고정 테마 토글 위치
const Header = styled.div`
  position: fixed;
  top: 20px;
  right: 20px;
  z-index: 999;
`;
