import './App.css'
import ProfileList from './compnents/ProfileList'
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
      <ProfileList userCardList ={userList}/>
    </>
  )
}

export default App
