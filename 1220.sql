select *
from(select
rownum as num,
EMPLOYEE_ID,
FIRST_NAME,
JOB_ID,
to_char(SALARY , '$999,999,999')as "mon_pay($)",
TRUNC(MONTHS_BETWEEN((SYSDATE),(HIRE_DATE))/12,1) as YEARS_HIRED,
to_char(SALARY/240 , '$999,999,999') as "hr_pay($)",
to_char((SALARY/240)*1100  ,'L99999999') as "hr_pay(\) "
from employees
order by 8 desc)
where num BETWEEN 3 and 8
/
