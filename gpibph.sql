-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 05, 2020 at 05:02 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gpibph`
--

-- --------------------------------------------------------

--
-- Table structure for table `atestasi`
--

CREATE TABLE `atestasi` (
  `id_atestasi` int(11) NOT NULL,
  `no_kk` varchar(12) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `sektor` varchar(15) NOT NULL,
  `tanggal_atestasi` date NOT NULL,
  `gereja_tujuan` varchar(30) NOT NULL,
  `alamat_gereja` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `atestasi`
--

INSERT INTO `atestasi` (`id_atestasi`, `no_kk`, `nama`, `sektor`, `tanggal_atestasi`, `gereja_tujuan`, `alamat_gereja`) VALUES
(1, '300320190001', 'Osvaldo Erens', 'Effesus', '2019-10-10', 'GPIB Pancoran Rahmat', 'jl. TB Simatupang'),
(2, '300320190002', 'Brenda Fonataba', 'Galatia', '2019-09-09', 'GPIB Immanuel', 'Jl. Pemuda no. 72'),
(3, '300320190003', 'Yamora Parnatal Sitorus', 'Korintus', '2019-09-23', 'GPIB Menara Iman', 'Jl. Melati Ujung no. 89');

-- --------------------------------------------------------

--
-- Table structure for table `jemaat`
--

CREATE TABLE `jemaat` (
  `id` int(11) NOT NULL,
  `no_kk` varchar(12) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `tempat_tinggal` varchar(30) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `pelkat` varchar(50) NOT NULL,
  `sektor` varchar(15) NOT NULL,
  `status_keluarga` int(1) NOT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jemaat`
--

INSERT INTO `jemaat` (`id`, `no_kk`, `nama`, `tanggal_lahir`, `tempat_tinggal`, `alamat`, `pelkat`, `sektor`, `status_keluarga`, `created_date`, `updated_date`) VALUES
(1, '300320190001', 'Osvaldo Erens', '1993-10-27', 'Depok', 'Jl. Persahabatan', 'Gerakan Pemuda', 'Effesus', 0, '2019-09-20 03:39:17', '2019-09-20 03:39:17'),
(2, '300320190002', 'Agus Subagyo', '1970-07-20', 'Depok', 'Jl. Persahabatan', 'KAUM BAPAK', 'Effesus', 1, '2019-09-23 03:13:51', '2019-09-23 03:13:51'),
(3, '300320190003', 'Hugo Rudolf Mustamu', '1972-05-07', 'Depok', 'Jl. Cakalele', 'KAUM BAPAK', 'Korintus', 0, '2019-09-20 03:39:17', '2019-09-20 03:39:17'),
(6, '300320190010', 'Ricco Patty', '1970-11-10', 'Depok', 'Depok', 'KAUM BAPAK', 'Korintus', 1, '2019-09-20 07:15:14', '2019-09-20 07:15:14'),
(7, '300320190004', 'Vencesius Osvaldo Erens', '1993-10-27', 'Depok', 'Gg. Beringin', 'GERAKAN PEMUDA', 'EFFESUS', 1, '2019-10-04 09:48:10', '2019-10-04 09:48:10');

-- --------------------------------------------------------

--
-- Table structure for table `kepalakeluarga`
--

CREATE TABLE `kepalakeluarga` (
  `id` int(11) NOT NULL,
  `no_kk` varchar(12) NOT NULL,
  `nama_kepala_keluarga` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kepalakeluarga`
--

INSERT INTO `kepalakeluarga` (`id`, `no_kk`, `nama_kepala_keluarga`) VALUES
(1, '300320190005', 'Agus Subagyo'),
(2, '300320190001', 'Ricco Patty'),
(3, '300320190002', 'John Pattiasina'),
(4, '300320190003', 'Franky Mamoto'),
(5, '300320190004', 'Siserra F. Sahertian'),
(6, '300320190006', 'Muller Gultom'),
(7, '300320190007', 'Denny Sitorus'),
(8, '300320190004', 'Vencesius Osvaldo Erens');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id_user` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(50) NOT NULL,
  `nomor_telepon` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id_user`, `username`, `password`, `email`, `nomor_telepon`) VALUES
(3, 'admin', 'admin', 'admin@pelitahidup.com', '0217716296'),
(4, 'user', 'user', 'user@pelitahidup.com', '0812345678'),
(5, 'osvaldo', '27101993', 'osvaldo@gmail.com', '085213221587'),
(6, 'osvaldo', '27101993', 'osvaldo@gmail.com', '085213221587');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `atestasi`
--
ALTER TABLE `atestasi`
  ADD PRIMARY KEY (`id_atestasi`);

--
-- Indexes for table `jemaat`
--
ALTER TABLE `jemaat`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `no_kk` (`no_kk`);

--
-- Indexes for table `kepalakeluarga`
--
ALTER TABLE `kepalakeluarga`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `atestasi`
--
ALTER TABLE `atestasi`
  MODIFY `id_atestasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `jemaat`
--
ALTER TABLE `jemaat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `kepalakeluarga`
--
ALTER TABLE `kepalakeluarga`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
