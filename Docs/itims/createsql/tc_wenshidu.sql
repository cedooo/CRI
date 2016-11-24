/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:39:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_wenshidu
-- ----------------------------
DROP TABLE IF EXISTS `tc_wenshidu`;
CREATE TABLE `tc_wenshidu` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `A1` varchar(50) DEFAULT NULL COMMENT '介质库温度',
  `A2` varchar(50) DEFAULT NULL COMMENT '介质库湿度',
  `A3` varchar(50) DEFAULT NULL COMMENT '服务器机房1#温度',
  `A4` varchar(50) DEFAULT NULL COMMENT '服务器机房1#湿度',
  `A5` varchar(50) DEFAULT NULL COMMENT '小型机机房1#温度',
  `A6` varchar(50) DEFAULT NULL COMMENT '小型机机房1#湿度',
  `A7` varchar(50) DEFAULT NULL COMMENT '小型机机房3#温度',
  `A8` varchar(50) DEFAULT NULL COMMENT '小型机机房3#湿度',
  `A9` varchar(50) DEFAULT NULL COMMENT '保密机房温度',
  `A10` varchar(50) DEFAULT NULL COMMENT '保密机房湿度',
  `A11` varchar(50) DEFAULT NULL COMMENT '电池间2温度',
  `A12` varchar(50) DEFAULT NULL COMMENT '电池间2湿度',
  `A13` varchar(50) DEFAULT NULL COMMENT 'UPS电源间1#温度',
  `A14` varchar(50) DEFAULT NULL COMMENT 'UPS电源间1#湿度',
  `A15` varchar(50) DEFAULT NULL COMMENT '网络机房1#温度',
  `A16` varchar(50) DEFAULT NULL COMMENT '网络机房1#湿度',
  `A17` varchar(50) DEFAULT NULL COMMENT 'KVM室1#温度',
  `A18` varchar(50) DEFAULT NULL COMMENT 'KVM室1#湿度',
  `A19` varchar(50) DEFAULT NULL COMMENT '服务器机房2#温度',
  `A20` varchar(50) DEFAULT NULL COMMENT '服务器机房2#湿度',
  `A21` varchar(50) DEFAULT NULL COMMENT '小型机机房4#温度',
  `A22` varchar(50) DEFAULT NULL COMMENT '小型机机房4#湿度',
  `A23` varchar(50) DEFAULT NULL COMMENT '网络机房2#温度',
  `A24` varchar(50) DEFAULT NULL COMMENT '网络机房2#湿度',
  `A25` varchar(50) DEFAULT NULL COMMENT 'KVM室2#温度',
  `A26` varchar(50) DEFAULT NULL COMMENT 'KVM室2#湿度',
  `A27` varchar(50) DEFAULT NULL COMMENT '服务器机房4#温度',
  `A28` varchar(50) DEFAULT NULL COMMENT '服务器机房4#湿度',
  `A29` varchar(50) DEFAULT NULL COMMENT '电池间1#温度',
  `A30` varchar(50) DEFAULT NULL COMMENT '电池间1#湿度',
  `A31` varchar(50) DEFAULT NULL COMMENT '小型机机房2#温度',
  `A32` varchar(50) DEFAULT NULL COMMENT '小型机机房2#湿度',
  `A33` varchar(50) DEFAULT NULL COMMENT 'UPS电源间2#温度',
  `A34` varchar(50) DEFAULT NULL COMMENT 'UPS电源间2#湿度',
  `A35` varchar(50) DEFAULT NULL COMMENT '服务器机房3#温度',
  `A36` varchar(50) DEFAULT NULL COMMENT '服务器机房3#湿度'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_wenshidu
-- ----------------------------
INSERT INTO `tc_wenshidu` VALUES ('998042294', '998', '2015-07-06 15:00:00', '模拟量', '16.1', '41.3', '21.1', '30.7', '22.6', '30.2', '23.2', '28.7', '16.6', '40.7', '19.3', '38.2', '20.8', '36', '21.3', '33.6', '22.2', '19.5', '22.8', '26.8', '21.1', '30.8', '19.8', '37.5', '22.5', '17.5', '23.8', '24.5', '19', '42.3', '23.9', '28.8', '20.8', '35.2', '24.4', '23.9');
INSERT INTO `tc_wenshidu` VALUES (null, null, '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
