/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:39:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_sts
-- ----------------------------
DROP TABLE IF EXISTS `tc_sts`;
CREATE TABLE `tc_sts` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `A1` varchar(50) DEFAULT NULL COMMENT '输入1线电压Uab',
  `A2` varchar(50) DEFAULT NULL COMMENT '输入1线电压Ubc',
  `A3` varchar(50) DEFAULT NULL COMMENT '输入1线电压Uca',
  `A4` varchar(50) DEFAULT NULL COMMENT '输入1A相电流',
  `A5` varchar(50) DEFAULT NULL COMMENT '输入1B相电流',
  `A6` varchar(50) DEFAULT NULL COMMENT '输入1C相电流',
  `A7` varchar(50) DEFAULT NULL COMMENT '输入1频率',
  `A8` varchar(50) DEFAULT NULL COMMENT '输入2线电压Uab',
  `A9` varchar(50) DEFAULT NULL COMMENT '输入2线电压Ubc',
  `A10` varchar(50) DEFAULT NULL COMMENT '输入2线电压Uca',
  `A11` varchar(50) DEFAULT NULL COMMENT '输入2A相电流',
  `A12` varchar(50) DEFAULT NULL COMMENT '输入2B相电流',
  `A13` varchar(50) DEFAULT NULL COMMENT '输入2C相电流',
  `A14` varchar(50) DEFAULT NULL COMMENT '输入2频率',
  `A15` varchar(50) DEFAULT NULL COMMENT '输入1与输入2相位差',
  `A16` varchar(50) DEFAULT NULL COMMENT '输出线电压Uab',
  `A17` varchar(50) DEFAULT NULL COMMENT '输出线电压Ubc',
  `A18` varchar(50) DEFAULT NULL COMMENT '输出线电压Uca',
  `A19` varchar(50) DEFAULT NULL COMMENT '输出A相电流',
  `A20` varchar(50) DEFAULT NULL COMMENT '输出B相电流',
  `A21` varchar(50) DEFAULT NULL COMMENT '输出C相电流',
  `A22` varchar(50) DEFAULT NULL COMMENT '输出频率',
  `D5` varchar(50) DEFAULT NULL COMMENT 'A相负载百分比',
  `D6` varchar(50) DEFAULT NULL COMMENT 'B相负载百分比',
  `D11` varchar(50) DEFAULT NULL COMMENT 'C相负载百分比',
  `D29` varchar(50) DEFAULT NULL COMMENT '总视在功率',
  `D34` varchar(50) DEFAULT NULL COMMENT '总有功功率',
  `D40` varchar(50) DEFAULT NULL COMMENT 'A相功率因数',
  `D53` varchar(50) DEFAULT NULL COMMENT 'B相功率因数',
  `D54` varchar(50) DEFAULT NULL COMMENT 'C相功率因数',
  `D55` varchar(50) DEFAULT NULL COMMENT '零序电流'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_sts
-- ----------------------------
INSERT INTO `tc_sts` VALUES ('998042292', '998', '2015-07-06 15:00:00', '模拟量', '383', '383', '384', '0', '0', '0', '50', '383', '383', '383', '9', '22', '9', '50', '1', '383', '383', '383', '13', '22', '21', '50', '正常', '正常', '正常', '否', '否', '否', '否', '否', '否');
