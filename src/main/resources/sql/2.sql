ALTER TABLE `guestbook`.`tbl_users` ADD COLUMN `firstname` VARCHAR(255) DEFAULT NULL, ADD COLUMN `lastname` VARCHAR(255) DEFAULT NULL;

CREATE TABLE `employee_tbl` (
  `emp_no` int(11) NOT NULL,
  `emp_name` varchar(45) DEFAULT NULL,
  `emp_password` varchar(45) DEFAULT NULL,
  `emp_role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`emp_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `te_database`.`lead_factory_tbl` 
ADD COLUMN `quantity` INT NULL AFTER `machine_no`;