import React from 'react'
import styled from 'styled-components'

const TodoItemContainer = styled.li`
    display:flex;
    align-items: center;
    justify-content: space-between;
    padding: 12px;
    border: 1px solid #f8a6a6;
    margin-bottom: 12px;
    border-radius: 6px;
`

const TodoContent = styled.div`
    display: flex;
    align-items: center;
    gap: 12px;
`

const TodoText = styled.span`
    text-decoration: ${props => props.completed ? 'line-through' : 'none'};
    color: ${props => props.completed ? 'inherit' : '#0f4d0377'};
`

const Checkbox = styled.input`
    width: 24px;
    height: 12px;
`

const DeletButton = styled.button`
    color: #6d0000;
    background: none;
    border: none;
    cursor: pointer;

    &:hover{
        color: #3d0000;
    }
`

const TodoItem = ({todo, onToggle,onDelete}) => {

    return (
        <TodoItemContainer>
            <TodoContent>
                <Checkbox
                    type="checkbox"
                    checked={todo.completed}
                    onChange={()=> onToggle(todo.id)}
                />
                <TodoText completed = {todo.completed}>
                    {todo.text}
                </TodoText>
            </TodoContent>
            <DeletButton onClick={() => onDelete(todo.id)}>
                삭제
            </DeletButton>
        </TodoItemContainer>
    )
}

export default TodoItem