-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 15 mars 2022 à 15:17
-- Version du serveur :  5.7.31
-- Version de PHP : 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `ccipromotion`
--
CREATE DATABASE IF NOT EXISTS `ccipromotion` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ccipromotion`;

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

DROP TABLE IF EXISTS `formation`;
CREATE TABLE IF NOT EXISTS `formation` (
  `acronyme` varchar(20) NOT NULL,
  `adresse_image` varchar(255) DEFAULT NULL,
  `date_debut` date DEFAULT NULL,
  `description` text,
  `duree_mois` int(11) NOT NULL,
  `intitule` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `video_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`acronyme`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `formation`
--

INSERT INTO `formation` (`acronyme`, `adresse_image`, `date_debut`, `description`, `duree_mois`, `intitule`, `link`, `video_url`) VALUES
('ASC22', '6CVnKuw.png', '2022-08-01', 'L\'assistant (e) commercial assure le suivi des plannings des commerciaux, des déplacements et des opérations terrain (animations, PLV). Il (elle) accueille et renseigne les clients, réalise les devis, prend les commandes, gère les livraisons et contrôle les stocks. Il (elle) suit les aspects administratifs de la vente, réalise la facturation, relance les impayés.\n\nIl (elle) participe aux opérations commerciales (envoi de mailing et emailing, action de promotion des ventes par téléphone), réalise des courriers commerciaux et newsletters, organise des réunions pour le compte de la Direction Commerciale. Il (elle) élabore des tableaux de bord de résultats, réalise des mises à jour de fichiers clients, de tarifs on line et off line, suit les prévisions de ventes.\n\nAvec le développement du ecommerce, l\'assistant(e) commercial(e) est amenée à gérer la relation client fournisseur via internet et à utiliser les outils de communication on line.\n\nLorsqu’on débarque dans l’univers du numérique, le développeur et l’intégrateur web peuvent être facilement confondus. Quand il faut faire appel à l’un ou à l’autre pour réaliser un projet informatique, si vous êtes néophyte dans le milieu, vous pouvez aisément vous emmêler les pinceaux. Pourquoi ? Tout simplement parce qu’ils parlent le même langage professionnel, que tu peux les voir collaborer ensemble sur un même projet, qu’ils ont quelques outils en commun, comme : HTML, CSS ou encore Git. Et qu’ils ont le même humour douteux [parole de développeur qui fréquente des intégrateurs].', 16, 'Assistant(e) Commercial(e)', 'https://www.campuscci.fr/liste-formations/liste-formations-bac2/assistant-commercial&ar=formations-diplomantes', 'UDph-yElLZQ'),
('DISII22', 'OhNaoGL.png', '2022-01-01', 'La formation \"prépa aux métiers de l\'informatique et du numérique\" permet d\'aborder différents concepts liés au monde numérique à savoir : les base du code et de la programmation, ainsi que la maintenance et les réseaux. Elle permet enfin de développer les compétences nécessaires pour travailler en mode projet (communication, autonomie, coopération, organisation, gestion des priorités, etc.)\n\nTaux de réussite : 100% attestation de compétences\nLorsqu’on débarque dans l’univers du numérique, le développeur et l’intégrateur web peuvent être facilement confondus. Quand il faut faire appel à l’un ou à l’autre pour réaliser un projet informatique, si vous êtes néophyte dans le milieu, vous pouvez aisément vous emmêler les pinceaux. Pourquoi ? Tout simplement parce qu’ils parlent le même langage professionnel, que tu peux les voir collaborer ensemble sur un même projet, qu’ils ont quelques outils en commun, comme : HTML, CSS ou encore Git. Et qu’ils ont le même humour douteux [parole de développeur qui fréquente des intégrateurs].\n\nL’objectif de la classe de 3ème « Prépa-PRO » est de permettre aux élèves de mûrir leur choix d’orientation par la découverte de métiers relevant de champs professionnels divers. Ils suivent une formation complète de 3ème (avec la mise en place d’une deuxième langue) et présentent le diplôme national du brevet en fin d’année.\n\n\nAu sein de l’établissement : électricité, mécanique, informatique, comptabilité, gestion…\n\nDurant l’année, la découverte des métiers s’organise au lycée sous forme de séquences de 3 heures de travaux pratiques et de mini projet. Un travail concerté entre la conseillère d’orientation, les conseillers principaux d’éducation et les enseignants permet de suivre régulièrement les progrès et les difficultés de chaque élève de façon à mettre en place un projet individuel d’orientation. ', 32, 'Développeur Intégrateur SII', 'https://www.campuscci.fr/evolutionpro/prepanumerique&ar=formations-diplomantes', '6dvlHXs8X-Y'),
('COCO22', 'si6w5CU.png', '2022-10-01', 'Par téléphone ou via des canaux digitaux tels que le courriel, le courrier et le « sms », et parfois en utilisant le dialogue en direct (dit «chat»), le (la) conseiller (ère) relation client à distance rend des services ou propose des biens et des services dans une démarche commerciale aux particuliers ou aux entreprises. Il (elle) agit dans un souci de satisfaire le client ou le prospect en préservant les intérêts de l\'entreprise.\n\nLe conseiller de clientèle à distance assure la gestion de la relation client à distance, à partir de différents supports (courrier, téléphone, fax, web). Il accueille, renseigne, conseille et fidélise la clientèle. Il est amené à recevoir ou émettre des appels de clients ou de prospects afin de contribuer à établir ou entretenir la relation commerciale.\n\nLe métier est accessible à partir d\'une formation Bac à Bac + 2 ou d\'un niveau équivalent acquis par l\'expérience et sur son sens commercial et ses compétences relationnelles (titre professionnel du conseiller service client à distance, mention complémentaire assistance Conseil Vente à distance).\n\nDans le cadre d’un service client de qualité, le conseiller clientèle est responsable des relations et de la mise en application de la stratégie entrepreneuriale. L’importance de son portefeuille dépend de la structure professionnelle et de son statut au sein de la hiérarchie. Pour les clients, il demeure le principal interlocuteur afin de prendre en compte leur demande, comme une question ou même une réclamation. Selon ses fonctions, on peut lui imposer des objectifs commerciaux. ', 24, 'Conseiller(ère) Commercial(e)', 'https://www.campuscci.fr/liste-formations/liste-formations-bac/Conseiller-commercial&ar=formations-diplomantes', 'yKkIh2vikaE'),
('CRCD22', 'X3gSWeb.pngg', '2022-12-01', 'Par téléphone ou via des canaux digitaux tels que le courriel, le courrier et le « sms », et parfois en utilisant le dialogue en direct (dit «chat»), le (la) conseiller (ère) relation client à distance rend des services ou propose des biens et des services dans une démarche commerciale aux particuliers ou aux entreprises. Il (elle) agit dans un souci de satisfaire le client ou le prospect en préservant les intérêts de l\'entreprise.\n\nLe conseiller relation clientèle accueille, renseigne, gère les réclamations et propose à la clientèle les services et avantages du magasin. Selon l\'organisation et la taille du magasin, il prend en charge des services plus ou moins étendus (détaxe, gestion des comptes des cartes de fidélité, billetterie, exportation, vestiaire, consigne,…).\n\nL\'accès se fait souvent par promotion interne suite à une expérience en caisse ou à la vente. Des compétences relationnelles et de service sont particulièrement recherchées sur ce profil. Le niveau Bac a tendance à se généraliser dans les recrutements récents.\n\nIl est possible de devenir conseiller clientèle pour une banque, un organisme d’assurances ou une entreprise issue du secteur privé. Si certaines missions dépendent du contexte d’exercice.', 8, 'Conseiller Relation Client à Distance', 'https://www.campuscci.fr/crcd&ar=formations-diplomantes', 'yKkIh2vikaE'),
('PMIN22', 'tz2smYX.png', '2022-04-01', 'La formation \"prépa aux métiers de l\'informatique et du numérique\" permet d\'aborder différents concepts liés au monde numérique à savoir : les base du code et de la programmation, ainsi que la maintenance et les réseaux. Elle permet enfin de développer les compétences nécessaires pour travailler en mode projet (communication, autonomie, coopération, organisation, gestion des priorités, etc.)\n\nLes métiers de l’informatique ne sont pas prêts de manquer d’offres d’emplois. Une classe préparatoire en informatique permet d’orienter les bacheliers vers ces nouveaux métiers mais aussi une formation ingénieur.\n\nLa prépa informatique post-bac est une année de mise à niveau pour bien entamer ses études supérieures, en particulier dans un domaine aussi méthodologique que l’informatique. Les étudiants y acquièrent des connaissances théoriques et techniques en science et technologies numériques préparant aux concours d’entrée afin d’intégrer les écoles d’ingénieurs.\n\nFormation organisée avec le concours financier de la Région Centre – Val de Loire et de l’Etat dans le cadre du PACTE Régional d’Investissement dans les Compétences 2019-2022, applicable jusqu’au 31/12/2022 | Réunions d\'information : Mardi 8 mars à 14h | Mercredi 16 mars à 14h | Mardi 22 mars à 10h | Cette session est orientée Développement et Design Web (modules conception Web, algorithmie et coding renforcés)', 18, 'Prépa métiers de l\'informatique', 'https://www.campuscci.fr/evolutionpro/prepanumerique&ar=formations-diplomantess', 'vGafo-a0Tyo'),
('GENU22', 'k7K4nbY.png', '2022-07-01', 'Au cœur du « Pôle CCI Business », découvrez la « Charente Business School » qui propose 16 programmes de BAC+2 à BAC+5 sur les sites de l’Isle d’Espagnac et Cognac. Chaque année plus de 400 apprentis / étudiants sont formés à la CBS.\n\nSa mission est d’accompagner la performance des entreprises en formant des managers engagés, agiles et responsables prêts à relever les défis de demain dans un monde de plus en plus ouvert et connecté.\n\nSon ADN : Proximité avec les entreprises de son territoire et empreinte sociale par son engagement dans l’apprentissage !\n\nRejoignez notre école de l’entreprise !\nLa GEN ouvre une nouvelle session de son MOOC créé en collaboration avec Social Builder. L\'objectif ? Donner des outils pratiques afin d’inciter davantage de femmes à se former aux métiers du numérique.\n\nLa Fondation Mozaïk lance cette année une nouvelle plateforme pour vous donner accès aux milliers d’offres d’emploi de Diversifiez Vos Talents.com, le job board partenaire de la GEN, mais aussi à des modules d’accompagnement et des infos métiers.', 36, 'Grande Ecole du Numérique', 'https://www.ccicharente-formation.fr/', 'Ze23S0Ny7Xs'),
('BATP22', 'HgOTpY5.png', '2022-10-01', 'CCI Charente Formation propose un large choix de formations courtes qui vous permettent d’actualiser vos compétences dans différents domaines : commerce, logistique, efficacité professionnelle, comptabilité, administratif, management, ressources humaines, bureautique et numérique, hôtellerie, restauration, santé, social, packaging, industries graphiques…\n\nLa majorité des thèmes de formation prescrits sur L’Isle d’Espagnac peuvent également être animés sur Cognac.\nVous souhaitez changer de secteur d’activité, changer de métier ou encore évoluer dans votre poste ?\n\nCCI Charente Formation propose des formations diplômantes, accessibles par différents dispositifs, qui vous permettent d’obtenir un niveau de qualification de CAP à BAC+5.\n', 24, 'Bâtiment et Travaux Publics', 'https://www.ccicharente-formation.fr/', '21DUg1BGKdg'),
('GAST22', 'jPwHNaQ.png', '2022-02-01', 'Vous souhaitez renforcer votre équipe ou bien développer un projet ? Pourquoi ne pas recruter un apprenti formé au cœur des écoles de CCI Charente Formation ? Plus de 1000 jeunes, de CAP à Ingénieur, sont formés tous les ans. Ils peuvent être pour vous une ressource humaine très enrichissante pendant 1, 2 ou 3 ans, en alternance, et peut-être plus.\n\nSi vous souhaitez connaître toutes les modalités du recrutement d’un apprenti et rencontrer des candidats, contactez dès maintenant les conseillers de CCI Charente Formation.Vous avez un besoin ponctuel de forces vives pour un projet ? Vous recherchez un stagiaire ?\nN’hésitez pas à nous faire passer vos offres de stages que nous diffuserons à nos apprenants.\nContactez dès maintenant les conseillers de CCI Charente Formation.\n', 12, 'Gastronomie et patisserie', 'https://www.ccicharente-formation.fr/', 'UxtM42F6n68'),
('CASN22', 'MBzqT6g.png', '2022-02-01', 'Purple Campus est présent sur ces salons pour vous aider à faciliter votre insertion professionnelle et votre orientation. Au programme ? Un accompagnement sur mesure pour vous aider à découvrir le métier qui vous plaît et pour vous proposer la formation idéale.L’alternance est un mode d’apprentissage innovant proposé par Purple Campus. Il vous permet d’acquérir une expérience professionnelle au sein d’une entreprise tout en continuant les cours pour obtenir votre diplôme. Selon vos envies, il est aussi possible de poursuivre votre formation jusqu’au BAC +5.\n\nPurple Campus Carcassonne est ancré sur un territoire marqué par la gastronomie, notre campus implique ses apprentis en Hôtellerie Restauration dans diverses actions avec des professionnels de renom : promotions parrainées par de grands Chefs audois, rencontres culinaires « Chefs Académies », participation à des concours culinaires…\n\nPlusieurs apprentis se sont ainsi distingués ces dernières années sur les podiums nationaux !\n \n\nPôle d\'excellence régional sur la filière numérique, l\'établissement propose deux diplômes de niveau supérieur (BAC+2 et BAC+3) en Informatique, numérique et robotique, élaborés en partenariat avec le Groupe FIM et le Campus Fonderie de l’Image.\n\n \n\nLe campus de Carcassonne est accessible au public en situation de handicap. Toute prise en charge est assurée sur place par un référent handicap dédié.\n', 12, 'Le renouveau du numérique', 'https://www.aude.cci.fr/', 'w98uVOqRJi8');

-- --------------------------------------------------------

--
-- Structure de la table `message`
--

DROP TABLE IF EXISTS `message`;
CREATE TABLE IF NOT EXISTS `message` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `message`
--

INSERT INTO `message` (`id`, `email`, `message`, `nom`, `prenom`) VALUES
(1, 'hugo@victor.com', 'Je voudrais avoir des informations complémentaires sur la formation informatique', 'Hugo', 'Victor'),
(2, 'lee@bruce.com', 'Je voudrais avoir des informations complémentaires sur la formation commerciale', 'Lee', 'Bruce'),
(3, 'proust@marcel.com', 'Je voudrais avoir des informations complémentaires sur la formation d\'assistant(e) de direction', 'Proust', 'Marcel'),
(4, 'carne@marcel.com', 'Je voudrais avoir des informations complémentaires sur la formation liée aux métiers de bouche', 'Carné', 'Marcel');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
