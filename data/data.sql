-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2023 at 03:13 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kintonexpress`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` varchar(25) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `gender` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `nama`, `no_telp`, `gender`) VALUES
('admin', 'Miharu', '082192066520', 'Laki-Laki');

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `berat_barang` int(11) DEFAULT NULL,
  `kuantitas_barang` int(11) DEFAULT NULL,
  `harga_barang` double DEFAULT NULL,
  `tipe_barang` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `berat_barang`, `kuantitas_barang`, `harga_barang`, `tipe_barang`) VALUES
(1, 'Latto-Latto', 1, 1, 10000, 'Mainan'),
(2, 'Kipas Angin', 2, 1, 150000, 'Kipas'),
(3, 'BILLY', 10, 1, 10000000000, 'MANUSIA'),
(4, 'MIHARU', 900, 2, 2000000000, 'MANUSIA IKAN');

-- --------------------------------------------------------

--
-- Table structure for table `kurir_antar`
--

CREATE TABLE `kurir_antar` (
  `userId` varchar(10) NOT NULL,
  `tipe_kendaraan` varchar(50) DEFAULT NULL,
  `nama` varchar(100) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `gender` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kurir_antar`
--

INSERT INTO `kurir_antar` (`userId`, `tipe_kendaraan`, `nama`, `no_telp`, `gender`) VALUES
('A001', 'Motor', 'Miharu', '082192066520', 'Laki-Laki');

-- --------------------------------------------------------

--
-- Table structure for table `pengirim`
--

CREATE TABLE `pengirim` (
  `userId` varchar(5) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `gender` varchar(15) NOT NULL,
  `subscribe` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pengirim`
--

INSERT INTO `pengirim` (`userId`, `id_barang`, `nama`, `no_telp`, `gender`, `subscribe`) VALUES
('A001', 4, 'Miharu', '082192066520', 'Laki-Laki', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userId` varchar(5) NOT NULL,
  `nama` varchar(80) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `userType` int(11) DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userId`, `nama`, `gender`, `userType`, `no_telp`) VALUES
('A001', 'Admin', 1, 1, NULL),
('A002', 'Admin1', 0, 1, '08123456'),
('P001', 'Pengirim', 1, 2, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `kurir_antar`
--
ALTER TABLE `kurir_antar`
  ADD KEY `userId` (`userId`);

--
-- Indexes for table `pengirim`
--
ALTER TABLE `pengirim`
  ADD KEY `userId` (`userId`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kurir_antar`
--
ALTER TABLE `kurir_antar`
  ADD CONSTRAINT `kurir_antar_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`);

--
-- Constraints for table `pengirim`
--
ALTER TABLE `pengirim`
  ADD CONSTRAINT `pengirim_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`),
  ADD CONSTRAINT `pengirim_ibfk_2` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
