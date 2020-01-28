DROP TABLE IF EXISTS TBL_EMPLOYEE;
 
CREATE TABLE TBL_EMPLOYEE (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  emp_name VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  salary DOUBLE(250) NOT NULL,
  bonus_percentage DOUBLE(250) NOT NULL,
  gross_salary DOUBLE(250) NOT NULL
);