import React from 'react';
import styled from 'styled-components';
import { BsBrightnessLowFill } from 'react-icons/bs';
import { MdDarkMode } from 'react-icons/md';

const Change = ({ onToggleTheme }) => {
  return (
    <Wrapper>
      <ToggleButton onClick={onToggleTheme}>
        <BsBrightnessLowFill /> / <MdDarkMode />
      </ToggleButton>
    </Wrapper>
  );
};

export default Change;

const Wrapper = styled.div`
  text-align: center;
`;

const ToggleButton = styled.button`
  display: flex;
  align-items: center;
  gap: 12px;
  padding: 10px 14px;
  background: ${({ theme }) => theme.primary};
  color: white;
  font-size: 18px;
  border: none;
  border-radius: 8px;
  transition: 0.2s;

  &:hover {
    opacity: 0.9;
  }
`;
