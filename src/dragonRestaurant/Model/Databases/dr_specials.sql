-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2020 at 06:36 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dr_specials`
--

-- --------------------------------------------------------

--
-- Table structure for table `specials`
--

CREATE TABLE `specials` (
  `Special_Name` varchar(40) NOT NULL,
  `What is it?` varchar(50) NOT NULL,
  `Price(Tk)` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `specials`
--

INSERT INTO `specials` (`Special_Name`, `What is it?`, `Price(Tk)`) VALUES
('Ice Cream Fruit Garden', '10 Flavours of Fruity Ice Cream', 1350),
('Mega Pizza', 'Really Large Family Pizza', 1200),
('Burger Bucket', 'A Bucket Full of Friendly Burgers', 1300),
('Chicken Split Pot', 'A Splited Pot of 3 Chicken Dishes', 1200),
('Beef Random Tri Tower', 'A Tower of 3 Beef Dishes', 1275),
('Egg-tastic', 'A Secret Egg Dish', 1000),
('Bread Buffet', 'A Collection of Breads', 1350),
('Juice Jive', 'A Set of Juices', 990),
('Cocktail Mash', 'A Cocktail of Speciality', 550),
('Fish Fun', 'A Flock of 3 Fish Dishes', 1150);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
