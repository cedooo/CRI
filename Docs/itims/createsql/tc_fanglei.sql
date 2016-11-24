/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:37:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_fanglei
-- ----------------------------
DROP TABLE IF EXISTS `tc_fanglei`;
CREATE TABLE `tc_fanglei` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT 'UPS1防雷器开关',
  `D2` varchar(50) DEFAULT NULL COMMENT 'UPS1防雷器状态',
  `D3` varchar(50) DEFAULT NULL COMMENT 'UPS2防雷器开关',
  `D4` varchar(50) DEFAULT NULL COMMENT 'UPS2防雷器状态',
  `D5` varchar(50) DEFAULT NULL COMMENT '小型机房1防雷器状态',
  `D6` varchar(50) DEFAULT NULL COMMENT '小型机房2防雷器状态',
  `D7` varchar(50) DEFAULT NULL COMMENT '服务器机房1防雷器状态',
  `D8` varchar(50) DEFAULT NULL COMMENT '服务器机房2防雷器状态',
  `D9` varchar(50) DEFAULT NULL COMMENT '网络机房1防雷器状态',
  `D10` varchar(50) DEFAULT NULL COMMENT '网络机房2防雷器状态',
  `D11` varchar(50) DEFAULT NULL,
  `D12` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_fanglei
-- ----------------------------
INSERT INTO `tc_fanglei` VALUES ('998042286', '998', '2015-07-06 15:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12');
