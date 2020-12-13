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
-- Database: `dr_maincourses`
--

-- --------------------------------------------------------

--
-- Table structure for table `beef`
--

CREATE TABLE `beef` (
  `Beef_Dish_Name` varchar(40) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `beef`
--

INSERT INTO `beef` (`Beef_Dish_Name`, `Price(Tk)`) VALUES
('Beef Curry', 120),
('Beef Steak', 140),
('Beef Tika', 60),
('Beef Rezala', 180),
('Beef with Onions', 170),
('Beef Kebab', 100);

-- --------------------------------------------------------

--
-- Table structure for table `chicken`
--

CREATE TABLE `chicken` (
  `Chicken_Dish_Name` varchar(40) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chicken`
--

INSERT INTO `chicken` (`Chicken_Dish_Name`, `Price(Tk)`) VALUES
('Chicken Curry', 120),
('Chicken Spicy', 110),
('Fried Chicken', 150),
('Chicken Rezala', 180),
('Chicken Grill', 195),
('Chicken Tikka', 130),
('Chicken with Onions', 200);

-- --------------------------------------------------------

--
-- Table structure for table `egg`
--

CREATE TABLE `egg` (
  `Egg_Dish_Name` varchar(20) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `egg`
--

INSERT INTO `egg` (`Egg_Dish_Name`, `Price(Tk)`) VALUES
('Sweet Egg Curry', 190),
('Spicy Egg Curry', 170),
('Egg Vegetable Curry', 220);

-- --------------------------------------------------------

--
-- Table structure for table `fish`
--

CREATE TABLE `fish` (
  `Fish_Dish_Name` varchar(40) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fish`
--

INSERT INTO `fish` (`Fish_Dish_Name`, `Price(Tk)`) VALUES
('Salmon Curry', 180),
('Fried Shrimp', 150),
('Grilled Salmon', 240),
('Fish Tikka', 160),
('Spicy Fish', 160),
('Deep Fried Fish', 250);

-- --------------------------------------------------------

--
-- Table structure for table `rice`
--

CREATE TABLE `rice` (
  `Rice_Name` varchar(30) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rice`
--

INSERT INTO `rice` (`Rice_Name`, `Price(Tk)`) VALUES
('Fried Rice', 160),
('Chicken Egg Rice', 260),
('Vegetable Rice', 180),
('Pulao', 130),
('Pulao(Bashomoti)', 160),
('Mutton Biriyani', 230),
('Beef Biriyani', 170),
('Chicken Biriyani', 200),
('White Rice', 60),
('Brown Rice', 80);

-- --------------------------------------------------------

--
-- Table structure for table `vegetable`
--

CREATE TABLE `vegetable` (
  `Vegetable_Dish_Name` varchar(40) NOT NULL,
  `Price(Tk)` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vegetable`
--

INSERT INTO `vegetable` (`Vegetable_Dish_Name`, `Price(Tk)`) VALUES
('Mixed Vegetable', 140),
('Spicy Vegetable', 170),
('Vegetable Curry', 195),
('Steamed Vegetables', 120);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
