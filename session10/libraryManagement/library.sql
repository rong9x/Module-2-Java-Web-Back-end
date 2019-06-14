-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: librarymanagement
-- ------------------------------------------------------
-- Server version	8.0.16

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `book` (
  `idBook` int(11) NOT NULL,
  `bookName` varchar(45) NOT NULL,
  `publisher` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `yearPublish` date NOT NULL,
  `numberPublish` int(11) NOT NULL,
  `price` double NOT NULL,
  `image` varchar(45) DEFAULT NULL,
  `Category_idCategory` int(11) NOT NULL,
  PRIMARY KEY (`idBook`,`Category_idCategory`),
  KEY `fk_Book_Category_idx` (`Category_idCategory`),
  CONSTRAINT `fk_Book_Category` FOREIGN KEY (`Category_idCategory`) REFERENCES `category` (`idCategory`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'Book1','Publisher1','Author1','2019-01-01',1,30000,NULL,1),(2,'Book2','Publisher2','Author2','2019-01-01',1,45000,NULL,2),(3,'Book3','Publisher3','Author3','2015-01-01',1,90000,NULL,3),(4,'Book4','Publisher4','Author4','2017-01-01',1,110000,NULL,2),(5,'Book5','Publisher5','Author5','2014-01-01',1,40000,NULL,5);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borroworder`
--

DROP TABLE IF EXISTS `borroworder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `borroworder` (
  `idBorrowOrder` int(11) NOT NULL,
  `status` varchar(20) NOT NULL,
  `loanDay` date NOT NULL,
  `payDay` date NOT NULL,
  `Book_idBook` int(11) NOT NULL,
  `Book_Category_idCategory` int(11) NOT NULL,
  `Student_idStudent` int(11) NOT NULL,
  PRIMARY KEY (`idBorrowOrder`,`Book_idBook`,`Book_Category_idCategory`,`Student_idStudent`),
  KEY `fk_BorrowOrder_Book1_idx` (`Book_idBook`,`Book_Category_idCategory`),
  KEY `fk_BorrowOrder_Student1_idx` (`Student_idStudent`),
  CONSTRAINT `fk_BorrowOrder_Book1` FOREIGN KEY (`Book_idBook`, `Book_Category_idCategory`) REFERENCES `book` (`idBook`, `Category_idCategory`),
  CONSTRAINT `fk_BorrowOrder_Student1` FOREIGN KEY (`Student_idStudent`) REFERENCES `student` (`idStudent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borroworder`
--

LOCK TABLES `borroworder` WRITE;
/*!40000 ALTER TABLE `borroworder` DISABLE KEYS */;
INSERT INTO `borroworder` VALUES (1,'borrowed','2019-06-14','2019-06-20',1,1,1),(2,'able','2019-06-14','2019-06-20',3,3,1);
/*!40000 ALTER TABLE `borroworder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `category` (
  `idCategory` int(11) NOT NULL,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`idCategory`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Novel'),(2,'Entertainment'),(3,'Technology'),(4,'News'),(5,'Curriculum');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `student` (
  `idStudent` int(11) NOT NULL,
  `studentName` varchar(45) NOT NULL,
  `birthday` date NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`idStudent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Van A','1992-01-01','Hue city','abc@gmail.com','012345678',NULL,'able'),(2,'Van B','1992-01-01','Hue city','abc@gmail.com','012345678',NULL,'in debt'),(3,'Van C','1992-01-01','Hue city','abc@gmail.com','012345678',NULL,'able'),(4,'Van D','1992-01-01','Hue city','abc@gmail.com','012345678',NULL,'able'),(5,'Thi E','1992-01-01','Hue city','abc@gmail.com','012345678',NULL,'in debt');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-14 10:22:02
