select * from emp;

select * from dept;

select * from 

select * 
 from emp e, dept d 
 where e.deptno = d.deptno 
;

select job, avg(sal) avg 
 from emp e, dept d 
 where e.deptno = d.deptno 
 group by job 
 order by job;
 
select to_char(hiredate,'day'), avg(sal) avg 
 from emp e, dept d 
 where e.deptno = d.deptno 
 group by to_char(hiredate,'day') 
 order by 1;
 
 
 
 