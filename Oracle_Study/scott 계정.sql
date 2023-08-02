INSERT INTO dept( deptno, dname, loc )
VALUES ( 50 ,'개발','서울');

INSERT INTO dept( deptno, dname )
VALUES ( 51 ,'개발');

INSERT INTO dept
VALUES ( 62 ,'인사','경기');

-- error 발생됨
INSERT INTO dept
VALUES ( 61 ,'인사');

INSERT INTO dept(deptno, dname , loc )
VALUES ( 80 ,'인사', null );

commit;

select *
from dept;

--
SELECT * FROM dept
WHERE 1=2;

CREATE TABLE mydept
AS
SELECT * FROM dept
WHERE 1=2;

CREATE TABLE mydept10
AS
SELECT * FROM dept;

SELECT * FROM dept;

-- mydept
select *
from mydept;

INSERT INTO mydept
SELECT deptno,dname,loc
FROM dept;
commit;

-- 무조건 insert all
CREATE TABLE myemp_hire
AS
SELECT empno,ename,hiredate,sal
FROM emp
WHERE 1=2;

CREATE TABLE myemp_mgr
AS
SELECT empno,ename,mgr
FROM emp
WHERE 1=2;

select *
from myemp_hire;

select *
from myemp_mgr;

INSERT ALL
INTO myemp_hire VALUES ( empno,ename,hiredate,sal )
INTO myemp_mgr VALUES ( empno,ename,mgr )
SELECT empno,ename,hiredate,sal,mgr
FROM emp;

commit;

SELECT empno,ename,hiredate,sal,mgr
FROM emp;

-- 조건 insert all
CREATE TABLE myemp_hire2
AS
SELECT empno,ename,hiredate,sal
FROM emp
WHERE 1=2;

CREATE TABLE myemp_mgr2
AS
SELECT empno,ename,mgr,sal
FROM emp
WHERE 1=2;


select *
from myemp_hire2;

select *
from myemp_mgr2;

INSERT ALL
WHEN sal = 800 THEN
 INTO myemp_hire2 VALUES ( empno,ename,hiredate,sal )
WHEN sal < 2500 THEN
 INTO myemp_mgr2 VALUES ( empno,ename,mgr,sal )
SELECT empno,ename,hiredate,sal,mgr
FROM emp;

-- insert first
CREATE TABLE myemp_hire3
AS
SELECT empno,ename,hiredate,sal
FROM emp
WHERE 1=2;

CREATE TABLE myemp_mgr3
AS
SELECT empno,ename,mgr,sal
FROM emp
WHERE 1=2;


select *
from myemp_hire3;

select *
from myemp_mgr3;

INSERT FIRST
WHEN sal = 800 THEN
 INTO myemp_hire3 VALUES ( empno,ename,hiredate,sal )
WHEN sal < 2500 THEN
 INTO myemp_mgr3 VALUES ( empno,ename,mgr,sal )
SELECT empno,ename,hiredate,sal,mgr
FROM emp;

-- update 문
select *
from mydept;


UPDATE mydept
SET dname='영업',loc='경기' 
WHERE deptno = 50;
commit;

UPDATE mydept
SET dname='영업',loc='경기';

rollback;


UPDATE mydept
SET dname= ( SELECT dname
             FROM dept
             WHERE deptno = 10),
    loc= ( SELECT loc
           FROM dept
           WHERE deptno=20)
WHERE deptno = 60;
select *
from mydept;

-- DELETE 
SELECT * FROM MYDEPT;

DELETE FROM mydept
WHERE deptno = 50;
COMMIT;

DELETE FROM mydept;
rollback;

DELETE 
FROM mydept
WHERE loc = (SELECT loc
 FROM dept
 WHERE deptno = 20);
 
 -- 한글 byte 확인
 select *
 from NLS_DATABASE_PARAMETERS
 where parameter = 'NLS_CHARACTERSET';
 
-- 일반적인 방법1
-- ==> 제약조건이 없기 때문에 모든 컬럼에 중복 가능하고 null 가능하다.
-- ==> 저장할 때 컬럼명을 명시하지 않는 컬럼은 자동으로 null 저장됨.
CREATE TABLE scott.employee
( empno NUMBER(4),
 ename VARCHAR2(20),
 hiredate DATE,
 sal NUMBER(7,2));

CREATE TABLE employee10
( empno NUMBER(4),
 ename VARCHAR2(20),
 hiredate DATE,
 sal NUMBER(7,2));

-- default 옵션
CREATE TABLE employee2
( empno NUMBER(4),
 ename VARCHAR2(20),
 hiredate DATE DEFAULT SYSDATE,
 sal NUMBER(7,2));

INSERT INTO employee2 ( empno,ename,sal)
VALUES ( 10, '홍길동',3000);

select *
from employee2;

-- 제약조건
-- 컬럼레벨의 primary key 제약조건타입 지정
CREATE TABLE department
( deptno NUMBER(2) CONSTRAINT department_deptno_pk PRIMARY KEY,
 dname VARCHAR2(15),
 loc VARCHAR2(15) );

CREATE TABLE department10
( deptno NUMBER(2) PRIMARY KEY,
 dname VARCHAR2(15),
 loc VARCHAR2(15) );
 
-- 제약조건 확인
select *
from user_constraints
where table_name = 'DEPARTMENT10';

-- 테이블 레벨의 primary key 제약조건타입 지정
CREATE TABLE department2
( deptno NUMBER(2), 
 dname VARCHAR2(15),
 loc VARCHAR2(15) ,
 CONSTRAINT department2_deptno_pk PRIMARY KEY(deptno)
);
CREATE TABLE department3
( deptno NUMBER(2), 
 dname VARCHAR2(15),
 loc VARCHAR2(15) ,
 CONSTRAINT department3_deptno_loc_pk PRIMARY KEY(deptno, loc)  -- 복합컬럼은 테이블 레벨만 가능하다.
);

-- 컬럼레벨의 unique 제약조건타입 지정
CREATE TABLE department4
( deptno NUMBER(2) CONSTRAINT department4_deptno_pk PRIMARY KEY, -- unique, not null
  dname VARCHAR2(15) CONSTRAINT department4_dname_uk UNIQUE,     -- nuique, null 허용
 loc VARCHAR2(15) );

insert into department4 ( deptno, dname, loc ) values ( 1, 'aa', 'bb');
insert into department4 ( deptno, dname, loc ) values ( 2, null, 'bb');

select * from department4;

-- 테이블 레벨의 unique 제약조건타입 지정
CREATE TABLE department5
( deptno NUMBER(2) CONSTRAINT department5_deptno_pk PRIMARY KEY,
 dname VARCHAR2(15), 
 loc VARCHAR2(15),
 CONSTRAINT department5_dname_uk UNIQUE(dname)
);
CREATE TABLE department11
( deptno NUMBER(2) ,
 dname VARCHAR2(15), 
 loc VARCHAR2(15),
 CONSTRAINT department11_deptno_pk PRIMARY KEY(deptno),
 CONSTRAINT department11_dname_uk UNIQUE(dname)
);

-- ############
-- 컬럼레벨의 not null 제약조건타입 지정
CREATE TABLE department6
( deptno NUMBER(2) CONSTRAINT department6_deptno_pk PRIMARY KEY,
 dname VARCHAR2(15) CONSTRAINT department6_dname_uk UNIQUE,
 loc VARCHAR2(15) CONSTRAINT department6_loc_nn NOT NULL);
 
 CREATE TABLE department12
( deptno NUMBER(2) ,
 dname VARCHAR2(15),
 loc VARCHAR2(15) CONSTRAINT department12_loc_nn NOT NULL,
  CONSTRAINT department12_deptno_pk PRIMARY KEY(deptno),
  CONSTRAINT department12_dname_uk UNIQUE(dname)
);
 
-- 테이블 레벨의 not null 제약조건타입은 지원 안됨.

-- 컬럼레벨의 check 제약조건타입 지정
CREATE TABLE department7
( deptno NUMBER(2) ,
 dname VARCHAR2(15) CONSTRAINT department7_dname_ck CHECK(dname IN('개발','인사')) ,
 loc VARCHAR2(15) 
);
insert into department7 ( deptno, dname, loc ) values ( 1, '개발', 'bb');
insert into department7 ( deptno, dname, loc ) values ( 2, '인사', 'bb');

insert into department7 ( deptno, dname, loc ) values ( 3, '관리', 'bb'); -- 에러

select * from department8;

-- 테이블레벨의 check 제약조건타입 지정
CREATE TABLE department8
( deptno NUMBER(2) ,
 dname VARCHAR2(15),
 loc VARCHAR2(15),
CONSTRAINT department8_dname_ck CHECK( dname IN('개발','인사')) 
);

-- FK 실습 - 컬럼레벨

-- master 테이블 생성
create table m1
(  no NUMBER(2) CONSTRAINT m1_no_pk PRIMARY KEY,
  name VARCHAR2(10) );
  
insert into m1 ( no, name ) values ( 10, 'aa');
insert into m1 ( no, name ) values ( 20, 'bb');
insert into m1 ( no, name ) values ( 30, 'cc');
commit;

select *
from m1;

-- slave 테이블
create table s1
( num NUMBER(4) CONSTRAINT s1_num_pk PRIMARY KEY,
  email VARCHAR2(20),
  -- fk 작업
  no NUMBER(2) CONSTRAINT s1_no_fk  REFERENCES  m1(no)
);

insert into s1 ( num, email, no ) values ( 100, 'xxx', 10);
insert into s1 ( num, email, no ) values ( 200, 'xxx2', 20);
insert into s1 ( num, email, no ) values ( 300, 'xxx3', 30);
insert into s1 ( num, email, no ) values ( 400, 'xxx4', null);

insert into s1 ( num, email, no ) values ( 500, 'xxx5', 40); -- 에러
-- fk : 부모에 있는 값, null만 허용

-- FK 실습 - 테이블 레벨
-- master 테이블 생성
create table m2
(  no NUMBER(2) CONSTRAINT m2_no_pk PRIMARY KEY,
  name VARCHAR2(10) );
  
insert into m2 ( no, name ) values ( 10, 'aa');
insert into m2 ( no, name ) values ( 20, 'bb');
insert into m2 ( no, name ) values ( 30, 'cc');
commit;

select *
from m2;

-- slave 테이블
create table s2
( num NUMBER(4) CONSTRAINT s2_num_pk PRIMARY KEY,
  email VARCHAR2(20),
  no NUMBER(2),
  
  -- fk 작업
   CONSTRAINT s2_no_fk FOREIGN KEY(no) REFERENCES m2(no)
);

insert into s2 ( num, email, no ) values ( 100, 'xxx', 10);
insert into s2 ( num, email, no ) values ( 200, 'xxx2', 20);
insert into s2 ( num, email, no ) values ( 300, 'xxx3', 30);
insert into s2 ( num, email, no ) values ( 400, 'xxx4', null);

insert into s2 ( num, email, no ) values ( 500, 'xxx5', 40); -- 에러

-- #################################################################
-- 1. FK이슈:  slave가 참조하는 master의 값을 삭제할 수 없다.
delete from m1
where no = 10;

-- ON DELETE CASCADE
-- master 테이블 생성
create table m3
(  no NUMBER(2) CONSTRAINT m3_no_pk PRIMARY KEY,
  name VARCHAR2(10) );
  
insert into m3 ( no, name ) values ( 10, 'aa');
insert into m3 ( no, name ) values ( 20, 'bb');
insert into m3 ( no, name ) values ( 30, 'cc');
commit;

select *
from m3;


-- slave 테이블
create table s3
( num NUMBER(4) CONSTRAINT s3_num_pk PRIMARY KEY,
  email VARCHAR2(20),
  -- fk 작업
  no NUMBER(2) CONSTRAINT s3_no_fk  REFERENCES  m3(no) ON DELETE CASCADE
);

insert into s3 ( num, email, no ) values ( 100, 'xxx', 10);
insert into s3 ( num, email, no ) values ( 200, 'xxx2', 20);
insert into s3 ( num, email, no ) values ( 300, 'xxx3', 30);
insert into s3 ( num, email, no ) values ( 400, 'xxx4', null);
commit;

select *
from m3;

select *
from s3;

delete from m3
where no = 10;

-- ON DELETE SET NULL
-- master 테이블 생성
create table m4
(  no NUMBER(2) CONSTRAINT m4_no_pk PRIMARY KEY,
  name VARCHAR2(10) );
  
insert into m4 ( no, name ) values ( 10, 'aa');
insert into m4 ( no, name ) values ( 20, 'bb');
insert into m4 ( no, name ) values ( 30, 'cc');
commit;

select *
from m4;


-- slave 테이블
create table s4
( num NUMBER(4) CONSTRAINT s4_num_pk PRIMARY KEY,
  email VARCHAR2(20),
  -- fk 작업
  no NUMBER(2) CONSTRAINT s4_no_fk  REFERENCES  m4(no) ON DELETE SET NULL
);

insert into s4 ( num, email, no ) values ( 100, 'xxx', 10);
insert into s4 ( num, email, no ) values ( 200, 'xxx2', 20);
insert into s4 ( num, email, no ) values ( 300, 'xxx3', 30);
insert into s4 ( num, email, no ) values ( 400, 'xxx4', null);
commit;

select *
from m4;

select *
from s4;

delete from m4
where no = 10;

-- 테이블 삭제
drop table mydept;
drop table mydept10;

drop table m1;

-- m1 과 s1 제약조건 확인
select *
from user_constraints
where table_name ='S1';

select *
from user_constraints
where table_name ='M1';

drop table m1 CASCADE CONSTRAINTS;  -- s1의 fk 제약조건을 삭제

select *
from s1;

-----------------------------------------------------JDBC연동
SELECT * FROM DEPT;