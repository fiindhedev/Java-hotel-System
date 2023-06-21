/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 10.1.16-MariaDB : Database - hotel
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hotel` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `hotel`;

/*Table structure for table `calisanlar` */

DROP TABLE IF EXISTS `calisanlar`;

CREATE TABLE `calisanlar` (
  `calisID` int(99) NOT NULL AUTO_INCREMENT,
  `calisadi` varchar(999) NOT NULL,
  `kimlik` varchar(99) NOT NULL,
  `cinsiyeti` varchar(999) NOT NULL,
  `telefon` int(99) NOT NULL,
  `istipi` varchar(999) NOT NULL,
  `calismasaat` int(99) NOT NULL,
  `haftasonu` varchar(999) NOT NULL,
  `saatlikmaas` int(99) NOT NULL,
  `sozbasla` varchar(999) NOT NULL,
  `sozbitis` varchar(999) NOT NULL,
  `maasi` int(99) NOT NULL,
  PRIMARY KEY (`calisID`,`kimlik`,`telefon`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `calisanlar` */

insert  into `calisanlar`(`calisID`,`calisadi`,`kimlik`,`cinsiyeti`,`telefon`,`istipi`,`calismasaat`,`haftasonu`,`saatlikmaas`,`sozbasla`,`sozbitis`,`maasi`) values 
(3,'Aybike','9926','Kad?n',63636,'temislici',9,'Pazar',10,'2022-12-19','2024-12-31',2340),
(6,'ahmed','9927','Erkek',748488,'yardimci',8,'Cumartesi',15,'2022-12-18','2024-12-19',3120),
(9,'Nesrin Cakir','73746373','Erkek',94978283,'temislici',8,'Cumartesi',10,'Sun Dec 26 00:00:00 EET 2021','Sun Jan 01 00:00:00 EET 2023',2080),
(10,'Alex','937989','Erkek',494040,'Yardimci',10,'Cumartesi',20,'Mon Dec 19 21:36:42 EET 2022','Tue Dec 20 21:36:44 EET 2022',6000),
(11,'Kadir','8384884','Erkek',478482,'temislici',8,'Çal???r',15,'2022-12-353','2024-12-361',3600);

/*Table structure for table `calisanyok` */

DROP TABLE IF EXISTS `calisanyok`;

CREATE TABLE `calisanyok` (
  `id` int(99) NOT NULL AUTO_INCREMENT,
  `yil` int(99) NOT NULL,
  `ay` varchar(999) NOT NULL,
  `calisadi` varchar(999) NOT NULL,
  `kimlik` varchar(99) NOT NULL,
  `caliszamani` varchar(999) NOT NULL,
  `giris` varchar(999) NOT NULL,
  `cikis` varchar(999) NOT NULL,
  `calismasaat` int(99) NOT NULL,
  `calistigi` int(99) NOT NULL,
  `eksik` int(99) NOT NULL,
  `tarih` varchar(999) NOT NULL,
  PRIMARY KEY (`id`,`kimlik`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `calisanyok` */

insert  into `calisanyok`(`id`,`yil`,`ay`,`calisadi`,`kimlik`,`caliszamani`,`giris`,`cikis`,`calismasaat`,`calistigi`,`eksik`,`tarih`) values 
(2,2022,'DECEMBER','hamse','9930','Tam Zaman?/Full-time','9:00AM','19:00AM',8,7,1,'Tue Dec 20 21:39:47 EET 2022'),
(7,2022,'DECEMBER','Aybike','9926','Tam Zaman?/Full-time','9:00AM','17:00AM',9,6,3,'2022-Dec-353'),
(8,2022,'DECEMBER','Jama Farah','9927','Tam Zaman?/Full-time','9:00AM','19:00AM',10,8,2,'2022-Dec-354');

/*Table structure for table `digergider` */

DROP TABLE IF EXISTS `digergider`;

CREATE TABLE `digergider` (
  `id` int(99) NOT NULL AUTO_INCREMENT,
  `yil` int(99) NOT NULL,
  `ay` varchar(999) NOT NULL,
  `tipi` varchar(999) NOT NULL,
  `miktar` int(99) NOT NULL,
  `turu` varchar(999) NOT NULL,
  `tarih` varchar(999) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `digergider` */

insert  into `digergider`(`id`,`yil`,`ay`,`tipi`,`miktar`,`turu`,`tarih`) values 
(1,2022,'DECEMBER','elektrik',100,'kredi kart','2022-12-15');

/*Table structure for table `gelir` */

DROP TABLE IF EXISTS `gelir`;

CREATE TABLE `gelir` (
  `id` int(99) NOT NULL AUTO_INCREMENT,
  `yil` int(99) NOT NULL,
  `ay` varchar(999) NOT NULL,
  `musteriadi` varchar(999) NOT NULL,
  `kimlik` varchar(700) NOT NULL,
  `telefon` int(99) NOT NULL,
  `odanum` int(99) NOT NULL,
  `toplamfiyati` int(99) NOT NULL,
  `odenen` int(99) NOT NULL,
  `kalan` int(99) NOT NULL,
  `tarih` varchar(999) NOT NULL,
  PRIMARY KEY (`id`,`kimlik`,`telefon`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

/*Data for the table `gelir` */

insert  into `gelir`(`id`,`yil`,`ay`,`musteriadi`,`kimlik`,`telefon`,`odanum`,`toplamfiyati`,`odenen`,`kalan`,`tarih`) values 
(2,2022,'DECEMBER','Polat Alemdar','26473737',904774,210,40,40,0,'2022-12-19'),
(3,2022,'DECEMBER','Hamse','9970',4488475,209,300,250,50,'2022-12-19'),
(4,2022,'DECEMBER','Cuma','36464738',55364748,209,200,200,0,'2022-12-19'),
(5,2022,'DECEMBER','Cuma','36464738',55364748,209,200,200,0,'2022-12-19'),
(6,2022,'DECEMBER','Sakarie Akabe','992675786',55465775,301,100,100,0,'Mon Dec 19 18:35:55 EET 2022'),
(7,2022,'DECEMBER','Sakarie Akabe','992675786',55465775,301,100,100,0,'Mon Dec 19 18:35:55 EET 2022'),
(8,2022,'DECEMBER','Cuma','36464738',55364748,209,200,200,0,'2022-12-19'),
(9,2022,'DECEMBER','Sakarie Akabe','992675786',55465775,301,100,100,0,'Mon Dec 19 18:35:55 EET 2022'),
(10,2022,'DECEMBER','Cuma','36464738',55364748,209,200,200,0,'2022-12-19'),
(16,2022,'DECEMBER','Sakarie Akabe','992675786',55465775,301,100,100,0,'Mon Dec 19 18:35:55 EET 2022'),
(17,2022,'DECEMBER','kilic','7383989',5373848,208,400,400,0,'2022-12-353'),
(18,2022,'DECEMBER','Kadir','7474884',474848,210,60,60,0,'2022-12-353'),
(19,2022,'DECEMBER','Sakarie Akabe','992675786',55465775,208,240,240,0,'2022-12-353');

/*Table structure for table `gider` */

DROP TABLE IF EXISTS `gider`;

CREATE TABLE `gider` (
  `id` int(99) NOT NULL AUTO_INCREMENT,
  `calisanadi` varchar(999) NOT NULL,
  `kimlik` varchar(99) NOT NULL,
  `telefon` int(99) NOT NULL,
  `yil` int(99) NOT NULL,
  `ay` varchar(999) NOT NULL,
  `calistigi` int(99) NOT NULL,
  `maasi` int(99) NOT NULL,
  `hak` int(99) NOT NULL,
  `aldigi` int(99) NOT NULL,
  `maaskalan` int(99) NOT NULL,
  `maastarihi` varchar(999) NOT NULL,
  PRIMARY KEY (`id`,`kimlik`,`telefon`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `gider` */

insert  into `gider`(`id`,`calisanadi`,`kimlik`,`telefon`,`yil`,`ay`,`calistigi`,`maasi`,`hak`,`aldigi`,`maaskalan`,`maastarihi`) values 
(1,'Aybike','9926',63636,2022,'DECEMBER',6,2340,2310,50,2260,'Mon Dec 19 19:50:19 EET 2022'),
(2,'Aybike','9926',63636,2022,'DECEMBER',6,2340,2310,50,2260,'Mon Dec 19 19:50:19 EET 2022'),
(3,'hamse','9930',484848,2022,'DECEMBER',100,644,654,3700,44,'2022-12-19'),
(4,'ahmed','9927',748488,2022,'DECEMBER',6,3120,3090,3000,0,'Mon Dec 19 21:43:38 EET 2022'),
(5,'ahmed','9927',748488,2022,'DECEMBER',6,3120,3090,3000,0,'Mon Dec 19 21:43:38 EET 2022'),
(7,'Aybike','9926',63636,2022,'DECEMBER',6,2340,2310,50,2260,'Mon Dec 19 19:50:19 EET 2022'),
(8,'Aybike','9926',63636,2022,'DECEMBER',6,2340,2310,50,2260,'Mon Dec 19 19:50:19 EET 2022'),
(9,'Aybike','9926',63636,2022,'DECEMBER',6,2340,2310,50,2260,'Mon Dec 19 19:50:19 EET 2022'),
(10,'ahmed','9927',748488,2022,'DECEMBER',6,3120,3090,3000,0,'Mon Dec 19 21:43:38 EET 2022'),
(11,'ahmed','9927',748488,2022,'DECEMBER',8,3120,3090,90,2910,'2022-12-353');

/*Table structure for table `kar` */

DROP TABLE IF EXISTS `kar`;

CREATE TABLE `kar` (
  `id` int(99) NOT NULL AUTO_INCREMENT,
  `yil` int(99) NOT NULL,
  `ay` varchar(999) NOT NULL,
  `toplamgeliri` int(99) NOT NULL,
  `toplamgideri` int(99) NOT NULL,
  `kari` int(99) NOT NULL,
  `tarih` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `kar` */

insert  into `kar`(`id`,`yil`,`ay`,`toplamgeliri`,`toplamgideri`,`kari`,`tarih`) values 
(3,2022,'DECEMBER',2190,7260,-5280,'Mon Dec 19 20:02:39 EET 2022');

/*Table structure for table `kullanici` */

DROP TABLE IF EXISTS `kullanici`;

CREATE TABLE `kullanici` (
  `id` int(99) NOT NULL AUTO_INCREMENT,
  `kimlik` varchar(700) NOT NULL,
  `sifre` varchar(999) NOT NULL,
  `rolu` varchar(999) NOT NULL,
  `soru` varchar(999) NOT NULL,
  `cevap` varchar(999) NOT NULL,
  PRIMARY KEY (`id`,`kimlik`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `kullanici` */

insert  into `kullanici`(`id`,`kimlik`,`sifre`,`rolu`,`soru`,`cevap`) values 
(1,'9926','123','yonetici','1-Dogum yiliniz?','2001'),
(2,'9925','124','Yardimci','1-Dogum yiliniz?','2002'),
(3,'9930','12','yardimci','1-Dogum yiliniz?','2002'),
(5,'996474','shaxda','Kullanici','2-Bir lakabiniz?','Libaax');

/*Table structure for table `musteriler` */

DROP TABLE IF EXISTS `musteriler`;

CREATE TABLE `musteriler` (
  `musteriID` int(99) NOT NULL AUTO_INCREMENT,
  `yil` int(99) NOT NULL,
  `ay` varchar(999) NOT NULL,
  `musteriadi` varchar(999) NOT NULL,
  `kimlik` varchar(99) NOT NULL,
  `telefon` int(99) NOT NULL,
  `cinsiyet` varchar(999) NOT NULL,
  `odatipi` varchar(999) NOT NULL,
  `odanum` varchar(700) NOT NULL,
  `giris` varchar(999) NOT NULL,
  `cikis` varchar(999) NOT NULL,
  `toplamfiyati` int(99) NOT NULL,
  PRIMARY KEY (`musteriID`,`kimlik`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `musteriler` */

insert  into `musteriler`(`musteriID`,`yil`,`ay`,`musteriadi`,`kimlik`,`telefon`,`cinsiyet`,`odatipi`,`odanum`,`giris`,`cikis`,`toplamfiyati`) values 
(9,2022,'DECEMBER','Sakarie Akabe','992675786',55465775,'Erkek','2 Yatakli oda','208','Mon Dec 19 21:12:23 EET 2022','Thu Dec 22 21:12:26 EET 2022',0),
(11,2022,'DECEMBER','kilic','7383989',5373848,'Erkek','2 Yatakli oda','208','Mon Dec 19 18:33:18 EET 2022','Wed Dec 21 18:33:21 EET 2022',-300),
(12,2022,'DECEMBER','Kadir','7474884',474848,'Erkek','3 Yatakli oda','210','2022-12-353','2022-12-354',-240);

/*Table structure for table `odalar` */

DROP TABLE IF EXISTS `odalar`;

CREATE TABLE `odalar` (
  `odaID` int(99) NOT NULL AUTO_INCREMENT,
  `odanum` varchar(700) NOT NULL,
  `odatipi` varchar(999) NOT NULL,
  `kati` varchar(999) NOT NULL,
  `durumu` varchar(999) NOT NULL,
  `fiyati` varchar(999) NOT NULL,
  PRIMARY KEY (`odaID`,`odanum`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `odalar` */

insert  into `odalar`(`odaID`,`odanum`,`odatipi`,`kati`,`durumu`,`fiyati`) values 
(2,'210','3 Yatakli oda','3','Bos','60'),
(3,'208','2 Yatakli oda','3','dolu','100'),
(4,'201','Buyuk aile oda','1','Bos','200'),
(7,'220','Buyuk aile oda','2','Bos','150');

/*Table structure for table `yilkari` */

DROP TABLE IF EXISTS `yilkari`;

CREATE TABLE `yilkari` (
  `id` int(99) NOT NULL AUTO_INCREMENT,
  `yil` int(99) NOT NULL,
  `kari` int(99) NOT NULL,
  PRIMARY KEY (`id`,`yil`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `yilkari` */

insert  into `yilkari`(`id`,`yil`,`kari`) values 
(1,2021,900);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
