--1.과목유형 테이블에 삽입
INSERT INTO TB_CLASS_TYPE VALUES(
    01, '전공필수'
);
INSERT INTO TB_CLASS_TYPE VALUES(
    02, '전공선택'
);
INSERT INTO TB_CLASS_TYPE VALUES(
    03, '교양필수'
);
INSERT INTO TB_CLASS_TYPE VALUES(
    04, '교양선택'
);
INSERT INTO TB_CLASS_TYPE VALUES(
    05, '논문지도'
);
--2
CREATE TABLE TB_학생일반정보 AS(
SELECT STUDENT_NO AS "학번", STUDENT_NAME AS "학생이름", STUDENT_ADDRESS AS"주소"
FROM TB_STUDENT
);
SELECT * FROM TB_학생일반정보;

--3
DROP TABLE TB_국어국문학과;
CREATE TABLE TB_국어국문학과 AS(
SELECT STUDENT_NO AS "학번", STUDENT_NAME AS "학생이름",  TO_DATE(SUBSTR(STUDENT_SSN,1,2), R) AS "주소", PROFESSOR_NAME AS "교수이름"
FROM TB_STUDENT A
LEFT JOIN TB_PROFESSOR B ON (A.DEPARTMENT_NO = B.DEPARTMENT_NO)
JOIN TB_DEPARTMENT C ON (a.department_no = c.department_no)
WHERE DEPARTMENT_NAME = '국어국문학과'
);
SELECT * FROM TB_국어국문학과;


--4
SELECT ROUND(capacity+CAPACITY * 0.1)
FROM TB_DEPARTMENT;

--5
UPDATE TB_STUDENT
SET STUDENT_ADDRESS = '서울시 종로구 숭인동 181-21'
WHERE STUDENT_NAME = '박건우' AND STUDENT_NO  = 'A413042';

--6
UPDATE TB_STUDENT
SET STUDENT_SSN = SUBSTR(STUDENT_SSN,1,6);

--7
UPDATE TB_GRADE
SET POINT = 3.5
WHERE TEMT_NO = '200501' AND STUDENT_NAME = (SELECT STUDENT_NAME
                                             FROM TB_STUDENT
                                             WHERE STUDENT_NAME = '김명훈')
                        AND DEPARTMENT_NAME= (SELECT DEPARTMENT_NAME
                                                FROM TB_DEPARTMENT
                                                WHERE  DEPARTMENT_NAME = '의학과');
                                                
--8


