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
INSERT INTO `passenger` VALUES ('First Name','Last Name',19,NULL,1234568970,'Male',914567),('First Name','Last Name',19,NULL,941156949,'Male',652549495),('First Name','Last Name',94,NULL,654946546,'Male',6144665),('First Name','Last Name',15,NULL,5646466,'Male',12165),('First Name','Last Name',15,NULL,656546468,'Male',54554),('First Name','Last Name',19,NULL,656546468,'Male',656546468),('First Name','Last Name',20,NULL,156464544,'Male',564985464),('First Name','Last Name',32,NULL,455455454,'Male',45574),('First Name','Last Name',65,NULL,654684565,'Male',545645);
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticketdata`
--

DROP TABLE IF EXISTS `ticketdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticketdata` (
  `TicketNo` int NOT NULL,
  `TrainNumber` int DEFAULT NULL,
  `TrainName` varchar(100) DEFAULT NULL,
  `SourceStation` varchar(100) DEFAULT NULL,
  `DestinationStation` varchar(100) DEFAULT NULL,
  `PassengerName` varchar(100) DEFAULT NULL,
  `SeatNo` varchar(20) DEFAULT NULL,
  `Price` int DEFAULT NULL,
  `userid` varchar(100) DEFAULT NULL,
  `status` varchar(100) DEFAULT 'WAIT',
  PRIMARY KEY (`TicketNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticketdata`
--

LOCK TABLES `ticketdata` WRITE;
/*!40000 ALTER TABLE `ticketdata` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticketdata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `traindata`
--

DROP TABLE IF EXISTS `traindata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `traindata` (
  `TrainNo` int DEFAULT NULL,
  `TrainName` varchar(100) DEFAULT NULL,
  `StationName` varchar(500) DEFAULT NULL,
  `DistanceFromSourceStation` int DEFAULT NULL,
  `VacancyQuota` varchar(100) DEFAULT NULL,
  `ArrivalTime` varchar(100) DEFAULT NULL,
  `DepartureTime` varchar(100) DEFAULT NULL,
  `Date` varchar(100) DEFAULT NULL,
  `SourceStationName` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `traindata`
--

LOCK TABLES `traindata` WRITE;
/*!40000 ALTER TABLE `traindata` DISABLE KEYS */;
INSERT INTO `traindata` VALUES (1234,'Malad Express','Mumbai',16,NULL,'11.30','10.30','11-10-121',NULL),(6321,'Hawada Express','Bhusawal',53,NULL,'23.63','6.10','04-11-2021',NULL),(4569,'Bakad Passenger','Mumbai',63,NULL,'12.30','23.26','17-08-2021','Pune');
/*!40000 ALTER TABLE `traindata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdata`
--

DROP TABLE IF EXISTS `userdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userdata` (
  `UserId` varchar(50) NOT NULL,
  `FirstName` varchar(100) DEFAULT NULL,
  `LasttName` varchar(100) DEFAULT NULL,
  `Address` varchar(500) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Role` varchar(50) DEFAULT 'User',
  `ValletBalance` int DEFAULT NULL,
  `Gender` varchar(50) DEFAULT NULL,
  `DOB` varchar(100) DEFAULT NULL,
  `AadharNo` varchar(100) DEFAULT NULL,
  `Mobile` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdata`
--

LOCK TABLES `userdata` WRITE;
/*!40000 ALTER TABLE `userdata` DISABLE KEYS */;
INSERT INTO `userdata` VALUES ('abc12345','abc','xyz',NULL,'xyz@gmail.com','12345','User',NULL,'Male','Fri Jun 15 13:58:16 IST 2012','1234556','123456789'),('Bakilog','Name','Another Name',NULL,'jTextField5',NULL,'User',NULL,'Male','jTextField3','jTextField4','jTextField6'),('bhanja','of','Name of bank',NULL,'jTextField5',NULL,'User',NULL,'Male','jTextField3','jTextField4','jTextField6'),('Esha64875','Esha','D',NULL,'lkrlgjlmm','12345','User',NULL,'Female',NULL,NULL,NULL),('Haril54986','Haril','Talele',NULL,'hari@gmail.com','123','User',NULL,'Male','9-10-121','16166694856','549864596'),('Karan123','Joshi','Karan Joshi',NULL,'jTextField5',NULL,'User',NULL,'Male','22/33/44','jTextField4','jTextField6'),('klmahltm','ktnhjnl','jrkngkra ktnhjnl',NULL,'ldmnglknahnml',NULL,'User',NULL,'Male','jTextField3','lmtrslh;kkm;l',',rtl;h;r;h;'),('krutika12345','krutika','chaudhari',NULL,'knjkhguidhnkbjnjhh','k12345','default',NULL,'Female',NULL,NULL,NULL),('krutika7894','Chaudhari','Krutika Chaudhari','Alpha Beta Gamma','k@gmail.com','12345','User',NULL,'Female','23-11-2002','1654646164854','2154863156446'),('Nimish12345','Nimish','Jain',NULL,'nimu@jain.in','12345','User',NULL,'Male','7-10-102','123456789','123456789'),('Pandya123','Sheth','Pandurang Sheth',NULL,'jTextField5',NULL,'User',NULL,'Male','jTextField3','jTextField4','jTextField6'),('rakesh12345','rakesh','roshan',NULL,'rakesh@roshan.in','12345','User',NULL,'Male',NULL,NULL,NULL),('Rakesh56446','Rakesh','Sharma',NULL,'raksesh@gmail.com','Rakesh@123','User',NULL,'Male','9-10-121','1595626562','564465651'),('Ramesh','1234','Ramesh 1234',NULL,'754545',NULL,'User',NULL,'Male',NULL,'2549484','8845458'),('Ramesh51366','Ramesh','Budhu',NULL,'ramesh@123','123','User',NULL,'Male','11-10-121','561684564468','513665856'),('Rushi91467','Rushi','Borakhede',NULL,'heqhugy ihhreug','rushi123','User',NULL,'Male',NULL,NULL,NULL),('Sambhav78945','Sambhav','Borakhede',NULL,'sambhav@gmail.com','321','User',NULL,'Male','3-10-121','1235685416845','789456123'),('UserID','Tera','Name Tera',NULL,'jTextField5',NULL,'User',NULL,'Male','jTextField3','jTextField4','jTextField6'),('vishal12345','vishal','yadav',NULL,'ihwkfnjhkve','12345','User',NULL,'Male','Wed Oct 13 10:57:57 IST 2021','1234567','123456789');
/*!40000 ALTER TABLE `userdata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userlogin`
--

DROP TABLE IF EXISTS `userlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userlogin` (
  `Username` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userlogin`
--

LOCK TABLES `userlogin` WRITE;
/*!40000 ALTER TABLE `userlogin` DISABLE KEYS */;
INSERT INTO `userlogin` VALUES ('Rushi91467','rushi123'),('Esha64875','12345'),('rakesh12345','12345'),('vishal12345','12345'),('abc12345','12345'),('UserID',NULL),('Bakilog',NULL),('klmahltm',NULL),('Nimish12345','12345'),('Ramesh',NULL),('krutika7894',NULL),('Haril54986','123'),('Sambhav78945','321'),('Ramesh51366','123'),('Rakesh56446','Rakesh@123');
/*!40000 ALTER TABLE `userlogin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-18 19:40:49
