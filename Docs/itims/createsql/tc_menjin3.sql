/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:39:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_menjin3
-- ----------------------------
DROP TABLE IF EXISTS `tc_menjin3`;
CREATE TABLE `tc_menjin3` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '电池间1防火门状态',
  `D2` varchar(50) DEFAULT NULL COMMENT 'UPS电源间防火门状态',
  `D3` varchar(50) DEFAULT NULL COMMENT '小型机机房2号玻璃门状态',
  `D4` varchar(50) DEFAULT NULL COMMENT '网络机房玻璃门状态',
  `D5` varchar(50) DEFAULT NULL COMMENT '电池间1防火门按钮开门',
  `D7` varchar(50) DEFAULT NULL COMMENT 'UPS电源间防火门按钮开门',
  `D9` varchar(50) DEFAULT NULL COMMENT '小型机机房2号玻璃门按钮开门',
  `D11` varchar(50) DEFAULT NULL COMMENT '网络机房防火门按钮开门'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_menjin3
-- ----------------------------
INSERT INTO `tc_menjin3` VALUES ('998042284', '998', '2015-07-07 12:00:00', '状态量', '关闭', '关闭', '关闭', '打开', '正常', '正常', '正常', '正常');
