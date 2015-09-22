-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-09-2015 a las 08:43:02
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `alpha`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `app_user`
--

CREATE TABLE IF NOT EXISTS `app_user` (
`id` bigint(20) NOT NULL,
  `account_expired` bit(1) NOT NULL,
  `account_locked` bit(1) NOT NULL,
  `address` varchar(150) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `postal_code` varchar(15) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `credentials_expired` bit(1) NOT NULL,
  `email` varchar(255) NOT NULL,
  `account_enabled` bit(1) DEFAULT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `password_hint` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `version` int(11) DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `app_user`
--

INSERT INTO `app_user` (`id`, `account_expired`, `account_locked`, `address`, `city`, `country`, `postal_code`, `province`, `credentials_expired`, `email`, `account_enabled`, `first_name`, `last_name`, `password`, `password_hint`, `phone_number`, `username`, `version`, `website`) VALUES
(-3, b'0', b'0', '', 'Denver', 'US', '80210', 'CO', b'0', 'two_roles_user@appfuse.org', b'1', 'Two Roles', 'User', '$2a$10$bH/ssqW8OhkTlIso9/yakubYODUOmh.6m5HEJvcBq3t3VdBh7ebqO', 'Not a female kitty.', '', 'two_roles_user', 1, 'http://raibledesigns.com'),
(-2, b'0', b'0', '', 'Denver', 'US', '80210', 'CO', b'0', 'matt@raibledesigns.com', b'1', 'Matt', 'Raible', '$2a$10$bH/ssqW8OhkTlIso9/yakubYODUOmh.6m5HEJvcBq3t3VdBh7ebqO', 'Not a female kitty.', '', 'admin', 1, 'http://raibledesigns.com'),
(-1, b'0', b'0', '', 'Denver', 'US', '80210', 'CO', b'0', 'matt_raible@yahoo.com', b'1', 'Tomcat', 'User', '$2a$10$CnQVJ9bsWBjMpeSKrrdDEeuIptZxXrwtI6CZ/OgtNxhIgpKxXeT9y', 'A male kitty.', '', 'user', 1, 'http://tomcat.apache.org');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catalog`
--

CREATE TABLE IF NOT EXISTS `catalog` (
  `idCatalog` bigint(20) NOT NULL,
  `description` varchar(155) NOT NULL,
`idCatalogValue` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `category`
--

CREATE TABLE IF NOT EXISTS `category` (
`id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dish`
--

CREATE TABLE IF NOT EXISTS `dish` (
`iddish` bigint(20) NOT NULL,
  `discription` varchar(155) NOT NULL,
  `photo` varchar(155) NOT NULL,
  `idcatalog_value` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `food`
--

CREATE TABLE IF NOT EXISTS `food` (
`idfood` bigint(20) NOT NULL,
  `name` varchar(155) NOT NULL,
  `idcatalog_value` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `foodxdish`
--

CREATE TABLE IF NOT EXISTS `foodxdish` (
  `iddish` bigint(20) NOT NULL,
  `idfood` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `goto`
--

CREATE TABLE IF NOT EXISTS `goto` (
`idgoto` bigint(20) NOT NULL,
  `date` datetime DEFAULT NULL,
  `idmenu` bigint(20) DEFAULT NULL,
  `idpersona` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu`
--

CREATE TABLE IF NOT EXISTS `menu` (
`idmenu` bigint(20) NOT NULL,
  `date` datetime NOT NULL,
  `iddish` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `person`
--

CREATE TABLE IF NOT EXISTS `person` (
`idPerson` bigint(20) NOT NULL,
  `birthday` datetime DEFAULT NULL,
  `email` varchar(155) NOT NULL,
  `first_name` varchar(155) NOT NULL,
  `last_name` varchar(155) NOT NULL,
  `nickname` varchar(100) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preference`
--

CREATE TABLE IF NOT EXISTS `preference` (
`idpreference` bigint(20) NOT NULL,
  `description` varchar(255) NOT NULL,
  `idcatalog_value` bigint(20) DEFAULT NULL,
  `idpersona` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rate`
--

CREATE TABLE IF NOT EXISTS `rate` (
`idrate` bigint(20) NOT NULL,
  `rate_value` int(11) NOT NULL,
  `iddish` bigint(20) DEFAULT NULL,
  `idpersona` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `role`
--

CREATE TABLE IF NOT EXISTS `role` (
`id` bigint(20) NOT NULL,
  `description` varchar(64) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `role`
--

INSERT INTO `role` (`id`, `description`, `name`) VALUES
(-2, 'Default role for all Users', 'ROLE_USER'),
(-1, 'Administrator role (can edit Users)', 'ROLE_ADMIN');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `suggest`
--

CREATE TABLE IF NOT EXISTS `suggest` (
`idsuggest` bigint(20) NOT NULL,
  `description` varchar(255) NOT NULL,
  `idcatalog_value` bigint(20) DEFAULT NULL,
  `idpersona` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_role`
--

CREATE TABLE IF NOT EXISTS `user_role` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `user_role`
--

INSERT INTO `user_role` (`user_id`, `role_id`) VALUES
(-3, -2),
(-1, -2),
(-3, -1),
(-2, -1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `app_user`
--
ALTER TABLE `app_user`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `UK_1j9d9a06i600gd43uu3km82jw` (`email`), ADD UNIQUE KEY `UK_3k4cplvh82srueuttfkwnylq0` (`username`);

--
-- Indices de la tabla `catalog`
--
ALTER TABLE `catalog`
 ADD PRIMARY KEY (`idCatalogValue`), ADD KEY `FK_iab96cs5ugm2v1lw1xucoch21` (`idCatalog`);

--
-- Indices de la tabla `category`
--
ALTER TABLE `category`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `dish`
--
ALTER TABLE `dish`
 ADD PRIMARY KEY (`iddish`), ADD KEY `FK_thqd25hgq83u4fwf83csdmq55` (`idcatalog_value`);

--
-- Indices de la tabla `food`
--
ALTER TABLE `food`
 ADD PRIMARY KEY (`idfood`), ADD KEY `FK_4q8wddmne6sr8ie61eealiytp` (`idcatalog_value`);

--
-- Indices de la tabla `foodxdish`
--
ALTER TABLE `foodxdish`
 ADD KEY `FK_8budh48co6b3vk8wa9ov843x2` (`idfood`), ADD KEY `FK_pgt9ps331w0i98ejjar32cmup` (`iddish`);

--
-- Indices de la tabla `goto`
--
ALTER TABLE `goto`
 ADD PRIMARY KEY (`idgoto`), ADD KEY `FK_5eub4do3bf6lrsv152e81atsm` (`idmenu`), ADD KEY `FK_ibjinsbqbj39hj00fj7ml6rmf` (`idpersona`);

--
-- Indices de la tabla `menu`
--
ALTER TABLE `menu`
 ADD PRIMARY KEY (`idmenu`), ADD KEY `FK_cfds707pr98n44s7fh755ag0x` (`iddish`);

--
-- Indices de la tabla `person`
--
ALTER TABLE `person`
 ADD PRIMARY KEY (`idPerson`), ADD KEY `FK_77e12pjkm9v423j9hd3u10bk1` (`user_id`);

--
-- Indices de la tabla `preference`
--
ALTER TABLE `preference`
 ADD PRIMARY KEY (`idpreference`), ADD KEY `FK_529vc6ogm4xcmbtdut461me3` (`idcatalog_value`), ADD KEY `FK_i716sscgk2alp8b72qf7ep55p` (`idpersona`);

--
-- Indices de la tabla `rate`
--
ALTER TABLE `rate`
 ADD PRIMARY KEY (`idrate`), ADD KEY `FK_aan1h7vm7f6wepk4v5qqe4gva` (`iddish`), ADD KEY `FK_c1upsl2vmt7alihbaxufjsnom` (`idpersona`);

--
-- Indices de la tabla `role`
--
ALTER TABLE `role`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `suggest`
--
ALTER TABLE `suggest`
 ADD PRIMARY KEY (`idsuggest`), ADD KEY `FK_2d08yeqfb42kuheenw16fjg42` (`idcatalog_value`), ADD KEY `FK_gorvixf7f5ucxo3te8u49ycgx` (`idpersona`);

--
-- Indices de la tabla `user_role`
--
ALTER TABLE `user_role`
 ADD PRIMARY KEY (`user_id`,`role_id`), ADD KEY `FK_it77eq964jhfqtu54081ebtio` (`role_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `app_user`
--
ALTER TABLE `app_user`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `catalog`
--
ALTER TABLE `catalog`
MODIFY `idCatalogValue` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `category`
--
ALTER TABLE `category`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `dish`
--
ALTER TABLE `dish`
MODIFY `iddish` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `food`
--
ALTER TABLE `food`
MODIFY `idfood` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `goto`
--
ALTER TABLE `goto`
MODIFY `idgoto` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `menu`
--
ALTER TABLE `menu`
MODIFY `idmenu` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `person`
--
ALTER TABLE `person`
MODIFY `idPerson` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `preference`
--
ALTER TABLE `preference`
MODIFY `idpreference` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `rate`
--
ALTER TABLE `rate`
MODIFY `idrate` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `role`
--
ALTER TABLE `role`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `suggest`
--
ALTER TABLE `suggest`
MODIFY `idsuggest` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `catalog`
--
ALTER TABLE `catalog`
ADD CONSTRAINT `FK_iab96cs5ugm2v1lw1xucoch21` FOREIGN KEY (`idCatalog`) REFERENCES `catalog` (`idCatalogValue`);

--
-- Filtros para la tabla `dish`
--
ALTER TABLE `dish`
ADD CONSTRAINT `FK_thqd25hgq83u4fwf83csdmq55` FOREIGN KEY (`idcatalog_value`) REFERENCES `catalog` (`idCatalogValue`);

--
-- Filtros para la tabla `food`
--
ALTER TABLE `food`
ADD CONSTRAINT `FK_4q8wddmne6sr8ie61eealiytp` FOREIGN KEY (`idcatalog_value`) REFERENCES `catalog` (`idCatalogValue`);

--
-- Filtros para la tabla `foodxdish`
--
ALTER TABLE `foodxdish`
ADD CONSTRAINT `FK_8budh48co6b3vk8wa9ov843x2` FOREIGN KEY (`idfood`) REFERENCES `food` (`idfood`),
ADD CONSTRAINT `FK_pgt9ps331w0i98ejjar32cmup` FOREIGN KEY (`iddish`) REFERENCES `dish` (`iddish`);

--
-- Filtros para la tabla `goto`
--
ALTER TABLE `goto`
ADD CONSTRAINT `FK_5eub4do3bf6lrsv152e81atsm` FOREIGN KEY (`idmenu`) REFERENCES `menu` (`idmenu`),
ADD CONSTRAINT `FK_ibjinsbqbj39hj00fj7ml6rmf` FOREIGN KEY (`idpersona`) REFERENCES `person` (`idPerson`);

--
-- Filtros para la tabla `menu`
--
ALTER TABLE `menu`
ADD CONSTRAINT `FK_cfds707pr98n44s7fh755ag0x` FOREIGN KEY (`iddish`) REFERENCES `dish` (`iddish`);

--
-- Filtros para la tabla `person`
--
ALTER TABLE `person`
ADD CONSTRAINT `FK_77e12pjkm9v423j9hd3u10bk1` FOREIGN KEY (`user_id`) REFERENCES `app_user` (`id`);

--
-- Filtros para la tabla `preference`
--
ALTER TABLE `preference`
ADD CONSTRAINT `FK_529vc6ogm4xcmbtdut461me3` FOREIGN KEY (`idcatalog_value`) REFERENCES `catalog` (`idCatalogValue`),
ADD CONSTRAINT `FK_i716sscgk2alp8b72qf7ep55p` FOREIGN KEY (`idpersona`) REFERENCES `person` (`idPerson`);

--
-- Filtros para la tabla `rate`
--
ALTER TABLE `rate`
ADD CONSTRAINT `FK_aan1h7vm7f6wepk4v5qqe4gva` FOREIGN KEY (`iddish`) REFERENCES `dish` (`iddish`),
ADD CONSTRAINT `FK_c1upsl2vmt7alihbaxufjsnom` FOREIGN KEY (`idpersona`) REFERENCES `person` (`idPerson`);

--
-- Filtros para la tabla `suggest`
--
ALTER TABLE `suggest`
ADD CONSTRAINT `FK_2d08yeqfb42kuheenw16fjg42` FOREIGN KEY (`idcatalog_value`) REFERENCES `catalog` (`idCatalogValue`),
ADD CONSTRAINT `FK_gorvixf7f5ucxo3te8u49ycgx` FOREIGN KEY (`idpersona`) REFERENCES `person` (`idPerson`);

--
-- Filtros para la tabla `user_role`
--
ALTER TABLE `user_role`
ADD CONSTRAINT `FK_apcc8lxk2xnug8377fatvbn04` FOREIGN KEY (`user_id`) REFERENCES `app_user` (`id`),
ADD CONSTRAINT `FK_it77eq964jhfqtu54081ebtio` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
