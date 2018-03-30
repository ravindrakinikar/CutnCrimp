

SET FOREIGN_KEY_CHECKS=0;

DROP DATABASE IF EXISTS `cnc`;

CREATE DATABASE `cnc`;

USE `cnc`;

#
# Dropping database objects
#

DROP TABLE IF EXISTS `tbl_user_comments`;
DROP TABLE IF EXISTS `tbl_users`;
DROP TABLE IF EXISTS `employee`;

create table `employee` (`id` INTEGER(11) NOT NULL AUTO_INCREMENT,`name` varchar(255),
`shift` varchar(255),PRIMARY KEY (`id`));

INSERT INTO `cnc`.`employee` (`name`, `shift`) VALUES ('mahesh', 'first');
INSERT INTO `cnc`.`employee` (`name`, `shift`) VALUES ('mihir', 'second');

CREATE TABLE `wire_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `frequency` varchar(45) DEFAULT NULL,
  `h1` int(11) DEFAULT NULL,
  `h2` int(11) DEFAULT NULL,
  `h3` int(11) DEFAULT NULL,
  `h4` int(11) DEFAULT NULL,
  `h5` int(11) DEFAULT NULL,
  `l1` int(11) DEFAULT NULL,
  `l2` int(11) DEFAULT NULL,
  `l3` int(11) DEFAULT NULL,
  `l4` int(11) DEFAULT NULL,
  `l5` int(11) DEFAULT NULL,
  `avg_height` int(11) DEFAULT NULL,
  `avg_length` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE `cnc`.`model_tbl` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

  CREATE TABLE `cnc`.`lead_tbl` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NULL,
  `gauge` VARCHAR(45) NULL,
  `color` VARCHAR(45) NULL,
  `strand` VARCHAR(45) NULL,
  `factory_no` INT NULL,
  `batch_no` INT NULL,
  `model_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `model_lead_fk_idx` (`model_id` ASC),
  CONSTRAINT `model_lead_fk`
    FOREIGN KEY (`model_id`)
    REFERENCES `cnc`.`model_tbl` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
  

COMMIT;
