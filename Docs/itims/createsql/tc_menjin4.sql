/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:39:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_menjin4
-- ----------------------------
DROP TABLE IF EXISTS `tc_menjin4`;
CREATE TABLE `tc_menjin4` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '介质库防火门状态',
  `D2` varchar(50) DEFAULT NULL COMMENT '介质库防火门按钮开门'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_menjin4
-- ----------------------------
INSERT INTO `tc_menjin4` VALUES ('998042284', '998', '2015-07-07 12:00:00', '状态量', '打开', '正常');
