-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: resolucionesbd
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cursos` (
  `codigo` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `creditos` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
INSERT INTO `cursos` VALUES ('IC1802','Introducci�n a la Programaci�n',3),('IC1803','Taller de Programaci�n',3),('IC4301','Bases de Datos I',4),('IC5485','Fundamentos de Computaci�n',3),('IC5821','Requerimientos de Software',4),('IC6821','Dise�o de Software',4),('IC7874','Administraci�n de Proyectos',4);
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inconsistencias`
--

DROP TABLE IF EXISTS `inconsistencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inconsistencias` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `detalle` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inconsistencias`
--

LOCK TABLES `inconsistencias` WRITE;
/*!40000 ALTER TABLE `inconsistencias` DISABLE KEYS */;
INSERT INTO `inconsistencias` VALUES (8,'EXCLUSION_ACTA'),(9,'INCLUSION_ACTA'),(10,'ERROR_NOTA');
/*!40000 ALTER TABLE `inconsistencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ofertas`
--

DROP TABLE IF EXISTS `ofertas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ofertas` (
  `idoferta` int(11) NOT NULL AUTO_INCREMENT,
  `codigoCurso` varchar(100) DEFAULT NULL,
  `idProfesor` varchar(100) DEFAULT NULL,
  `numeroGrupo` int(11) DEFAULT NULL,
  `periodo` varchar(100) DEFAULT NULL,
  `modalidad` varchar(100) DEFAULT NULL,
  `horario` varchar(100) DEFAULT NULL,
  `aula` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idoferta`),
  UNIQUE KEY `idoferta_UNIQUE` (`idoferta`),
  KEY `ofertaCurso_idx` (`codigoCurso`),
  KEY `ofertaProfesor_idx` (`idProfesor`),
  CONSTRAINT `ofertaCurso` FOREIGN KEY (`codigoCurso`) REFERENCES `cursos` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `ofertaProfesor` FOREIGN KEY (`idProfesor`) REFERENCES `profesores` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ofertas`
--

LOCK TABLES `ofertas` WRITE;
/*!40000 ALTER TABLE `ofertas` DISABLE KEYS */;
INSERT INTO `ofertas` VALUES (80,'IC1802','5-5555-5555',1,'IS2017',NULL,'K-J 7:30-9:20','B3-08'),(81,'IC1803','5-5555-5555',1,'IIS2017',NULL,'K-J 9:30-11:20','B3-08'),(82,'IC4301','2-2222-2222',1,'IS2017',NULL,'M-V 13:00-14:50','B3-06'),(83,'IC4301','4-4444-4444',2,'IS2017',NULL,'M-V 7:30-9:20','B3-06'),(84,'IC5821','2-2222-2222',1,'IS2017',NULL,'M-V 15:00-16:50','B3-06'),(85,'IC6821','1-1111-1111',1,'IIS2017',NULL,'K-J 7:30-9:20','B3-07'),(86,'IC6821','1-1111-1111',2,'IS2017',NULL,'M-V 7:30-9:20','B3-07'),(87,'IC1802','5-5555-5555',1,'IIS2016',NULL,'K-J 7:30-9:20','B3-08'),(88,'IC1803','5-5555-5555',1,'IS2016',NULL,'K-J 9:30-11:20','B3-08'),(89,'IC4301','2-2222-2222',1,'IIS2016',NULL,'M-V 13:00-14:50','B3-06'),(90,'IC4301','4-4444-4444',2,'IT2016',NULL,'M-V 7:30-9:20','B3-06'),(91,'IC5821','2-2222-2222',1,'IS2016',NULL,'M-V 15:00-16:50','B3-06'),(92,'IC6821','1-1111-1111',1,'IIS2016',NULL,'K-J 7:30-9:20','B3-07'),(93,'IC6821','1-1111-1111',2,'IS2016',NULL,'M-V 7:30-9:20','B3-07'),(94,'IC1802','5-5555-5555',1,'IIS2015',NULL,'K-J 7:30-9:20','B3-08'),(95,'IC1803','5-5555-5555',1,'IC2015',NULL,'K-J 9:30-11:20','B3-08'),(96,'IC4301','2-2222-2222',1,'IS2015',NULL,'M-V 13:00-14:50','B3-06'),(97,'IC4301','4-4444-4444',2,'IS2015',NULL,'M-V 7:30-9:20','B3-06'),(98,'IC5821','2-2222-2222',1,'IS2015',NULL,'M-V 15:00-16:50','B3-06'),(99,'IC6821','1-1111-1111',1,'IIS2015',NULL,'K-J 7:30-9:20','B3-07'),(100,'IC6821','1-1111-1111',2,'IS2015',NULL,'M-V 7:30-9:20','B3-07'),(101,'IC1802','5-5555-5555',1,'IS2014',NULL,'K-J 7:30-9:20','B3-08'),(102,'IC1803','5-5555-5555',1,'IIS2014',NULL,'K-J 9:30-11:20','B3-08'),(103,'IC5485','6-6666-6666',1,'IS2014',NULL,'M-V 13:00-14:50','B3-06'),(104,'IC4301','4-4444-4444',2,'IIT2014',NULL,'M-V 7:30-9:20','B3-06'),(105,'IC5821','2-2222-2222',1,'IS2014',NULL,'M-V 15:00-16:50','B3-06'),(106,'IC6821','1-1111-1111',1,'IS2014',NULL,'K-J 7:30-9:20','B3-07'),(107,'IC6821','1-1111-1111',2,'IS2014',NULL,'M-V 7:30-9:20','B3-07'),(108,'IC1802','5-5555-5555',1,'IIS2013',NULL,'K-J 7:30-9:20','B3-08'),(109,'IC1803','5-5555-5555',1,'IS2013',NULL,'K-J 9:30-11:20','B3-08'),(110,'IC4301','2-2222-2222',1,'IS2013',NULL,'M-V 13:00-14:50','B3-06'),(111,'IC4301','4-4444-4444',2,'IIS2013',NULL,'M-V 7:30-9:20','B3-06'),(112,'IC5485','6-6666-6666',1,'IS2013',NULL,'M-V 15:00-16:50','B3-06'),(113,'IC6821','1-1111-1111',1,'IS2013',NULL,'K-J 7:30-9:20','B3-07'),(114,'IC6821','1-1111-1111',2,'IC2013',NULL,'M-V 7:30-9:20','B3-07');
/*!40000 ALTER TABLE `ofertas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plantilla`
--

DROP TABLE IF EXISTS `plantilla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plantilla` (
  `idPlantilla` int(11) NOT NULL AUTO_INCREMENT,
  `siglas` varchar(100) NOT NULL,
  `introduccion` varchar(5000) NOT NULL,
  `resultado` varchar(5000) NOT NULL,
  `considerandos` varchar(5000) NOT NULL,
  `resuelvo` varchar(5000) NOT NULL,
  `consecutivo` int(11) NOT NULL,
  PRIMARY KEY (`idPlantilla`),
  KEY `FK_Pplant_DetallIncosist_idx` (`siglas`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plantilla`
--

LOCK TABLES `plantilla` WRITE;
/*!40000 ALTER TABLE `plantilla` DISABLE KEYS */;
INSERT INTO `plantilla` VALUES (30,'EA','El suscrito #nombreDirectorEscuela , Director de la Escuela de Ingeniería en Computación en atención al caso de #inconsistencia del estudiante #nombreAfectado , carné #idAfectado , sobre el curso #codigoCurso ,\r\ngrupo #nGrupo, del #periodo , resuelvo:','Por un error involuntario, no se tramitó la inclusión del estudiante #nombreAfectadocon identificación #idAfectado en el curso #codigoCurso , grupo #nGrupo impartido en el #periodo , el profesor no pudo registrar en el acta la calificación obtenida por el estudiante.','Autorizar la modificación del acta del curso #codigoCurso grupo #nGrupo en el #periodo impartido para incluir al estudiante #nombreAfectado#nombreAfectado , carné #idAfectado con una nota de aprobaciónde noventa y cinco (95).','Después de haber realizado la investigación del caso, y consultado al profesor, quien impartió el curso #codigoCurso , grupo #nGrupo, del #periodo se logra comprobar que el estudiante#nombreAfectado , carné #idAfectado , efectivamente aprobó el curso con una nota de noventa y cinco(95), por lo que esta Dirección solicita gestionar la modificación del acta correspondiente.',1),(31,'IA','El suscrito #nombreDirectorEscuela , Director de la Escuela de Ingeniería en Computación en atención al caso de #inconsistencia del estudiante #nombreAfectado , carné #idAfectado , sobre el curso #codigoCurso ,\r\ngrupo #nGrupo, del #periodo , resuelvo:','Por un error involuntario, no se tramitó la inclusión del estudiante #nombreAfectadocon identificación #idAfectado en el curso #codigoCurso , grupo #nGrupo impartido en el #periodo , el profesor no pudo registrar en el acta la calificación obtenida por el estudiante.','Autorizar la modificación del acta del curso #codigoCurso grupo #nGrupo en el #periodo impartido para incluir al estudiante #nombreAfectado#nombreAfectado , carné #idAfectado con una nota de aprobaciónde noventa y cinco (95).','Después de haber realizado la investigación del caso, y consultado al profesor, quien impartió el curso #codigoCurso , grupo #nGrupo, del #periodo se logra comprobar que el estudiante#nombreAfectado , carné #idAfectado , efectivamente aprobó el curso con una nota de noventa y cinco(95), por lo que esta Dirección solicita gestionar la modificación del acta correspondiente.',1),(32,'EN','El suscrito #nombreDirectorEscuela , Director de la Escuela de Ingeniería en Computación en atención al caso de #inconsistencia del estudiante #nombreAfectado , carné #idAfectado , sobre el curso #codigoCurso ,\r\ngrupo #nGrupo, del #periodo , resuelvo:','Por un error involuntario, no se tramitó la inclusión del estudiante #nombreAfectadocon identificación #idAfectado en el curso #codigoCurso , grupo #nGrupo impartido en el #periodo , el profesor no pudo registrar en el acta la calificación obtenida por el estudiante.','Autorizar la modificación del acta del curso #codigoCurso grupo #nGrupo en el #periodo impartido para incluir al estudiante #nombreAfectado#nombreAfectado , carné #idAfectado con una nota de aprobaciónde noventa y cinco (95).','Después de haber realizado la investigación del caso, y consultado al profesor, quien impartió el curso #codigoCurso , grupo #nGrupo, del #periodo se logra comprobar que el estudiante#nombreAfectado , carné #idAfectado , efectivamente aprobó el curso con una nota de noventa y cinco(95), por lo que esta Dirección solicita gestionar la modificación del acta correspondiente.',1);
/*!40000 ALTER TABLE `plantilla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profesores` (
  `id` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `telefono` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES ('1-1111-1111','Ericka Solano Fern�ndez','ersolano@itcr.ac.cr','8111-1111'),('2-2222-2222','Alicia Salazar Hern�ndez','asalazar@itcr.ac.cr','8222-2222'),('3-3333-3333','Sa�l Calder�n Ram�rez','sacalderon@itcr.ac.cr','8333-3333'),('4-4444-4444','Franco Quir�s Ram�rez','fquiros@itcr.ac.cr','8444-4444'),('5-5555-5555','Ivannia Cerdas Quesada','iquesada@itcr.ac.cr','8555-5555'),('6-6666-6666','Kirstein Gatjens','kgatjens@itcr.ac.cr','8666-6666');
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resoluciones`
--

DROP TABLE IF EXISTS `resoluciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resoluciones` (
  `idSolicitud` int(11) NOT NULL,
  `numeroResolucion` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `coordinador` varchar(100) DEFAULT NULL,
  `directorEscuela` varchar(100) DEFAULT NULL,
  `directorAdmyReg` varchar(100) DEFAULT NULL,
  `introduccion` text,
  `resultado` text,
  `considerandos` text,
  `resuelvo` text,
  PRIMARY KEY (`idSolicitud`),
  UNIQUE KEY `idSolicitud_UNIQUE` (`idSolicitud`),
  UNIQUE KEY `numeroResolucion_UNIQUE` (`numeroResolucion`),
  CONSTRAINT `idsolic2` FOREIGN KEY (`idSolicitud`) REFERENCES `solicitudes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resoluciones`
--

LOCK TABLES `resoluciones` WRITE;
/*!40000 ALTER TABLE `resoluciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `resoluciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitudes`
--

DROP TABLE IF EXISTS `solicitudes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `solicitudes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idOferta` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `inconsistencia` varchar(100) DEFAULT NULL,
  `descripcion` text,
  `idSolicitante` varchar(100) DEFAULT NULL,
  `solicitante` varchar(100) DEFAULT NULL,
  `idAfectado` varchar(100) DEFAULT NULL,
  `nombreAfectado` varchar(100) DEFAULT NULL,
  `correoAfectado` varchar(100) DEFAULT NULL,
  `telefonoAfectado` varchar(100) DEFAULT NULL,
  `rutaAdjunto` text,
  `estado` varchar(100) NOT NULL,
  `aclaracion` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `solicitudOferta_idx` (`idOferta`),
  CONSTRAINT `solicitudOferta` FOREIGN KEY (`idOferta`) REFERENCES `ofertas` (`idoferta`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudes`
--

LOCK TABLES `solicitudes` WRITE;
/*!40000 ALTER TABLE `solicitudes` DISABLE KEYS */;
INSERT INTO `solicitudes` VALUES (18,114,'2017-06-20','MODIFICACION ACTA','El alumno indica que fue matriculado\nen un curso al cual no realizó solicitud\nde matricula en ningún momento.','2015082908','Andrey Mendoza','2013585956','Javier Solano','jsolano@gmail.com','86574132','C:\\Users\\Andrey\\Documents\\DXAuditorias\\build.xml','Pendiente','Sin definir'),(19,94,'2017-06-20','MODIFICACION ACTA','El siguiente alumno presenta un error\nen la nota que yo le reporté. Favor \ncambiar a un 90.','70250238','Eduardo Canessa','2015485649','Brandon Dinrte','bdinarte@gmail.com','70560254','C:\\Users\\Andrey\\Documents\\.Rhistory','Pendiente','Sin definir'),(20,94,'2017-06-20','MODIFICACION ACTA','El estudiante indica que la nota que se\nle asignó no es la adecuada, por lo que\nes necesario verificar con el profesor.','201078962','Mauricio Arroyo','2012456285','Anthony Fernández','afernandez@gmail.com','60154782','C:\\Users\\Andrey\\Documents\\.Rhistory','Pendiente','Sin definir'),(21,83,'2017-06-20','MODIFICACION ACTA','Matriculé el curso, sin embargo, no\nsalgo en el registro de actas por lo que\nel profesor no pudo asignarme la nota.','2005456548','Edwin Alvarado','2005456548','Edwin Alvarado','ealvarado@gmail.com','78451234','C:\\Users\\Andrey\\Documents\\NFS Most Wanted\\Andrey\\Andrey','Pendiente','Sin definir'),(22,94,'2017-06-21','EXCLUSION ACTA','Fui incluída en el curso y yo no lo \nmatriculé. Posible error en el sistema.','2017452816','Paola Alvarado','2017452816','Paola Alvarado','palvarado@gmail.com','85412142','C:\\Users\\Andrey\\Documents\\R\\win-library\\3.4\\base64enc\\DESCRIPTION','Pendiente','Sin definir');
/*!40000 ALTER TABLE `solicitudes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id` varchar(100) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `contrasenha` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `telefono` varchar(100) NOT NULL,
  `tipoUsuario` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('1','super','Disennio','Administrador','admin@gmail.com','25509111','SuperUsuario'),('amendoza@gmail.com','amendoza','asd','2015082908','Andrey Mendoza','86382040','Coordinador'),('asistente@gmail.com','asistente','asd','2014565658','Asistente de Coordinador','7851232','Asistente'),('fdireccion@gmail.com','direccion','asd','2014565658','Funcionario de Direccion','7851232','Director');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-21  0:43:53
