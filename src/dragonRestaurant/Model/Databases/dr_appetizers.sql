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
-- Database: `dr_appetizers`
--

-- --------------------------------------------------------

--
-- Table structure for table `fast_food`
--

CREATE TABLE `fast_food` (
  `FastFood_Name` varchar(50) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fast_food`
--

INSERT INTO `fast_food` (`FastFood_Name`, `Price(Tk)`) VALUES
('Beef Burger', 45),
('Chicken Sandwich', 35),
('French Fries', 25),
('Potato Salad', 55),
('Shawrma(Beef)', 65),
('Shawrma(Chicken)', 55),
('Fried Chicken', 70),
('Noodles', 25),
('Mini Pizza', 65),
('Chicken Patties', 35),
('Beef Patties', 45);

-- --------------------------------------------------------

--
-- Table structure for table `soups`
--

CREATE TABLE `soups` (
  `Soup_Name` varchar(20) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `soups`
--

INSERT INTO `soups` (`Soup_Name`, `Price(Tk)`) VALUES
('Thai Soup', 150),
('Corn Soup', 120),
('Chicken Soup', 90),
('Vegetable Soup', 60);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
