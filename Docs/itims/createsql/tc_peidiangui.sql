/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:39:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_peidiangui
-- ----------------------------
DROP TABLE IF EXISTS `tc_peidiangui`;
CREATE TABLE `tc_peidiangui` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `A1` varchar(50) DEFAULT NULL COMMENT '相电压Ua',
  `A2` varchar(50) DEFAULT NULL COMMENT '线电压Uca',
  `A3` varchar(50) DEFAULT NULL COMMENT 'A相电流',
  `A4` varchar(50) DEFAULT NULL COMMENT 'A相有功功率P',
  `A5` varchar(50) DEFAULT NULL COMMENT 'A相功率因数',
  `A6` varchar(50) DEFAULT NULL COMMENT 'A相无功功率Q',
  `A7` varchar(50) DEFAULT NULL COMMENT 'A相视在功率S',
  `A8` varchar(50) DEFAULT NULL,
  `A9` varchar(50) DEFAULT NULL,
  `A10` varchar(50) DEFAULT NULL,
  `A11` varchar(50) DEFAULT NULL,
  `A12` varchar(50) DEFAULT NULL,
  `A13` varchar(50) DEFAULT NULL,
  `A14` varchar(50) DEFAULT NULL,
  `A15` varchar(50) DEFAULT NULL,
  `A16` varchar(50) DEFAULT NULL,
  `A17` varchar(50) DEFAULT NULL,
  `A18` varchar(50) DEFAULT NULL,
  `A19` varchar(50) DEFAULT NULL,
  `A20` varchar(50) DEFAULT NULL,
  `A21` varchar(50) DEFAULT NULL,
  `A23` varchar(50) DEFAULT NULL,
  `A24` varchar(50) DEFAULT NULL,
  `A25` varchar(50) DEFAULT NULL,
  `A26` varchar(50) DEFAULT NULL,
  `A27` varchar(50) DEFAULT NULL,
  `A28` varchar(50) DEFAULT NULL,
  `A29` varchar(50) DEFAULT NULL,
  `A70` varchar(50) DEFAULT NULL,
  `A71` varchar(50) DEFAULT NULL,
  `A72` varchar(50) DEFAULT NULL,
  `A73` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_peidiangui
-- ----------------------------
INSERT INTO `tc_peidiangui` VALUES ('998049017', '998', '2015-07-03 14:00:00', '模拟量', '220.03', '380.88', '108.42', '22.656', '0.9509', '6.96', '23.856', '220.03', '381.32', '149.76', '30.768', '0.9354', '10.992', '32.904', '220.23', '381.24', '99.336', '19.68', '0.9', '9.36', '21.864', '220.06', '119.088', '50.0323', '73.104', '0.93', '27.312', '78.6', '1448817.84', '0', '0', '510012.6');
INSERT INTO `tc_peidiangui` VALUES ('998049019', '998', '2015-07-03 14:00:00', '模拟量', '232.11', '402.16', '11.988', '2.352', '0.8545', '1.392', '2.784', '232.91', '402.72', '12.216', '2.304', '0.823', '1.584', '2.832', '232.34', '403.6', '11.052', '2.16', '0.8539', '1.344', '2.568', '232.41', '11.772', '50.043', '6.816', '0.8303', '4.32', '8.208', '671693.76', '0', '454974.84', '0');
INSERT INTO `tc_peidiangui` VALUES ('998049016', '998', '2015-07-03 14:00:00', '模拟量', '231.64', '402.12', '130.512', '26.88', '0.8899', '13.568', '30.24', '232.55', '402.16', '135.52', '28.224', '0.8961', '13.76', '31.52', '232.78', '403.36', '134.176', '27.52', '0.8818', '14.528', '31.232', '232.31', '133.376', '50.0419', '82.624', '0.8884', '41.856', '92.992', '1693750.72', '0.32', '706199.84', '24.96');
INSERT INTO `tc_peidiangui` VALUES ('998049025', '998', '2015-07-03 14:00:00', '模拟量', '220.49', '381.88', '128.124', '26.112', '0.9243', '10.224', '28.248', '220.42', '381.72', '95.532', '19.68', '0.935', '7.296', '21.072', '220.56', '381.92', '80.124', '16.512', '0.9367', '6.048', '17.664', '220.44', '101.28', '50.0376', '62.304', '0.9301', '23.568', '66.984', '682590.72', '0', '0', '252311.4');
INSERT INTO `tc_peidiangui` VALUES ('998042291', '998', '2015-07-03 14:00:00', '模拟量', '230.55', '399.12', '297.904', '56.64', '0.8252', '38.72', '68.672', '231.3', '400', '301.616', '56.448', '0.8091', '40.896', '69.76', '231.83', '401.4', '302.192', '56.064', '0.8005', '41.92', '70.048', '231.22', '300.288', '50.0376', '169.024', '0.8113', '121.536', '208.32', '1571084.8', '0', '1035052.96', '9.12');
INSERT INTO `tc_peidiangui` VALUES ('998049018', '998', '2015-07-03 14:00:00', '模拟量', '232.82', '402.96', '11.86', '2.4', '0.8912', '1.28', '2.76', '233.54', '402.32', '12.38', '2.4', '0.8524', '1.44', '2.88', '233.18', '403.96', '11.34', '2.24', '0.8593', '1.36', '2.64', '233.17', '11.82', '50.0387', '7.04', '0.8502', '4.08', '8.28', '4469104', '0.4', '3387552.8', '3.4');
