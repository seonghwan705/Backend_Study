show user;

-- hr 계정 lock 풀고 비번 hr 설정
alter user hr identified by hr; -- 비밀번호변경
alter user hr identified by hr account unlock; -- 락푸는것 

-- workshop 계정 생성 및 권한 부여
-- system 관리자계정에서 작업할 것

create user workshop identified by workshop; -- 계정 생성
grant resource, connect to workshop; -- 권한 부여 