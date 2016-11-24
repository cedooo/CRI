/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:37:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_jinshui
-- ----------------------------
DROP TABLE IF EXISTS `tc_jinshui`;
CREATE TABLE `tc_jinshui` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '电磁阀状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_jinshui
-- ----------------------------
INSERT INTO `tc_jinshui` VALUES ('998042287', '998', '2015-07-03 14:00:00', '模拟量', '阀门打开');
