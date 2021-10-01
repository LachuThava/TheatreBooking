-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: theatre_booking
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `seatbook`
--

DROP TABLE IF EXISTS `seatbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seatbook` (
  `USERID` int DEFAULT NULL,
  `MOVIEID` int DEFAULT NULL,
  `SEATNAMES` text,
  `TIMEDATE` timestamp NULL DEFAULT NULL,
  KEY `USERID` (`USERID`),
  KEY `MOVIEID` (`MOVIEID`),
  CONSTRAINT `seatbook_ibfk_1` FOREIGN KEY (`USERID`) REFERENCES `user` (`user_id`),
  CONSTRAINT `seatbook_ibfk_2` FOREIGN KEY (`MOVIEID`) REFERENCES `movies` (`movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seatbook`
--

LOCK TABLES `seatbook` WRITE;
/*!40000 ALTER TABLE `seatbook` DISABLE KEYS */;
INSERT INTO `seatbook` VALUES (1,1,'seat72','2021-06-18 03:00:00'),(1,1,'seat73','2021-06-18 03:00:00'),(1,1,'seat69','2021-06-18 03:00:00'),(1,1,'seat610','2021-06-18 03:00:00'),(1,1,'seat510','2021-06-18 03:00:00'),(1,1,'seat59','2021-06-18 03:00:00'),(2,5,'seat16','2021-06-18 09:30:00'),(2,5,'seat26','2021-06-18 09:30:00'),(2,5,'seat36','2021-06-18 09:30:00'),(2,5,'seat35','2021-06-18 09:30:00'),(2,5,'seat25','2021-06-18 09:30:00'),(2,5,'seat15','2021-06-18 09:30:00'),(2,6,'seat16','2021-06-19 08:30:00'),(2,6,'seat26','2021-06-19 08:30:00'),(2,6,'seat36','2021-06-19 08:30:00'),(2,6,'seat35','2021-06-19 08:30:00'),(2,6,'seat25','2021-06-19 08:30:00'),(2,6,'seat15','2021-06-19 08:30:00'),(2,6,'seat32','2021-06-19 08:30:00'),(2,6,'seat33','2021-06-19 08:30:00'),(2,6,'seat34','2021-06-19 08:30:00'),(2,6,'seat35','2021-06-19 08:30:00'),(2,6,'seat45','2021-06-19 08:30:00'),(2,6,'seat46','2021-06-19 08:30:00'),(2,6,'seat47','2021-06-19 08:30:00'),(2,6,'seat48','2021-06-19 08:30:00'),(2,6,'seat49','2021-06-19 08:30:00'),(3,6,'seat16','2021-06-19 08:30:00'),(3,6,'seat26','2021-06-19 08:30:00'),(3,6,'seat36','2021-06-19 08:30:00'),(3,6,'seat35','2021-06-19 08:30:00'),(3,6,'seat25','2021-06-19 08:30:00'),(3,6,'seat15','2021-06-19 08:30:00'),(3,6,'seat32','2021-06-19 08:30:00'),(3,6,'seat33','2021-06-19 08:30:00'),(3,6,'seat34','2021-06-19 08:30:00'),(3,6,'seat35','2021-06-19 08:30:00'),(3,6,'seat45','2021-06-19 08:30:00'),(3,6,'seat46','2021-06-19 08:30:00'),(3,6,'seat47','2021-06-19 08:30:00'),(3,6,'seat48','2021-06-19 08:30:00'),(3,6,'seat49','2021-06-19 08:30:00'),(3,6,'seat62','2021-06-19 08:30:00'),(3,6,'seat63','2021-06-19 08:30:00'),(3,6,'seat72','2021-06-19 08:30:00'),(3,6,'seat73','2021-06-19 08:30:00'),(3,6,'seat74','2021-06-19 08:30:00'),(1,2,'seat16','2021-06-18 05:30:00'),(1,2,'seat26','2021-06-18 05:30:00'),(1,2,'seat36','2021-06-18 05:30:00'),(1,2,'seat35','2021-06-18 05:30:00'),(1,2,'seat25','2021-06-18 05:30:00'),(1,2,'seat15','2021-06-18 05:30:00'),(1,2,'seat32','2021-06-18 05:30:00'),(1,2,'seat33','2021-06-18 05:30:00'),(1,2,'seat34','2021-06-18 05:30:00'),(1,2,'seat35','2021-06-18 05:30:00'),(1,2,'seat45','2021-06-18 05:30:00'),(1,2,'seat46','2021-06-18 05:30:00'),(1,2,'seat47','2021-06-18 05:30:00'),(1,2,'seat48','2021-06-18 05:30:00'),(1,2,'seat49','2021-06-18 05:30:00'),(1,2,'seat62','2021-06-18 05:30:00'),(1,2,'seat63','2021-06-18 05:30:00'),(1,2,'seat72','2021-06-18 05:30:00'),(1,2,'seat73','2021-06-18 05:30:00'),(1,2,'seat74','2021-06-18 05:30:00'),(1,2,'seat53','2021-06-18 05:30:00'),(1,2,'seat52','2021-06-18 05:30:00'),(1,2,'seat42','2021-06-18 05:30:00'),(1,2,'seat43','2021-06-18 05:30:00'),(1,2,'seat32','2021-06-18 05:30:00'),(1,2,'seat33','2021-06-18 05:30:00'),(1,2,'seat59','2021-06-18 05:30:00'),(1,2,'seat49','2021-06-18 05:30:00'),(1,2,'seat39','2021-06-18 05:30:00'),(1,2,'seat310','2021-06-18 05:30:00'),(1,2,'seat410','2021-06-18 05:30:00'),(1,2,'seat510','2021-06-18 05:30:00');
/*!40000 ALTER TABLE `seatbook` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-02  1:04:01
