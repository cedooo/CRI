/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:38:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_menjin1
-- ----------------------------
DROP TABLE IF EXISTS `tc_menjin1`;
CREATE TABLE `tc_menjin1` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '服务器机房2号玻璃门',
  `D2` varchar(50) DEFAULT NULL COMMENT '电池间2防火门状态',
  `D3` varchar(50) DEFAULT NULL COMMENT '机房通道东侧玻璃门状态',
  `D4` varchar(50) DEFAULT NULL COMMENT '新风间防火门状态',
  `D5` varchar(50) DEFAULT NULL COMMENT '服务器机房2防火门按钮开门',
  `D7` varchar(50) DEFAULT NULL COMMENT '电池间2防火门按钮开门',
  `D9` varchar(50) DEFAULT NULL COMMENT '机房通道东侧玻璃门按钮开门',
  `D11` varchar(50) DEFAULT NULL COMMENT '新风间防火门按钮开门'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_menjin1
-- ----------------------------
INSERT INTO `tc_menjin1` VALUES ('998042284', '998', '2015-07-07 12:00:00', '模拟量', '关闭', '关闭', '关闭', '关闭', '正常', '正常', '正常', '正常');
