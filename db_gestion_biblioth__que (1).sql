-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 22 avr. 2022 à 15:26
-- Version du serveur : 8.0.27
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `db_gestion_bibliothéque`
--

-- --------------------------------------------------------

--
-- Structure de la table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `idbook` int NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `author` varchar(128) NOT NULL,
  `editor` varchar(128) NOT NULL,
  `pageNB` int NOT NULL,
  `summary` text NOT NULL,
  `refLibrary` enum('1','2','3') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`idbook`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `book`
--

INSERT INTO `book` (`idbook`, `title`, `author`, `editor`, `pageNB`, `summary`, `refLibrary`) VALUES
(1, 'L\'Etranger', 'Albert Camus', 'Gallimard', 191, 'Condamné à mort, Meursault. Sur une plage algérienne, il a tué un Arabe. À cause du soleil, dira-t-il, parce qu\'il faisait chaud. On n\'en tirera rien d\'autre. Rien ne le fera plus réagir : ni l\'annonce de sa condamnation, ni la mort de sa mère, ni les paroles du prêtre avant la fin.\r\n\r\nComme si, sur cette plage, il avait soudain eu la révélation de l\'universelle équivalence du tout et du rien.', '1'),
(2, 'Voyage au bout de la nuit', 'Louis-Ferdinand Céline', 'Albert', 193, 'Bardamu s\'engage dans l\'armée par hasard et découvre l\'horreur de la première guerre mondiale, mais se lie d\'amitié avec Robinson, son frère d\'arme. Blessé, puis réformé, il fréquente quelques femmes de basse condition (Lola, Musyne) puis quitte la France pour l\'Afrique.', '2'),
(3, 'Don Quichotte', 'Miguel de Cervantes', 'Paul', 200, 'Don Quichotte de la Manche est un homme passionné par les romans de chevalerie. Enchanté par ses lectures, il décide de se faire chevalier errant. En compagnie de son fidèle écuyer Sancho Panza, il parcourt le monde en quête d\'exploits et d\'amour.', '3'),
(4, 'Les Métamorphoses', 'Ovide', 'Anonyme', 300, 'Les dieux étaient inquiets à l\'idée de la disparition des hommes. Jupiter promit qu\'il y aurait une nouvelle race d\'hommes pour repeupler la terre. Alors il décida d\'anéantir les humains non pas par le feu mais par l\'eau. Iris, la messagère des dieux, aspira toute l\'eau pour nourrir les nuages.', '2'),
(5, 'Les misérables', 'Victor Hugo', ' Albert Lacroix et Cie', 300, ' ', '1');

-- --------------------------------------------------------

--
-- Structure de la table `library`
--

DROP TABLE IF EXISTS `library`;
CREATE TABLE IF NOT EXISTS `library` (
  `idlibrary` int NOT NULL AUTO_INCREMENT,
  `name` varchar(128) NOT NULL,
  `adresse` varchar(128) NOT NULL,
  `numTel` int NOT NULL,
  `refBook` set('1','2','3','4') NOT NULL,
  `refRent` set('1','2','3','4') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`idlibrary`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `library`
--

INSERT INTO `library` (`idlibrary`, `name`, `adresse`, `numTel`, `refBook`, `refRent`) VALUES
(1, 'Librairie Joseph', 'Paris', 123456789, '2,4', '3,4'),
(2, 'Librairie Mollat', 'Bordeaux', 231456789, '1', '2'),
(3, 'Librairie EMLS', 'Marseille', 145698723, '3', '1');

-- --------------------------------------------------------

--
-- Structure de la table `rent`
--

DROP TABLE IF EXISTS `rent`;
CREATE TABLE IF NOT EXISTS `rent` (
  `idrent` int NOT NULL AUTO_INCREMENT,
  `refUser` int NOT NULL,
  `refBook` int NOT NULL,
  `datePret` date NOT NULL,
  `dateFin` date NOT NULL,
  PRIMARY KEY (`idrent`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `rent`
--

INSERT INTO `rent` (`idrent`, `refUser`, `refBook`, `datePret`, `dateFin`) VALUES
(1, 1, 3, '2022-04-01', '2022-04-15'),
(2, 3, 1, '2022-04-08', '2022-04-23'),
(3, 2, 2, '2022-04-10', '2022-04-25'),
(4, 1, 4, '2022-04-07', '2022-04-22');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `iduser` int NOT NULL AUTO_INCREMENT,
  `prenom` varchar(128) NOT NULL,
  `nom` varchar(128) NOT NULL,
  `adresse` varchar(128) NOT NULL,
  `numTel` int NOT NULL,
  `mail` varchar(128) NOT NULL,
  `refRent` set('1','2','3','4') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`iduser`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`iduser`, `prenom`, `nom`, `adresse`, `numTel`, `mail`, `refRent`) VALUES
(1, 'Ghada', 'Ghram', 'Ezzahra', 99737510, 'ghada.ghram@talan.com', '1,4'),
(2, 'Jihene', 'Saidaine', 'Ariana', 99737515, 'jihene.saidane@talan.com', '3'),
(3, 'Ayoub', 'Youssef', 'Fouchena', 99737520, 'ayoub.youssef@gmail.com', '2'),
(4, 'Moez', 'Taleb', 'Borj cedria', 99737525, 'moez.taleb@talan.com', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
