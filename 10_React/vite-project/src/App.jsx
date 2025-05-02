// import { useState } from 'react';
import './App.css';
// import Hello from './components/Hello';
// import Heading from './components/Heading';
// import VideoList from './components/VideoList';
// import LifecycleText from './components/03_classcomponents/LifecycleText';
// import Comment from './components/03_classcomponents/Comment';
// import CommentList from './components/03_classcomponents/CommentList';
// import UseStateTest from './components/04_Hook/userState/UseStateTest';
// import SignUp from './components/04_Hook/userState/SignUp';
// import LandingPage from './components/04_Hook/userState/LandingPage';
// import UseRefTest from './components/04_Hook/useRef/UseRefTest';
// import UseRefScroll from './components/04_Hook/useRef/UseRefScroll';
// import UseMemoTest from './components/04_Hook/useMemo/UseMemoTest';
// import UseEffectTest from './components/04_Hook/useEffectTest/UseEffectTest';
// import UseCallbackTest from './components/04_Hook/useCallback/UseCallbackTest';
// import EffectView from './components/04_Hook/useEffectTest/EffectView';
// import BlackOrWhite from './components/04_Hook/useContext/BlackOrWhite';
// import MyForm from './components/04_Hook/customHook/MyForm';
// import ToggleBox from './components/04_Hook/customHook/ToggleBox';
// import { UserProvider } from './components/04_Hook/useContext/UserContext';
// import Header from './components/04_Hook/useContext/Header';
// import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
// import NotFound from './pages/NotFound';
// import Profile from './pages/Profile';
// import About from './pages/About';
// import Home from './pages/Home';
// import styled from 'styled-components';
// import CounterDisplay from './components/06_zustand/CounterDisplay';
// import CounterControls from './components/06_zustand/CounterControls';
// import TodoList from './components/06_zustand/TodoList';
// import IconButtons from './components/Icon/IconButtons';
// import { ThemeProvider } from 'styled-components';
// import GlobalStyle from './GlobalStyle';
// import { darkTheme, lightTheme } from './themes';
// import ThemeBox from './components/Icon/ThemeBox';
import TodoList from './components/Icon/TodoList';
import { performToast } from './components/Icon/utils/performToast';

// const AppContainer = styled.div``;

// const Section = styled.section`
//   width: 100%;
// `;
performToast({ msg: '요청에 성공하였습니다.1', type: 'success' });

function App() {
  // const [isDark, setIsDark] = useState(false);
  // const toggleTheme = () => setIsDark(!isDark);

  const apiUrl = import.meta.env.VITE_API_URL;
  console.log(apiUrl);

  return (
    <>
      {/* {isButton && <LifecycleText/>}
          <button onClick={toggleButton}>count 없애기</button> */}

      {/* <Comment message={"안녕하세요"}/> */}
      {/* <CommentList/> */}

      {/* <UseStateTest/> */}
      {/* <SignUp/> */}
      {/* <LandingPage/> */}
      {/* <UseRefTest/> */}
      {/* <UseRefScroll/> */}
      {/* <UseMemoTest/> */}
      {/* <EffectView/> */}
      {/* <UseCallbackTest/> */}
      {/* <BlackOrWhite/> */}
      {/* <MyForm/> */}
      {/* <ToggleBox /> */}
      {/* <UserProvider>
              <Header />
            </UserProvider> */}

      {/* <BrowserRouter> */}
      {/* <nav style={{marginBottom: 20}}> */}
      {/* Link : a태그와 동일한 역할을 하지만 react-router-dom을 활용해 spa방식으로 자연스럽게 화면전횐 */}
      {/* <Link to="/" style={{marginRight: 12}}>홈</Link> */}
      {/* <Link to="/about" style={{marginRight: 12}}>소개</Link> */}
      {/* <Link to="/profile/최지원">프로필</Link> */}
      {/* </nav> */}
      {/* <Routes> */}
      {/* <Route path='/' element={<Home />}/> */}
      {/* <Route path='/about' element={<About />}/> */}
      {/* <Route path='/profile/:username' element={<Profile />}/> */}
      {/* <Route path='*' element={<NotFound />}/> */}
      {/* </Routes> */}
      {/* </BrowserRouter> */}

      {/* <AppContainer> */}
      {/* <Section> */}
      {/* <h2>Zustand 전역 상태 관리</h2> */}
      {/* <CounterDisplay /> */}
      {/* <CounterControls /> */}
      {/* </Section> */}
      {/* <Section> */}
      {/* <h2>zustand TodoList</h2> */}
      {/* <TodoList /> */}
      {/* </Section> */}
      {/* </AppContainer> */}
      {/* <IconButtons/> */}
      {/* {
        <ThemeProvider theme={isDark ? darkTheme : lightTheme}>
          <GlobalStyle />
          <ThemeBox onToggleTheme={toggleTheme} />
        </ThemeProvider>
      } */}
      {/* <ToastContainer />
      <SimpleForm />
      <LoaderDemo /> */}
      <TodoList />
    </>
  );
}

export default App;
