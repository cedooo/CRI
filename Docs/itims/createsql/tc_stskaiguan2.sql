/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:39:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_stskaiguan2
-- ----------------------------
DROP TABLE IF EXISTS `tc_stskaiguan2`;
CREATE TABLE `tc_stskaiguan2` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '二层配电箱开关C相',
  `D2` varchar(50) DEFAULT NULL COMMENT '网络机房列头柜2开关A相',
  `D3` varchar(50) DEFAULT NULL COMMENT '网络机房列头柜2开关B相',
  `D4` varchar(50) DEFAULT NULL COMMENT '网络机房列头柜2开关C相',
  `D5` varchar(50) DEFAULT NULL COMMENT '备用A相',
  `D6` varchar(50) DEFAULT NULL COMMENT '备用B相',
  `D7` varchar(50) DEFAULT NULL COMMENT '备用C相',
  `D8` varchar(50) DEFAULT NULL COMMENT '小型机电源开关'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_stskaiguan2
-- ----------------------------
INSERT INTO `tc_stskaiguan2` VALUES ('998042293', '998', '2015-07-03 14:00:00', '模拟量', '断开', '断开', '断开', '断开', '闭合', '闭合', '闭合', '断开');
