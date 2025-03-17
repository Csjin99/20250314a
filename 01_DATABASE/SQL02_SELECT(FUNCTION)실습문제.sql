--1. 영어영문학과 학생들의 학번과 이름 입학년도를 입학년도가 빠른순으로 표시
SELECT STUDENT_NO AS "학번", STUDENT_NAME AS "이름", TO_CHAR(ENTRANCE_DATE,'YYYY-MM-DD') AS "입학년도"
FROM TB_STUDENT
WHERE department_no = 002
ORDER BY ENTRANCE_DATE ASC;

--2.춘 기술대학교의 교수중 이름이 세글자가 아닌 교수가 한명 있다고한다.
--그 교수의 이름과 주민번호를 화면에 출력하는 문장 작성
SELECT PROFESSOR_NAME, PROFESSOR_SSN
FROM TB_PROFESSOR
WHERE professor_name NOT LIKE '___';

--3. 춘 기술대학교의 남자 교수들의 이름과 나이르 출력하는 문장을 작성
--나이가 적은사람에서 많은 순서로 화면에 출력되도록 만드시오
SELECT PROFESSOR_NAME AS "교수이름",
     ROUND((SYSDATE - TO_DATE(19||SUBSTR(PROFESSOR_SSN,1,6))) / 365) AS "나이"
FROM TB_PROFESSOR
ORDER BY 나이 ASC;

--4.교수들의 이름 중 성을 제외한 이름만 출력하는 SQL문자
--단 출력헤더는 이름
SELECT SUBSTR(PROFESSOR_NAME,2)
FROM TB_PROFESSOR;

--5. 춘 기술 대학교의 재수생 입학자를 구하려고 한다. 
-- 단 19살에 입학하면 재수를 하지 않은 것으로 간주한다.
SELECT STUDENT_NO, STUDENT_NAME
FROM TB_STUDENT
WHERE EXTRACT(YEAR FROM ENTRANCE_DATE) -( 19||SUBSTR(STUDENT_SSN,1,2)) > 19;

--6.2020년 크리스마스는 무슨요일인가?
SELECT TO_CHAR(TO_DATE(20201225),'DAY')
FROM DUAL;

--7.TO_DATE('99/10/11','YY/MM/DD'),TO_DATE('49/10/11','YY/MM/DD')은
--각각 몇년 몇월 몇일을 의미할까? 또 TO_DATE('99/10/11','RR/MM/DD'),
--TO_DATE('49/10/11','RR/MM/DD')은 각각 몇년 몇월 몇일을 의미할까?

SELECT
TO_CHAR(TO_DATE('99/10/11','YY/MM/DD'),'YYYY-MM-DD'),
TO_CHAR(TO_DATE('49/10/11','YY/MM/DD'),'YYYY-MM-DD'),
TO_CHAR(TO_DATE('99/10/11','RR/MM/DD'),'RRRR-MM-DD'),
TO_CHAR(TO_DATE('49/10/11','RR/MM/DD'),'RRRR-MM-DD')
FROM DUAL;

--8. 춘기술대학교의 2000년도 이후 입학자들은 A로 시작하게 되어있다.
--2000년도 이전 학벅을 받은 학생들이 학번과 이름
SELECT STUDENT_NO, STUDENT_NAME
FROM TB_STUDENT
WHERE STUDENT_NO NOT LIKE 'A%';

--9.학번이 A5171718인 한아름학생의 학점 총 평점을 구하라
-- 단 점수는 반올림 소수점 이하 한자리까지
SELECT ROUND(SUM(POINT)/COUNT(POINT),1) AS "평점"
FROM TB_GRADE
WHERE STUDENT_NO = 'A517178';

--10. 학과별 상생수를 구하시오 학과 번호, 학생수(명) 헤더로 만들것
SELECT DEPARTMENT_NO AS "학과번호", COUNT(STUDENT_NAME)
FROM TB_STUDENT
GROUP BY DEPARTMENT_NO
ORDER BY DEPARTMENT_NO;

--11.지도 교수를 배정받지 못한 학생의 수는 몇명 정도 되는지 알아내라
SELECT COUNT(*)
FROM TB_STUDENT
WHERE COACH_PROFESSOR_NO IS NULL;

--12.학번이 A112113인 김고운 학생의 년도 별 평점을 구하라
--헤더는 년도, 년도 별 평점이라고 찍히게 하고 점수는 반올림해라
SELECT SUBSTR(TERM_NO, 1, 4) AS "년도", ROUND(SUM(POINT)/ COUNT(POINT),1)
FROM TB_GRADE
WHERE STUDENT_NO = 'A112113'
GROUP BY SUBSTR(TERM_NO, 1, 4);

--13. 학과 별 휴학생수를 파악하고자 한다
SELECT DEPARTMENT_NO AS "학과코드명",SUM(DECODE(ABSENCE_YN,'Y', 1, 'N', 0) ) AS "휴학생 수"
FROM TB_STUDENT
GROUP BY department_no
ORDER BY department_no;

--14 춘 대학교에 다니는 동명이인 학생들의 이름을 찾아라
SELECT STUDENT_NAME AS "동일이름", COUNT(STUDENT_NO)
FROM TB_STUDENT
GROUP BY STUDENT_NAME
HAVING COUNT(STUDENT_NO) >=2
ORDER BY STUDENT_NAME;


--15 학번이 A112113인 김고운 학생의 년도,
--학기별 평점과 년도 별 누적 평점, 총 평점
SELECT SUBSTR(TERM_NO, 1, 4) AS "년도",
       SUBSTR(TERM_NO, 5, 6) AS "학기",
       SUM(POINT)/ COUNT(POINT) AS "평점"
FROM TB_GRADE
WHERE STUDENT_NO = 'A112113'
GROUP BY ORSUBSTR(TERM_NO, 5, 6);


