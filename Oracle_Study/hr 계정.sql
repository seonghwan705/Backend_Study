
-- 1. 모든 컬럼 보기
SELECT * FROM EMPLOYEES;

SELECT * FROM DEPARTMENTS;

-- 2. 특정컬럼 보기
SELECT EMPLOYEE_ID, LAST_NAME, HIRE_DATE, SALARY 
FROM EMPLOYEES;

-- 3. 연산 가능

SELECT LAST_NAME, SALARY, SALARY * 12
FROM EMPLOYEES;

-- 4. 별칭 주기
SELECT last_name as 이름, salary 월급, salary * 12 as 연봉
FROM employees;

-- 5. 공백 포함 출력 " " 
SELECT last_name as "사원 이름", salary "사원 월급", salary * 12 as "연 봉" 
FROM employees;

-- 6. NVL(컬럼, 치환값) => 널 값을 지정값으로 치환
SELECT last_name 이름, salary 월급, commission_pct 수수료,
 salary * 12+NVL(commission_pct,0) as 연봉
FROM employees;

-- 7. 연결 : 컬럼 || 컬럼
SELECT last_name || salary as "이름 월급" 
FROM employees;

-- 7. 연결 : 컬럼 || '값'
SELECT last_name || ' 사원' 
FROM employees;

-- 7. 연결 : 컬럼 || 컬럼 || '값'
SELECT last_name || '의 직업은 ' || job_id || ' 입니다' as "사원별 직급" 
FROM employees;

-- 8. 중복제거
SELECT DISTINCT job_id
FROM employees;

-- 9. WHERE 조건식
SELECT employee_id,last_name,job_id, salary
FROM employees
WHERE salary >= 10000;

-- 값은 대소문자를 구별함. 
SELECT employee_id,last_name,job_id, salary
FROM employees
WHERE last_name = 'King';

-- 10. 날짜데이터 조건절 => 수치데이터로 취급, 비교연산자 사용 가능
SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE hire_date > '07/12/31';

-- 11. Between a AND b
SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE salary BETWEEN 7000 AND 8000;

SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE hire_date BETWEEN '07/01/01' AND '08/12/31';

-- 12. IN 연산자 : 일치하는 값 찾기
SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE employee_id IN ( 100,200,300 );

SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE last_name IN ( 'King','Abel','Jones');

SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE hire_date IN ( '01/01/13','07/02/07');

-- 13. LIKE 연산자 + 와일드카드 %, _
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE 'J%'; -- J 로 시작하는 것 찾기

SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '%ai%'; -- ai 포함하는 것 찾기

SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '%in'; -- in으로 끝나는 것 찾기

SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '_b%'; -- 두 번째 문자가 b인 것 찾기

SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '_____d'; -- 6번째 문자가 d인 것 찾기 

-- ESCAPE : 와일드카드를 문자로 인식하고자 할 때 사용
SELECT employee_id,last_name,salary,job_id
FROM employees
WHERE job_id LIKE '%E___' ESCAPE 'E'; -- 뒤에서 3번째 문자로 _ 를 가진 사원 조회

-- 14. 논리 연산자 AND, OR, NOT
SELECT last_name,job_id,salary
FROM employees
WHERE job_id = 'IT_PROG' AND salary >= 5000;

SELECT last_name,job_id,salary
FROM employees
WHERE job_id = 'IT_PROG' OR salary >= 5000;

SELECT last_name,job_id,salary
FROM employees
WHERE NOT salary < 20000;

SELECT last_name,job_id,salary
FROM employees
WHERE salary NOT IN (9000,8000,6000 );

SELECT last_name,job_id,salary
FROM employees
WHERE last_name NOT LIKE 'J%';

SELECT last_name,job_id,salary
FROM employees
WHERE salary NOT BETWEEN 2400 AND 20000;

-- WHERE 조건절 NULL 값 찾기 : IS NULL 연산자 
SELECT last_name,job_id,salary
FROM employees
WHERE commission_pct IS NULL; -- NULL인 값 찾기

SELECT last_name,job_id,salary
FROM employees
WHERE manager_id IS NOT NULL; -- NULL이 아닌 값 찾기

-- 논리 연산자 사용시 주의 : NOT > AND > OR 순서
SELECT last_name,job_id,salary,commission_pct
FROM employees
WHERE ( job_id ='AC_MGR' OR job_id='MK_REP' ) 
AND commission_pct IS NULL
AND salary >=4000
AND salary <= 9000;

-- ORDER BY : ASC, DESC
SELECT employee_id,last_name,job_id,salary
FROM employees
ORDER BY salary DESC; -- 샐러리 값 내림차순 정렬

SELECT employee_id,last_name,job_id,salary
FROM employees
ORDER BY salary ASC; -- 샐러리 값 오름차순 정렬 (기본값)

SELECT employee_id,last_name,job_id,salary as "월급" 
FROM employees
ORDER BY 월급 DESC; -- 별칭으로 정렬가능!!!

SELECT employee_id,last_name,job_id,salary as "월급" 
FROM employees
ORDER BY 4 DESC; -- 순서값으로 정렬가능!!!

SELECT employee_id,last_name as 이름,job_id,salary 
FROM employees
ORDER BY last_name ASC; -- A:65 B:66

SELECT employee_id,last_name,salary,hire_date as 입사일
FROM employees
ORDER BY hire_date DESC; -- 최근부터 과거까지

-- 샐러리 먼저 내림차순하고 정렬된 데이터를 다시 날짜로 오름차순 정렬
SELECT employee_id,last_name,salary,hire_date
FROM employees
ORDER BY salary DESC, hire_date; 

SELECT employee_id,last_name,salary,hire_date
FROM employees
ORDER BY 3 DESC, 4; -- 위랑 같은 값

-- NULL 값 정렬 : NULL 오라클에서 가장 큰 값, 오름차순엔 마지막, 내림차순엔 첫번째

-- [ 더미 테이블 : DUAL ] 
-- 임시 테이블, 용도 : FROM 절에 적용할 마땅할 테이블이 없는 경우 
SELECT 287*1665
FROM DUAL;

SELECT SYSDATE
FROM DUAL; -- 현재 날짜 출력

-- INITCAP : 첫 문자만 대문자 나머지는 소문자
SELECT INITCAP('ORACLE SQL') -- 문자 지정
FROM dual;

SELECT email, INITCAP(email) -- 컬럼 지정
FROM employees;

-- UPPER : 모든 문자를 대문자로
SELECT last_name, UPPER(last_name)
FROM employees;

SELECT last_name, salary
FROM employees
WHERE UPPER(last_name)='KING'; -- 값이 소문자인지 대문자인지 헷갈릴 때 사용

-- 모두 소문자
SELECT last_name, LOWER(last_name)
FROM employees;

-- 문자열 연결
SELECT CONCAT( last_name, salary)
FROM employees;

SELECT last_name || salary
FROM employees;

-- LENGTH 함수 : 리터럴 글자 수 세기
SELECT last_name, LENGTH(last_name)
FROM employees; -- 리터럴이 몇 글자인지

-- INSTR : 특정 문자가 나타나는 위치를 반환
SELECT INSTR('MILLER' , 'L', 1 , 2 ), INSTR('MILLER' , 'X', 1 , 2 )
FROM dual; -- L문자, 1번째 M부터, 2번째 L 위치값

-- SUBSTR : 문자열에서 일부분의 문자열을 추출할 때 사용
SELECT hire_date 입사일, SUBSTR(hire_date,1,2) 입사년도
FROM employees; -- 입사일 1번째부터 2자리 추출

SELECT SUBSTR('900303-1234567' , 8 , 1 ) 
FROM dual; -- 8번째 자리부터 1자리 추출

SELECT SUBSTR('900303-1234567' , 8 ) 
FROM dual; -- 8번째 자리부터 끝까지 추출

SELECT SUBSTR('900303-1234567' , -8 ) 
FROM dual; -- 뒤에서 8번째부터 끝까지 추출 

-- REPLACE 함수 : 특정 문자열을 치환할 때 사용하는 함수 
SELECT REPLACE('JACK and JUE' , 'J' , 'BL' ) 
FROM dual; -- 모든'J'문자를 'BL'로 치환

-- LPAD 함수 : 문자열을 오른쪽 정렬 후에 특정 문자를 왼쪽부터 지정한 문자로 채우는 함수
SELECT LPAD('MILLER' , 10 , '*' ) 
FROM dual; -- 총 자리수 10, 'MILLER' 오른쪽 정렬 후, '*'문자로 나머지 자리 채움
-- ****MILLER <<

-- RPAD 함수 :  문자열을 왼쪽 정렬 후에 특정 문자를 왼쪽부터 지정한 문자로 채우는 함수
SELECT RPAD('MILLER' , 10 , '*' ) 
FROM dual; -- 총 자리수 10, 'MILLER' 왼쪽 정렬 후, '*'문자로 나머지 자리 채움
-- MILLER****

-- 보안 상 이유로 주민등록번호 포맷 변경
-- 방법 1 : SUBSTR , CONCAT || 활용
SELECT SUBSTR('900303-1234567',1,8)||'******' 주민번호 
FROM dual;
-- 첫번째 자리부터 8자리 추출하고 '******' 연결

-- 방법 2 : SUBSTR 과 RPAD 활용
SELECT RPAD(SUBSTR('900303-1234567',1,8),14,'*')
FROM DUAL;

-- 방법 3 : REPLACE, SUBSTR 활용
SELECT REPLACE( '900303-1234567', SUBSTR('900303-1234567', 9 ) , '******' ) 
주민번호 
FROM dual; -- SUBSTR에서 '234567' 추출하여 ******로 치환

-- LTRIM 함수 : 문자열에서 특정 문자를 삭제하기 위한 용도
-- 첫 문자부터 시작하여, 지정된 문자와 일치하지 않는 문자가 나올 때까지 해당 문자 제거
SELECT LTRIM('MILLER', 'M')
FROM dual; -- ILLER

SELECT LTRIM('     MILLER     '), LENGTH(LTRIM('     MILLER     '))
FROM dual; -- 왼쪽 공백 삭제 후 왼쪽 정렬 상태 

-- RTRIM 함수
SELECT RTRIM('MILLER', 'R')
FROM dual; -- 'MILLE'

SELECT RTRIM('     MILLER     '), LENGTH(RTRIM('     MILLER     '))
FROM dual; -- 오른쪽 공백 삭제 후 오른쪽 정렬 상태

-- TRIM 함수 : 양쪽 모두 삭제
SELECT TRIM( '0' FROM '0001234567000' ) 
FROM dual; -- 양쪽 0 삭제

SELECT TRIM( LEADING '0' FROM '0001234567000' ) 
FROM dual; -- 왼쪽 0 삭제

SELECT TRIM( TRAILING '0' FROM '0001234567000' ) 
FROM dual; -- 오른쪽 0 삭제

-- [ 숫자처리 함수 ]

-- ROUND 함수 : 지정한 자리 수 이하에서 반올림한 결과를 반환
SELECT ROUND( 456.789, 2 ) 
FROM dual; -- 456.79

SELECT ROUND( 456.789, -1 ) 
FROM dual; -- 460

SELECT ROUND( 456.789 ) 
FROM dual; -- 457

-- TRUNC 함수 : 지정한 자리 수 이하에서 절삭한 결과 반환
SELECT TRUNC( 456.789, 2 ) 
FROM dual; -- 456.78

SELECT TRUNC( 456.789, -1 ) 
FROM dual; -- 450

SELECT TRUNC( 456.789 ) 
FROM dual; -- 456

-- MOD 함수 : 나누 연산 후, 몫이 아닌 나머지를 반환
SELECT MOD( 10 , 3 ) , MOD( 10 , 0 ) 
FROM dual; -- 1, 10

SELECT employee_id,last_name,salary 
FROM employees
WHERE MOD(employee_id,2)=1;
-- 사원 ID가 홀수인 사원만 출력하는 SQL문

-- CEIL 함수 : 소수점을 가진 실수값을 정수값으로 반환하는 함수
-- 주어진 숫자보다 크거나 같은 최소 정수값
SELECT CEIL(10.6), CEIL(-10.6) 
FROM dual; -- 11, -10

-- FLOOR 함수 : 소수점을 가진 실수값을 정수값으로 반환하는 함수
-- 주어진 숫자보다 작거나 같은 최대 정수값
SELECT FLOOR(10.6), FLOOR(-10.6) 
FROM dual; -- 10, -11

-- SIGN 함수 : 지정된 값이 양수인지 음수인지 0인지 판별
-- 결과값 : 양수 (1) 음수 (-1) 0(0)
SELECT SIGN( 100 ) , SIGN(-20) , SIGN(0) 
FROM dual; -- 1, -1, 0

-- 월급이 15000보다 큰 사원만 출력하는 SQL문
SELECT employee_id,last_name,salary 
FROM employees
WHERE SIGN(salary-15000)=1;

-- [ 날짜 정보 ] 
select *
from NLS_SESSION_PARAMETERS;

create table exam
(a date, b date);

insert into exam (a,b)
VALUES ( to_date('15/01/01', 'RR/MM/DD'), to_date('15/01/01', 'YY/MM/DD'));

-- 시스템의 연도를 1995년도로 변경
insert into exam (a,b)
VALUES ( to_date('95/01/01', 'RR/MM/DD'), to_date('1995/01/01', 'YYYY/MM/DD'));

SELECT TO_CHAR(a,'RRRR'), TO_CHAR(b,'YYYY')
FROM exam;

-- 현내 날짜 출력
SELECT SYSDATE
FROM dual;

-- 내일, 어제
SELECT SYSDATE 오늘, SYSDATE+1 내일, SYSDATE-1 어제
FROM dual;

-- 근무 년도 구하기!
SELECT last_name, hire_date, TRUNC((sysdate-hire_date)/365) "년" 
FROM employees
ORDER BY 3 desc;

-- MONTHS_BETWEEN 함수 : 날짜와 날짜 사이의 개월 수를 반환하는 함수
SELECT last_name, hire_date, MONTHS_BETWEEN(sysdate, hire_date) "근무 월수" 
FROM employees
ORDER BY 3 desc;

-- 소수점 안보이게 하기
SELECT last_name, hire_date, TRUNC(MONTHS_BETWEEN(sysdate, hire_date)) "근
무 월수" FROM employees
ORDER BY 3 desc;

-- ADD_MONTHS 함수 : 지정된 날짜에 특정 개월 수를 더하거나 뺀 날짜를 반환하는 함수
SELECT sysdate 현재, ADD_MONTHS(sysdate,1) 다음달, ADD_MONTHS(sysdate,-1) 이전달
FROM dual;

-- 입사 후 5개월이 지난 후 날짜 출력
SELECT last_name, hire_date, ADD_MONTHS(hire_date , 5)
FROM employees
ORDER BY 3 desc;

-- NEXT_DAY 함수 : 지정된 날짜를 기준으로 돌아오는 가장 가까운 요일에 해당하는 날짜를 반환하는 함수
SELECT last_name, hire_date, NEXT_DAY(hire_date, '금'),NEXT_DAY(hire_date, 6)
FROM employees
ORDER BY 3 desc;

-- LAST_DAY : 해당 날짜가 속한 달의 마지막 날짜를 반환하는 함수
SELECT last_name, hire_date, LAST_DAY(hire_date)
FROM employees
ORDER BY 2 desc; -- 입사한 달의 마지막 날짜 구하기

-- ROUND 함수 : 날짜데이터를 ROUND 함수를 이용하여 반올림가능
SELECT last_name, hire_date, 
 ROUND(hire_date,'YEAR'),
 ROUND(hire_date,'MONTH')
FROM employees;

-- TRUNC 함수 : 날짜데이터를 가장 가까운 년도 또는 월로 절삭이 가능
SELECT last_name, hire_date, 
 TRUNC(hire_date,'YEAR'),
 TRUNC(hire_date,'MONTH')
FROM employees; -- 1) 년도 절삭 : 월, 일 01/01 2) 월 절삭 : 일 01

-- 변환함수
-- TO_NUMBER : 문자데이터를 숫자데이터로 변환 ( 반환값 : 숫자 )
-- TO_DATE : 문자데이터를 날짜데이터로 변환 ( 반환값 : 날짜 )
-- TO_CHAR : 숫자, 날짜 데이터를 문자데이터로 변환 ( 반환값 : 문자 )

-- 자동 형변환
SELECT last_name, salary
FROM employees
WHERE salary = '17000';

-- TO_CHAR 문법 : TO_CHAR(컬럼, 포맷)
-- 날짜를 포맷을 주어 문자로 출력
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD,(AM) DY HH24:MI:SS')
FROM dual;

-- 입사가 9월인 사원 정보 출력
SELECT last_name,hire_date, salary
FROM employees
WHERE TO_CHAR(hire_date, 'MM')='09'; -- 날짜를 문자로 변경

-- 날짜 및 시간 출력 형식에 한글 표현식 추가
SELECT TO_CHAR(SYSDATE, ' YYYY "년" MM "월" DD "일" ') 날짜
FROM dual;

-- 숫자 출력 형식
SELECT last_name, salary, 
 TO_CHAR(salary, '$999,999') 달러,
 TO_CHAR(salary, 'L999,999') 원화
FROM employees;

-- TO_NUMBER 함수 : 숫자 형태의 문자열을 숫자로 변환하기 위해서 사용
-- 문법 : TO_NUMBER (STR) 
SELECT TO_NUMBER('123') + 100 
FROM dual;

-- 아래 명령어로 날짜 형식이 RR/MM/DD 가 아닌 
-- YYYY/MM/DD HH24:MI:SS 형식으로 변경
ALTER SESSION SET NLS_DATE_FORMAT='YYYY/MM/DD HH24:MI:SS';

-- 문자 '20170802181030'를 날짜 데이터로 변환
SELECT TO_DATE( '20170802181030' , 'YYYYMMDDHH24MISS' )
FROM dual;

-- 현재 날짜에서 특정 날짜 뺀 결과 출력 : 일 수 차이 출력 
SELECT SYSDATE, SYSDATE-TO_DATE( '20170801' , 'YYYYMMDD' )
FROM dual;

-----------------조건 함수 : CASE, DECODE----------------------------------------

-- [ 조건함수 ]
-- DECODE 함수 : 조건이 반드시 일치하는 경우에 사용하는 함수
-- CASE : 조건이 반드시 일치하지 않아도 범위 및 비교가 가능한 경우에 사용하는 함수

SELECT last_name,salary,
DECODE(salary,
24000, salary*0.3,
17000, salary*0.2,
salary) 보너스
FROM employees
ORDER BY 2 desc; -- SALARY 와 일치하는 값일 때 명령문 실행

SELECT COUNT(*) "총인원수",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2001, 1, 0)) "2001",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2002, 1, 0)) "2002",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2003, 1, 0)) "2003",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2004, 1, 0)) "2004",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2005, 1, 0)) "2005",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2006, 1, 0)) "2006",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2007, 1, 0)) "2007",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2008, 1, 0)) "2008"
FROM employees; -- 년도별 입사 인원 구하기

-- CASE 함수 : 조건문이지만, 다양한 비교 연산자를 이용해서 조건 설정 가능 
SELECT last_name,salary,
CASE salary WHEN 24000 THEN salary*0.3
WHEN 17000 THEN salary*0.2
ELSE salary 
END 보너스 FROM employees
ORDER BY 2 desc; -- DECODE랑 비슷

SELECT last_name,salary,
 CASE WHEN salary >=20000 THEN 1000
 WHEN salary >=15000 THEN 2000
 WHEN salary >=10000 THEN 3000
 ELSE 4000 
 END 보너스 FROM employees
ORDER BY 2 desc; -- 범위 설정가능

SELECT last_name,salary,
 CASE WHEN salary BETWEEN 20000 AND 25000 THEN '상'
 WHEN salary BETWEEN 10000 AND 19999 THEN '중'
 ELSE '하'
 END 등급 
FROM employees
ORDER BY 2 desc; -- BETWEEN 가능

SELECT last_name,salary,
 CASE WHEN salary IN ( 24000, 17000 , 14000) THEN '상'
 WHEN salary IN ( 13500, 13000) THEN '중'
 ELSE '하'
 END 등급 FROM employees
ORDER BY 2 desc; -- IN 도 사용 가능

-----------------그룹함수-------------------------------------------------------
-- 그룹함수 : SUM 합계
SELECT SUM(DISTINCT salary),SUM(ALL salary), SUM(salary)
FROM employees;

-- 그룹함수 : AVG 평균
SELECT SUM(salary), ROUND(AVG(salary))
FROM employees;

-- 그룹함수 : MAX 최대값, MIN 최소값
SELECT MAX(salary), MIN(salary)
FROM employees;

-- 날짜 데이터의 최소, 최대
SELECT MIN( hire_date ), MAX( hire_date)
FROM employees;

-- 그룹함수 : COUNT, 조건을 만족하는 행의 개수를 반환
SELECT COUNT(last_name), COUNT(commission_pct)
FROM employees;

SELECT COUNT(job_id), COUNT(DISTINCT job_id)
FROM employees; -- 총 직업ID, 직업ID 종류 개수

-- 모든 사원 수
SELECT COUNT(*) 
FROM employees;
--------------GROUP BY함수-------------------------------------------------------
-- GROUP BY 함수 : 그룹함수(집계함수)와 단순 컬럼은 SELECT절에서 동시 사용이 불가능
-- GROUP BY 절을 사용해서 단순컬럼을 그룹으로 묶으면 동시 사용이 가능해짐

SELECT department_id 부서번호, ROUND(AVG(salary)) 평균월급
FROM employees
GROUP BY department_id
ORDER BY 1; -- 그룹핑 된 부서별 평균 월급이 구해진다.

SELECT department_id 부서번호, MAX(salary) 최대월급, MIN(salary) 최소월급
FROM employees
GROUP BY department_id
ORDER BY 1; -- 그룹핑 된 부서별 최대월급, 최소월급

SELECT TO_CHAR( hire_date , 'YYYY' ) 년,TO_CHAR( hire_date , 'MM') 월, SUM(salary)
FROM employees
GROUP BY TO_CHAR( hire_date , 'YYYY'),TO_CHAR( hire_date , 'MM') 
ORDER BY 년 ASC;
-- 입사년도별(1), (1) 그룹핑 이후 그 안에서 월별(2)로 추가 그룹핑, 월급합계를 구함

-- HAVING 절 : GROUP BY절에 의해 생성된 결과 중 조건과 일치하는 데이터를 추출할 때 사용!
-- ** WHERE는 SELECT 문에서 테이블에 저장된 데이터를 조회할 때 사용하는 조건절

SELECT department_id, SUM(salary)
FROM employees
GROUP BY department_id
HAVING SUM(salary) >= 90000
ORDER BY 1; 
-- 부서별로 그룹핑을 하고 월급 합계를 구함, 근데 그 합계가 90000이상인 부서만 추출

SELECT department_id, COUNT(department_id)
FROM employees
GROUP BY department_id
HAVING COUNT(salary) >= 6
ORDER BY 1; -- 부서별 그룹핑을 하고, 부서별 인원이 6명 이상인 부서만 추출

SELECT department_id, SUM(salary)
FROM employees
WHERE salary >= 3000
GROUP BY department_id
HAVING SUM(salary) >= 90000
ORDER BY 1; 
-- 월급이 3000이상인 인원만 추출하여
-- 월급 합계가 90000 이상일 때 부서별로 그룹핑을 해서 월급 합계를 낸다. 

-- 제약조건 검색
SELECT *
FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'EMPLOYEES';

----------조인--------------------------------------------------------------
-- EQUI 조인 결과 : 106개, 1개 누락 
-- DEPARTMENT_ID 에 NULL 값 1개가 서로 일치하지 않아서 누락
SELECT last_name,department_name -- 유일한 컬럼들이라, 테이블명 생략가능
FROM employees, departments
WHERE employees.department_id = departments.department_id;

-- 지정된 테이블에 공통적으로 존재하는 컬럼은 반드시 테이블명.컬럼명 형식으로 사용해야함
SELECT last_name,department_name, departments.DEPARTMENT_ID
FROM employees, departments
WHERE employees.department_id = departments.department_id;

-- 테이블 별칭 사용
SELECT emp.last_name,department_name, emp.department_id
FROM employees emp, departments dept
WHERE emp.department_id = dept.department_id;
-- 반드시 별칭 명시해야함. 

-- WHERE 절에 공통컬럼 명시 뿐만 아니라 '검색조건' 추가
-- 오라클 조인은 WHERE 절에 조인조건과 검색조건을 같이 지정한다.
-- ANSI 조인은 조인조건과 검색조건을 "분리"한다. 
SELECT emp.last_name,salary,department_name 
FROM employees emp, departments dept
WHERE emp.department_id = dept.department_id
AND last_name='Whalen'; -- 검색조건 추가

SELECT d.department_name 부서명, COUNT(e.employee_id) 인원수
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND TO_CHAR( hire_date , 'YYYY') <= 2005
GROUP BY d.department_name -- 검색조건 추가
ORDER BY 2; 

-- NON EQUI 조인 : = 연산자가 아닌, 다른 연산자 사용하는 것
SELECT last_name, salary, grade_level
FROM employees e, job_grades g
WHERE e.salary BETWEEN g.lowest_sal AND g.highest_sal; 

-- 3개의 테이블 조인, E와 D는 EQUI 조인, E와 G는 NON EQUI 조인 => INNER 조인(일치값만)
-- N개의 테이블 조인시, 반드시 N-1개의 조인이 필요하다. 
SELECT last_name, salary, department_name, grade_level
FROM employees e, departments d, job_grades g
WHERE e.department_id = d.department_id
AND e.salary BETWEEN g.lowest_sal AND g.highest_sal;

-- SELF 조인 : 사원테이블 가상으로 생성
SELECT employee_id, LAST_NAME, MANAGER_ID
FROM EMPLOYEES E;
SELECT employee_id, LAST_NAME
FROM EMPLOYEES M;

SELECT e.last_name 사원명, m.last_name 관리자명 -- INNER 조인, SELF조인
FROM employees e, employees m
WHERE e.manager_id = m.employee_id;  -- 사장 제외 106개 추출

-- 질문 : E사원명 M관리자명 M2관리자의 관리자명 출력하시오.
SELECT *
FROM EMPLOYEES;

SELECT E.LAST_NAME 사원명, M.LAST_NAME 관리자명, M2.LAST_NAME "관리자의 관리자명"
FROM EMPLOYEES E, EMPLOYEES M, EMPLOYEES M2
WHERE E.MANAGER_ID = M.EMPLOYEE_ID AND M.MANAGER_ID = M2.EMPLOYEE_ID;
-- 직급체계 테이블에서 사원의 관리자의 관리자 출력하는 것!

-- OUTER 조인
SELECT e.last_name 사원명, m.last_name 관리자명 
FROM employees e, employees m
WHERE e.manager_id = m.employee_id(+);

SELECT e.last_name 사원명,
 m.last_name 관리자명, mm.last_name "관리자의 관리자명" 
FROM employees e, employees m , employees mm
WHERE e.manager_id = m.employee_id(+) 
AND m.manager_id = mm.employee_id(+);

-- CARTESIAN PRODUCT
SELECT EMP.LAST_NAME, DEPARTMENT_NAME, EMP.DEPARTMENT_ID
FROM EMPLOYEES EMP, DEPARTMENTS DEPT;

SELECT 107 * 27 
FROM DUAL;

---------------ANSI 조인--------------------------------------------------------
-- NATURAL JOIN : 공통컬럼 찾아서 조인해줌, 테이블명.컬럼 또는 별칭.컬럼 사용불가
SELECT last_name,department_name, department_id
FROM employees NATURAL JOIN departments; -- DEPARTMENT_ID, MANAGER_ID 두 개 공통컬럼

SELECT last_name,department_name, department_id
FROM employees e NATURAL JOIN departments d   -- 조인조건
WHERE department_id=90;                       -- 검색조건

-- USING 절
SELECT last_name,department_name, department_id
FROM employees e JOIN departments d USING(department_id); -- USING(컬럼)으로 조인

-- ON절 : 별칭 사용 필수
SELECT last_name,department_name, e.department_id
FROM employees e JOIN departments d 
ON e.department_id = d.department_id;

SELECT last_name,department_name, e.department_id
FROM employees e INNER JOIN departments d 
ON e.department_id = d.department_id        -- 조인조건
WHERE e.department_id=90;                   -- 검색조건

-- SELF 조인, INNER 조인, ON절 사용
SELECT e.last_name 사원명, m.last_name 관리자
FROM employees e INNER JOIN employees m 
ON e.manager_id = m.employee_id;

-- 3개 테이블 조인 시 ON 조건절도 추가로 사용해야함
SELECT e.last_name 사원명, d.department_name 부서명,
 g.grade_level 등급
FROM employees e INNER JOIN departments d 
ON e.department_id = d.department_id
 INNER JOIN job_grades g
ON e.salary BETWEEN g.lowest_sal AND g.highest_sal;

-- 오라클을 ANSI로 바꾸기
SELECT last_name, salary, grade_level       -- 오라클
FROM employees e, job_grades g
WHERE e.salary BETWEEN g.lowest_sal AND g.highest_sal;

SELECT last_name, salary, grade_level       -- ANSI
FROM employees e inner join job_grades g
ON e.SALARY between g.lowest_sal and g.highest_sal;

SELECT e.last_name 사원명, m.last_name 관리자명 -- 오라클 SELF
FROM employees e, employees m
WHERE e.manager_id = m.employee_id;

SELECT e.last_name 사원명, m.last_name 관리자명 -- ANSI SELF
FROM employees e INNER JOIN employees m
ON e.manager_id = m.employee_id;

-- 크로스 조인
SELECT LAST_NAME, DEPARTMENT_NAME, E.DEPARTMENT_ID
FROM EMPLOYEES e CROSS JOIN DEPARTMENTS d;  -- 카디널리티 X 카디널리티

-- LEFT OUTER 조인, NULL 도 출력
SELECT e.last_name 사원명, m.last_name 관리자명 
FROM employees e LEFT OUTER JOIN employees m
ON e.manager_id = m.employee_id;

SELECT LAST_NAME, DEPARTMENT_NAME, DEPARTMENT_ID -- using
FROM EMPLOYEES e LEFT OUTER JOIN DEPARTMENTS d USING (DEPARTMENT_ID);

SELECT LAST_NAME, DEPARTMENT_NAME, DEPARTMENT_ID -- on
FROM EMPLOYEES e LEFT OUTER JOIN DEPARTMENTS d 
ON d.department_id = e.department_id;

SELECT LAST_NAME, DEPARTMENT_NAME, DEPARTMENT_ID -- using
FROM EMPLOYEES e right OUTER JOIN DEPARTMENTS d USING (DEPARTMENT_ID);

SELECT LAST_NAME, DEPARTMENT_NAME, DEPARTMENT_ID -- on
FROM EMPLOYEES e right OUTER JOIN DEPARTMENTS d 
ON d.department_id = e.department_id;

------------서브쿼리-----------------------------------------------------------
SELECT LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY >= ( SELECT SALARY      -- 얘가 서브쿼리
                 FROM EMPLOYEES
                 WHERE LAST_NAME ='Whalen');
-- LAST_NAME이 Whalen인 애를 서브쿼리로 찾아서 그걸 조건절에 전달!
-- 즉 Whalen보다 연봉이 높은 사람들을 찾게된다.

-- 사원들의 평균 월급보다 더 많은 월급을 받는 사원을 조회?
SELECT AVG(salarY)
FROM EMPLOYEES; --6461.83

SELECT *
FROM EMPLOYEES
WHERE SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEES);
-- 서브쿼리로 평균 월급값 전달 (단일행 서브쿼리)

-- 다음은 부서번호가 100인 사원들 중에서 최대월급을 받는 사원과 동일한 월급을 받는 사원을 조회?
SELECT MAX(SALARY)
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 100; -- 12008

SELECT *
FROM EMPLOYEES
WHERE SALARY = 12008;

SELECT *
FROM EMPLOYEES
WHERE SALARY = (SELECT MAX(SALARY)
                FROM EMPLOYEES
                WHERE DEPARTMENT_ID = 100);
-- HAVING 절에 서브쿼리 사용
SELECT department_id, MAX(salary)
FROM employees
GROUP BY department_id
HAVING MAX(salary) > (SELECT MAX(salary)
                      FROM employees
                      WHERE department_id=100 );
-------------------복수행연산자 IN ANY EXISTS ALL--------------------------------            
-- 복수행 연산자 IN 
SELECT last_name, salary
FROM employees
WHERE salary IN ( SELECT salary
                  FROM employees
                  WHERE last_name IN ('Whalen','Fay') );
                  
-- 복수행 연산자 ALL
-- 서브쿼리에서 반환된 모든 값을 전달
SELECT last_name, department_id, salary
FROM employees
WHERE salary > ALL (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG'); 
                    -- 최대값보다 큰 값을 조회
 
SELECT last_name, department_id, salary
FROM employees
WHERE salary < ALL (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG'); 
                    -- 최소값보다 작은 값을 조회
 
 -- 복수행 연산자 ANY 
 -- 서브쿼리에서 반환된 조건 중 하나라도 조건을 만족하면 반환
SELECT last_name, department_id, salary
FROM employees
WHERE salary > ANY (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG'); 
                    -- 서브쿼리에서 나온 최소값보다 큰 값 반환

SELECT last_name, department_id, salary
FROM employees
WHERE salary < ANY (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG');
                    -- 서브쿼리에서 나온 최대값보다 작은 값 반환

-- 복수행 연산자 EXISTS
-- 서브쿼리에서 실행된 결과가 하나라도 존재하는지 여부를 확인할 때 사용하는 것
SELECT last_name, department_id, salary
FROM employees
WHERE EXISTS (SELECT employee_id
              FROM employees
              WHERE commission_pct IS NOT NULL); 
              -- TRUE를 반환하면 결과값이 출력된다. 
              
SELECT last_name, department_id, salary
FROM employees
WHERE EXISTS (SELECT employee_id
              FROM employees
              WHERE salary > 500000 ); -- 결과값이 FALSE라 출력이 안됨.
              
----------------다중 컬럼 서브쿼리-----------------------------------------------
SELECT last_name, department_id, salary
FROM employees
WHERE (department_id, salary) IN (SELECT department_id, MAX(salary)
                                  FROM employees
                                  GROUP BY department_id )
ORDER BY 2; -- 두개의 컬럼을 둘 다 만족하는 것을 추출한다.

------------------인라인 뷰-----------------------------------------------------
-- 인라인 뷰 : FROM 절에 적용된 서브쿼리를 '인라인뷰'라고 한다. 성능과 관련이 있다.
SELECT e.department_id , SUM(salary) 총합, AVG(salary) 평균, COUNT(*) 인원수
FROM employees e , departments d
WHERE e.department_id = d.department_id
GROUP BY e.department_id
ORDER BY 1;

SELECT e.department_id, 총합, 평균, 인원수
FROM (SELECT department_id, SUM(salary) 합계, AVG(salary) 평균 ,COUNT(*) 인원수 
      FROM employees  -- 가상 테이블이다.
      GROUP BY department_id ) e, departments d
WHERE e.department_id = d.department_id
ORDER By 1;
 
                









