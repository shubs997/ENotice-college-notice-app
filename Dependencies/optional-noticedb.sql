-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: testapp
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `circular`
--

DROP TABLE IF EXISTS `circular`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `circular` (
  `title` varchar(20) DEFAULT NULL,
  `body` varchar(20) DEFAULT NULL,
  `priority` varchar(20) DEFAULT NULL,
  `files` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `circular`
--

LOCK TABLES `circular` WRITE;
/*!40000 ALTER TABLE `circular` DISABLE KEYS */;
INSERT INTO `circular` VALUES ('testc','testcircular','High','circular.jpg'),('shantanu','abc','Medium','WhatsApp Image 2018-08-27 at 12.03.32 AM (1).jpeg'),('bunny','test','Low','Lifecode Proteomics.pdf'),('MEETING CIRCULAR','meeting on monday','Medium','WhatsApp Image 2018-07-19 at 10.38.49 AM (1).jpeg'),('abc2141','test','Medium','Screenshot (27).png'),('bunny','test3','Medium','WhatsApp Image 2018-08-27 at 12.03.32 AM (1).jpeg'),('','','High','WhatsApp Image 2018-08-27 at 12.03.32 AM (1).jpeg'),('shantanu16','do MIS','Medium','WhatsApp Image 2018-07-19 at 10.38.49 AM (1).jpeg'),('avinash circular','test','High','null'),('shantanu circular','test','High','null'),('a','a','High','Screenshot (55).png'),('b','b','High','Screenshot (56).png'),('holiday pl','PL','High','Screenshot (7).png'),('pl','pl','High','Screenshot (15).png'),('circular to students','student','High','titleIX_students_staff_2018.jpg'),('not to students',' no student','High','images (4).jpg');
/*!40000 ALTER TABLE `circular` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `circular_staff`
--

DROP TABLE IF EXISTS `circular_staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `circular_staff` (
  `title` varchar(20) DEFAULT NULL,
  `body` varchar(20) DEFAULT NULL,
  `priority` varchar(20) DEFAULT NULL,
  `files` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `circular_staff`
--

LOCK TABLES `circular_staff` WRITE;
/*!40000 ALTER TABLE `circular_staff` DISABLE KEYS */;
INSERT INTO `circular_staff` VALUES ('Assignment Notice','test','Medium','WhatsApp Image 2018-08-27 at 12.03.32 AM (1).jpeg'),('Holiday Notice','test2','Medium','Screenshot (54).png'),('asd','asdasd','High','Screenshot (9).png'),('shantanu','test23423r','Medium','WhatsApp Image 2018-07-19 at 10.38.49 AM (1).jpeg'),('assignment142','abc','Medium','Screenshot (11).png'),('assignment not done','test','Medium','CRB(10).pdf'),('test2323','test','High','WhatsApp Image 2018-07-19 at 10.38.49 AM(1).jpeg'),('avinash circular','test','High','null'),('a','a','High','Screenshot (55).png'),('b','b','High','Screenshot (56).png'),('holiday pl','PL','High','Screenshot (7).png'),('meeting staff','cirricular','High','Screenshot (15).png'),('','','High','Screenshot (15).png'),('teacher','t','High','Screenshot (11).png'),('circ1','test','Medium','download (3).jpg'),('circ2','test','High','images (4).jpg'),('circular to students','student','High','titleIX_students_staff_2018.jpg');
/*!40000 ALTER TABLE `circular_staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hod`
--

DROP TABLE IF EXISTS `hod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `hod` (
  `hid` varchar(20) DEFAULT NULL,
  `hname` varchar(20) DEFAULT NULL,
  `hpassword` varchar(20) DEFAULT NULL,
  `hphone` varchar(20) DEFAULT NULL,
  `hdeptbname` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hod`
--

LOCK TABLES `hod` WRITE;
/*!40000 ALTER TABLE `hod` DISABLE KEYS */;
INSERT INTO `hod` VALUES ('1','hod1','name','123','IT'),('2','abc','123',NULL,NULL),('3','hod3','test',NULL,NULL),(NULL,NULL,NULL,NULL,NULL),('4','hod4','hod4',NULL,NULL),('h102','Swapna  Bhavsar','123','12345','IT');
/*!40000 ALTER TABLE `hod` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_admin`
--

DROP TABLE IF EXISTS `login_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `login_admin` (
  `id` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_admin`
--

LOCK TABLES `login_admin` WRITE;
/*!40000 ALTER TABLE `login_admin` DISABLE KEYS */;
INSERT INTO `login_admin` VALUES ('admin','admin@123');
/*!40000 ALTER TABLE `login_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newuser`
--

DROP TABLE IF EXISTS `newuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `newuser` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(20) DEFAULT NULL,
  `lastname` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  `date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newuser`
--

LOCK TABLES `newuser` WRITE;
/*!40000 ALTER TABLE `newuser` DISABLE KEYS */;
INSERT INTO `newuser` VALUES (1,'shubham','jadhav','abc','shubhamj@gmail.com','Male','Information Technology','Oct 25, 2018'),(2,'avinash','jannu','123','avi@gmail.com','Male','Information Technology','Oct 25, 2018'),(3,'shantanu','sarode','123','shantanu@gmail.com','Male','Information Technology','Oct 25, 2018'),(4,'bunny',NULL,'123',NULL,NULL,NULL,NULL),(5,'mandar',NULL,'abc',NULL,NULL,NULL,NULL),(6,'MCOE1006',NULL,'admin@123',NULL,NULL,NULL,'Oct 25, 2018'),(7,'MCOE1007',NULL,'admin@123',NULL,NULL,NULL,'Oct 25, 2018'),(8,'MCOE1008',NULL,'admin@123',NULL,NULL,NULL,'Oct 25, 2018');
/*!40000 ALTER TABLE `newuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `notice` (
  `title` varchar(50) DEFAULT NULL,
  `body` varchar(200) DEFAULT NULL,
  `priority` varchar(20) DEFAULT NULL,
  `sltuser` varchar(200) DEFAULT NULL,
  `files` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT INTO `notice` VALUES ('test','test','High','[shubham, avinash, mihir, shantanu]','WhatsApp Image 2018-07-19 at 10.38.49 AM (1).jpeg'),('Holiday Notice','test','Medium','[shubham]','WhatsApp Image 2018-07-19 at 10.38.49 AM(1).jpeg'),('test2','text','Medium','[shubham, avinash, mihir, shantanu]','null'),('Practical exam','TEST','High','[shubham, avinash, mihir, shantanu]','null'),('something','test','Low','[shubham, avinash, mihir, shantanu]','null'),('vfv','test','Low','[shubham, avinash, mihir, shantanu]','null'),('assignment submission','test','High','[shubham, avinash]','Screenshot (50).png'),('view by student','test','Low','[shubham, avinash, shantanu]','images (5).jpg');
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice_views`
--

DROP TABLE IF EXISTS `notice_views`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `notice_views` (
  `NoticeID` varchar(100) DEFAULT NULL,
  `userviews` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice_views`
--

LOCK TABLES `notice_views` WRITE;
/*!40000 ALTER TABLE `notice_views` DISABLE KEYS */;
INSERT INTO `notice_views` VALUES ('assignment submission',',avinash'),('view by student',',shubham');
/*!40000 ALTER TABLE `notice_views` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `teacher` (
  `tid` varchar(20) NOT NULL,
  `tname` varchar(20) DEFAULT NULL,
  `tpassword` varchar(20) DEFAULT NULL,
  `tsubject` varchar(20) DEFAULT NULL,
  `tphoneno` varchar(50) DEFAULT NULL,
  `tdeptname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('t001','teacher1','abc','DBMS','7769099521','IT');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_login`
--

DROP TABLE IF EXISTS `user_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user_login` (
  `uname` varchar(20) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_login`
--

LOCK TABLES `user_login` WRITE;
/*!40000 ALTER TABLE `user_login` DISABLE KEYS */;
INSERT INTO `user_login` VALUES ('user','123'),('shubham','abc'),('omkar','abc');
/*!40000 ALTER TABLE `user_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-25 14:04:32
