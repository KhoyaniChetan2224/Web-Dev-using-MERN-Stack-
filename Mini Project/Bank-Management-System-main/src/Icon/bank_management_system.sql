-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2024 at 11:52 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE `bank` (
  `pin` varchar(10) DEFAULT NULL,
  `date` varchar(70) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `amount` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `formno` varchar(20) NOT NULL,
  `cardNumber` varchar(25) NOT NULL,
  `pin` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `formno` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `father_name` varchar(20) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `marital_status` varchar(20) DEFAULT NULL,
  `address` varchar(40) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `pincode` varchar(20) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signup`
--

-- --------------------------------------------------------

--
-- Table structure for table `signupthree`
--

CREATE TABLE `signupthree` (
  `formno` varchar(20) DEFAULT NULL,
  `accountType` varchar(40) DEFAULT NULL,
  `cardNumber` varchar(25) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL,
  `facility` varchar(120) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signupthree`
--

-- --------------------------------------------------------

--
-- Table structure for table `signuptwo`
--

CREATE TABLE `signuptwo` (
  `formno` varchar(20) DEFAULT NULL,
  `reiligion` varchar(20) DEFAULT NULL,
  `category` varchar(20) DEFAULT NULL,
  `income` varchar(20) DEFAULT NULL,
  `education` varchar(20) DEFAULT NULL,
  `occupation` varchar(20) DEFAULT NULL,
  `pan` varchar(20) DEFAULT NULL,
  `aadhar` varchar(20) DEFAULT NULL,
  `seniorcitizen` varchar(20) DEFAULT NULL,
  `existingaccount` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signuptwo`
--

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
