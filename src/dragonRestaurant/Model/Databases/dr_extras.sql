-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 03, 2020 at 06:35 PM
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
-- Database: `dr_extras`
--

-- --------------------------------------------------------

--
-- Table structure for table `biscuits`
--

CREATE TABLE `biscuits` (
  `Biscuit_Name` varchar(20) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `biscuits`
--

INSERT INTO `biscuits` (`Biscuit_Name`, `Price(Tk)`) VALUES
('Toasts', 35),
('Savory', 40),
('Chocolate', 45),
('Cookies', 25),
('Crackers', 30),
('Branded(any)', 35);

-- --------------------------------------------------------

--
-- Table structure for table `breads`
--

CREATE TABLE `breads` (
  `Bread_Name` varchar(20) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `breads`
--

INSERT INTO `breads` (`Bread_Name`, `Price(Tk)`) VALUES
('Nun', 20),
('garlic', 45),
('Roti', 15),
('Parata', 20),
('Egg Bread', 35),
('Fried Bread', 40);

-- --------------------------------------------------------

--
-- Table structure for table `cheese`
--

CREATE TABLE `cheese` (
  `Cheese_Name` varchar(20) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cheese`
--

INSERT INTO `cheese` (`Cheese_Name`, `Price(Tk)`) VALUES
('Mozzarella', 30),
('Cheddar', 25),
('Parmisano', 35),
('Camembert', 40);

-- --------------------------------------------------------

--
-- Table structure for table `sauces`
--

CREATE TABLE `sauces` (
  `Sauce_Name` varchar(20) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sauces`
--

INSERT INTO `sauces` (`Sauce_Name`, `Price(Tk)`) VALUES
('Tomato', 15),
('Hollandaise', 25),
('Mayo', 15),
('Mustard', 20),
('Tamarind', 20),
('Vegetable', 25);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
