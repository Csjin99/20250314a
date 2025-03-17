
--1. 춘 기술대학교의 학과 이름과 계열을 표시하시오
-- 단, 출력 헤더는 "학과 명", "계열"으로 표시하도록한다.
SELECT DEPARTMENT_NAME AS "학과 명", CATEGORY AS "계열"
FROM tb_department;

--2. 학과의 학과 정원을 다음과 같은 형태로 화면에 출력한다.
SELECT DEPARTMENT_NAME||'의 정원은 '||CAPACITY||'명 입니다.' AS "학과별 정원"
FROM TB_DEPARTMENT;

--3. "국어국문학과"에 다니는 여학생 중 현재 휴학중인 여학생을 찾아달라는 요정이 들어왔다.
--국문학과의 학과코드는 학과 테이블을 조회해서 찾아내도록하자
SELECT STUDENT_NAME
FROM TB_STUDENT
JOIN TB_DEPARTMENT USING (DEPARTMENT_NO)
WHERE DEPARTMENT_NO = 001 AND ABSENCE_YN = 'Y' AND STUDENT_SSN LIKE '%-2%';

--4. 도서관에서 대출 도서장기연체자들을 찾아 이름을 게시하고자한다.
--그 대상자들의 학번이 다음과 같을 때 대상자들을 찾는 적절한 구문을 작성하시오
--A513079, A513090, A513091, A513110, A513119
SELECT STUDENT_NAME
FROM TB_STUDENT
WHERE STUDENT_NO IN ('A513079', 'A513090', 'A513091', 'A513110', 'A513119')
ORDER BY STUDENT_NAME DESC;

--5.입학정원이 20명이상 30명 이하인 학과들의 학과 이름과 계열을 출력하시오
SELECT DEPARTMENT_NAME, CATEGORY
FROM TB_DEPARTMENT
WHERE CAPACITY BETWEEN 20 AND 30;

--6.춘 기술대학교는 총장을 제외하고 모든 교수들이 소속 학과를 가지고있다
--그럼 춘기술대학교 총장의 이름을 알아낼 수 있는 문장을 작성
SELECT PROFESSOR_NAME
FROM tb_professor
WHERE DEPARTMENT_NO IS NULL;

--7.전산상의 착오로 학과가 지정되어 있지않은 학생이 있는지 확인
SELECT STUDENT_NAME
FROM TB_STUDENT
WHERE department_no IS NULL;

--8. 수강신청을 하려고한다 선수과목여부를 확인해야하는데
--선수 과목이 존재하는 과목들은 어떤과목인지 과목번호 조회
SELECT CLASS_NO
FROM TB_CLASS
WHERE PREATTENDING_CLASS_NO IS NOT NULL;

--9. 춘 대학에는 어떤 계열들이 있는지 조회해보자
SELECT CATEGORY
FROM TB_DEPARTMENT
GROUP BY CATEGORY
ORDER BY CATEGORY ASC;

--10. 02학번 전주 거주자들의 모임을 만들려고한다 휴학한 사람들은 제외한
--재학중인 학생들의 학번 이름 주민번호 출력
SELECT STUDENT_NO, STUDENT_NAME, STUDENT_SSN
FROM TB_STUDENT
WHERE STUDENT_ADDRESS LIKE '전주시%'
      AND ABSENCE_YN = 'N'
      AND STUDENT_NO LIKE 'A2%'
ORDER BY STUDENT_NAME ASC;