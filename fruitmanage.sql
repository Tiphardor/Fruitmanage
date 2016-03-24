-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: fruitmanage
-- ------------------------------------------------------
-- Server version	5.6.23-log

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
-- Table structure for table `fruit`
--

DROP TABLE IF EXISTS `fruit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fruit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fruitId` varchar(45) NOT NULL,
  `fruitName` varchar(45) NOT NULL,
  `fruitLongName` varchar(45) DEFAULT NULL,
  `fruitDes` varchar(150) DEFAULT NULL,
  `fruitCount` int(11) NOT NULL DEFAULT '0',
  `date` date DEFAULT NULL,
  `calCount` int(11) NOT NULL DEFAULT '0',
  `seasonId` int(11) DEFAULT NULL,
  `fruitPrice` float DEFAULT NULL,
  `imageUrl` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `fruidId_UNIQUE` (`fruitId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fruit`
--

LOCK TABLES `fruit` WRITE;
/*!40000 ALTER TABLE `fruit` DISABLE KEYS */;
INSERT INTO `fruit` VALUES (3,'P03','苹果','山东蓬莱特级红富士2.5kg（果径80-85mm）苹果辅食','苹果：属于蔷薇科，落叶乔木，叶椭圆形，有锯齿；果实球形，味甜，是普通的水果，也是最常见的水果，富含丰富的营养，是世界四大水果（苹果、葡萄、柑桔和香蕉）之冠。',0,'2015-05-11',79,5,9,'苹果.png'),(7,'P05','橘子','四川浦江丑八怪不知火丑橘子 丑橘新鲜水果桔子4斤装','橘子：也称桔子，是芸香科柑橘属的一种水果，含有丰富的糖类，还含有维生素、苹果酸、柠檬酸、蛋白质、脂肪、食物纤维以及多种矿物质等，有益健康功效作用：橘子富含维生素C与柠檬酸，前者具有美容作用，后者则具有消除疲劳的作用',7,'2015-04-21',94,2,29.3,'橘子.png'),(8,'P06','草莓','丹东奶油草莓红颜草莓新鲜水果孕妇孩子爱吃家庭装','草莓: 又叫红莓、洋莓、地莓等，是一种红色的水果。草莓是对蔷薇科草莓属植物的通称，属多年生草本植物。功效作用：草莓营养价值高，含丰富维生素C ，有帮助消化的功效，与此同时，草莓还可以巩固齿龈，清新口气，润泽喉部。',6,'2015-04-21',40,1,29.9,'草莓.png'),(9,'P07','火龙果','越南红心火龙果6斤 红肉火龙果 特级 新鲜水果','火龙果：又称红龙果、龙珠果，呈椭圆形，直径10~12cm，外观为红色或黄色，有绿色圆角三角形的叶状体，白色、红色或黄色果肉，具有黑色种子的水果。功效作用：火龙果中花青素含量较高。花青素是一种效用明显的抗氧化剂，它具有抗氧化，抗自由基，抗衰老的作用，还具有抑制脑细胞变性，预防痴呆症的作用。',5,'2015-04-21',19,1,10,'火龙果.png'),(12,'098','葡萄','云南蒙自水果新鲜孕妇 无籽葡萄提子原产地葡萄三斤','葡萄：又称提子，是葡萄属（Vitis）的一种常见植物。落叶藤本植物，褐色枝蔓细长。近圆形单叶互生，近全缘至3～7裂，叶缘有锯齿。功效作用：改善过敏症状；增强心脏机能；清肠作用超强；护肤养颜佳品。',1,'2015-04-22',19,5,7.9,'葡萄.png'),(13,'P08','西瓜','新鲜水果西瓜 海南麒麟瓜1粒（单果1.8kg以上）','西瓜：属葫芦科，原产于非洲。西瓜是一种双子叶开花植物，形状像藤蔓，叶子呈羽毛状。',12,'2015-04-24',10,1,16,'西瓜.png'),(14,'P09','柿子','特级陕西特产富平临潼火晶柿子','柿子：是柿科植物浆果类水果，成熟季节在十月左右，果实形状较多，如球形、扁圆、近似锥形\'方形等，不同的品种颜色从浅桔黄色到深桔红色不等功效作用：润肺生津，清热止血，肠健脾，解酒降压。有清热润肺，生津止渴，健脾化痰的功效',89,'2015-05-11',90,5,87,'柿子.png'),(15,'P10','香蕉','山东蓬莱特级红富士2.5kg（果径80-85mm）苹果辅食','香蕉：为芭蕉科芭蕉属多年生草本植物蕉树的果实，果实长有棱；果皮黄色，果肉白色，味道香甜功效作用: 清肠胃，治便秘，并有清热润肺、止烦渴、填精髓、解酒毒等功效。',59,'2015-05-11',75,2,56.9,'香蕉.png'),(16,'P11','李子','智利红李 3斤 红布林 进口水果 天天新鲜水果单果重100-120g','李子：是蔷薇科李属植物功效作用：味甘酸，性凉，具有清热生津、泻肝涤热、活血解毒、利水消肿的功效。适用于治疗胃阴不足、口渴咽干、大腹水肿、小便不利等症，还可用于内伤痨热、肝病腹水等病症。饭后食李，能增加胃酸，帮助消化；在暑热时食李，有生津止渴、去暑解热的功效。',39,'2015-05-11',49,3,34.2,'李子.png'),(17,'P12','水蜜桃','精品美味平谷毛桃 新鲜水蜜桃子 新鲜水果 6个装','水蜜桃：水蜜桃原生长于中国，是蔷薇科植物桃Prunus persica的果实。成熟的水蜜桃略呈球形，表面裹着一层细小的绒毛，青里泛白，白里透红。功效作用：水蜜桃营养丰富，肉甜汁多，含丰富的铁质，能增加人体血红蛋白数量',23,'2015-05-11',31,4,12.6,'水蜜桃.png'),(18,'P13','枇杷','苏州东山白玉枇杷 孕妇新鲜水果pk西山白沙青种大五星琵琶5斤礼盒','枇杷：中文古名芦橘，又名金丸、芦枝、琵琶果，是蔷薇科中的枇杷属的一种植物。枇杷原产中国东南部，因果子形状似琵琶乐器而名。功效作用：治疗肺热咳喘，吐逆，烦渴。润肺下气；止渴。',90,'2015-05-11',180,2,23,'枇杷.png'),(19,'P14','甘蔗','云南蒙自水果新鲜孕妇 无籽葡萄提子原产地葡萄三斤','甘蔗：甘蔗是温带和热带农作物，是制造蔗糖的原料，且可提炼乙醇作为能源替代品。',80,'2015-05-11',98,4,45,'甘蔗.png'),(20,'P15','哈密瓜','新鲜水果海南三亚上口密甜瓜蜜瓜哈密瓜 香甜可口 10斤','哈密瓜：是甜瓜的一个转变。又名雪瓜、贡瓜，是一类优良甜瓜品种，果型圆形或卵圆形，出产于新疆。功效作用：具有疗饥、利便、益气、清肺热止咳的功效，适宜于肾病、胃病、咳嗽痰喘、贫血和便秘患者。',89,'2015-05-11',16,3,17,'哈密瓜.png');
/*!40000 ALTER TABLE `fruit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderfruit`
--

DROP TABLE IF EXISTS `orderfruit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderfruit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) DEFAULT NULL,
  `totalPrice` float DEFAULT NULL,
  `fruitId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `stateId` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderfruit`
--

LOCK TABLES `orderfruit` WRITE;
/*!40000 ALTER TABLE `orderfruit` DISABLE KEYS */;
INSERT INTO `orderfruit` VALUES (1,5,146.5,7,1,5,NULL),(2,1,10,9,1,4,NULL),(3,1,9,3,1,5,'2015-05-03'),(4,1,29.9,8,1,5,'2015-05-03'),(5,1,9,3,1,5,'2015-05-03'),(6,1,9,3,1,5,'2015-05-03'),(7,2,18,3,1,4,'2015-05-03'),(8,1,10,9,1,5,'2015-05-03'),(9,1,16,13,1,4,'2015-05-03'),(10,1,29.3,7,1,4,'2015-05-03'),(11,2,59.8,8,1,4,'2015-05-03'),(12,1,29.3,7,1,2,'2015-05-03'),(13,1,10,9,1,3,'2015-05-03'),(14,1,7.9,12,1,2,'2015-05-03'),(15,1,87,14,1,2,'2015-05-03'),(16,2,68.4,16,1,4,'2015-05-03'),(17,1,34.2,16,1,3,'2015-05-03'),(18,1,29.9,8,1,3,'2015-05-06'),(19,9,81,3,1,2,'2015-05-08'),(20,1,10,9,1,1,'2015-05-11'),(21,1,9,3,1,1,'2015-05-11'),(22,1,34.2,16,1,2,'2015-05-11'),(23,1,29.3,7,1,1,'2015-05-12'),(24,2,59.8,8,1,1,'2015-05-12'),(25,1,16,13,1,1,'2015-05-12'),(26,4,40,9,1,1,'2015-05-12'),(27,2,113.8,15,1,1,'2015-05-12'),(28,2,15.8,12,1,1,'2015-05-12'),(29,1,29.3,7,1,1,'2015-05-12'),(30,1,10,9,1,1,'2015-05-12'),(31,1,7.9,12,1,1,'2015-05-12'),(32,1,7.9,12,1,1,'2015-05-12');
/*!40000 ALTER TABLE `orderfruit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `firstName` varchar(45) NOT NULL,
  `secondName` varchar(45) NOT NULL,
  `age` varchar(45) NOT NULL,
  PRIMARY KEY (`firstName`,`secondName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES ('111','222','-');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `season`
--

DROP TABLE IF EXISTS `season`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `season` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `seasonName` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `season`
--

LOCK TABLES `season` WRITE;
/*!40000 ALTER TABLE `season` DISABLE KEYS */;
INSERT INTO `season` VALUES (1,'春季'),(2,'夏季'),(3,'秋季'),(4,'冬季'),(5,'全季');
/*!40000 ALTER TABLE `season` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shopcar`
--

DROP TABLE IF EXISTS `shopcar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shopcar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) DEFAULT NULL,
  `totalPrice` float DEFAULT NULL,
  `date` date DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `fruitId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shopcar`
--

LOCK TABLES `shopcar` WRITE;
/*!40000 ALTER TABLE `shopcar` DISABLE KEYS */;
INSERT INTO `shopcar` VALUES (1,1,29.3,'2015-05-27',1,7),(2,3,23.7,'2015-05-27',1,12),(3,6,341.4,'2015-05-27',1,15);
/*!40000 ALTER TABLE `shopcar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stateDes` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` VALUES (1,'待审核'),(2,'待发货'),(3,'已发货'),(4,'审核不通过'),(5,'完成');
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(45) DEFAULT NULL,
  `realName` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `postcode` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `gender` int(11) DEFAULT '1',
  `address` varchar(45) DEFAULT NULL,
  `style` int(11) DEFAULT '2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'gxl','甘锡梁','123','310000','1234567890','fdhdsfds@163.com',1,'浙江省杭州市江干区浙江工商大学',2),(2,'1',NULL,'1',NULL,NULL,NULL,1,NULL,1),(3,'','','',NULL,'','',1,'',NULL),(4,'','','',NULL,'','',1,'',NULL),(5,'','','',NULL,'','',1,'',NULL),(6,'    ','','',NULL,'','',1,'',NULL),(7,'','','',NULL,'','',1,'',NULL),(8,'43','34','1',NULL,'1','',1,'1',NULL),(9,'gfgffd','1','1',NULL,'1','1',1,'1',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user1`
--

DROP TABLE IF EXISTS `user1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user1` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(50) NOT NULL COMMENT '邮箱格式或手机号，注册后不可改',
  `passWord` varchar(50) NOT NULL DEFAULT '654321' COMMENT '6位或以上的字符或数字组合；默认值“654321”',
  `loginStatus` varchar(6) DEFAULT NULL,
  `realName` varchar(50) DEFAULT NULL,
  `userType` varchar(6) NOT NULL,
  `cellPhone` varchar(50) DEFAULT NULL,
  `nickName` varchar(50) DEFAULT NULL,
  `headPortraits` varchar(200) DEFAULT NULL COMMENT 'url',
  `email` varchar(50) DEFAULT NULL,
  `userCode` varchar(10) DEFAULT NULL COMMENT 'C0001-C9999999；平台更新，客户可看，不可修改；工号',
  `userRegistrationTime` datetime DEFAULT NULL COMMENT '系统自动记录，不可修改；客户可看',
  `userRemarksInformation` varchar(500) DEFAULT NULL COMMENT '后台销售人员填写',
  `userGrade` int(11) DEFAULT NULL COMMENT '平台更新，客户可看，不可修改',
  `firmName` varchar(50) DEFAULT NULL COMMENT '工厂名称；',
  `businessLicenseScanning` varchar(100) DEFAULT NULL COMMENT 'url',
  `identificationNumber` varchar(20) DEFAULT NULL,
  `storeAddressLink` varchar(200) DEFAULT NULL COMMENT 'url',
  `saleProductCategory` varchar(100) DEFAULT NULL COMMENT '做复选框选择，只做第一层分类；同生产产品类别；另外做数据字典表',
  `receiveAddress` varchar(200) DEFAULT NULL COMMENT '（下拉框可选择省，市，县、区，再进一步地址客户选填）',
  `payTermAndPayDay` varchar(200) DEFAULT NULL COMMENT '平台更新，客户可看，不可修改',
  `payAccount` varchar(100) DEFAULT NULL,
  `accountStatus` varchar(6) DEFAULT NULL COMMENT '待审核，待激活，正常，注销；平台更新，客户可看，不可修改',
  `saleStaffNumber` varchar(10) DEFAULT NULL COMMENT '平台更新，客户可看，不可修改',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userName_UNIQUE` (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user1`
--

LOCK TABLES `user1` WRITE;
/*!40000 ALTER TABLE `user1` DISABLE KEYS */;
/*!40000 ALTER TABLE `user1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userydtong`
--

DROP TABLE IF EXISTS `userydtong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userydtong` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(50) NOT NULL COMMENT '邮箱格式或手机号，注册后不可改',
  `passWord` varchar(50) NOT NULL DEFAULT '654321' COMMENT '6位或以上的字符或数字组合；默认值“654321”',
  `loginStatus` varchar(6) DEFAULT NULL,
  `realName` varchar(50) DEFAULT NULL,
  `userType` varchar(6) NOT NULL,
  `cellPhone` varchar(50) DEFAULT NULL,
  `nickName` varchar(50) DEFAULT NULL,
  `headPortraits` varchar(200) DEFAULT NULL COMMENT 'url',
  `email` varchar(50) DEFAULT NULL,
  `userCode` varchar(10) DEFAULT NULL COMMENT 'C0001-C9999999；平台更新，客户可看，不可修改；工号',
  `userRegistrationTime` datetime DEFAULT NULL COMMENT '系统自动记录，不可修改；客户可看',
  `userRemarksInformation` varchar(500) DEFAULT NULL COMMENT '后台销售人员填写',
  `userGrade` int(11) DEFAULT NULL COMMENT '平台更新，客户可看，不可修改',
  `firmName` varchar(50) DEFAULT NULL COMMENT '工厂名称；',
  `businessLicenseScanning` varchar(100) DEFAULT NULL COMMENT 'url',
  `identificationNumber` varchar(20) DEFAULT NULL,
  `storeAddressLink` varchar(200) DEFAULT NULL COMMENT 'url',
  `saleProductCategory` varchar(100) DEFAULT NULL COMMENT '做复选框选择，只做第一层分类；同生产产品类别；另外做数据字典表',
  `receiveAddress` varchar(200) DEFAULT NULL COMMENT '（下拉框可选择省，市，县、区，再进一步地址客户选填）',
  `payTermAndPayDay` varchar(200) DEFAULT NULL COMMENT '平台更新，客户可看，不可修改',
  `payAccount` varchar(100) DEFAULT NULL,
  `accountStatus` varchar(6) DEFAULT NULL COMMENT '待审核，待激活，正常，注销；平台更新，客户可看，不可修改',
  `saleStaffNumber` varchar(10) DEFAULT NULL COMMENT '平台更新，客户可看，不可修改',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userName_UNIQUE` (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userydtong`
--

LOCK TABLES `userydtong` WRITE;
/*!40000 ALTER TABLE `userydtong` DISABLE KEYS */;
/*!40000 ALTER TABLE `userydtong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'fruitmanage'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-28 10:14:38
