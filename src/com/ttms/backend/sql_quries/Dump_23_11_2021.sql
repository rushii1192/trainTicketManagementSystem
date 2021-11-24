CREATE DATABASE  IF NOT EXISTS `ttms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ttms`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ttms
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passenger` (
  `FirstName` varchar(100) DEFAULT NULL,
  `LasttName` varchar(100) DEFAULT NULL,
  `Age` int DEFAULT NULL,
  `Birthdate` date DEFAULT NULL,
  `Aadhar` int DEFAULT NULL,
  `Gender` varchar(50) DEFAULT NULL,
  `MobileNo` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger`
--

LOCK TABLES `passenger` WRITE;
/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
INSERT INTO `passenger` VALUES ('First Name','Last Name',19,NULL,1234568970,'Male',914567),('First Name','Last Name',19,NULL,941156949,'Male',652549495),('First Name','Last Name',94,NULL,654946546,'Male',6144665),('First Name','Last Name',15,NULL,5646466,'Male',12165),('First Name','Last Name',15,NULL,656546468,'Male',54554),('First Name','Last Name',19,NULL,656546468,'Male',656546468),('First Name','Last Name',20,NULL,156464544,'Male',564985464),('First Name','Last Name',32,NULL,455455454,'Male',45574),('First Name','Last Name',65,NULL,654684565,'Male',545645),('Kanishka','Borakhede',14,NULL,65464456,'Female',6516468),('Kanishka','Borakhede',14,NULL,65464456,'Female',6516468),('Kanishka','Borakhede',14,NULL,654564,'Female',5454545),('Bhuvan','Bam',28,NULL,654566,'Male',544645),('Ashish','Chanchalani',30,NULL,655652,'Male',545454),('Sneha','Borakhede',19,NULL,54578,'Female',4569784),('Rushikesh','Borakhede',19,NULL,545445241,'Male',54544454),('Ravindra','Borakhede',47,NULL,5454845,'Male',5414415);
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rates`
--

DROP TABLE IF EXISTS `rates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rates` (
  `Vacancy` varchar(100) DEFAULT NULL,
  `Price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rates`
--

LOCK TABLES `rates` WRITE;
/*!40000 ALTER TABLE `rates` DISABLE KEYS */;
INSERT INTO `rates` VALUES ('General',1.3),('Tatkal',1.6),('1stAc',1.8),('2ndAc',2),('3rdAc',2.2),('Sleeper',1.5),('General',1.3),('Tatkal',1.6),('1AC',1.8),('2AC',2),('3AC',2.2),('Sleeper',1.5),('2S',1);
/*!40000 ALTER TABLE `rates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticketdata`
--

DROP TABLE IF EXISTS `ticketdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticketdata` (
  `TicketNo` int NOT NULL,
  `TrainNumber` varchar(100) DEFAULT NULL,
  `TrainName` varchar(100) DEFAULT NULL,
  `SourceStation` varchar(100) DEFAULT NULL,
  `DestinationStation` varchar(100) DEFAULT NULL,
  `PassengerName` varchar(100) DEFAULT NULL,
  `SeatNo` varchar(20) DEFAULT NULL,
  `Price` varchar(100) DEFAULT NULL,
  `UserId` varchar(100) DEFAULT NULL,
  `Status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`TicketNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticketdata`
--

LOCK TABLES `ticketdata` WRITE;
/*!40000 ALTER TABLE `ticketdata` DISABLE KEYS */;
INSERT INTO `ticketdata` VALUES (1,'12290','Ngp Csmt Duronto','Nagpur','Bhusawal','Rushi B','0','0','rushi@gmail.com','CANCELED'),(2,'12290','Ngp Csmt Duronto','Nagpur','Bhusawal','Rushi B','0','706','rushi@gmail.com','CANCELED'),(12292,'12290','Ngp Csmt Duronto','Nagpur','Bhusawal','Rushi B','0','706','rushi@gmail.com','CANCELED'),(23158,'12951','Mumbai Express','Malad','Borivali','Esha123','28','450','rushi@123','WAIT'),(23160,'12290','Ngp Csmt Duronto','Nagpur','Bhusawal','Rushi B','0','706','rushi@gmail.com','CANCELED'),(23161,'12290','Ngp Csmt Duronto','Nagpur','Bhusawal','Rushi B','0','706','rushi@gmail.com','CANCELED'),(23162,'12290','Ngp Csmt Duronto','Nagpur','Nagpur','KanishkaBorakhede','0','0',' Login','WAIT'),(23163,'12290',NULL,'Nagpur','Bhusawal','BhuvanBam','0','0','Rushi','WAIT'),(23164,'12290',NULL,'Nagpur','Bhusawal','AshishChanchalani','0','0','Rushi','WAIT'),(23165,'12290',NULL,'Nagpur','Bhusawal','SnehaBorakhede','0','0','rushi@gmail.com','CANCELED'),(23166,'12290','Ngp Csmt Duronto','Nagpur','Nagpur','RushikeshBorakhede','0','0','rushi@gmail.com','CNRFM'),(23167,'12290','Ngp Csmt Duronto','Nagpur','Nagpur','RavindraBorakhede','0','0','rushi@gmail.com','CNRFM');
/*!40000 ALTER TABLE `ticketdata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `traindata`
--

DROP TABLE IF EXISTS `traindata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `traindata` (
  `TrainNo` varchar(50) NOT NULL,
  `TrainName` varchar(100) DEFAULT NULL,
  `SourceStation` varchar(500) DEFAULT NULL,
  `DestinationStation` varchar(500) DEFAULT NULL,
  `ArrivalTime` varchar(100) DEFAULT NULL,
  `DepartureTime` varchar(100) DEFAULT NULL,
  `Date` varchar(100) DEFAULT NULL,
  `DistanceFromSourceStation` int DEFAULT NULL,
  `Vacancy` int DEFAULT NULL,
  `VacancyQuota` varchar(100) DEFAULT NULL,
  `Price` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `traindata`
--

LOCK TABLES `traindata` WRITE;
/*!40000 ALTER TABLE `traindata` DISABLE KEYS */;
INSERT INTO `traindata` VALUES ('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','16-09-2021',0,89,'General',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','16-09-2021',12,89,'General',16),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','16-09-2021',0,25,'1AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','16-09-2021',0,89,'2AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','16-09-2021',0,75,'3AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','16-09-2021',0,33,'2S',0),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','16-09-2021',392,67,'Genral',NULL),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','16-09-2021',392,65,'1AC',706),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','16-09-2021',392,23,'2AC',784),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','16-09-2021',392,45,'3AC',862),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','16-09-2021',392,89,'2S',392),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','16-09-2021',440,96,'Genral',NULL),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','16-09-2021',440,58,'1AC',792),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','16-09-2021',440,20,'2AC',880),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','16-09-2021',440,57,'3AC',968),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','16-09-2021',440,46,'2S',440),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','16-09-2021',0,23,'1AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','16-09-2021',0,85,'2AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','16-09-2021',0,72,'3AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','16-09-2021',0,25,'2S',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','16-09-2021',128,56,'1AC',230),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','16-09-2021',128,24,'2AC',256),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','16-09-2021',128,47,'3AC',282),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','16-09-2021',128,88,'2S',128),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','16-09-2021',64,58,'1AC',115),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','16-09-2021',64,26,'2AC',128),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','16-09-2021',64,41,'3AC',141),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','16-09-2021',64,43,'2S',64),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','16-09-2021',0,30,'1AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','16-09-2021',0,25,'2AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','16-09-2021',0,32,'3AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','16-09-2021',30,25,'1AC',54),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','16-09-2021',30,32,'2AC',60),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','16-09-2021',30,85,'3AC',66),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','16-09-2021',233,32,'1AC',419),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','16-09-2021',233,85,'2AC',466),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','16-09-2021',233,62,'3AC',513),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','16-09-2021',159,85,'1AC',286),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','16-09-2021',159,62,'2AC',318),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','16-09-2021',159,30,'3AC',350),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','16-09-2021',494,62,'1AC',889),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','16-09-2021',494,30,'2AC',988),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','16-09-2021',494,25,'3AC',1087),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','16-09-2021',201,30,'1AC',362),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','16-09-2021',201,25,'2AC',402),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','16-09-2021',201,32,'3AC',442),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','16-09-2021',322,25,'1AC',580),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','16-09-2021',322,32,'2AC',644),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','16-09-2021',322,85,'3AC',708),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','16-09-2021',433,32,'1AC',779),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','16-09-2021',433,85,'2AC',866),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','16-09-2021',433,62,'3AC',953),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','17-09-2021',0,25,'1AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','17-09-2021',0,89,'2AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','17-09-2021',0,75,'3AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','17-09-2021',0,33,'2S',0),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','17-09-2021',392,67,'Genral',NULL),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','17-09-2021',392,65,'1AC',706),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','17-09-2021',392,23,'2AC',784),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','17-09-2021',392,45,'3AC',862),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','17-09-2021',392,89,'2S',392),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','17-09-2021',440,96,'Genral',NULL),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','17-09-2021',440,58,'1AC',792),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','17-09-2021',440,20,'2AC',880),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','17-09-2021',440,57,'3AC',968),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','17-09-2021',440,46,'2S',440),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','17-09-2021',0,23,'1AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','17-09-2021',0,85,'2AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','17-09-2021',0,72,'3AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','17-09-2021',0,25,'2S',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','17-09-2021',128,56,'1AC',230),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','17-09-2021',128,24,'2AC',256),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','17-09-2021',128,47,'3AC',282),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','17-09-2021',128,88,'2S',128),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','17-09-2021',64,58,'1AC',115),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','17-09-2021',64,26,'2AC',128),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','17-09-2021',64,41,'3AC',141),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','17-09-2021',64,43,'2S',64),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','17-09-2021',0,30,'1AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','17-09-2021',0,25,'2AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','17-09-2021',0,32,'3AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','17-09-2021',30,25,'1AC',54),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','17-09-2021',30,32,'2AC',60),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','17-09-2021',30,85,'3AC',66),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','17-09-2021',233,32,'1AC',419),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','17-09-2021',233,85,'2AC',466),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','17-09-2021',233,62,'3AC',513),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','17-09-2021',159,85,'1AC',286),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','17-09-2021',159,62,'2AC',318),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','17-09-2021',159,30,'3AC',350),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','17-09-2021',494,62,'1AC',889),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','17-09-2021',494,30,'2AC',988),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','17-09-2021',494,25,'3AC',1087),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','17-09-2021',201,30,'1AC',362),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','17-09-2021',201,25,'2AC',402),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','17-09-2021',201,32,'3AC',442),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','17-09-2021',322,25,'1AC',580),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','17-09-2021',322,32,'2AC',644),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','17-09-2021',322,85,'3AC',708),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','17-09-2021',433,32,'1AC',779),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','17-09-2021',433,85,'2AC',866),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','17-09-2021',433,62,'3AC',953),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','18-09-2021',0,25,'1AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','18-09-2021',0,89,'2AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','18-09-2021',0,75,'3AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','18-09-2021',0,33,'2S',0),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','18-09-2021',392,67,'Genral',NULL),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','18-09-2021',392,65,'1AC',706),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','18-09-2021',392,23,'2AC',784),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','18-09-2021',392,45,'3AC',862),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','18-09-2021',392,89,'2S',392),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','18-09-2021',440,96,'Genral',NULL),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','18-09-2021',440,58,'1AC',792),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','18-09-2021',440,20,'2AC',880),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','18-09-2021',440,57,'3AC',968),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','18-09-2021',440,46,'2S',440),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','18-09-2021',0,23,'1AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','18-09-2021',0,85,'2AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','18-09-2021',0,72,'3AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','18-09-2021',0,25,'2S',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','18-09-2021',128,56,'1AC',230),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','18-09-2021',128,24,'2AC',256),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','18-09-2021',128,47,'3AC',282),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','18-09-2021',128,88,'2S',128),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','18-09-2021',64,58,'1AC',115),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','18-09-2021',64,26,'2AC',128),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','18-09-2021',64,41,'3AC',141),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','18-09-2021',64,43,'2S',64),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','18-09-2021',0,30,'1AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','18-09-2021',0,25,'2AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','18-09-2021',0,32,'3AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','18-09-2021',30,25,'1AC',54),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','18-09-2021',30,32,'2AC',60),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','18-09-2021',30,85,'3AC',66),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','18-09-2021',233,32,'1AC',419),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','18-09-2021',233,85,'2AC',466),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','18-09-2021',233,62,'3AC',513),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','18-09-2021',159,85,'1AC',286),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','18-09-2021',159,62,'2AC',318),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','18-09-2021',159,30,'3AC',350),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','18-09-2021',494,62,'1AC',889),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','18-09-2021',494,30,'2AC',988),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','18-09-2021',494,25,'3AC',1087),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','18-09-2021',201,30,'1AC',362),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','18-09-2021',201,25,'2AC',402),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','18-09-2021',201,32,'3AC',442),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','18-09-2021',322,25,'1AC',580),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','18-09-2021',322,32,'2AC',644),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','18-09-2021',322,85,'3AC',708),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','18-09-2021',433,32,'1AC',779),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','18-09-2021',433,85,'2AC',866),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','18-09-2021',433,62,'3AC',953),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','19-09-2021',0,25,'1AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','19-09-2021',0,89,'2AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','19-09-2021',0,75,'3AC',0),('12290','Ngp Csmt Duronto','Nagpur','Nagpur','20.4','20.4','19-09-2021',0,33,'2S',0),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','19-09-2021',392,67,'Genral',NULL),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','19-09-2021',392,65,'1AC',706),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','19-09-2021',392,23,'2AC',784),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','19-09-2021',392,45,'3AC',862),('12290','Ngp Csmt Duronto','Nagpur','Bhusawal','1.2','1.25','19-09-2021',392,89,'2S',392),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','19-09-2021',440,96,'Genral',NULL),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','19-09-2021',440,58,'1AC',792),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','19-09-2021',440,20,'2AC',880),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','19-09-2021',440,57,'3AC',968),('12290','Ngp Csmt Duronto','Bhusawal','Mumbai CSMT','08..05','08..05','19-09-2021',440,46,'2S',440),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','19-09-2021',0,23,'1AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','19-09-2021',0,85,'2AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','19-09-2021',0,72,'3AC',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Mumbai CSMT','7.15','7.15','19-09-2021',0,25,'2S',0),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','19-09-2021',128,56,'1AC',230),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','19-09-2021',128,24,'2AC',256),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','19-09-2021',128,47,'3AC',282),('12127','Csmt Pune Intercity Exp','Mumbai CSMT','Lonavala','9.35','9.45','19-09-2021',128,88,'2S',128),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','19-09-2021',64,58,'1AC',115),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','19-09-2021',64,26,'2AC',128),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','19-09-2021',64,41,'3AC',141),('12127','Csmt Pune Intercity Exp','Lonavala','Pune','11.2','11.2','19-09-2021',64,43,'2S',64),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','19-09-2021',0,30,'1AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','19-09-2021',0,25,'2AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Mumbai Central','17:00','17:00','19-09-2021',0,32,'3AC',0),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','19-09-2021',30,25,'1AC',54),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','19-09-2021',30,32,'2AC',60),('12951','Mumbai Rajdhani Express','Mumbai Central','Borivali','17:30','17:32','19-09-2021',30,85,'3AC',66),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','19-09-2021',233,32,'1AC',419),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','19-09-2021',233,85,'2AC',466),('12951','Mumbai Rajdhani Express','Borivali','Surat','19:53','19:58','19-09-2021',233,62,'3AC',513),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','19-09-2021',159,85,'1AC',286),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','19-09-2021',159,62,'2AC',318),('12951','Mumbai Rajdhani Express','Surat','Vadodara Jn','21:18','21:28','19-09-2021',159,30,'3AC',350),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','19-09-2021',494,62,'1AC',889),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','19-09-2021',494,30,'2AC',988),('12951','Mumbai Rajdhani Express','Vadodara Jn','Ratlam Jn','0:37','0:40','19-09-2021',494,25,'3AC',1087),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','19-09-2021',201,30,'1AC',362),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','19-09-2021',201,25,'2AC',402),('12951','Mumbai Rajdhani Express','Ratlam Jn','Nagda Jn','1:18','1:20','19-09-2021',201,32,'3AC',442),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','19-09-2021',322,25,'1AC',580),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','19-09-2021',322,32,'2AC',644),('12951','Mumbai Rajdhani Express','Nagda Jn','Kota Jn','3:20','3:25','19-09-2021',322,85,'3AC',708),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','19-09-2021',433,32,'1AC',779),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','19-09-2021',433,85,'2AC',866),('12951','Mumbai Rajdhani Express','Kota Jn','New Delhi','8:35','8:35','19-09-2021',433,62,'3AC',953),('423','Malad Express','Malad','Borivali','11.15','11.20','26-11-2021',23,100,'General',NULL);
/*!40000 ALTER TABLE `traindata` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`rushi`@`localhost`*/ /*!50003 TRIGGER `cost_calculator` BEFORE INSERT ON `traindata` FOR EACH ROW begin
    if new.Price = null or new.Price = 0 then 
		set new.Price = (select Price from rates where Vacancy = new.VacancyQuota)*(new.DistanceFromSourceStation);
	end if;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `userdata`
--

DROP TABLE IF EXISTS `userdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userdata` (
  `FirstName` varchar(100) DEFAULT NULL,
  `LasttName` varchar(100) DEFAULT NULL,
  `Address` varchar(500) DEFAULT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Role` varchar(50) DEFAULT 'User',
  `ValletBalance` int DEFAULT NULL,
  `Gender` varchar(50) DEFAULT NULL,
  `DOB` varchar(100) DEFAULT NULL,
  `AadharNo` varchar(16) DEFAULT NULL,
  `Mobile` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdata`
--

LOCK TABLES `userdata` WRITE;
/*!40000 ALTER TABLE `userdata` DISABLE KEYS */;
INSERT INTO `userdata` VALUES ('Rushi','Borakhede',NULL,'rushi@gmail.com','Rushi@123','User',NULL,'Male','11-09-2002','6536486564','5414654645');
/*!40000 ALTER TABLE `userdata` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`rushi`@`localhost`*/ /*!50003 TRIGGER `usr_login_creator` BEFORE INSERT ON `userdata` FOR EACH ROW begin
    insert into userlogin values(new.Username,new.Password,"User");
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `userlogin`
--

DROP TABLE IF EXISTS `userlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userlogin` (
  `Username` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `Role` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userlogin`
--

LOCK TABLES `userlogin` WRITE;
/*!40000 ALTER TABLE `userlogin` DISABLE KEYS */;
INSERT INTO `userlogin` VALUES ('Rushi91467','rushi123',NULL),('Esha64875','12345',NULL),('rakesh12345','12345',NULL),('vishal12345','12345',NULL),('abc12345','12345',NULL),('UserID',NULL,NULL),('Bakilog',NULL,NULL),('klmahltm',NULL,NULL),('Nimish12345','12345',NULL),('Ramesh',NULL,NULL),('krutika7894',NULL,NULL),('Haril54986','123',NULL),('Sambhav78945','321',NULL),('Ramesh51366','123',NULL),('Rakesh56446','Rakesh@123',NULL),('Sneha45455','123',NULL),('rushi@gmail.com','Rushi@123','User');
/*!40000 ALTER TABLE `userlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'ttms'
--

--
-- Dumping routines for database 'ttms'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-24  8:28:18
