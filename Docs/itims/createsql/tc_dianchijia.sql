/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:37:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_dianchijia
-- ----------------------------
DROP TABLE IF EXISTS `tc_dianchijia`;
CREATE TABLE `tc_dianchijia` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `A1` varchar(50) DEFAULT NULL COMMENT '电池1电压',
  `A2` varchar(50) DEFAULT NULL COMMENT '电池2电压',
  `A3` varchar(50) DEFAULT NULL COMMENT '电池3电压',
  `A4` varchar(50) DEFAULT NULL COMMENT '电池4电压',
  `A5` varchar(50) DEFAULT NULL COMMENT '电池5电压',
  `A6` varchar(50) DEFAULT NULL COMMENT '电池6电压',
  `A7` varchar(50) DEFAULT NULL COMMENT '电池7电压',
  `A8` varchar(50) DEFAULT NULL COMMENT '电池8电压',
  `A9` varchar(50) DEFAULT NULL COMMENT '电池9电压',
  `A10` varchar(50) DEFAULT NULL COMMENT '电池10电压',
  `A11` varchar(50) DEFAULT NULL COMMENT '电池11电压',
  `A12` varchar(50) DEFAULT NULL COMMENT '电池12电压',
  `A13` varchar(50) DEFAULT NULL COMMENT '电池13电压',
  `A14` varchar(50) DEFAULT NULL COMMENT '电池14电压',
  `A15` varchar(50) DEFAULT NULL COMMENT '电池15电压',
  `A16` varchar(50) DEFAULT NULL COMMENT '电池16电压',
  `A17` varchar(50) DEFAULT NULL COMMENT '电池17电压',
  `A18` varchar(50) DEFAULT NULL COMMENT '电池18电压',
  `A19` varchar(50) DEFAULT NULL COMMENT '电池19电压',
  `A20` varchar(50) DEFAULT NULL COMMENT '电池20电压',
  `A21` varchar(50) DEFAULT NULL COMMENT '电池21电压',
  `A22` varchar(50) DEFAULT NULL COMMENT '电池22电压',
  `A23` varchar(50) DEFAULT NULL COMMENT '电池23电压',
  `A24` varchar(50) DEFAULT NULL COMMENT '电池24电压',
  `A25` varchar(50) DEFAULT NULL COMMENT '电池25电压',
  `A26` varchar(50) DEFAULT NULL COMMENT '电池26电压',
  `A27` varchar(50) DEFAULT NULL COMMENT '电池27电压',
  `A28` varchar(50) DEFAULT NULL COMMENT '电池28电压',
  `A29` varchar(50) DEFAULT NULL COMMENT '电池29电压',
  `A30` varchar(50) DEFAULT NULL COMMENT '电池30电压',
  `A31` varchar(50) DEFAULT NULL COMMENT '电池31电压',
  `A32` varchar(50) DEFAULT NULL COMMENT '电池32电压',
  `A35` varchar(50) DEFAULT NULL COMMENT '总电压',
  `A36` varchar(50) DEFAULT NULL COMMENT '充放电电流'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_dianchijia
-- ----------------------------
INSERT INTO `tc_dianchijia` VALUES ('998049041', '998', '2015-07-06 15:00:00', '模拟量', '15.0104', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0.006531');
INSERT INTO `tc_dianchijia` VALUES ('998049042', '998', '2015-07-06 15:00:00', '模拟量', '11.9666', '11.592', '0', '6.2707', '13.6143', '13.6299', '13.6496', '13.6335', '13.662', '13.6569', '13.6397', '13.6631', '13.5998', '13.6646', '13.0519', '13.0514', '13.4991', '13.7783', '13.6288', '13.6646', '13.5764', '13.6361', '13.6314', '13.5713', '13.5702', '13.6226', '13.6683', '13.5739', '13.6351', '13.5873', '11.9677', '11.6216', '435.4065', '-0.7266');
INSERT INTO `tc_dianchijia` VALUES ('998049043', '998', '2015-07-06 15:00:00', '模拟量', '14.8755', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '13.5246', '0', '0', '0', '0', '0', '0', '14.8755', '0', '0', '0', '0', '0', '0', '0', '0', '0.008484');
INSERT INTO `tc_dianchijia` VALUES ('998042285', '998', '2015-07-06 15:00:00', '模拟量', '14.9357', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '13.5391', '13.5209', '13.5713', '13.5365', '13.5521', '13.5095', '13.522', '13.5282', '13.5355', '13.5209', '13.5521', '13.5282', '13.5391', '14.9357', '13.5173', '217.6758', '0.009033');
