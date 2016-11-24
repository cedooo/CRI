/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:40:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_xinfengji
-- ----------------------------
DROP TABLE IF EXISTS `tc_xinfengji`;
CREATE TABLE `tc_xinfengji` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D2` varchar(50) DEFAULT NULL COMMENT '新风机电源检测A相',
  `D3` varchar(50) DEFAULT NULL COMMENT '新风机电源检测B相',
  `D4` varchar(50) DEFAULT NULL COMMENT '新风机电源检测C相',
  `D5` varchar(50) DEFAULT NULL COMMENT '新风机压差开关',
  `D1` varchar(50) DEFAULT NULL COMMENT '新风机控制状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_xinfengji
-- ----------------------------
INSERT INTO `tc_xinfengji` VALUES ('998042297', '998', '2015-07-03 14:00:00', '模拟量', '正常', '正常', '正常', '正常', '停止');
