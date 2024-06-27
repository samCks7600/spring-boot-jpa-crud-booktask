-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- 主機： 127.0.0.1
-- 產生時間： 2024-06-27 03:51:09
-- 伺服器版本： 10.4.32-MariaDB
-- PHP 版本： 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫： `bookdb`
--

-- --------------------------------------------------------

--
-- 資料表結構 `bookinformation`
--

CREATE TABLE `bookinformation` (
  `book_id` int(11) NOT NULL,
  `book_name` varchar(255) DEFAULT NULL,
  `author` varchar(255) NOT NULL,
  `publish_date` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) NOT NULL,
  `isbn` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- 傾印資料表的資料 `bookinformation`
--

INSERT INTO `bookinformation` (`book_id`, `book_name`, `author`, `publish_date`, `price`, `isbn`) VALUES
(2, '1984', 'George Orwell', '1949-06-08', 10.99, '9780451524935'),
(3, 'The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 15.99, '9780743273565'),
(4, 'Pride and Prejudice', 'Jane Austen', '1813-01-28', 9.99, '9780141439518'),
(5, 'The Catcher in the Rye', 'J.D. Salinger', '1951-07-16', 11.99, '9780316769174'),
(8, 'SIMP', 'alex', '2021-05-04', 9.99, '123-21378-21344'),
(9, 'SIMP', 'alex', '2021-05-04', 9.99, '123-123131-21344');

-- --------------------------------------------------------

--
-- 資料表結構 `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- 傾印資料表的資料 `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(2);

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `bookinformation`
--
ALTER TABLE `bookinformation`
  ADD PRIMARY KEY (`book_id`);

--
-- 在傾印的資料表使用自動遞增(AUTO_INCREMENT)
--

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `bookinformation`
--
ALTER TABLE `bookinformation`
  MODIFY `book_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
