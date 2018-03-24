/*
SQLyog Community v12.4.3 (64 bit)
MySQL - 5.5.56 : Database - library
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`library` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `library`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `BookID` varchar(10) NOT NULL,
  `BookAuthor` varchar(40) DEFAULT NULL,
  `BookName` varchar(40) DEFAULT NULL,
  `Number` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`BookID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `book` */

insert  into `book`(`BookID`,`BookAuthor`,`BookName`,`Number`) values 
('123','Ashirvad','Physics','3');

/*Table structure for table `issue` */

DROP TABLE IF EXISTS `issue`;

CREATE TABLE `issue` (
  `BookId` varchar(10) DEFAULT NULL,
  `BookName` varchar(30) DEFAULT NULL,
  `IDNO` varchar(10) DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `IssueDate` varchar(20) DEFAULT NULL,
  `ReturnDate` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `issue` */

/*Table structure for table `librarian` */

DROP TABLE IF EXISTS `librarian`;

CREATE TABLE `librarian` (
  `LID` varchar(10) NOT NULL,
  `FName` varchar(20) DEFAULT NULL,
  `LName` varchar(20) DEFAULT NULL,
  `Contact` varchar(12) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`LID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `librarian` */

insert  into `librarian`(`LID`,`FName`,`LName`,`Contact`,`Address`) values 
('1','Piya','Sharma','9865345123','dfsdgsd'),
('123','ronak','pansari','7014892385','jecrc gh');

/*Table structure for table `loan` */

DROP TABLE IF EXISTS `loan`;

CREATE TABLE `loan` (
  `IDNO` varchar(10) NOT NULL,
  `Loan` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`IDNO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `loan` */

insert  into `loan`(`IDNO`,`Loan`) values 
('123','115');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `Email` varchar(40) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `Post` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`Email`,`Password`,`Post`) values 
('ronak','pansari','Librarian'),
('Suraj','1234','Admin');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
