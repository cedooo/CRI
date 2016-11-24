/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:38:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_loushui
-- ----------------------------
DROP TABLE IF EXISTS `tc_loushui`;
CREATE TABLE `tc_loushui` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `A13` varchar(50) DEFAULT NULL COMMENT '漏水点位置',
  `A17` varchar(50) DEFAULT NULL COMMENT '红绿线电阻(绳长度)',
  `D5` varchar(50) DEFAULT NULL COMMENT '漏水检测',
  `D6` varchar(50) DEFAULT NULL COMMENT '灰尘及小水珠检测',
  `D7` varchar(50) DEFAULT NULL COMMENT '漏水绳检测'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_loushui
-- ----------------------------
INSERT INTO `tc_loushui` VALUES ('998042290', '998', '2015-07-03 14:00:00', '模拟量', '38.475', '53.25', '发现漏水', '发现小水珠', '恢复正常');
