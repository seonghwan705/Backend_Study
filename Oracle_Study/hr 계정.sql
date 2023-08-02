
-- 1. ��� �÷� ����
SELECT * FROM EMPLOYEES;

SELECT * FROM DEPARTMENTS;

-- 2. Ư���÷� ����
SELECT EMPLOYEE_ID, LAST_NAME, HIRE_DATE, SALARY 
FROM EMPLOYEES;

-- 3. ���� ����

SELECT LAST_NAME, SALARY, SALARY * 12
FROM EMPLOYEES;

-- 4. ��Ī �ֱ�
SELECT last_name as �̸�, salary ����, salary * 12 as ����
FROM employees;

-- 5. ���� ���� ��� " " 
SELECT last_name as "��� �̸�", salary "��� ����", salary * 12 as "�� ��" 
FROM employees;

-- 6. NVL(�÷�, ġȯ��) => �� ���� ���������� ġȯ
SELECT last_name �̸�, salary ����, commission_pct ������,
 salary * 12+NVL(commission_pct,0) as ����
FROM employees;

-- 7. ���� : �÷� || �÷�
SELECT last_name || salary as "�̸� ����" 
FROM employees;

-- 7. ���� : �÷� || '��'
SELECT last_name || ' ���' 
FROM employees;

-- 7. ���� : �÷� || �÷� || '��'
SELECT last_name || '�� ������ ' || job_id || ' �Դϴ�' as "����� ����" 
FROM employees;

-- 8. �ߺ�����
SELECT DISTINCT job_id
FROM employees;

-- 9. WHERE ���ǽ�
SELECT employee_id,last_name,job_id, salary
FROM employees
WHERE salary >= 10000;

-- ���� ��ҹ��ڸ� ������. 
SELECT employee_id,last_name,job_id, salary
FROM employees
WHERE last_name = 'King';

-- 10. ��¥������ ������ => ��ġ�����ͷ� ���, �񱳿����� ��� ����
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

-- 12. IN ������ : ��ġ�ϴ� �� ã��
SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE employee_id IN ( 100,200,300 );

SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE last_name IN ( 'King','Abel','Jones');

SELECT employee_id,last_name,salary,hire_date
FROM employees
WHERE hire_date IN ( '01/01/13','07/02/07');

-- 13. LIKE ������ + ���ϵ�ī�� %, _
SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE 'J%'; -- J �� �����ϴ� �� ã��

SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '%ai%'; -- ai �����ϴ� �� ã��

SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '%in'; -- in���� ������ �� ã��

SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '_b%'; -- �� ��° ���ڰ� b�� �� ã��

SELECT employee_id,last_name,salary
FROM employees
WHERE last_name LIKE '_____d'; -- 6��° ���ڰ� d�� �� ã�� 

-- ESCAPE : ���ϵ�ī�带 ���ڷ� �ν��ϰ��� �� �� ���
SELECT employee_id,last_name,salary,job_id
FROM employees
WHERE job_id LIKE '%E___' ESCAPE 'E'; -- �ڿ��� 3��° ���ڷ� _ �� ���� ��� ��ȸ

-- 14. �� ������ AND, OR, NOT
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

-- WHERE ������ NULL �� ã�� : IS NULL ������ 
SELECT last_name,job_id,salary
FROM employees
WHERE commission_pct IS NULL; -- NULL�� �� ã��

SELECT last_name,job_id,salary
FROM employees
WHERE manager_id IS NOT NULL; -- NULL�� �ƴ� �� ã��

-- �� ������ ���� ���� : NOT > AND > OR ����
SELECT last_name,job_id,salary,commission_pct
FROM employees
WHERE ( job_id ='AC_MGR' OR job_id='MK_REP' ) 
AND commission_pct IS NULL
AND salary >=4000
AND salary <= 9000;

-- ORDER BY : ASC, DESC
SELECT employee_id,last_name,job_id,salary
FROM employees
ORDER BY salary DESC; -- ������ �� �������� ����

SELECT employee_id,last_name,job_id,salary
FROM employees
ORDER BY salary ASC; -- ������ �� �������� ���� (�⺻��)

SELECT employee_id,last_name,job_id,salary as "����" 
FROM employees
ORDER BY ���� DESC; -- ��Ī���� ���İ���!!!

SELECT employee_id,last_name,job_id,salary as "����" 
FROM employees
ORDER BY 4 DESC; -- ���������� ���İ���!!!

SELECT employee_id,last_name as �̸�,job_id,salary 
FROM employees
ORDER BY last_name ASC; -- A:65 B:66

SELECT employee_id,last_name,salary,hire_date as �Ի���
FROM employees
ORDER BY hire_date DESC; -- �ֱٺ��� ���ű���

-- ������ ���� ���������ϰ� ���ĵ� �����͸� �ٽ� ��¥�� �������� ����
SELECT employee_id,last_name,salary,hire_date
FROM employees
ORDER BY salary DESC, hire_date; 

SELECT employee_id,last_name,salary,hire_date
FROM employees
ORDER BY 3 DESC, 4; -- ���� ���� ��

-- NULL �� ���� : NULL ����Ŭ���� ���� ū ��, ���������� ������, ���������� ù��°

-- [ ���� ���̺� : DUAL ] 
-- �ӽ� ���̺�, �뵵 : FROM ���� ������ ������ ���̺��� ���� ��� 
SELECT 287*1665
FROM DUAL;

SELECT SYSDATE
FROM DUAL; -- ���� ��¥ ���

-- INITCAP : ù ���ڸ� �빮�� �������� �ҹ���
SELECT INITCAP('ORACLE SQL') -- ���� ����
FROM dual;

SELECT email, INITCAP(email) -- �÷� ����
FROM employees;

-- UPPER : ��� ���ڸ� �빮�ڷ�
SELECT last_name, UPPER(last_name)
FROM employees;

SELECT last_name, salary
FROM employees
WHERE UPPER(last_name)='KING'; -- ���� �ҹ������� �빮������ �򰥸� �� ���

-- ��� �ҹ���
SELECT last_name, LOWER(last_name)
FROM employees;

-- ���ڿ� ����
SELECT CONCAT( last_name, salary)
FROM employees;

SELECT last_name || salary
FROM employees;

-- LENGTH �Լ� : ���ͷ� ���� �� ����
SELECT last_name, LENGTH(last_name)
FROM employees; -- ���ͷ��� �� ��������

-- INSTR : Ư�� ���ڰ� ��Ÿ���� ��ġ�� ��ȯ
SELECT INSTR('MILLER' , 'L', 1 , 2 ), INSTR('MILLER' , 'X', 1 , 2 )
FROM dual; -- L����, 1��° M����, 2��° L ��ġ��

-- SUBSTR : ���ڿ����� �Ϻκ��� ���ڿ��� ������ �� ���
SELECT hire_date �Ի���, SUBSTR(hire_date,1,2) �Ի�⵵
FROM employees; -- �Ի��� 1��°���� 2�ڸ� ����

SELECT SUBSTR('900303-1234567' , 8 , 1 ) 
FROM dual; -- 8��° �ڸ����� 1�ڸ� ����

SELECT SUBSTR('900303-1234567' , 8 ) 
FROM dual; -- 8��° �ڸ����� ������ ����

SELECT SUBSTR('900303-1234567' , -8 ) 
FROM dual; -- �ڿ��� 8��°���� ������ ���� 

-- REPLACE �Լ� : Ư�� ���ڿ��� ġȯ�� �� ����ϴ� �Լ� 
SELECT REPLACE('JACK and JUE' , 'J' , 'BL' ) 
FROM dual; -- ���'J'���ڸ� 'BL'�� ġȯ

-- LPAD �Լ� : ���ڿ��� ������ ���� �Ŀ� Ư�� ���ڸ� ���ʺ��� ������ ���ڷ� ä��� �Լ�
SELECT LPAD('MILLER' , 10 , '*' ) 
FROM dual; -- �� �ڸ��� 10, 'MILLER' ������ ���� ��, '*'���ڷ� ������ �ڸ� ä��
-- ****MILLER <<

-- RPAD �Լ� :  ���ڿ��� ���� ���� �Ŀ� Ư�� ���ڸ� ���ʺ��� ������ ���ڷ� ä��� �Լ�
SELECT RPAD('MILLER' , 10 , '*' ) 
FROM dual; -- �� �ڸ��� 10, 'MILLER' ���� ���� ��, '*'���ڷ� ������ �ڸ� ä��
-- MILLER****

-- ���� �� ������ �ֹε�Ϲ�ȣ ���� ����
-- ��� 1 : SUBSTR , CONCAT || Ȱ��
SELECT SUBSTR('900303-1234567',1,8)||'******' �ֹι�ȣ 
FROM dual;
-- ù��° �ڸ����� 8�ڸ� �����ϰ� '******' ����

-- ��� 2 : SUBSTR �� RPAD Ȱ��
SELECT RPAD(SUBSTR('900303-1234567',1,8),14,'*')
FROM DUAL;

-- ��� 3 : REPLACE, SUBSTR Ȱ��
SELECT REPLACE( '900303-1234567', SUBSTR('900303-1234567', 9 ) , '******' ) 
�ֹι�ȣ 
FROM dual; -- SUBSTR���� '234567' �����Ͽ� ******�� ġȯ

-- LTRIM �Լ� : ���ڿ����� Ư�� ���ڸ� �����ϱ� ���� �뵵
-- ù ���ں��� �����Ͽ�, ������ ���ڿ� ��ġ���� �ʴ� ���ڰ� ���� ������ �ش� ���� ����
SELECT LTRIM('MILLER', 'M')
FROM dual; -- ILLER

SELECT LTRIM('     MILLER     '), LENGTH(LTRIM('     MILLER     '))
FROM dual; -- ���� ���� ���� �� ���� ���� ���� 

-- RTRIM �Լ�
SELECT RTRIM('MILLER', 'R')
FROM dual; -- 'MILLE'

SELECT RTRIM('     MILLER     '), LENGTH(RTRIM('     MILLER     '))
FROM dual; -- ������ ���� ���� �� ������ ���� ����

-- TRIM �Լ� : ���� ��� ����
SELECT TRIM( '0' FROM '0001234567000' ) 
FROM dual; -- ���� 0 ����

SELECT TRIM( LEADING '0' FROM '0001234567000' ) 
FROM dual; -- ���� 0 ����

SELECT TRIM( TRAILING '0' FROM '0001234567000' ) 
FROM dual; -- ������ 0 ����

-- [ ����ó�� �Լ� ]

-- ROUND �Լ� : ������ �ڸ� �� ���Ͽ��� �ݿø��� ����� ��ȯ
SELECT ROUND( 456.789, 2 ) 
FROM dual; -- 456.79

SELECT ROUND( 456.789, -1 ) 
FROM dual; -- 460

SELECT ROUND( 456.789 ) 
FROM dual; -- 457

-- TRUNC �Լ� : ������ �ڸ� �� ���Ͽ��� ������ ��� ��ȯ
SELECT TRUNC( 456.789, 2 ) 
FROM dual; -- 456.78

SELECT TRUNC( 456.789, -1 ) 
FROM dual; -- 450

SELECT TRUNC( 456.789 ) 
FROM dual; -- 456

-- MOD �Լ� : ���� ���� ��, ���� �ƴ� �������� ��ȯ
SELECT MOD( 10 , 3 ) , MOD( 10 , 0 ) 
FROM dual; -- 1, 10

SELECT employee_id,last_name,salary 
FROM employees
WHERE MOD(employee_id,2)=1;
-- ��� ID�� Ȧ���� ����� ����ϴ� SQL��

-- CEIL �Լ� : �Ҽ����� ���� �Ǽ����� ���������� ��ȯ�ϴ� �Լ�
-- �־��� ���ں��� ũ�ų� ���� �ּ� ������
SELECT CEIL(10.6), CEIL(-10.6) 
FROM dual; -- 11, -10

-- FLOOR �Լ� : �Ҽ����� ���� �Ǽ����� ���������� ��ȯ�ϴ� �Լ�
-- �־��� ���ں��� �۰ų� ���� �ִ� ������
SELECT FLOOR(10.6), FLOOR(-10.6) 
FROM dual; -- 10, -11

-- SIGN �Լ� : ������ ���� ������� �������� 0���� �Ǻ�
-- ����� : ��� (1) ���� (-1) 0(0)
SELECT SIGN( 100 ) , SIGN(-20) , SIGN(0) 
FROM dual; -- 1, -1, 0

-- ������ 15000���� ū ����� ����ϴ� SQL��
SELECT employee_id,last_name,salary 
FROM employees
WHERE SIGN(salary-15000)=1;

-- [ ��¥ ���� ] 
select *
from NLS_SESSION_PARAMETERS;

create table exam
(a date, b date);

insert into exam (a,b)
VALUES ( to_date('15/01/01', 'RR/MM/DD'), to_date('15/01/01', 'YY/MM/DD'));

-- �ý����� ������ 1995�⵵�� ����
insert into exam (a,b)
VALUES ( to_date('95/01/01', 'RR/MM/DD'), to_date('1995/01/01', 'YYYY/MM/DD'));

SELECT TO_CHAR(a,'RRRR'), TO_CHAR(b,'YYYY')
FROM exam;

-- ���� ��¥ ���
SELECT SYSDATE
FROM dual;

-- ����, ����
SELECT SYSDATE ����, SYSDATE+1 ����, SYSDATE-1 ����
FROM dual;

-- �ٹ� �⵵ ���ϱ�!
SELECT last_name, hire_date, TRUNC((sysdate-hire_date)/365) "��" 
FROM employees
ORDER BY 3 desc;

-- MONTHS_BETWEEN �Լ� : ��¥�� ��¥ ������ ���� ���� ��ȯ�ϴ� �Լ�
SELECT last_name, hire_date, MONTHS_BETWEEN(sysdate, hire_date) "�ٹ� ����" 
FROM employees
ORDER BY 3 desc;

-- �Ҽ��� �Ⱥ��̰� �ϱ�
SELECT last_name, hire_date, TRUNC(MONTHS_BETWEEN(sysdate, hire_date)) "��
�� ����" FROM employees
ORDER BY 3 desc;

-- ADD_MONTHS �Լ� : ������ ��¥�� Ư�� ���� ���� ���ϰų� �� ��¥�� ��ȯ�ϴ� �Լ�
SELECT sysdate ����, ADD_MONTHS(sysdate,1) ������, ADD_MONTHS(sysdate,-1) ������
FROM dual;

-- �Ի� �� 5������ ���� �� ��¥ ���
SELECT last_name, hire_date, ADD_MONTHS(hire_date , 5)
FROM employees
ORDER BY 3 desc;

-- NEXT_DAY �Լ� : ������ ��¥�� �������� ���ƿ��� ���� ����� ���Ͽ� �ش��ϴ� ��¥�� ��ȯ�ϴ� �Լ�
SELECT last_name, hire_date, NEXT_DAY(hire_date, '��'),NEXT_DAY(hire_date, 6)
FROM employees
ORDER BY 3 desc;

-- LAST_DAY : �ش� ��¥�� ���� ���� ������ ��¥�� ��ȯ�ϴ� �Լ�
SELECT last_name, hire_date, LAST_DAY(hire_date)
FROM employees
ORDER BY 2 desc; -- �Ի��� ���� ������ ��¥ ���ϱ�

-- ROUND �Լ� : ��¥�����͸� ROUND �Լ��� �̿��Ͽ� �ݿø�����
SELECT last_name, hire_date, 
 ROUND(hire_date,'YEAR'),
 ROUND(hire_date,'MONTH')
FROM employees;

-- TRUNC �Լ� : ��¥�����͸� ���� ����� �⵵ �Ǵ� ���� ������ ����
SELECT last_name, hire_date, 
 TRUNC(hire_date,'YEAR'),
 TRUNC(hire_date,'MONTH')
FROM employees; -- 1) �⵵ ���� : ��, �� 01/01 2) �� ���� : �� 01

-- ��ȯ�Լ�
-- TO_NUMBER : ���ڵ����͸� ���ڵ����ͷ� ��ȯ ( ��ȯ�� : ���� )
-- TO_DATE : ���ڵ����͸� ��¥�����ͷ� ��ȯ ( ��ȯ�� : ��¥ )
-- TO_CHAR : ����, ��¥ �����͸� ���ڵ����ͷ� ��ȯ ( ��ȯ�� : ���� )

-- �ڵ� ����ȯ
SELECT last_name, salary
FROM employees
WHERE salary = '17000';

-- TO_CHAR ���� : TO_CHAR(�÷�, ����)
-- ��¥�� ������ �־� ���ڷ� ���
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD,(AM) DY HH24:MI:SS')
FROM dual;

-- �Ի簡 9���� ��� ���� ���
SELECT last_name,hire_date, salary
FROM employees
WHERE TO_CHAR(hire_date, 'MM')='09'; -- ��¥�� ���ڷ� ����

-- ��¥ �� �ð� ��� ���Ŀ� �ѱ� ǥ���� �߰�
SELECT TO_CHAR(SYSDATE, ' YYYY "��" MM "��" DD "��" ') ��¥
FROM dual;

-- ���� ��� ����
SELECT last_name, salary, 
 TO_CHAR(salary, '$999,999') �޷�,
 TO_CHAR(salary, 'L999,999') ��ȭ
FROM employees;

-- TO_NUMBER �Լ� : ���� ������ ���ڿ��� ���ڷ� ��ȯ�ϱ� ���ؼ� ���
-- ���� : TO_NUMBER (STR) 
SELECT TO_NUMBER('123') + 100 
FROM dual;

-- �Ʒ� ��ɾ�� ��¥ ������ RR/MM/DD �� �ƴ� 
-- YYYY/MM/DD HH24:MI:SS �������� ����
ALTER SESSION SET NLS_DATE_FORMAT='YYYY/MM/DD HH24:MI:SS';

-- ���� '20170802181030'�� ��¥ �����ͷ� ��ȯ
SELECT TO_DATE( '20170802181030' , 'YYYYMMDDHH24MISS' )
FROM dual;

-- ���� ��¥���� Ư�� ��¥ �� ��� ��� : �� �� ���� ��� 
SELECT SYSDATE, SYSDATE-TO_DATE( '20170801' , 'YYYYMMDD' )
FROM dual;

-----------------���� �Լ� : CASE, DECODE----------------------------------------

-- [ �����Լ� ]
-- DECODE �Լ� : ������ �ݵ�� ��ġ�ϴ� ��쿡 ����ϴ� �Լ�
-- CASE : ������ �ݵ�� ��ġ���� �ʾƵ� ���� �� �񱳰� ������ ��쿡 ����ϴ� �Լ�

SELECT last_name,salary,
DECODE(salary,
24000, salary*0.3,
17000, salary*0.2,
salary) ���ʽ�
FROM employees
ORDER BY 2 desc; -- SALARY �� ��ġ�ϴ� ���� �� ��ɹ� ����

SELECT COUNT(*) "���ο���",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2001, 1, 0)) "2001",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2002, 1, 0)) "2002",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2003, 1, 0)) "2003",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2004, 1, 0)) "2004",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2005, 1, 0)) "2005",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2006, 1, 0)) "2006",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2007, 1, 0)) "2007",
 SUM(DECODE(TO_CHAR(hire_date, 'YYYY'), 2008, 1, 0)) "2008"
FROM employees; -- �⵵�� �Ի� �ο� ���ϱ�

-- CASE �Լ� : ���ǹ�������, �پ��� �� �����ڸ� �̿��ؼ� ���� ���� ���� 
SELECT last_name,salary,
CASE salary WHEN 24000 THEN salary*0.3
WHEN 17000 THEN salary*0.2
ELSE salary 
END ���ʽ� FROM employees
ORDER BY 2 desc; -- DECODE�� ���

SELECT last_name,salary,
 CASE WHEN salary >=20000 THEN 1000
 WHEN salary >=15000 THEN 2000
 WHEN salary >=10000 THEN 3000
 ELSE 4000 
 END ���ʽ� FROM employees
ORDER BY 2 desc; -- ���� ��������

SELECT last_name,salary,
 CASE WHEN salary BETWEEN 20000 AND 25000 THEN '��'
 WHEN salary BETWEEN 10000 AND 19999 THEN '��'
 ELSE '��'
 END ��� 
FROM employees
ORDER BY 2 desc; -- BETWEEN ����

SELECT last_name,salary,
 CASE WHEN salary IN ( 24000, 17000 , 14000) THEN '��'
 WHEN salary IN ( 13500, 13000) THEN '��'
 ELSE '��'
 END ��� FROM employees
ORDER BY 2 desc; -- IN �� ��� ����

-----------------�׷��Լ�-------------------------------------------------------
-- �׷��Լ� : SUM �հ�
SELECT SUM(DISTINCT salary),SUM(ALL salary), SUM(salary)
FROM employees;

-- �׷��Լ� : AVG ���
SELECT SUM(salary), ROUND(AVG(salary))
FROM employees;

-- �׷��Լ� : MAX �ִ밪, MIN �ּҰ�
SELECT MAX(salary), MIN(salary)
FROM employees;

-- ��¥ �������� �ּ�, �ִ�
SELECT MIN( hire_date ), MAX( hire_date)
FROM employees;

-- �׷��Լ� : COUNT, ������ �����ϴ� ���� ������ ��ȯ
SELECT COUNT(last_name), COUNT(commission_pct)
FROM employees;

SELECT COUNT(job_id), COUNT(DISTINCT job_id)
FROM employees; -- �� ����ID, ����ID ���� ����

-- ��� ��� ��
SELECT COUNT(*) 
FROM employees;
--------------GROUP BY�Լ�-------------------------------------------------------
-- GROUP BY �Լ� : �׷��Լ�(�����Լ�)�� �ܼ� �÷��� SELECT������ ���� ����� �Ұ���
-- GROUP BY ���� ����ؼ� �ܼ��÷��� �׷����� ������ ���� ����� ��������

SELECT department_id �μ���ȣ, ROUND(AVG(salary)) ��տ���
FROM employees
GROUP BY department_id
ORDER BY 1; -- �׷��� �� �μ��� ��� ������ ��������.

SELECT department_id �μ���ȣ, MAX(salary) �ִ����, MIN(salary) �ּҿ���
FROM employees
GROUP BY department_id
ORDER BY 1; -- �׷��� �� �μ��� �ִ����, �ּҿ���

SELECT TO_CHAR( hire_date , 'YYYY' ) ��,TO_CHAR( hire_date , 'MM') ��, SUM(salary)
FROM employees
GROUP BY TO_CHAR( hire_date , 'YYYY'),TO_CHAR( hire_date , 'MM') 
ORDER BY �� ASC;
-- �Ի�⵵��(1), (1) �׷��� ���� �� �ȿ��� ����(2)�� �߰� �׷���, �����հ踦 ����

-- HAVING �� : GROUP BY���� ���� ������ ��� �� ���ǰ� ��ġ�ϴ� �����͸� ������ �� ���!
-- ** WHERE�� SELECT ������ ���̺� ����� �����͸� ��ȸ�� �� ����ϴ� ������

SELECT department_id, SUM(salary)
FROM employees
GROUP BY department_id
HAVING SUM(salary) >= 90000
ORDER BY 1; 
-- �μ����� �׷����� �ϰ� ���� �հ踦 ����, �ٵ� �� �հ谡 90000�̻��� �μ��� ����

SELECT department_id, COUNT(department_id)
FROM employees
GROUP BY department_id
HAVING COUNT(salary) >= 6
ORDER BY 1; -- �μ��� �׷����� �ϰ�, �μ��� �ο��� 6�� �̻��� �μ��� ����

SELECT department_id, SUM(salary)
FROM employees
WHERE salary >= 3000
GROUP BY department_id
HAVING SUM(salary) >= 90000
ORDER BY 1; 
-- ������ 3000�̻��� �ο��� �����Ͽ�
-- ���� �հ谡 90000 �̻��� �� �μ����� �׷����� �ؼ� ���� �հ踦 ����. 

-- �������� �˻�
SELECT *
FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'EMPLOYEES';

----------����--------------------------------------------------------------
-- EQUI ���� ��� : 106��, 1�� ���� 
-- DEPARTMENT_ID �� NULL �� 1���� ���� ��ġ���� �ʾƼ� ����
SELECT last_name,department_name -- ������ �÷����̶�, ���̺�� ��������
FROM employees, departments
WHERE employees.department_id = departments.department_id;

-- ������ ���̺� ���������� �����ϴ� �÷��� �ݵ�� ���̺��.�÷��� �������� ����ؾ���
SELECT last_name,department_name, departments.DEPARTMENT_ID
FROM employees, departments
WHERE employees.department_id = departments.department_id;

-- ���̺� ��Ī ���
SELECT emp.last_name,department_name, emp.department_id
FROM employees emp, departments dept
WHERE emp.department_id = dept.department_id;
-- �ݵ�� ��Ī ����ؾ���. 

-- WHERE ���� �����÷� ��� �Ӹ� �ƴ϶� '�˻�����' �߰�
-- ����Ŭ ������ WHERE ���� �������ǰ� �˻������� ���� �����Ѵ�.
-- ANSI ������ �������ǰ� �˻������� "�и�"�Ѵ�. 
SELECT emp.last_name,salary,department_name 
FROM employees emp, departments dept
WHERE emp.department_id = dept.department_id
AND last_name='Whalen'; -- �˻����� �߰�

SELECT d.department_name �μ���, COUNT(e.employee_id) �ο���
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND TO_CHAR( hire_date , 'YYYY') <= 2005
GROUP BY d.department_name -- �˻����� �߰�
ORDER BY 2; 

-- NON EQUI ���� : = �����ڰ� �ƴ�, �ٸ� ������ ����ϴ� ��
SELECT last_name, salary, grade_level
FROM employees e, job_grades g
WHERE e.salary BETWEEN g.lowest_sal AND g.highest_sal; 

-- 3���� ���̺� ����, E�� D�� EQUI ����, E�� G�� NON EQUI ���� => INNER ����(��ġ����)
-- N���� ���̺� ���ν�, �ݵ�� N-1���� ������ �ʿ��ϴ�. 
SELECT last_name, salary, department_name, grade_level
FROM employees e, departments d, job_grades g
WHERE e.department_id = d.department_id
AND e.salary BETWEEN g.lowest_sal AND g.highest_sal;

-- SELF ���� : ������̺� �������� ����
SELECT employee_id, LAST_NAME, MANAGER_ID
FROM EMPLOYEES E;
SELECT employee_id, LAST_NAME
FROM EMPLOYEES M;

SELECT e.last_name �����, m.last_name �����ڸ� -- INNER ����, SELF����
FROM employees e, employees m
WHERE e.manager_id = m.employee_id;  -- ���� ���� 106�� ����

-- ���� : E����� M�����ڸ� M2�������� �����ڸ� ����Ͻÿ�.
SELECT *
FROM EMPLOYEES;

SELECT E.LAST_NAME �����, M.LAST_NAME �����ڸ�, M2.LAST_NAME "�������� �����ڸ�"
FROM EMPLOYEES E, EMPLOYEES M, EMPLOYEES M2
WHERE E.MANAGER_ID = M.EMPLOYEE_ID AND M.MANAGER_ID = M2.EMPLOYEE_ID;
-- ����ü�� ���̺��� ����� �������� ������ ����ϴ� ��!

-- OUTER ����
SELECT e.last_name �����, m.last_name �����ڸ� 
FROM employees e, employees m
WHERE e.manager_id = m.employee_id(+);

SELECT e.last_name �����,
 m.last_name �����ڸ�, mm.last_name "�������� �����ڸ�" 
FROM employees e, employees m , employees mm
WHERE e.manager_id = m.employee_id(+) 
AND m.manager_id = mm.employee_id(+);

-- CARTESIAN PRODUCT
SELECT EMP.LAST_NAME, DEPARTMENT_NAME, EMP.DEPARTMENT_ID
FROM EMPLOYEES EMP, DEPARTMENTS DEPT;

SELECT 107 * 27 
FROM DUAL;

---------------ANSI ����--------------------------------------------------------
-- NATURAL JOIN : �����÷� ã�Ƽ� ��������, ���̺��.�÷� �Ǵ� ��Ī.�÷� ���Ұ�
SELECT last_name,department_name, department_id
FROM employees NATURAL JOIN departments; -- DEPARTMENT_ID, MANAGER_ID �� �� �����÷�

SELECT last_name,department_name, department_id
FROM employees e NATURAL JOIN departments d   -- ��������
WHERE department_id=90;                       -- �˻�����

-- USING ��
SELECT last_name,department_name, department_id
FROM employees e JOIN departments d USING(department_id); -- USING(�÷�)���� ����

-- ON�� : ��Ī ��� �ʼ�
SELECT last_name,department_name, e.department_id
FROM employees e JOIN departments d 
ON e.department_id = d.department_id;

SELECT last_name,department_name, e.department_id
FROM employees e INNER JOIN departments d 
ON e.department_id = d.department_id        -- ��������
WHERE e.department_id=90;                   -- �˻�����

-- SELF ����, INNER ����, ON�� ���
SELECT e.last_name �����, m.last_name ������
FROM employees e INNER JOIN employees m 
ON e.manager_id = m.employee_id;

-- 3�� ���̺� ���� �� ON �������� �߰��� ����ؾ���
SELECT e.last_name �����, d.department_name �μ���,
 g.grade_level ���
FROM employees e INNER JOIN departments d 
ON e.department_id = d.department_id
 INNER JOIN job_grades g
ON e.salary BETWEEN g.lowest_sal AND g.highest_sal;

-- ����Ŭ�� ANSI�� �ٲٱ�
SELECT last_name, salary, grade_level       -- ����Ŭ
FROM employees e, job_grades g
WHERE e.salary BETWEEN g.lowest_sal AND g.highest_sal;

SELECT last_name, salary, grade_level       -- ANSI
FROM employees e inner join job_grades g
ON e.SALARY between g.lowest_sal and g.highest_sal;

SELECT e.last_name �����, m.last_name �����ڸ� -- ����Ŭ SELF
FROM employees e, employees m
WHERE e.manager_id = m.employee_id;

SELECT e.last_name �����, m.last_name �����ڸ� -- ANSI SELF
FROM employees e INNER JOIN employees m
ON e.manager_id = m.employee_id;

-- ũ�ν� ����
SELECT LAST_NAME, DEPARTMENT_NAME, E.DEPARTMENT_ID
FROM EMPLOYEES e CROSS JOIN DEPARTMENTS d;  -- ī��θ�Ƽ X ī��θ�Ƽ

-- LEFT OUTER ����, NULL �� ���
SELECT e.last_name �����, m.last_name �����ڸ� 
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

------------��������-----------------------------------------------------------
SELECT LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY >= ( SELECT SALARY      -- �갡 ��������
                 FROM EMPLOYEES
                 WHERE LAST_NAME ='Whalen');
-- LAST_NAME�� Whalen�� �ָ� ���������� ã�Ƽ� �װ� �������� ����!
-- �� Whalen���� ������ ���� ������� ã�Եȴ�.

-- ������� ��� ���޺��� �� ���� ������ �޴� ����� ��ȸ?
SELECT AVG(salarY)
FROM EMPLOYEES; --6461.83

SELECT *
FROM EMPLOYEES
WHERE SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEES);
-- ���������� ��� ���ް� ���� (������ ��������)

-- ������ �μ���ȣ�� 100�� ����� �߿��� �ִ������ �޴� ����� ������ ������ �޴� ����� ��ȸ?
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
-- HAVING ���� �������� ���
SELECT department_id, MAX(salary)
FROM employees
GROUP BY department_id
HAVING MAX(salary) > (SELECT MAX(salary)
                      FROM employees
                      WHERE department_id=100 );
-------------------�����࿬���� IN ANY EXISTS ALL--------------------------------            
-- ������ ������ IN 
SELECT last_name, salary
FROM employees
WHERE salary IN ( SELECT salary
                  FROM employees
                  WHERE last_name IN ('Whalen','Fay') );
                  
-- ������ ������ ALL
-- ������������ ��ȯ�� ��� ���� ����
SELECT last_name, department_id, salary
FROM employees
WHERE salary > ALL (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG'); 
                    -- �ִ밪���� ū ���� ��ȸ
 
SELECT last_name, department_id, salary
FROM employees
WHERE salary < ALL (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG'); 
                    -- �ּҰ����� ���� ���� ��ȸ
 
 -- ������ ������ ANY 
 -- ������������ ��ȯ�� ���� �� �ϳ��� ������ �����ϸ� ��ȯ
SELECT last_name, department_id, salary
FROM employees
WHERE salary > ANY (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG'); 
                    -- ������������ ���� �ּҰ����� ū �� ��ȯ

SELECT last_name, department_id, salary
FROM employees
WHERE salary < ANY (SELECT salary
                    FROM employees
                    WHERE job_id = 'IT_PROG');
                    -- ������������ ���� �ִ밪���� ���� �� ��ȯ

-- ������ ������ EXISTS
-- ������������ ����� ����� �ϳ��� �����ϴ��� ���θ� Ȯ���� �� ����ϴ� ��
SELECT last_name, department_id, salary
FROM employees
WHERE EXISTS (SELECT employee_id
              FROM employees
              WHERE commission_pct IS NOT NULL); 
              -- TRUE�� ��ȯ�ϸ� ������� ��µȴ�. 
              
SELECT last_name, department_id, salary
FROM employees
WHERE EXISTS (SELECT employee_id
              FROM employees
              WHERE salary > 500000 ); -- ������� FALSE�� ����� �ȵ�.
              
----------------���� �÷� ��������-----------------------------------------------
SELECT last_name, department_id, salary
FROM employees
WHERE (department_id, salary) IN (SELECT department_id, MAX(salary)
                                  FROM employees
                                  GROUP BY department_id )
ORDER BY 2; -- �ΰ��� �÷��� �� �� �����ϴ� ���� �����Ѵ�.

------------------�ζ��� ��-----------------------------------------------------
-- �ζ��� �� : FROM ���� ����� ���������� '�ζ��κ�'��� �Ѵ�. ���ɰ� ������ �ִ�.
SELECT e.department_id , SUM(salary) ����, AVG(salary) ���, COUNT(*) �ο���
FROM employees e , departments d
WHERE e.department_id = d.department_id
GROUP BY e.department_id
ORDER BY 1;

SELECT e.department_id, ����, ���, �ο���
FROM (SELECT department_id, SUM(salary) �հ�, AVG(salary) ��� ,COUNT(*) �ο��� 
      FROM employees  -- ���� ���̺��̴�.
      GROUP BY department_id ) e, departments d
WHERE e.department_id = d.department_id
ORDER By 1;
 
                









