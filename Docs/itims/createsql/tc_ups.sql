/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:39:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_ups
-- ----------------------------
DROP TABLE IF EXISTS `tc_ups`;
CREATE TABLE `tc_ups` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(255) DEFAULT NULL,
  `fPartID` varchar(50) DEFAULT NULL,
  `A1` varchar(50) DEFAULT NULL COMMENT '交流输入线电压AB(V)',
  `A2` varchar(50) DEFAULT NULL COMMENT '交流输入线电压BC(V)',
  `A3` varchar(50) DEFAULT NULL COMMENT '交流输入线电压CA(V)',
  `A4` varchar(50) DEFAULT NULL COMMENT '交流输出相电压A(V)',
  `A5` varchar(50) DEFAULT NULL COMMENT '交流输出相电压B(V)',
  `A6` varchar(50) DEFAULT NULL COMMENT '交流输出相电压C(V)',
  `A7` varchar(50) DEFAULT NULL COMMENT '交流输出电流A(A)',
  `A8` varchar(50) DEFAULT NULL COMMENT '交流输出电流B(A)',
  `A9` varchar(50) DEFAULT NULL COMMENT '交流输出电流C(A)',
  `A10` varchar(50) DEFAULT NULL COMMENT '电池电压(V)',
  `A11` varchar(50) DEFAULT NULL COMMENT '输出频率(Hz)',
  `A12` varchar(50) DEFAULT NULL COMMENT 'A相输入电流(A)',
  `A13` varchar(50) DEFAULT NULL COMMENT 'B相输入电流(A)',
  `A14` varchar(50) DEFAULT NULL COMMENT 'C相输入电流(A)',
  `A15` varchar(50) DEFAULT NULL COMMENT '入输频率(Hz)',
  `A16` varchar(50) DEFAULT NULL COMMENT '总输入功率因数',
  `A17` varchar(50) DEFAULT NULL COMMENT 'A相旁路电压(V)',
  `A18` varchar(50) DEFAULT NULL COMMENT 'B相旁路电压(V)',
  `A19` varchar(50) DEFAULT NULL COMMENT 'C相旁路电压(V)',
  `A21` varchar(50) DEFAULT NULL COMMENT '旁路频率(Hz)',
  `A40` varchar(50) DEFAULT NULL COMMENT '电池电流(A)',
  `D1` varchar(50) DEFAULT NULL COMMENT 'A相输出功率因数',
  `D2` varchar(50) DEFAULT NULL COMMENT 'B相输出功率因数',
  `D3` varchar(50) DEFAULT NULL COMMENT 'C相输出功率因数',
  `D4` varchar(50) DEFAULT NULL COMMENT 'A相输出峰值比',
  `D5` varchar(50) DEFAULT NULL COMMENT 'B相输出峰值比',
  `D6` varchar(50) DEFAULT NULL COMMENT 'C相输出峰值比',
  `D7` varchar(50) DEFAULT NULL,
  `D8` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_ups
-- ----------------------------
INSERT INTO `tc_ups` VALUES ('998049026', '998', '2015-07-03 14:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '1', '1');
INSERT INTO `tc_ups` VALUES ('998042295', '998', '2015-07-03 14:00:00', '模拟量', '398.1', '400', '399.6', '220', '220.6', '218.9', '129.6', '95.9', '80.8', '435.6', '50.01', '124.3', '127', '126.5', '15', '16', '229.4', '231.1', '230.9', '1.3', '71', '是', '否', '否', '否', '是', '否', '是', '开机');
