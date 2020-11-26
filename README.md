# EmployeeMS

Spring boot based solution, which :
 
1. Creating DB Schema, DML scripts and related persistent classes to store each record(Employee
record) in a DB(in memory DB like H2), with below columns:
EmployeeID | EmployeeName | Title | BusinessUnit | Place | SupervisorID | Competencies | Salary
 
2. Creating a /employee/place/{place}/salary/{percentage} PUT endpoint that will update each
record by increasing their salary by percentage(percentage path param) for employees that
have place matching with place path param.
 
3. Creating an endpoint to return the list of employees for a given place from the DB in a
page size of 5.

4. Creating an endpoint to return the range of salaries for a given Competency.
 
5. Swagger (Open API) is configured
