/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:39:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_menjin5
-- ----------------------------
DROP TABLE IF EXISTS `tc_menjin5`;
CREATE TABLE `tc_menjin5` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '1# Door 状态',
  `D2` varchar(50) DEFAULT NULL COMMENT '2# Door 状态',
  `D3` varchar(50) DEFAULT NULL COMMENT '1# Door 按钮开门',
  `D4` varchar(50) DEFAULT NULL COMMENT '1# Door 门',
  `D5` varchar(50) DEFAULT NULL COMMENT '2# Door 按钮开门',
  `D6` varchar(50) DEFAULT NULL COMMENT '2# Door 门'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_menjin5
-- ----------------------------
INSERT INTO `tc_menjin5` VALUES ('998042284', '998', '2015-07-07 12:00:00', '状态量', '打开', '打开', '正常', '正常', '正常', '正常');
