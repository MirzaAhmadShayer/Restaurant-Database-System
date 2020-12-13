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
-- Database: `dr_beverages`
--

-- --------------------------------------------------------

--
-- Table structure for table `fruit_juices`
--

CREATE TABLE `fruit_juices` (
  `Juice_Name` varchar(20) NOT NULL,
  `Quantity` varchar(7) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fruit_juices`
--

INSERT INTO `fruit_juices` (`Juice_Name`, `Quantity`, `Price(Tk)`) VALUES
('Apple', 'Small', 45),
('Apple', 'Medium', 95),
('Banana', 'Small', 50),
('Banana', 'Medium', 100),
('Guava', 'Small', 80),
('Guava', 'Medium', 160),
('Pineapple', 'Small', 75),
('Pineapple', 'Medium', 125),
('Watermelon', 'Small', 55),
('Watermelon', 'Medium', 110),
('Grape', 'Small', 60),
('Grape', 'Medium', 100);

-- --------------------------------------------------------

--
-- Table structure for table `hot_items`
--

CREATE TABLE `hot_items` (
  `Item_Name` varchar(20) NOT NULL,
  `Container` varchar(30) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hot_items`
--

INSERT INTO `hot_items` (`Item_Name`, `Container`, `Price(Tk)`) VALUES
('Coffee(Mocha)', 'Coffee Cup', 120),
('Coffee(Cappuccino)', 'Coffee Cup', 140),
('Coffee(Latte)', 'Large Cup', 135),
('Milk Tea', 'Tea Cup', 20),
('Lemon Tea', 'Tea Cup', 25),
('Ginger Tea', 'Medium Cup', 30),
('Spice Tea', 'Medium Cup', 40),
('Black Tea', 'Tea Cup', 25);

-- --------------------------------------------------------

--
-- Table structure for table `milk_shakes`
--

CREATE TABLE `milk_shakes` (
  `Milk_Shake_Flavour` varchar(20) NOT NULL,
  `Container` varchar(20) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `milk_shakes`
--

INSERT INTO `milk_shakes` (`Milk_Shake_Flavour`, `Container`, `Price(Tk)`) VALUES
('Chocolate', 'Milkshake Cup', 160),
('Vanilla', 'Milkshake Cup', 130),
('Coffee', 'Milkshake Cup', 170),
('Strawberry', 'Milkshake Cup', 190),
('Banana', 'Milkshake Cup', 170),
('Mango', 'Milkshake Cup', 185);

-- --------------------------------------------------------

--
-- Table structure for table `soft_drinks`
--

CREATE TABLE `soft_drinks` (
  `Name` varchar(20) NOT NULL,
  `Quantity` varchar(7) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `soft_drinks`
--

INSERT INTO `soft_drinks` (`Name`, `Quantity`, `Price(Tk)`) VALUES
('7up', 'Small', 25),
('7up', 'Medium', 45),
('Coca Cola', 'Small', 25),
('Coca Cola', 'Medium', 45),
('Fanta', 'Small', 25),
('Fanta', 'Medium', 45),
('Pepsi', 'Small', 25),
('Pepsi', 'Medium', 45),
('Mountain Dew', 'Small', 25),
('Mountain Dew', 'Medium', 45);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
