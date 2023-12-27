insert into employeeList(employeeName, email, department)
select 'John Doe', 'johndoe@example.com', 'Marketing'
where not exists (select 1 from employeeList where employeeId=1);

 insert into employeeList(employeeName, email, department)
 select'Jane Smith', 'janesmith@example.com', 'Human Resources'
 where not exists (select 2 from employeeList where employeeId=2);


 insert into employeeList(employeeName, email, department)
 select'Bob Johnson', 'bjohnson@example.com', 'Sales'
 where not exists (select 3 from employeeList where employeeId=3);


 insert into employeeList(employeeName, email, department)
 select'Alice Lee', 'alee@example.com', 'IT'
 where not exists (select 4 from employeeList where employeeId=4);


 insert into employeeList(employeeName, email, department)
 select'Mike Brown', 'mbrown@example.com', 'Finance'
 where not exists (select 5 from employeeList where employeeId=5);


 insert into employeeList(employeeName, email, department)
select 'Sara Lee', 'slee@example.com', 'Operations'
where not exists (select 6 from employeeList where employeeId=6);
