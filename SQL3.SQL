create table dima (kita varchar2(30),
decem number(17);
-- 이렇게하면 dima라는 테이블을 만드는데 col 속성이 kita varchar2(30) kita col 문자속성 (30)개, decem 숫자속성 (17)개가 완성됩니다.
-- 여기에 데이터를 넣고 싶으면                   
insert into dima(kita,decem)
select loc,DEPTNO from dept;
-- 인서트 into dima(kita,decem)에 넣습니다.
-- loc,DEPTNO를 DEPT에 있는
--SYS는 모든것을 볼수 있습니다.
select * from hr.dima;
--라고 입력하면 hr에 있는 디마도 볼수있습니다.
--물론 scott에서도 볼수있습니다.
--스캇에서
grant select on dima to hr; --을 입력하면 hr이 스캇에 있는 디마를 볼수있게됩니다.
