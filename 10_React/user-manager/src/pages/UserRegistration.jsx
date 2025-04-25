import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import styled from 'styled-components'

const Container = styled.form`
    width: 500px;
    height: 300px;
    background: #aabdfc;
    padding: 10px;
    align-items:center;
`
const User = styled.div`
    width: 100%;
    height: 85%;
    margin-right: 12px;
    display: flex;
    flex-direction: column;
`

const UserRegistration = ({ addUser }) => {
  const [form, setForm] = useState({
    name: '',
    id: '',
    age: '',
    email: '',
    isOnline: 'on',
  })
  const navigate = useNavigate()

  const handleChange = (e) => {
    const { name, value } = e.target
    setForm(prev => ({ ...prev, [name]: value }))
  }

  const handleSubmit = (e) => {
    e.preventDefault()
    const { name, age, isOnline } = form

    addUser({ name, age: Number(age), isOnline })
    navigate('/') // 저장 후 유저 목록으로 이동
  }

  return (
    <Container onSubmit={handleSubmit}>
      <User>
        이름: <input name="name" type="text" placeholder='이름을 입력해주세요' value={form.name} onChange={handleChange} required />
        아이디: <input name="id" type="text" placeholder='아이디를 입력해주세요' value={form.id} onChange={handleChange} required />
        나이: <input name="age" type='text' placeholder='나이를 입력해주세요' value={form.age} onChange={handleChange} required />
        이메일: <input name="email" type="email" placeholder='이메일을 입력해주세요' value={form.email} onChange={handleChange} required />
        상태:
        <select name="isOnline" value={form.isOnline} onChange={handleChange}>
          <option value="on">on</option>
          <option value="off">off</option>
        </select>
      </User>
      <div>
        <button type='submit'>저장하기</button>
        <button type='button' onClick={() => navigate('/')}>취소</button>
      </div>
    </Container>
  )
}

export default UserRegistration