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
-- Database: `dr_deserts`
--

-- --------------------------------------------------------

--
-- Table structure for table `cakes`
--

CREATE TABLE `cakes` (
  `Cake_Name` varchar(20) NOT NULL,
  `Weight(Pounds)` int(3) NOT NULL,
  `Price(Tk)` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cakes`
--

INSERT INTO `cakes` (`Cake_Name`, `Weight(Pounds)`, `Price(Tk)`) VALUES
('Red Velvet', 8, 700),
('Red Velvet', 12, 1250),
('Brown Curtain', 8, 650),
('Brown Curtain', 12, 1150),
('Black Forest', 8, 800),
('Black Forest', 12, 1500),
('Orange Groove', 8, 550),
('Orange Groove', 12, 1350);

-- --------------------------------------------------------

--
-- Table structure for table `donuts`
--

CREATE TABLE `donuts` (
  `Donut_Name` varchar(20) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `donuts`
--

INSERT INTO `donuts` (`Donut_Name`, `Quantity`, `Price(Tk)`) VALUES
('Black Orchid', 1, 65),
('Vanilla Crème', 1, 55),
('Brown Tabletop', 1, 85),
('Coffee Sugarcoat', 1, 70),
('Coffee Crème', 1, 75),
('Strawberry Delight', 1, 80);

-- --------------------------------------------------------

--
-- Table structure for table `ice_cream`
--

CREATE TABLE `ice_cream` (
  `Flavour` varchar(20) NOT NULL,
  `Served_In` varchar(5) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ice_cream`
--

INSERT INTO `ice_cream` (`Flavour`, `Served_In`, `Price(Tk)`) VALUES
('Chocolate Chip', 'Cone', 45),
('Chocolate Chip', 'Cup', 40),
('Banana n Mango', 'Cone', 65),
('Banana n Mango', 'Cup', 55),
('Strawberry', 'Cone', 70),
('Strawberry', 'Cup', 60),
('Mixed Rainbow', 'Cone', 85),
('Mixed Rainbow', 'Cup', 80),
('Vanilla ', 'Cone', 65),
('Vanilla ', 'Cup', 55);

-- --------------------------------------------------------

--
-- Table structure for table `muffins`
--

CREATE TABLE `muffins` (
  `Muffin_Name` varchar(20) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `muffins`
--

INSERT INTO `muffins` (`Muffin_Name`, `Quantity`, `Price(Tk)`) VALUES
('Choco Delight', 2, 35),
('Crème Delight', 2, 25),
('Mocha Fiesta', 2, 65),
('Strawberry Cup', 2, 55);

-- --------------------------------------------------------

--
-- Table structure for table `sweets`
--

CREATE TABLE `sweets` (
  `Sweet_Name` varchar(30) NOT NULL,
  `Weight(grams)` int(11) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sweets`
--

INSERT INTO `sweets` (`Sweet_Name`, `Weight(grams)`, `Price(Tk)`) VALUES
('Shada Roshogolla', 500, 140),
('Kalo Jam', 500, 150),
('Monsoor', 500, 160),
('Shondesh', 500, 150),
('Shada Chanah', 500, 140),
('Shondesh', 500, 130),
('Maltova Mishti', 500, 165),
('Choto golla', 500, 120);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
