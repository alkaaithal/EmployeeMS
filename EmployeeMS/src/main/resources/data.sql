DROP TABLE IF EXISTS EMPLOYEE;
 
CREATE TABLE EMPLOYEE (
  EmployeeId INT AUTO_INCREMENT  PRIMARY KEY,
  EmployeeName VARCHAR(250) NOT NULL,
  Title VARCHAR(250) NOT NULL,
  BusinessUnit VARCHAR(250) DEFAULT NULL,
  Place VARCHAR(250) NOT NULL,
  SupervisorId VARCHAR(250) NOT NULL,
  Competencies VARCHAR(250) NOT NULL,
  Salary LONG NOT NULL,
);

INSERT INTO EMPLOYEE ( EmployeeId, EmployeeName, Title, BusinessUnit, Place, SupervisorId, Competencies, Salary) VALUES
  (1,'alka', 'SD2', 'IT', 'Bangalore', '1234', 'Coding', 1000000),
  (2,'ankit', 'SD3', 'IT', 'Udupi', '23', 'Machine Learning', 1500000),
  (3,'anusha', 'SD1', 'IT', 'Chennai', '345', 'Automation', 1100000),
  (4,'arpita', 'Architect', 'IT', 'Delhi', '13345', 'Cloud', 900000),
  (5,'laxmitha', 'Manager', 'IT', 'Hydrabad', '6537', 'Management', 800000),
  (6,'mahima', 'SD2', 'IT', 'Bangalore', '3455', 'QA', 700000),
  (7,'rahul', 'SD2', 'IT', 'US', '974', 'Testing', 600000),
  (8,'ranjan', 'SD2', 'IT', 'Bangalore', '1234', 'Coding', 1100000),
  (9,'rohit', 'SD3', 'IT', 'Udupi', '23', 'Machine Learning', 1500000),
  (10,'ramesh', 'SD1', 'IT', 'Chennai', '345', 'Automation', 1200000),
  (11,'suresh', 'Architect', 'IT', 'Delhi', '13345', 'Cloud', 700000),
  (12,'john', 'Manager', 'IT', 'Hydrabad', '6537', 'Management', 900000),
  (13,'mahesh', 'SD2', 'IT', 'Bangalore', '3455', 'QA', 800000),
  (14,'hima', 'SD2', 'IT', 'US', '974', 'Testing', 500000),
    (16,'rohan', 'SD2', 'IT', 'Bangalore', '3455', 'Automation', 700000),
      (17,'mohan', 'SD2', 'IT', 'Bangalore', '3455', 'Coding', 700000),
        (18,'sachin', 'SD2', 'IT', 'Bangalore', '3455', 'QA', 700000),
          (19,'virat', 'SD2', 'IT', 'Bangalore', '3455', 'Coding', 700000),
            (20,'ashwin', 'SD2', 'IT', 'Bangalore', '3455', 'Management', 700000),
  (15,'bindu', 'SD2', 'IT', 'US', '974', 'Testing', 600000);
