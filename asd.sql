/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.34-log : Database - personalfinance
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`personalfinance` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `personalfinance`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) NOT NULL,
  `upwd` varchar(20) NOT NULL,
  `stat` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

/*Table structure for table `bank` */

DROP TABLE IF EXISTS `bank`;

CREATE TABLE `bank` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cardnumber` varchar(20) NOT NULL,
  `openbank` varchar(20) NOT NULL,
  `bankname` varchar(20) NOT NULL,
  `balance` double NOT NULL,
  `admin` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `admin` (`admin`),
  CONSTRAINT `bank_ibfk_1` FOREIGN KEY (`admin`) REFERENCES `admin` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bank` */

/*Table structure for table `financing` */

DROP TABLE IF EXISTS `financing`;

CREATE TABLE `financing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `income` double NOT NULL,
  `
expenditure` double NOT NULL,
  `createdate` date NOT NULL,
  `admin` int(11) NOT NULL,
  `bank` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `admin` (`admin`),
  KEY `bank` (`bank`),
  CONSTRAINT `financing_ibfk_1` FOREIGN KEY (`admin`) REFERENCES `admin` (`id`),
  CONSTRAINT `financing_ibfk_2` FOREIGN KEY (`bank`) REFERENCES `bank` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `financing` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
