import styled from 'styled-components'
import './App.css'
import TodoList from './components/TodoList'

const AppContainer = styled.div`
  min-height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  background: #a3abf7;
`

function App() {

  return (
    <AppContainer>
      <TodoList/>
    </AppContainer>
  )
}

export default App
