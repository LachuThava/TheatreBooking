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
-- Table structure for table `movies`
--

DROP TABLE IF EXISTS `movies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movies` (
  `movie_id` int NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(50) DEFAULT NULL,
  `movie_hour` varchar(20) DEFAULT NULL,
  `movie_type` varchar(50) DEFAULT NULL,
  `movie_des` text,
  `movie_lang` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies`
--

LOCK TABLES `movies` WRITE;
/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
INSERT INTO `movies` VALUES (1,'The Dark Knight Rises','2hours','Family/Kid Movie','Director : Christopher Nolan <br> Writers : Jonathan Nolan, Christoper Nolan, David S Goyer <br> IMDB : 8.4/10','English'),(2,'The Expendables','1h30min','Action Film','Director : Sylvester Stallone\nWriters: Dave Callaham,sylvester Stallon<br>IMBD : 6.5/10','English'),(3,'Fight Club','2h30min','Action/Adult Film','Director : David Fincher<br>Writers : Chuck Palahniuk,Jim Uhls<br>IMDB : 8.8/10','English/Tamil'),(4,'Ford Vs Ferrari','2h40min','Historical Movie','Director : James Mangold<br>Writers : Jez Butterworth,John-Henry Butterworth,Jason Keller<br>IMDB : 8.1/10','English/French'),(5,'Forrest Gump','3hours','Family Movie','Director : Robert Zemeckis<br>Writers : Winston Groom,Eric Roth<br>IMDB : 8.8/10','English/French'),(6,'The HangOver','3hours','Adult Movie','Director : Todd Phillips<br>Writers : Jon Lucas,Scott Moore<br>IMDB : 7.7/10','English/Tamil'),(7,'John Wick','2h15min','Action Movie','Director : Chad Stahelski,David Leitch<br>Writers : Derek Kolstad<br>IMDB : 7.4/10','English/French'),(8,'Jurrasic Park','2h45min','Adventure Movie','Director : Steven Spielberg<br>Writers : Michae; Crichton,David Koepp<br>IMDB : 8.1/10','English'),(9,'Predator','2hours','Action Movie','Director : John McTiernan<br>Writers : Jim Thomas,John Thomas<br>IMDB : 7.8/10','English'),(10,'Titanic','2h30min','Adult Movie','Director : James Cameron<br>Writers : James Cameron<br>IMDB : 7.8/10','English/Tamil');
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-02  1:04:00
