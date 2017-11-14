-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2015 at 08:50 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `aplikasi_phtrs`
--

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE IF NOT EXISTS `karyawan` (
  `ID_Karyawan` varchar(10) NOT NULL,
  `Nama_Karyawan` varchar(25) NOT NULL,
  `No_Identitas_Karyawan` varchar(20) NOT NULL,
  `Alamat_Karyawan` text NOT NULL,
  `No_Telepon_Karyawan` varchar(12) NOT NULL,
  `Email_Karyawan` varchar(25) NOT NULL,
  `Passwor_Karyawan` varchar(15) NOT NULL,
  `Jabatan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`ID_Karyawan`, `Nama_Karyawan`, `No_Identitas_Karyawan`, `Alamat_Karyawan`, `No_Telepon_Karyawan`, `Email_Karyawan`, `Passwor_Karyawan`, `Jabatan`) VALUES
('1213100022', 'Hartanto Setiawan', '3521091103950002', 'Jl. Ahmad Yani No. 199, Ngawi', '081249910119', 'zetiawan.h@gmail.com', 'thecloud', 'Admin'),
('1213100074', 'Muhammad Asna Faqih', '3518071004950001', 'RT/RW 07/03, Ds./Kec. Ngronggot, Kab. Nganjuk', '085607772104', 'muhammad.asna13@gmail.com', 'santrieboy', 'Admin'),
('1213100120', 'Moh Rifqi Fahri Anggara', '3525101705950004', 'Jl. Diponegoro RT 02 RW 01, Gumeno, Manyar, Gresik', '083832638814', 'rifqianggara17@gmail.com', 'kiria_17', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `laporan_pelapor`
--

CREATE TABLE IF NOT EXISTS `laporan_pelapor` (
  `Laporan_ID` varchar(10) NOT NULL,
  `Nama_Pelapor` varchar(25) NOT NULL,
  `Tanggal_Laporan` varchar(20) NOT NULL,
  `Alamat_Karyawan` text NOT NULL,
  `Diameter` decimal(3,2) NOT NULL,
  `Kedalaman` decimal(3,2) NOT NULL,
  `Foto_Lubang` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE IF NOT EXISTS `register` (
  `User_ID` varchar(10) NOT NULL,
  `Nama_Lengkap` varchar(25) NOT NULL,
  `No_Identitas` varchar(15) NOT NULL,
  `Alamat` text NOT NULL,
  `No_Telepon` varchar(12) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `Password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`User_ID`, `Nama_Lengkap`, `No_Identitas`, `Alamat`, `No_Telepon`, `Email`, `Password`) VALUES
('1213100012', 'Hartanto Setiabudi', '1234567890', 'Surabaya', '085677772190', 'as@gmail.com', 'qwerty');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
 ADD PRIMARY KEY (`ID_Karyawan`);

--
-- Indexes for table `laporan_pelapor`
--
ALTER TABLE `laporan_pelapor`
 ADD PRIMARY KEY (`Laporan_ID`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
 ADD PRIMARY KEY (`User_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
