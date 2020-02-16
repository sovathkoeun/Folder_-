-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 09, 2019 at 02:18 PM
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
-- Database: `db_wep2020_hw5`
--

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `locationID` int(11) NOT NULL,
  `locationName` varchar(45) DEFAULT NULL,
  `locationAddress` varchar(200) DEFAULT NULL,
  `locationDescription` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`locationID`, `locationName`, `locationAddress`, `locationDescription`) VALUES
(1, 'Cambodia', 'Banteay Meanchey', 'Support stuendets poor'),
(2, 'Cambodia', 'Battambang', 'Support stuendets poor'),
(3, 'Cambodia', 'Kampong Cham', 'Support stuendets poor'),
(4, 'Cambodia', 'Kampong Chhnang', 'Support stuendets poor'),
(5, 'Cambodia', 'Kampong Speu', 'Support stuendets poor'),
(6, 'Cambodia', 'Kampong Thom', 'Support stuendets poor'),
(7, 'Cambodia', 'Kampot', 'Support stuendets poor'),
(8, 'Cambodia', 'Kandal', 'Support stuendets poor'),
(9, 'Cambodia', 'Koh Kong', 'Support stuendets poor'),
(10, 'Cambodia', 'Kep', 'Support stuendets poor');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `roleID` int(11) NOT NULL,
  `roleName` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`roleID`, `roleName`) VALUES
(3, 'delete'),
(4, 'delete'),
(5, 'update'),
(6, 'manage_user'),
(7, 'chick all user'),
(8, 'idet'),
(9, 'set to user'),
(10, 'accept'),
(11, 'reject'),
(12, 'create');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomID` int(11) NOT NULL,
  `roomName` varchar(45) DEFAULT NULL,
  `roomFloor` int(11) DEFAULT NULL,
  `roomDescription` varchar(200) DEFAULT NULL,
  `Location_locationID` int(11) DEFAULT NULL,
  `Manager_userID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomID`, `roomName`, `roomFloor`, `roomDescription`, `Location_locationID`, `Manager_userID`) VALUES
(49, 'A1', 1, 'Teach the students', NULL, NULL),
(50, 'A1', 2, 'Teach the teachers', NULL, NULL),
(51, 'A1', 3, 'Teacher speak with students', NULL, NULL),
(52, 'A1', 4, 'Teacher meeting with studente', NULL, NULL),
(53, 'A1', 5, 'centeen room', NULL, NULL),
(54, 'A1', 6, 'library room', NULL, NULL),
(55, 'A1', 7, 'education room', NULL, NULL),
(56, 'A1', 8, 'IT admit room', NULL, NULL),
(57, 'A1', 9, 'brack room', NULL, NULL),
(58, 'A1', 10, 'play game rooom', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userID` int(11) NOT NULL,
  `fristName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `passwords` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userID`, `fristName`, `lastName`, `email`, `passwords`, `position`) VALUES
(1, 'da', 'duon', 'da.duon@gmail.com', '123', 'study'),
(2, 'sim', 'deom', 'sim.deom@gmail.com', '123', 'study'),
(3, 'yon', 'yen', 'yon.yenl@gmail.com', '123', 'study'),
(4, 'vuthy', 'khel', 'vuthy.khel@gmail.com', '123', 'study'),
(5, 'jon', 'nit', 'jon.nit@gmail.com', '123', 'study'),
(6, 'dara', 'duong', 'dara.duong@gmail.com', '123', 'study'),
(7, 'ji', 'cheat', 'ji.cheat@gmail.com', '123', 'study'),
(8, 'ta', 'do', 'ta.do@gmail.com', '123', 'study'),
(9, 'ti', 'ty', 'ti.ty@gmail.com', '123', 'study'),
(10, 'ya', 'yuk', 'ya.yuk@gmail.com', '123', 'study');

-- --------------------------------------------------------

--
-- Table structure for table `user_has_role`
--

CREATE TABLE `user_has_role` (
  `User_userID` int(11) NOT NULL,
  `Role_roleID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user_request_room`
--

CREATE TABLE `user_request_room` (
  `requestID` int(11) NOT NULL,
  `User_userID` int(11) DEFAULT NULL,
  `Room_roomID` int(11) DEFAULT NULL,
  `statDat` varchar(20) DEFAULT NULL,
  `endDate` varchar(20) DEFAULT NULL,
  `note` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`locationID`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`roleID`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomID`),
  ADD KEY `Manager_userID` (`Manager_userID`),
  ADD KEY `Location_locationID` (`Location_locationID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `user_has_role`
--
ALTER TABLE `user_has_role`
  ADD PRIMARY KEY (`User_userID`,`Role_roleID`),
  ADD KEY `Role_roleID` (`Role_roleID`);

--
-- Indexes for table `user_request_room`
--
ALTER TABLE `user_request_room`
  ADD PRIMARY KEY (`requestID`),
  ADD KEY `User_userID` (`User_userID`),
  ADD KEY `Room_roomID` (`Room_roomID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `location`
--
ALTER TABLE `location`
  MODIFY `locationID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `roleID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `roomID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `user_request_room`
--
ALTER TABLE `user_request_room`
  MODIFY `requestID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `room`
--
ALTER TABLE `room`
  ADD CONSTRAINT `room_ibfk_1` FOREIGN KEY (`Manager_userID`) REFERENCES `users` (`userID`),
  ADD CONSTRAINT `room_ibfk_2` FOREIGN KEY (`Location_locationID`) REFERENCES `location` (`locationID`);

--
-- Constraints for table `user_has_role`
--
ALTER TABLE `user_has_role`
  ADD CONSTRAINT `user_has_role_ibfk_1` FOREIGN KEY (`User_userID`) REFERENCES `users` (`userID`),
  ADD CONSTRAINT `user_has_role_ibfk_2` FOREIGN KEY (`Role_roleID`) REFERENCES `role` (`roleID`);

--
-- Constraints for table `user_request_room`
--
ALTER TABLE `user_request_room`
  ADD CONSTRAINT `user_request_room_ibfk_1` FOREIGN KEY (`User_userID`) REFERENCES `users` (`userID`),
  ADD CONSTRAINT `user_request_room_ibfk_2` FOREIGN KEY (`Room_roomID`) REFERENCES `room` (`roomID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
