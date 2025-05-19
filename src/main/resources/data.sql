DROP TABLE IF EXISTS employees;
 
CREATE TABLE employees (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  mail VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  age INT  NOT NULL
);
 
INSERT INTO employees (first_name, last_name, mail, password,age) VALUES
  ('Laurent', 'GINA', 'laurentgina@mail.com', 'laurent',25),
  ('Sophie', 'FONCEK', 'sophiefoncek@mail.com', 'sophie',50),
  ('Agathe', 'FEELING', 'agathefeeling@mail.com', 'agathe',30);