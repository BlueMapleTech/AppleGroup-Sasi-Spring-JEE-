-- MySQL dump 10.13  Distrib 5.6.23, for Win32 (x86)
--
-- Host: localhost    Database: ticket_reservation
-- ------------------------------------------------------
-- Server version	5.6.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `movies_list_has_timings`
--

DROP TABLE IF EXISTS `movies_list_has_timings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movies_list_has_timings` (
  `movie_id` int(11) NOT NULL,
  `timings_id` int(11) NOT NULL,
  KEY `fk_movies_list_has_timings_timings1_idx` (`timings_id`),
  KEY `fk_movies_list_has_timings_movies_list1_idx` (`movie_id`),
  CONSTRAINT `fk_movies_list_has_timings_movies_list1` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`movie_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_movies_list_has_timings_timings1` FOREIGN KEY (`timings_id`) REFERENCES `timings` (`timings_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies_list_has_timings`
--

LOCK TABLES `movies_list_has_timings` WRITE;
/*!40000 ALTER TABLE `movies_list_has_timings` DISABLE KEYS */;
INSERT INTO `movies_list_has_timings` VALUES (35,1),(35,2),(35,3),(35,4),(36,1),(36,2),(36,3),(38,1),(38,2),(38,3),(39,1),(39,2),(39,3),(40,1),(40,2),(40,3),(41,1),(41,2),(41,3),(42,1),(42,2),(42,3),(43,1),(43,2),(43,3),(44,1),(44,2),(44,3),(45,1),(45,2),(45,3),(46,1),(46,2),(46,3),(47,1),(47,2),(47,3),(48,1),(48,2),(48,3),(50,1),(50,2),(50,3),(50,4),(1,1),(1,2),(1,3),(1,4),(1,1),(1,2),(1,3),(1,4),(2,1),(2,2),(2,3),(51,1),(51,2),(51,3),(51,1),(51,2),(51,3);
/*!40000 ALTER TABLE `movies_list_has_timings` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-21 22:39:22
