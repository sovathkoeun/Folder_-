-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 19, 2019 at 01:33 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `attendent_list`
--

-- --------------------------------------------------------

--
-- Table structure for table `sna`
--

CREATE TABLE `sna` (
  `id` int(11) NOT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `absent` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sna`
--

INSERT INTO `sna` (`id`, `firstname`, `lastname`, `sex`, `absent`, `description`) VALUES
(1, 'Dany', 'Chean', 'F', '', 'Go home'),
(2, 'Houn', 'Thoeurt', 'M', '', 'Sick'),
(3, 'Makara', 'Theng', 'M', '', 'To visit makara');

-- --------------------------------------------------------

--
-- Table structure for table `wep_a`
--

CREATE TABLE `wep_a` (
  `id` int(11) NOT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `absent` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wep_a`
--

INSERT INTO `wep_a` (`id`, `firstname`, `lastname`, `sex`, `absent`, `description`) VALUES
(1, 'Yon', 'Yen', 'M', '', 'lookafter mother'),
(2, 'Sreyrot', 'Oun', 'F', '', 'Sick');

-- --------------------------------------------------------

--
-- Table structure for table `wep_b`
--

CREATE TABLE `wep_b` (
  `id` int(11) NOT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `absent` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wep_b`
--

INSERT INTO `wep_b` (`id`, `firstname`, `lastname`, `sex`, `absent`, `description`) VALUES
(1, 'Da', 'Doun', 'M', '', 'To visit angkor'),
(2, 'Sovath', 'Keoun', 'M', '', 'To visit Thailand'),
(3, 'Sreyneang', 'Nov', 'F', '', 'To visit sreyrot'),
(4, 'Dany', 'Chean', 'F', '', 'Go home'),
(5, 'Houn', 'Thoeurt', 'M', '', 'Sick'),
(6, 'Makara', 'Theng', 'M', '', 'To visit makara');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sna`
--
ALTER TABLE `sna`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `wep_a`
--
ALTER TABLE `wep_a`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `wep_b`
--
ALTER TABLE `wep_b`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sna`
--
ALTER TABLE `sna`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `wep_a`
--
ALTER TABLE `wep_a`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `wep_b`
--
ALTER TABLE `wep_b`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
