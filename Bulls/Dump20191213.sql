-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: havish
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `ADDRESS_ID` varchar(45) NOT NULL,
  `street` varchar(245) DEFAULT NULL,
  `landmark` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(25) DEFAULT NULL,
  `picode` varchar(45) DEFAULT NULL,
  `addressType` varchar(45) DEFAULT NULL,
  `USER_ID` varchar(45) DEFAULT NULL,
  `RCRE_TIME` timestamp NULL DEFAULT NULL,
  `RMOD_TIME` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ADDRESS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES ('AD0001','7349085992',NULL,NULL,NULL,NULL,NULL,'7349085992','2019-12-08 18:30:00','2019-12-08 18:30:00'),('AD0005','7349085992',NULL,NULL,NULL,NULL,NULL,'7349085992','2019-12-08 18:30:00','2019-12-08 18:30:00'),('HVADR002','old street,madiwala','BDA Complex','chennai','karnataka','560068','H','7349087660','2019-12-08 18:30:00','2019-12-08 18:30:00'),('HVADR003','old street,madiwala','BDA Complex','chennai','karnataka','560068','H','7349087660','2019-12-08 18:30:00','2019-12-08 18:30:00');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category_list`
--

DROP TABLE IF EXISTS `category_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category_list` (
  `CATEGORY_NAME` varchar(245) NOT NULL,
  `CATEGORY_ID` varchar(45) NOT NULL,
  PRIMARY KEY (`CATEGORY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category_list`
--

LOCK TABLES `category_list` WRITE;
/*!40000 ALTER TABLE `category_list` DISABLE KEYS */;
INSERT INTO `category_list` VALUES ('Grocery and Staples','PRCT001'),('Household Needs','PRCT002'),('Grofers Exclusive','PRCT003'),('Beverages','PRCT004'),('Personal Care','PRCT005');
/*!40000 ALTER TABLE `category_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `catg_lst`
--

DROP TABLE IF EXISTS `catg_lst`;
/*!50001 DROP VIEW IF EXISTS `catg_lst`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `catg_lst` AS SELECT 
 1 AS `CATEGORY_NAME`,
 1 AS `CATEGORY_ID`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `pdlst`
--

DROP TABLE IF EXISTS `pdlst`;
/*!50001 DROP VIEW IF EXISTS `pdlst`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `pdlst` AS SELECT 
 1 AS `PROD_ID`,
 1 AS `PROD_NAME`,
 1 AS `CATEGORY_ID`,
 1 AS `PROD_CAT_ID`,
 1 AS `PROD_PRICE`,
 1 AS `PROD_AVAIL`,
 1 AS `PROD_DESCRIPTION`,
 1 AS `PROD_RATING`,
 1 AS `BRAND`,
 1 AS `PROD_ATTRIBUTE`,
 1 AS `PRODUCT_IMAGE`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `pdvar`
--

DROP TABLE IF EXISTS `pdvar`;
/*!50001 DROP VIEW IF EXISTS `pdvar`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `pdvar` AS SELECT 
 1 AS `VARIENT_ID`,
 1 AS `PRODUCT_ID`,
 1 AS `VARIENT_VALUE`,
 1 AS `VARIENT_PRICE`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `poder`
--

DROP TABLE IF EXISTS `poder`;
/*!50001 DROP VIEW IF EXISTS `poder`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `poder` AS SELECT 
 1 AS `ORDER_ID`,
 1 AS `USER_ID`,
 1 AS `ORDER_DATE`,
 1 AS `ORDER_TIME`,
 1 AS `ORDER_ADDRESS`,
 1 AS `ORDER_STATUS`,
 1 AS `ORDER_PAYMENT_MODE`,
 1 AS `R_CRE_TIME`,
 1 AS `R_MOD_TIME`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `prod_order`
--

DROP TABLE IF EXISTS `prod_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prod_order` (
  `ORDER_ID` varchar(45) NOT NULL,
  `USER_ID` varchar(45) DEFAULT NULL,
  `ORDER_DATE` timestamp NULL DEFAULT NULL,
  `ORDER_TIME` timestamp NULL DEFAULT NULL,
  `ORDER_ADDRESS` varchar(245) DEFAULT NULL,
  `ORDER_STATUS` varchar(45) DEFAULT NULL,
  `ORDER_PAYMENT_MODE` varchar(45) DEFAULT NULL,
  `R_CRE_TIME` timestamp NULL DEFAULT NULL,
  `R_MOD_TIME` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prod_order`
--

LOCK TABLES `prod_order` WRITE;
/*!40000 ALTER TABLE `prod_order` DISABLE KEYS */;
INSERT INTO `prod_order` VALUES ('ORDERHAV0001','dafin','2019-11-26 10:04:20','2019-11-26 10:04:20','Destination 9 PG,Madiwala,Bangalore','Initiated','COD','2019-11-25 18:30:00','2019-11-25 18:30:00'),('ORDERHAV0002','meenu','2019-11-26 10:05:40','2019-11-26 10:05:40','SML Ladies PG,Madiwala,Bangalore','Initiated','COD','2019-11-25 18:30:00','2019-11-25 18:30:00'),('ORDERHAV0004','Gaurav','2019-11-26 10:05:51','2019-11-26 10:05:51','Destination 9 PG,Madiwala,Bangalore','Initiated','COD','2019-11-25 18:30:00','2019-11-25 18:30:00');
/*!40000 ALTER TABLE `prod_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `prod_sbct`
--

DROP TABLE IF EXISTS `prod_sbct`;
/*!50001 DROP VIEW IF EXISTS `prod_sbct`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `prod_sbct` AS SELECT 
 1 AS `PROD_SUBCATGRY_ID`,
 1 AS `PROD_SUBCATGRY_NAME`,
 1 AS `CATEGORY_ID`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `prod_subcatgry`
--

DROP TABLE IF EXISTS `prod_subcatgry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prod_subcatgry` (
  `PROD_SUBCATGRY_ID` varchar(45) NOT NULL,
  `PROD_SUBCATGRY_NAME` varchar(255) NOT NULL,
  `CATEGORY_ID` varchar(45) NOT NULL,
  PRIMARY KEY (`PROD_SUBCATGRY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prod_subcatgry`
--

LOCK TABLES `prod_subcatgry` WRITE;
/*!40000 ALTER TABLE `prod_subcatgry` DISABLE KEYS */;
INSERT INTO `prod_subcatgry` VALUES ('SBCT001','Pantry','PRCT001'),('SBCT002','Moong','PRCT001'),('SBCT003','Massor','PRCT001'),('SBCT004','Atta','PRCT002'),('SBCT005','Gifts','PRCT002');
/*!40000 ALTER TABLE `prod_subcatgry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_list`
--

DROP TABLE IF EXISTS `product_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_list` (
  `PROD_ID` varchar(45) NOT NULL,
  `PROD_NAME` varchar(255) DEFAULT NULL,
  `CATEGORY_ID` varchar(45) DEFAULT NULL,
  `PROD_CAT_ID` varchar(45) DEFAULT NULL,
  `PROD_PRICE` decimal(13,2) DEFAULT NULL,
  `PROD_AVAIL` varchar(45) DEFAULT NULL,
  `PROD_DESCRIPTION` text,
  `PROD_RATING` varchar(45) DEFAULT NULL,
  `BRAND` varchar(45) DEFAULT NULL,
  `PROD_ATTRIBUTE` varchar(245) DEFAULT NULL,
  `PRODUCT_IMAGE` longblob,
  PRIMARY KEY (`PROD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_list`
--

LOCK TABLES `product_list` WRITE;
/*!40000 ALTER TABLE `product_list` DISABLE KEYS */;
INSERT INTO `product_list` VALUES ('PROD001','Amul Butter - Pasteurised','PRCT001','SBCT002',91.08,'45','Pasteurized Amul butter is a delicious bread spread,\n an essential ingredient of baking and a known enhancer for many food items. This smooth creamy chunk from the house of Amul can be added \n to sauce, Indian gravy and baked products.','','Amul','{\"variant1\": {\"100g\": \"Rs 44\", \"500g\": \"Rs201\"}}',_binary 'resources/images/product-details/img001.jpg'),('PROD004','Pierre Cardin Delight Set Pen Gift Set  (Pack of 2)','PRCT002','SBCT005',750.00,'55','Body Color: Blue, Brown,Solid Body Type,Made of Metal.','','Pierre Cardin','{}',_binary 'resources/images/product-details/img004.jpeg'),('PROD005','shoppers stoppers Brown Antique Feather Ink & Stand Pen Gift Set','PRCT002','SBCT005',700.00,'24','Body Color: Gold,Made of Metal','','shoppersstoppers','{}',_binary 'resources/images/product-details/img005.jpeg'),('PROD006','Ink & Stand Pen Gift Set','PRCT002','SBCT001',482.00,'40','Body Color: Gold,Made of Metal','','ClassMate','{}',_binary 'resources/images/product-details/img006.jpeg'),('PROD007',' NoteBook','PRCT002','SBCT005',740.00,'24','Body Color: Gold,Made of Metal','','Camlin','{}',_binary 'resources/images/product-details/img004.jpeg'),('PROD008','Amul Masti Buttermilk - Spice, 1 L','PRCT001','SBCT002',47.52,'12','Amul Masti Buttermilk is refreshing milk based natural drink. It is an easy to use low calorie drink that \n refreshes you immediately with goodness of nature.','','Amul','{}',_binary 'resources/images/product-details/img8.jpg'),('PROD009','Amul Taaza Fresh Toned Milk, 500 ml','PRCT001','SBCT002',28.10,'12','Amul Taaza is all purpose milk.','','Amul','{}',_binary 'resources/images/product-details/img9.jpg'),('PROD010','Classmate Notebook - Ruled, Long, Single Line, 172 Pages','PRCT002','SBCT005',42.00,'132','Classmate Notebooks Amul are made to the highest quality standards.','','ClassMate','{}',_binary 'resources/images/product-details/img10.jpg'),('PROD011','Classmate Notebook - A4, Ruled, Single Line, 240 Pages, 3x1pc Multipack','PRCT002','SBCT005',207.00,'35','Classmate Notebooks are made to the highest quality standards. ','','ClassMate','{}',_binary 'resources/images/product-details/img11.jpg'),('PROD012','Camlin Kokuyo Permanent Marker Pen - Red, 10 pcs','PRCT002','SBCT005',179.00,'50','Unlike the regular markers Camlin Kokuyo permanent markers do not erase easily off the white board.. ','','ClassMate','{}',_binary 'resources/images/product-details/img12.jpg');
/*!40000 ALTER TABLE `product_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_varient`
--

DROP TABLE IF EXISTS `product_varient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_varient` (
  `VARIENT_ID` varchar(45) NOT NULL,
  `PRODUCT_ID` varchar(45) DEFAULT NULL,
  `VARIENT_VALUE` varchar(45) DEFAULT NULL,
  `VARIENT_PRICE` decimal(13,2) DEFAULT NULL,
  PRIMARY KEY (`VARIENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_varient`
--

LOCK TABLES `product_varient` WRITE;
/*!40000 ALTER TABLE `product_varient` DISABLE KEYS */;
INSERT INTO `product_varient` VALUES ('HVAR001','PROD001','2*500g',424.00),('HVAR0013','PROD0012','VA1',430.00),('HVAR0014','PROD0011','VA1',420.00),('HVAR0015','PROD0010','VA1',140.00),('HVAR002','PROD001','100g',491.08),('HVAR003','PROD001','2*100g',182.16),('HVAR004','PROD001','4*100g',136.62),('HVAR005','PROD009','200ml',13.86),('HVAR006','PROD0011','VA1',420.00),('HVAR016','PROD011','VA1',120.00),('HVAR017','PROD005','VA1',99.00),('HVAR018','PROD005','VA1',50.00),('HVAR019','PROD004','VA1',92.00);
/*!40000 ALTER TABLE `product_varient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `sbct_lst`
--

DROP TABLE IF EXISTS `sbct_lst`;
/*!50001 DROP VIEW IF EXISTS `sbct_lst`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `sbct_lst` AS SELECT 
 1 AS `SUBCATGRY_ID`,
 1 AS `SUBCATGRY_NAME`,
 1 AS `PROD_CAT_ID`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `subcatgry_list`
--

DROP TABLE IF EXISTS `subcatgry_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subcatgry_list` (
  `SUBCATGRY_ID` varchar(45) NOT NULL,
  `SUBCATGRY_NAME` varchar(255) NOT NULL,
  `PROD_CAT_ID` varchar(45) NOT NULL,
  PRIMARY KEY (`SUBCATGRY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcatgry_list`
--

LOCK TABLES `subcatgry_list` WRITE;
/*!40000 ALTER TABLE `subcatgry_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `subcatgry_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `table_name`
--

DROP TABLE IF EXISTS `table_name`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_name` (
  `USER_NAME` varchar(45) NOT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `USER_ROLE` enum('Super Admin','Admin','User') NOT NULL,
  `USER_CATEGORY` enum('User','Business User','Test User') NOT NULL,
  `ORGANISATION_ID` varchar(45) NOT NULL,
  PRIMARY KEY (`USER_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_name`
--

LOCK TABLES `table_name` WRITE;
/*!40000 ALTER TABLE `table_name` DISABLE KEYS */;
/*!40000 ALTER TABLE `table_name` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `uadrs`
--

DROP TABLE IF EXISTS `uadrs`;
/*!50001 DROP VIEW IF EXISTS `uadrs`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `uadrs` AS SELECT 
 1 AS `ADDRESS_ID`,
 1 AS `street`,
 1 AS `landmark`,
 1 AS `city`,
 1 AS `state`,
 1 AS `picode`,
 1 AS `addressType`,
 1 AS `USER_ID`,
 1 AS `RCRE_TIME`,
 1 AS `RMOD_TIME`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `ucart`
--

DROP TABLE IF EXISTS `ucart`;
/*!50001 DROP VIEW IF EXISTS `ucart`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `ucart` AS SELECT 
 1 AS `USER_CART_ID`,
 1 AS `PRODUCT_ID`,
 1 AS `USER_ID`,
 1 AS `PROD_QUANTITY`,
 1 AS `PRICE_RATE`,
 1 AS `TOTAL_RATE`,
 1 AS `VARIENT_ID`,
 1 AS `SAVE_LATER`,
 1 AS `RCRE_TIME`,
 1 AS `RMOD_TIME`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `USER_ID` varchar(45) DEFAULT NULL,
  `PASSWORD` varchar(45) DEFAULT NULL,
  `USER_NAME` varchar(15) DEFAULT NULL,
  `EMAIL_ID` varchar(245) DEFAULT NULL,
  `phone_number` varchar(20) NOT NULL,
  `USER_ROLE` varchar(45) DEFAULT NULL,
  `USER_CATEGORY` varchar(45) DEFAULT NULL,
  `ORGANISATION_ID` varchar(45) DEFAULT NULL,
  `R_CRE_TIME` timestamp NULL DEFAULT NULL,
  `R_MOD_TIME` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`phone_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (NULL,NULL,'anoop','anoop@gmail.com','1237645221',NULL,NULL,NULL,'2019-12-05 18:30:00','2019-12-05 18:30:00'),(NULL,NULL,'anoop','anoop@gmail.com','1237645700',NULL,NULL,NULL,'2019-12-05 18:30:00','2019-12-05 18:30:00'),(NULL,NULL,'anoop','anoop@gmail.com','1237645701',NULL,NULL,NULL,'2019-12-05 18:30:00','2019-12-05 18:30:00'),(NULL,NULL,'anoop','anoop@gmail.com','1237645711',NULL,NULL,NULL,'2019-12-05 18:30:00','2019-12-05 18:30:00'),(NULL,NULL,'anoop','anoop@gmail.com','1237645789',NULL,NULL,NULL,NULL,NULL),(NULL,NULL,'AppMomos','test.appmomos@gmail.com','7259002743',NULL,NULL,NULL,'2019-12-09 18:30:00','2019-12-09 18:30:00'),(NULL,NULL,'USER003','meenu@gmail.com','7349055352',NULL,NULL,NULL,NULL,NULL),(NULL,NULL,'USER003','meenu@gmail.com','7349055452',NULL,NULL,NULL,NULL,NULL),('Neethu','neethu',NULL,'neethu@gmail.com','734907550',NULL,NULL,NULL,NULL,NULL),(NULL,NULL,'USER003','meenu','7349085222',NULL,NULL,NULL,NULL,NULL),(NULL,NULL,'USER003','meenu','7349085452',NULL,NULL,NULL,NULL,NULL),(NULL,NULL,'USER003','meenu','7349085992',NULL,NULL,NULL,NULL,NULL),('','meenu','USER003','meenu','7349087000',NULL,NULL,NULL,NULL,NULL),(NULL,NULL,'USER003','meenu','7349087001',NULL,NULL,NULL,NULL,NULL),(NULL,NULL,'USER003','meenu','7349087002',NULL,NULL,NULL,NULL,NULL),(NULL,NULL,'USER003','meenu','7349087022',NULL,NULL,NULL,NULL,NULL),(NULL,NULL,'USER003','meenu','7349087222',NULL,NULL,NULL,NULL,NULL),(NULL,'5786','HADLY','','7349087500',NULL,NULL,NULL,'2019-12-09 18:30:00','2019-12-09 18:30:00'),(NULL,'4707','reenu','reeu@gmail.com','7349087660',NULL,NULL,NULL,'2019-12-08 18:30:00','2019-12-08 18:30:00'),(NULL,NULL,'Niva','niva@gmail.com','7749070000',NULL,NULL,NULL,NULL,NULL),(NULL,NULL,'Niva','niva@gmail.com','7749080000',NULL,NULL,NULL,'2019-12-09 18:30:00','2019-12-09 18:30:00');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_cart`
--

DROP TABLE IF EXISTS `user_cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_cart` (
  `USER_CART_ID` varchar(45) NOT NULL,
  `PRODUCT_ID` varchar(45) DEFAULT NULL,
  `USER_ID` varchar(45) DEFAULT NULL,
  `PROD_QUANTITY` int(11) DEFAULT NULL,
  `PRICE_RATE` decimal(13,2) DEFAULT NULL,
  `TOTAL_RATE` decimal(13,2) DEFAULT NULL,
  `VARIENT_ID` varchar(45) DEFAULT NULL,
  `SAVE_LATER` char(1) DEFAULT NULL,
  `RCRE_TIME` timestamp NULL DEFAULT NULL,
  `RMOD_TIME` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`USER_CART_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_cart`
--

LOCK TABLES `user_cart` WRITE;
/*!40000 ALTER TABLE `user_cart` DISABLE KEYS */;
INSERT INTO `user_cart` VALUES ('HUCR11','PRCT001','7349087660',1,92.00,92.00,'HVAR019','N','2019-12-12 18:30:00','2019-12-12 18:30:00'),('HUCRT00002','PROD010','7349087660',2,140.00,280.00,'HVAR0015','Y','2019-12-10 18:30:00','2019-12-11 18:30:00'),('HUCRT00004',NULL,'7349087660',1,424.00,424.00,NULL,'N','2019-12-10 18:30:00','2019-12-10 18:30:00'),('HUCRT00009','PROD011','7349087660',1,420.00,420.00,'HVAR0014','N','2019-12-12 18:30:00','2019-12-12 18:30:00'),('HUCRT00018','PROD010','7349087660',2,120.00,240.00,'HVAR020','N','2019-12-12 18:30:00','2019-12-12 18:30:00'),('HUCRT0007','prodId','7349087660',1,424.00,424.00,'N',NULL,'2019-12-12 18:30:00','2019-12-12 18:30:00'),('HUCRT0010','PRCT001','7349087660',1,120.00,120.00,'HVAR016','N','2019-12-12 18:30:00','2019-12-12 18:30:00');
/*!40000 ALTER TABLE `user_cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `catg_lst`
--

/*!50001 DROP VIEW IF EXISTS `catg_lst`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `catg_lst` AS select `category_list`.`CATEGORY_NAME` AS `CATEGORY_NAME`,`category_list`.`CATEGORY_ID` AS `CATEGORY_ID` from `category_list` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `pdlst`
--

/*!50001 DROP VIEW IF EXISTS `pdlst`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `pdlst` AS select `product_list`.`PROD_ID` AS `PROD_ID`,`product_list`.`PROD_NAME` AS `PROD_NAME`,`product_list`.`CATEGORY_ID` AS `CATEGORY_ID`,`product_list`.`PROD_CAT_ID` AS `PROD_CAT_ID`,`product_list`.`PROD_PRICE` AS `PROD_PRICE`,`product_list`.`PROD_AVAIL` AS `PROD_AVAIL`,`product_list`.`PROD_DESCRIPTION` AS `PROD_DESCRIPTION`,`product_list`.`PROD_RATING` AS `PROD_RATING`,`product_list`.`BRAND` AS `BRAND`,`product_list`.`PROD_ATTRIBUTE` AS `PROD_ATTRIBUTE`,`product_list`.`PRODUCT_IMAGE` AS `PRODUCT_IMAGE` from `product_list` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `pdvar`
--

/*!50001 DROP VIEW IF EXISTS `pdvar`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `pdvar` AS select `product_varient`.`VARIENT_ID` AS `VARIENT_ID`,`product_varient`.`PRODUCT_ID` AS `PRODUCT_ID`,`product_varient`.`VARIENT_VALUE` AS `VARIENT_VALUE`,`product_varient`.`VARIENT_PRICE` AS `VARIENT_PRICE` from `product_varient` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `poder`
--

/*!50001 DROP VIEW IF EXISTS `poder`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `poder` AS select `prod_order`.`ORDER_ID` AS `ORDER_ID`,`prod_order`.`USER_ID` AS `USER_ID`,`prod_order`.`ORDER_DATE` AS `ORDER_DATE`,`prod_order`.`ORDER_TIME` AS `ORDER_TIME`,`prod_order`.`ORDER_ADDRESS` AS `ORDER_ADDRESS`,`prod_order`.`ORDER_STATUS` AS `ORDER_STATUS`,`prod_order`.`ORDER_PAYMENT_MODE` AS `ORDER_PAYMENT_MODE`,`prod_order`.`R_CRE_TIME` AS `R_CRE_TIME`,`prod_order`.`R_MOD_TIME` AS `R_MOD_TIME` from `prod_order` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `prod_sbct`
--

/*!50001 DROP VIEW IF EXISTS `prod_sbct`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `prod_sbct` AS select `prod_subcatgry`.`PROD_SUBCATGRY_ID` AS `PROD_SUBCATGRY_ID`,`prod_subcatgry`.`PROD_SUBCATGRY_NAME` AS `PROD_SUBCATGRY_NAME`,`prod_subcatgry`.`CATEGORY_ID` AS `CATEGORY_ID` from `prod_subcatgry` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `sbct_lst`
--

/*!50001 DROP VIEW IF EXISTS `sbct_lst`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `sbct_lst` AS select `subcatgry_list`.`SUBCATGRY_ID` AS `SUBCATGRY_ID`,`subcatgry_list`.`SUBCATGRY_NAME` AS `SUBCATGRY_NAME`,`subcatgry_list`.`PROD_CAT_ID` AS `PROD_CAT_ID` from `subcatgry_list` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `uadrs`
--

/*!50001 DROP VIEW IF EXISTS `uadrs`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `uadrs` AS select `address`.`ADDRESS_ID` AS `ADDRESS_ID`,`address`.`street` AS `street`,`address`.`landmark` AS `landmark`,`address`.`city` AS `city`,`address`.`state` AS `state`,`address`.`picode` AS `picode`,`address`.`addressType` AS `addressType`,`address`.`USER_ID` AS `USER_ID`,`address`.`RCRE_TIME` AS `RCRE_TIME`,`address`.`RMOD_TIME` AS `RMOD_TIME` from `address` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ucart`
--

/*!50001 DROP VIEW IF EXISTS `ucart`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ucart` AS select `user_cart`.`USER_CART_ID` AS `USER_CART_ID`,`user_cart`.`PRODUCT_ID` AS `PRODUCT_ID`,`user_cart`.`USER_ID` AS `USER_ID`,`user_cart`.`PROD_QUANTITY` AS `PROD_QUANTITY`,`user_cart`.`PRICE_RATE` AS `PRICE_RATE`,`user_cart`.`TOTAL_RATE` AS `TOTAL_RATE`,`user_cart`.`VARIENT_ID` AS `VARIENT_ID`,`user_cart`.`SAVE_LATER` AS `SAVE_LATER`,`user_cart`.`RCRE_TIME` AS `RCRE_TIME`,`user_cart`.`RMOD_TIME` AS `RMOD_TIME` from `user_cart` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-13 18:53:49
