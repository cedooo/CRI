/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:36:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_baojing
-- ----------------------------
DROP TABLE IF EXISTS `tc_baojing`;
CREATE TABLE `tc_baojing` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '防区1报警状态',
  `D2` varchar(50) DEFAULT NULL COMMENT '防区2报警状态',
  `D3` varchar(50) DEFAULT NULL COMMENT '防区3报警状态',
  `D17` varchar(50) DEFAULT NULL COMMENT '防区1撤布防状态',
  `D18` varchar(50) DEFAULT NULL COMMENT '防区2撤布防状态',
  `D19` varchar(50) DEFAULT NULL COMMENT '防区3撤布防状态',
  `D25` varchar(50) DEFAULT NULL COMMENT '防区1类型',
  `D26` varchar(50) DEFAULT NULL COMMENT '防区2类型',
  `D27` varchar(50) DEFAULT NULL COMMENT '防区3类型'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_baojing
-- ----------------------------
INSERT INTO `tc_baojing` VALUES ('998042283', '998', '2015-07-07 12:00:00', '模拟量', '报警', '报警', '正常', '布防', '布防', '布防', '即时防区', '即时防区', '即时防区');
