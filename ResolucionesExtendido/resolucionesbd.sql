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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inconsistencias`
--

LOCK TABLES `inconsistencias` WRITE;
/*!40000 ALTER TABLE `inconsistencias` DISABLE KEYS */;
INSERT INTO `inconsistencias` VALUES (5,'EXCLUSION_ACTA'),(6,'INCLUSION_ACTA'),(7,'ERROR_NOTA');
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
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ofertas`
--

LOCK TABLES `ofertas` WRITE;
/*!40000 ALTER TABLE `ofertas` DISABLE KEYS */;
INSERT INTO `ofertas` VALUES (45,'IC1802','5-5555-5555',1,'IS2017',NULL,'K-J 7:30-9:20','B3-08'),(46,'IC1803','5-5555-5555',1,'IIS2017',NULL,'K-J 9:30-11:20','B3-08'),(47,'IC4301','2-2222-2222',1,'IS2017',NULL,'M-V 13:00-14:50','B3-06'),(48,'IC4301','4-4444-4444',2,'IS2017',NULL,'M-V 7:30-9:20','B3-06'),(49,'IC5821','2-2222-2222',1,'IS2017',NULL,'M-V 15:00-16:50','B3-06'),(50,'IC6821','1-1111-1111',1,'IIS2017',NULL,'K-J 7:30-9:20','B3-07'),(51,'IC6821','1-1111-1111',2,'IS2017',NULL,'M-V 7:30-9:20','B3-07'),(52,'IC1802','5-5555-5555',1,'IIS2016',NULL,'K-J 7:30-9:20','B3-08'),(53,'IC1803','5-5555-5555',1,'IS2016',NULL,'K-J 9:30-11:20','B3-08'),(54,'IC4301','2-2222-2222',1,'IIS2016',NULL,'M-V 13:00-14:50','B3-06'),(55,'IC4301','4-4444-4444',2,'IT2016',NULL,'M-V 7:30-9:20','B3-06'),(56,'IC5821','2-2222-2222',1,'IS2016',NULL,'M-V 15:00-16:50','B3-06'),(57,'IC6821','1-1111-1111',1,'IIS2016',NULL,'K-J 7:30-9:20','B3-07'),(58,'IC6821','1-1111-1111',2,'IS2016',NULL,'M-V 7:30-9:20','B3-07'),(59,'IC1802','5-5555-5555',1,'IIS2015',NULL,'K-J 7:30-9:20','B3-08'),(60,'IC1803','5-5555-5555',1,'IC2015',NULL,'K-J 9:30-11:20','B3-08'),(61,'IC4301','2-2222-2222',1,'IS2015',NULL,'M-V 13:00-14:50','B3-06'),(62,'IC4301','4-4444-4444',2,'IS2015',NULL,'M-V 7:30-9:20','B3-06'),(63,'IC5821','2-2222-2222',1,'IS2015',NULL,'M-V 15:00-16:50','B3-06'),(64,'IC6821','1-1111-1111',1,'IIS2015',NULL,'K-J 7:30-9:20','B3-07'),(65,'IC6821','1-1111-1111',2,'IS2015',NULL,'M-V 7:30-9:20','B3-07'),(66,'IC1802','5-5555-5555',1,'IS2014',NULL,'K-J 7:30-9:20','B3-08'),(67,'IC1803','5-5555-5555',1,'IIS2014',NULL,'K-J 9:30-11:20','B3-08'),(68,'IC5485','6-6666-6666',1,'IS2014',NULL,'M-V 13:00-14:50','B3-06'),(69,'IC4301','4-4444-4444',2,'IIT2014',NULL,'M-V 7:30-9:20','B3-06'),(70,'IC5821','2-2222-2222',1,'IS2014',NULL,'M-V 15:00-16:50','B3-06'),(71,'IC6821','1-1111-1111',1,'IS2014',NULL,'K-J 7:30-9:20','B3-07'),(72,'IC6821','1-1111-1111',2,'IS2014',NULL,'M-V 7:30-9:20','B3-07'),(73,'IC1802','5-5555-5555',1,'IIS2013',NULL,'K-J 7:30-9:20','B3-08'),(74,'IC1803','5-5555-5555',1,'IS2013',NULL,'K-J 9:30-11:20','B3-08'),(75,'IC4301','2-2222-2222',1,'IS2013',NULL,'M-V 13:00-14:50','B3-06'),(76,'IC4301','4-4444-4444',2,'IIS2013',NULL,'M-V 7:30-9:20','B3-06'),(77,'IC5485','6-6666-6666',1,'IS2013',NULL,'M-V 15:00-16:50','B3-06'),(78,'IC6821','1-1111-1111',1,'IS2013',NULL,'K-J 7:30-9:20','B3-07'),(79,'IC6821','1-1111-1111',2,'IC2013',NULL,'M-V 7:30-9:20','B3-07');
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
  PRIMARY KEY (`idPlantilla`),
  KEY `FK_Pplant_DetallIncosist_idx` (`siglas`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plantilla`
--

LOCK TABLES `plantilla` WRITE;
/*!40000 ALTER TABLE `plantilla` DISABLE KEYS */;
INSERT INTO `plantilla` VALUES (1,'EN','Esta es la plantilla 1','Estan funcionando bien','Los tipos de siglas ','las plantillas estan volando'),(2,'EN','Introduccion 2','resultado 2','considerando 2','resuelvo 2'),(3,'IA','intro 3','resultado 3','considerandos 3',''),(4,'IA','intro 4','res 4','consi 4','resuelvo 4'),(5,'IA','intro 3','resultado 3','considerandos 3',''),(6,'IA','intro 6','resultado 6','considerandos 6','resuelvo 6'),(7,'IA','intro 7','resultado 7','considerandos 7','resuelvo 7'),(8,'IA','intro 8','resultado 8','considerandos 8','resuelvo 8');
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
INSERT INTO `profesores` VALUES ('1-1111-1111','Ericka Solano Fern�ndez','ersolano@itcr.ac.cr','8111-1111'),('2-2222-2222','Alicia Salazar Hern�ndez','asalazar@itcr.ac.cr','8222-2222'),('3-3333-3333','Sa�l Calder�n Ram�rez','sacalderon@itcr.ac.cr','8333-3333'),('4-4444-4444','Franco Quir�s Ram�rez','fquiros@itcr.ac.cr','8444-4444'),('5-5555-5555','Ivannia Cerdas Quesada','iquesada@itcr.ac.cr','8555-5555'),('6-6666-6666','Kirstein Gatjens','kgatjens@itcr.ac.cr','8666-6666'),('CRC 101','Brondon','mail@mail.com','8591-7790');
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
INSERT INTO `resoluciones` VALUES (1,9,'2017-06-16','Ericka Solano','Mauricio Arroyo Herrera','Geovanni Rojas Rodriguez','intro modif','resultados modif','considerandos modif','resuelvo modif'),(9,10,'2017-06-17','Ericka Solano','Mauricio Arroyo Herrera','Geovanni Rojas Rodriguez','{ Hora y fecha }, el suscrito { Nombre del Director }, Director de la Escuela de Ingeniería en Computación en atención al caso de { Situacion de inconsistencia } del estudiante{ Nombre del afectado }, carné { carné del afectado } , sobre el curso { código y nombre del curso } , grupo { Número de grupo }, del { Semestre } , resuelvo:','Por un error involuntario, no se tramitó la inclusión del estudiante { Nombre del estudiante }con identificación { carné del estudiante } en el curso { código y nombre del curso }, grupo { Número de grupo } impartido por el profesor { Nombre del profesor } en el { Semestre }, el profesor no pudo registrar en el acta la calificación obtenida\npor el estudiante.  ','Después de haber realizado la investigación del caso, y consultado al profesor{ Nombre del profesor }, quien impartió el curso { código y nombre del curso }, { Número de grupo }, del { Semestre }  se logra comprobar que el estudiante { Nombre del afectado },carné { carné del estudiante }, efectivamente aprobó el curso con una nota de noventa y cinco(95), por lo que esta Dirección solicita gestionar la modificación del acta\ncorrespondiente. ',' Autorizar la modificación del acta del curso  { código y nombre del curso } grupo { Número de grupo } en el { Semestre }impartido por el profesor { Nombre del profesor } para inc,luir al estudiante{ Nombre del afectado }, carné { carné del estudiante } con una nota de aprobaciónde noventa y cinco (95). ');
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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudes`
--

LOCK TABLES `solicitudes` WRITE;
/*!40000 ALTER TABLE `solicitudes` DISABLE KEYS */;
INSERT INTO `solicitudes` VALUES (1,53,'2017-06-15','Probando desde el freim','Solicitud de Prueba #1','2015082908','Andrey Mendoza','898989','Luis Mendoza','lm@gmail.com','454554','C:\\Users\\Andrey\\Documents\\.Rhistory','Tramitada','Sin definir'),(2,59,'2017-06-16','MODIFICACION_ACTA','asd','asd','asd','asd','asd','asd@asd.com','asd','','Pendiente',''),(3,59,'2017-06-16','MODIFICACION_ACTA','asd','asd','asd','asd','asda','asd@asd.com','asd','','Anulada','por que me ronca\n'),(4,59,'2017-06-16','MODIFICACION_ACTA','asd','asd','asd','asd','asd','asd@asd.com','asd','','Anulada','Por que si\n'),(5,59,'2017-06-16','MODIFICACION_ACTA','sad','asd','asd','sd','asda','asd@asd.com','asd','','Pendiente',''),(6,59,'2017-06-16','MODIFICACION_ACTA','asd','asd','as','asd','asd','asd@asd.com','asd','','Pendiente',''),(7,59,'2017-06-16','MODIFICACION_ACTA','asd','asd','asd','asd','asda','asd@asd.com','asd','','Tramitada',''),(8,59,'2017-06-16','MODIFICACION_ACTA','sd','ad','asd','asd','asd','asd@asd.com','asd','','Tramitada',''),(9,59,'2017-06-17','MODIFICACION_ACTA','Prueba pagina web lista','2015082908','Andrey Mendoza','89898','Julian Salinas','jsaly12@gmail.com','85566223','','Tramitada',''),(10,59,'2017-06-17','EXCLUSION_ACTA','Prueba con interfaz de coordinador lista','515432','prueba22','56513','afect22','asd@gmail.com','123124','C:\\Users\\Andrey\\Documents\\.Rhistory','Pendiente','Sin definir'),(11,59,'2017-06-17','EXCLUSION_ACTA','Es un puto error en la fucking nota','2015082908','Andrey Mendoza','2015082908','Andrey Mendoza','a@gmail.com','91233','C:\\Users\\Andrey\\Documents\\.Rhistory','Pendiente','Sin definir');
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
INSERT INTO `usuarios` VALUES ('99999','super','Disennio','Superusuario','escuelaIC@itcr.ac.cr','2550-9696','SuperUsuario'),('a@gmail.com','amendoza','asd','2015082908','Andrey Mendoza','86382040','SuperUsuario'),('bd@gmail.com','bdinarte','asd','201588896','Brandon Dinarte','555563','Asistente');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'resolucionesbd'
--
/*!50003 DROP PROCEDURE IF EXISTS `ActIncostSolicitud` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ActIncostSolicitud`(
	IN id INT,
	IN inconsistencia VARCHAR(100)
)
BEGIN
	UPDATE solicitudes s 
    SET  s.inconsistencia = inconsistencia
    WHERE s.id = id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `actualizarPlantilla` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizarPlantilla`(
	IN nConsecutivo INT,
	IN siglas VARCHAR(100),
    IN introduccion VARCHAR(5000),
    IN resultado VARCHAR(5000),
    IN considerandos VARCHAR(5000),
    IN resuelvo VARCHAR(5000)

)
BEGIN

	UPDATE Plantilla
		SET plantilla.siglas = siglas,
			plantilla.introduccion = introduccion,
            plantilla.resultado = resultado,
            plantilla.considerandos = considerandos,
            plantilla.resuelvo = resuelvo
		WHERE plantilla.idPlantilla= nConsecutivo;
        
						
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarUsuario`(
	IN id VARCHAR(100),
	IN usuario VARCHAR(100),
    IN contrasenha VARCHAR(100),
    IN nombre VARCHAR(100),
    IN correo VARCHAR(100),
    IN telefono VARCHAR(100),
    IN tipoUsuario VARCHAR(100)
    
)
BEGIN
	
    INSERT INTO usuarios (	`id`,
							`usuario`, 
							`contrasenha`,
                            `nombre`,
                            `correo`,
                            `telefono`,
                            `tipoUsuario`
                            )
		VALUES (id, usuario, contrasenha, nombre, correo, telefono, tipoUsuario);
	
        
						
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `anularSolicitud` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `anularSolicitud`(
IN idS INT, IN aclaration TEXT
)
BEGIN
	UPDATE solicitudes
    SET estado = 'Anulada', aclaracion = aclaration
    WHERE id = idS;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `CambiarContrasenha` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `CambiarContrasenha`(
		IN usuario VARCHAR(100),
        IN contrasenhaAct VARCHAR(100),
        IN contrasenhaNueva VARCHAR(100)
)
BEGIN
	
    UPDATE usuarios u 
		SET u.contrasenha = contrasenhaNueva            
		WHERE u.usuario = usuario AND u.contrasenha = contrasenhaAct;
        
	SELECT u.id
		FROM usuarios u
        WHERE u.usuario = usuario AND u.contrasenha = contrasenhaNueva;
        
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `consultarPlantillas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `consultarPlantillas`()
BEGIN

	SELECT *
		FROM Plantilla;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `consultarResolucion` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `consultarResolucion`(in pidSolicitud int(11) )
BEGIN

	select * from resoluciones where pidSolicitud = resoluciones.idSolicitud;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `consultarSolicitudes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `consultarSolicitudes`()
BEGIN
	SELECT s.id, s.fecha, s.idSolicitante, s.solicitante, s.idAfectado, s.nombreAfectado,
		   s.correoAfectado, s.telefonoAfectado, s.inconsistencia, s.descripcion, 
           s.rutaAdjunto, s.estado, s.aclaracion, -1 as 'numResolucion',
		   o.periodo, o.codigoCurso, o.numeroGrupo, s.estado
	FROM solicitudes s, ofertas o
    WHERE s.idOferta = o.idoferta and s.id not in (select idSolicitud from resoluciones)
    UNION
    SELECT s.id, s.fecha, s.idSolicitante, s.solicitante, s.idAfectado, s.nombreAfectado,
		   s.correoAfectado, s.telefonoAfectado, s.inconsistencia, s.descripcion, 
           s.rutaAdjunto, s.estado, s.aclaracion, r.numeroResolucion as 'numResolucion',
		   o.periodo, o.codigoCurso, o.numeroGrupo, s.estado
	FROM solicitudes s, ofertas o, resoluciones r
    WHERE s.idOferta = o.idoferta and r.idSolicitud = s.id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarResolucion` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarResolucion`(
		IN idSolicitud INT(11),
        IN introduccion TEXT, 
		IN resultado TEXT, 
        IN considerandos TEXT, 
        IN resuelvo TEXT
)
BEGIN
	
    UPDATE resoluciones r 
		SET r.introduccion = introduccion,
            r.resultado = resultado,
            r.considerandos = considerandos,
            r.resuelvo = resuelvo
		WHERE r.idSolicitud = idSolicitud;
        
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `obtenerNumResolucionParaSolic` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `obtenerNumResolucionParaSolic`(IN idBuscado INT)
BEGIN
	SELECT numeroResolucion FROM resoluciones
    WHERE idSolicitud = idBuscado;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `RealizarLogin` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `RealizarLogin`(
	IN usuario VARCHAR(100),
    IN contrasenha VARCHAR(100)
)
BEGIN

	SELECT 	u.id,
			u.nombre,
            u.correo,
            u.telefono,
            u.tipoUsuario
		FROM usuarios u 
        WHERE u.usuario LIKE usuario AND u.contrasenha LIKE BINARY contrasenha;
        
						
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `registrarCurso` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrarCurso`(
IN cod VARCHAR(100), IN nomb VARCHAR(100), IN cred INT
)
BEGIN
	IF NOT EXISTS (SELECT codigo FROM cursos WHERE codigo = cod)
	THEN
		INSERT INTO cursos 	(`codigo`, `nombre`, `creditos`)
					VALUES	(cod, nomb, IFNULL(cred, 1) );
                                
	ELSE
		SELECT codigo FROM cursos WHERE codigo = cod;
	END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `registrarInconsistencia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrarInconsistencia`(
IN detail VARCHAR(100)
)
BEGIN
	IF NOT EXISTS (SELECT id FROM inconsistencias WHERE LOWER(detail) = LOWER(detalle) )
	THEN
		INSERT INTO inconsistencias	(`detalle`)
					VALUES	(detail);
                                
		SELECT LAST_INSERT_ID() AS 'ultimoID';
	ELSE
		SELECT id FROM inconsistencias WHERE LOWER(detail) = LOWER(detalle);
	END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `registrarOferta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrarOferta`( 
IN codCurso VARCHAR(100), IN idProfe VARCHAR(100), IN nGrupo INT, 
IN period VARCHAR(100), IN sched VARCHAR(100), IN class VARCHAR(100)
)
BEGIN
	IF NOT EXISTS (SELECT idoferta FROM ofertas WHERE period = periodo AND codigoCurso = codCurso
											AND numeroGrupo = nGrupo)
	THEN
		INSERT INTO ofertas (`codigoCurso`, `idProfesor`, `numeroGrupo`, `periodo`,
							`horario`, `aula`)
					VALUES	(codCurso, idProfe, nGrupo, period, IFNULL(sched, 'No definido'),
							IFNULL(class, 'No definida'));
                                
		SELECT LAST_INSERT_ID() AS 'ultimoID';
	ELSE
		SELECT idoferta FROM ofertas WHERE period = periodo AND codigoCurso = codCurso
											AND numeroGrupo = nGrupo;
	END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `registrarPlantilla` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrarPlantilla`(

	IN siglas VARCHAR(100),
    IN introduccion VARCHAR(5000),
    IN resultado VARCHAR(5000),
    IN considerandos VARCHAR(5000),
    IN resuelvo VARCHAR(5000)

)
BEGIN

	INSERT INTO Plantilla (`siglas`,`introduccion`,`resultado`,`considerandos`,`resuelvo`)
				VALUES(siglas, introduccion, resultado, considerandos, resuelvo);
							
	SELECT LAST_INSERT_ID() AS 'ultimoID';
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `registrarProfesor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrarProfesor`(
IN identif VARCHAR(100), IN nomb VARCHAR(100), IN mail VARCHAR(100), IN tel VARCHAR(100)
)
BEGIN
	IF NOT EXISTS (SELECT id FROM profesores WHERE id = identif)
	THEN
		INSERT INTO profesores 	(`id`, `nombre`, `correo`, `telefono`)
					VALUES	(identif, nomb, IFNULL(mail, 'Sin correo'), 
							IFNULL(tel, 'Sin teléfono') );

	ELSE
		SELECT id FROM profesores WHERE id = identif;
	END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `registrarResolucion` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrarResolucion`(
IN idSolicitud INT(11), IN nResolucion INT(11),  IN fecha DATE, IN coordinador VARCHAR(100), 
in directorEscuela VARCHAR(100), in directorAdmyReg VARCHAR(100), in introduccion text, 
in resultado text, in considerandos text, in resuelvo text
)
BEGIN
	IF NOT EXISTS (select idSolicitud from resoluciones where idSolicitud = resoluciones.idSolicitud)
	THEN
		insert into resoluciones (`idSolicitud`, `numeroResolucion`, `fecha`, `coordinador`, `directorEscuela`,
					`directorAdmYReg`, `introduccion`, `resultado`,`considerandos`,`resuelvo`)  
                    VALUES 
                    (idSolicitud, nResolucion, fecha, coordinador, directorEscuela,
					directorAdmyReg, introduccion, resultado, considerandos, resuelvo);
	END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `registrarSolicitud` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrarSolicitud`(
IN fecha DATE, IN idSolic VARCHAR(100), IN nombreSolic VARCHAR(100),
IN period VARCHAR(100), IN codCurso VARCHAR(100), IN nGrupo INT,
IN idAfect VARCHAR(100), IN nombreAfect VARCHAR(100), IN correoAfect VARCHAR(100),
IN telefonoAfect VARCHAR(100), IN inconsist VARCHAR(100), IN descrip TEXT, 
IN ruta TEXT, IN estado VARCHAR(100), IN aclarac TEXT
)
BEGIN
	IF EXISTS (SELECT idoferta FROM ofertas WHERE period = periodo AND codigoCurso = codCurso
											AND numeroGrupo = nGrupo)
	THEN
		SET @idOferta = (SELECT idoferta FROM ofertas WHERE period = periodo AND codigoCurso = codCurso
											AND numeroGrupo = nGrupo);
		INSERT INTO solicitudes (`idOferta`,`fecha`,`inconsistencia`,`descripcion`,
								`idSolicitante`,`solicitante`,`idAfectado`,`nombreAfectado`,
                                `correoAfectado`,`telefonoAfectado`,`rutaAdjunto`,`estado`,
                                `aclaracion`)
					VALUES		(@idOferta, fecha, inconsist, descrip, idSolic,
								nombreSolic, idAfect, nombreAfect, correoAfect, 
                                telefonoAfect, ruta, estado, aclarac);
                                
		SELECT LAST_INSERT_ID() AS 'ultimoID';
	ELSE
		SIGNAL SQLSTATE '01000';
	END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `tramitarSolicitud` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tramitarSolicitud`(
IN idS INT
)
BEGIN
	UPDATE solicitudes
    SET estado = 'Tramitada'
    WHERE id = idS;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-17 18:05:55
