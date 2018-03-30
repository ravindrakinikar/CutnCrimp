

CREATE TABLE `shift_tbl` (
  `shift_no` int(11) NOT NULL,
  `shift_desc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`shift_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `employee_tbl` (
  `emp_no` int(11) NOT NULL,
  `emp_name` varchar(45) DEFAULT NULL,
  `emp_password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`emp_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `emp_shift_tbl` (
  `es_no` int(11) NOT NULL AUTO_INCREMENT,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `emp_no` int(11) DEFAULT NULL,
  `shift_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`es_no`),
  KEY `emp_id_idx` (`emp_no`),
  KEY `shift_id_fk_idx` (`shift_no`),
  CONSTRAINT `emp_id_fk` FOREIGN KEY (`emp_no`) REFERENCES `employee_tbl` (`emp_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `shift_id_fk` FOREIGN KEY (`shift_no`) REFERENCES `shift_tbl` (`shift_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `machine_tbl` (
  `machine_no` int(11) NOT NULL,
  `machine_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`machine_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `model_tbl` (
  `model_no` int(11) NOT NULL,
  `model_name` varchar(45) DEFAULT NULL,
  `model_desc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`model_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




CREATE TABLE `lead_tbl` (
  `lead_no` int(11) NOT NULL,
  `side_type` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `gauge` varchar(45) DEFAULT NULL,
  `strands` varchar(45) DEFAULT NULL,
  `strip_length` varchar(45) DEFAULT NULL,
  `crimp_height` varchar(45) DEFAULT NULL,
  `crimp_width` varchar(45) DEFAULT NULL,
  `wire_length` varchar(45) DEFAULT NULL,
  `pull_force` varchar(45) DEFAULT NULL,
  `terminal_no` int(11) DEFAULT NULL,
  `batch_no` int(11) DEFAULT NULL,
  `coro_dia` varchar(45) DEFAULT NULL,
  `wayback` varchar(45) DEFAULT NULL,
  `model_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`lead_no`),
  KEY `model_no_fk_idx` (`model_no`),
  CONSTRAINT `model_no_fk` FOREIGN KEY (`model_no`) REFERENCES `model_tbl` (`model_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `load_selection_tbl` (
  `ls_no` int(11) NOT NULL,
  `selected_load` varchar(45) DEFAULT NULL,
  `cc_record_date` datetime DEFAULT NULL,
  `cqm` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ls_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lead_factory_tbl` (
  `lf_no` int(11) NOT NULL AUTO_INCREMENT,
  `es_no` int(11) NOT NULL,
  `lead_no` varchar(45) NOT NULL,
  `fo_no` varchar(45) DEFAULT NULL,
  `batch_no` varchar(45) DEFAULT NULL,
  `side_type` varchar(45) DEFAULT NULL,
  `machine_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`lf_no`,`es_no`,`lead_no`),
  KEY `machine_no_fk_idx` (`machine_no`),
  CONSTRAINT `machine_no_fk` FOREIGN KEY (`machine_no`) REFERENCES `machine_tbl` (`machine_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `lead_actuals1_tbl` (
  `la1_no` int(11) NOT NULL,
  `lf_no` int(11) DEFAULT NULL,
  `crimp_height_1` varchar(45) DEFAULT NULL,
  `crimp_height_2` varchar(45) DEFAULT NULL,
  `crimp_height_3` varchar(45) DEFAULT NULL,
  `crimp_height_4` varchar(45) DEFAULT NULL,
  `crimp_height_5` varchar(45) DEFAULT NULL,
  `wire_length_1` varchar(45) DEFAULT NULL,
  `wire_length_2` varchar(45) DEFAULT NULL,
  `wire_length_3` varchar(45) DEFAULT NULL,
  `wire_length_4` varchar(45) DEFAULT NULL,
  `wire_length_5` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`la1_no`),
  KEY `lf_no_fk_idx` (`lf_no`),
  CONSTRAINT `lf_no_fk` FOREIGN KEY (`lf_no`) REFERENCES `lead_factory_tbl` (`lf_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `lead_actuals2_tbl` (
  `la2_no` int(11) NOT NULL,
  `lf_no` int(11) DEFAULT NULL,
  `strip_length` varchar(45) DEFAULT NULL,
  `crimp_width` varchar(45) DEFAULT NULL,
  `pull_force` varchar(45) DEFAULT NULL,
  `appearance` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`la2_no`),
  KEY `lf_no_idx` (`lf_no`),
  CONSTRAINT `lf_no` FOREIGN KEY (`lf_no`) REFERENCES `lead_factory_tbl` (`lf_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `te_database`.`machine_tbl` (`machine_no`, `machine_name`) VALUES ('1', 'machine1');
INSERT INTO `te_database`.`machine_tbl` (`machine_no`, `machine_name`) VALUES ('2', 'machine2');
INSERT INTO `te_database`.`machine_tbl` (`machine_no`, `machine_name`) VALUES ('3', 'machine3');
INSERT INTO `te_database`.`machine_tbl` (`machine_no`, `machine_name`) VALUES ('4', 'machine4');


INSERT INTO `te_database`.`model_tbl` (`model_no`, `model_name`, `model_desc`) VALUES ('1', 'model1', 'model1');
INSERT INTO `te_database`.`model_tbl` (`model_no`, `model_name`, `model_desc`) VALUES ('2', 'model2', 'model2');

INSERT INTO `te_database`.`lead_tbl` (`lead_no`, `color`, `model_no`) VALUES ('1', 'yellow', '1');
INSERT INTO `te_database`.`lead_tbl` (`lead_no`, `color`, `model_no`) VALUES ('2', 'red', '1');
INSERT INTO `te_database`.`lead_tbl` (`lead_no`, `color`, `model_no`) VALUES ('3', 'blue', '1');
INSERT INTO `te_database`.`lead_tbl` (`lead_no`, `color`, `model_no`) VALUES ('4', 'green', '2');
INSERT INTO `te_database`.`lead_tbl` (`lead_no`, `color`, `model_no`) VALUES ('5', 'violet', '2');
INSERT INTO `te_database`.`lead_tbl` (`lead_no`, `color`, `model_no`) VALUES ('6', 'black', '2');

INSERT INTO `te_database`.`shift_tbl` (`shift_no`, `shift_desc`) VALUES ('1', 'General');
INSERT INTO `te_database`.`shift_tbl` (`shift_no`, `shift_desc`) VALUES ('2', 'First');
INSERT INTO `te_database`.`shift_tbl` (`shift_no`, `shift_desc`) VALUES ('3', 'Second');
INSERT INTO `te_database`.`shift_tbl` (`shift_no`, `shift_desc`) VALUES ('4', 'Third');


CREATE TABLE `terminal_tbl` (
  `terminal_no` int(11) NOT NULL AUTO_INCREMENT,
  `terminal_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`terminal_no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


