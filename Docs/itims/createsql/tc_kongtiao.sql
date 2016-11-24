/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:38:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_kongtiao
-- ----------------------------
DROP TABLE IF EXISTS `tc_kongtiao`;
CREATE TABLE `tc_kongtiao` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `A1` varchar(50) DEFAULT NULL COMMENT '实测湿度',
  `A2` varchar(50) DEFAULT NULL COMMENT '实测温度',
  `A3` varchar(50) DEFAULT NULL COMMENT '平均湿度',
  `A4` varchar(50) DEFAULT NULL COMMENT '平均温度',
  `A5` varchar(50) DEFAULT NULL COMMENT '湿度设定值',
  `A6` varchar(50) DEFAULT NULL COMMENT '温度设定值',
  `A7` varchar(50) DEFAULT NULL COMMENT '低湿报警设定值',
  `A8` varchar(50) DEFAULT NULL COMMENT '高湿报警设定值',
  `A9` varchar(50) DEFAULT NULL COMMENT '低温报警设定值',
  `A10` varchar(50) DEFAULT NULL COMMENT '高温报警设定值',
  `A11` varchar(50) DEFAULT NULL COMMENT '送风温度设定值',
  `D1` varchar(50) DEFAULT NULL COMMENT '系统状态',
  `D2` varchar(50) DEFAULT NULL COMMENT '除湿器状态',
  `D3` varchar(50) DEFAULT NULL COMMENT '加热器1状态',
  `D4` varchar(50) DEFAULT NULL COMMENT '加热器2状态',
  `D5` varchar(50) DEFAULT NULL COMMENT '压缩机1状态',
  `D6` varchar(50) DEFAULT NULL COMMENT '压缩机2状态',
  `D7` varchar(50) DEFAULT NULL COMMENT '风机状态',
  `D8` varchar(50) DEFAULT NULL COMMENT '过滤器阻塞',
  `D9` varchar(50) DEFAULT NULL COMMENT '压缩机1低压',
  `D10` varchar(50) DEFAULT NULL COMMENT '压缩机1高压',
  `D11` varchar(50) DEFAULT NULL COMMENT '冷却水温度过高',
  `D12` varchar(50) DEFAULT NULL COMMENT '冷却水流量过低',
  `D13` varchar(50) DEFAULT NULL COMMENT '电子加热器过热',
  `D14` varchar(50) DEFAULT NULL COMMENT '风机故障',
  `D15` varchar(50) DEFAULT NULL COMMENT '漏水',
  `D16` varchar(50) DEFAULT NULL COMMENT '外加加湿器故障',
  `D17` varchar(50) DEFAULT NULL COMMENT '加湿器电流过高',
  `D18` varchar(50) DEFAULT NULL COMMENT '加湿器故障',
  `D19` varchar(50) DEFAULT NULL COMMENT '室内湿度过高(EEAP)',
  `D20` varchar(50) DEFAULT NULL COMMENT '室内湿度过低(EEAP)',
  `D21` varchar(50) DEFAULT NULL COMMENT '室内温度过高',
  `D22` varchar(50) DEFAULT NULL COMMENT '室内温度过低',
  `D23` varchar(50) DEFAULT NULL COMMENT '室内湿度过高',
  `D24` varchar(50) DEFAULT NULL COMMENT '室内湿度过低',
  `D25` varchar(50) DEFAULT NULL COMMENT '压缩机1工作超时',
  `D26` varchar(50) DEFAULT NULL COMMENT '加湿器工作超时',
  `D27` varchar(50) DEFAULT NULL COMMENT '室内温度过高(EEAP)',
  `D28` varchar(50) DEFAULT NULL COMMENT '室内温度过低(EEAP)',
  `D29` varchar(50) DEFAULT NULL COMMENT 'PTC传感器故障',
  `D30` varchar(50) DEFAULT NULL COMMENT '室温传感器故障',
  `D31` varchar(50) DEFAULT NULL COMMENT '室温传感器故障',
  `D32` varchar(50) DEFAULT NULL COMMENT '加湿器故障',
  `D33` varchar(50) DEFAULT NULL COMMENT '加湿器缸磨损',
  `D34` varchar(50) DEFAULT NULL COMMENT 'EEAP传感器故障',
  `D35` varchar(50) DEFAULT NULL COMMENT '水流传感器故障',
  `D36` varchar(50) DEFAULT NULL COMMENT '压缩机2高压',
  `D37` varchar(50) DEFAULT NULL COMMENT '压缩机2低压',
  `D38` varchar(50) DEFAULT NULL COMMENT '室外温感故障',
  `D39` varchar(50) DEFAULT NULL COMMENT '乙二醇温感故障',
  `D40` varchar(50) DEFAULT NULL COMMENT '压缩机2工作超时',
  `D41` varchar(50) DEFAULT NULL COMMENT '火警',
  `D42` varchar(50) DEFAULT NULL COMMENT '冷凝器2风扇故障',
  `D43` varchar(50) DEFAULT NULL COMMENT '冷凝器1风扇故障',
  `D44` varchar(50) DEFAULT NULL COMMENT '烟雾报警'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_kongtiao
-- ----------------------------
INSERT INTO `tc_kongtiao` VALUES ('998049028', '998', '2015-07-06 15:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '11', '12', '13', '14', '16', '15', '17', '17', '18', '19', '20', '21', '22', '23', '24', '24', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35', '36', '37', '38', '39', '40', '41', '42', '43', '44', '45', '45', '47', '48', '48', '50', '51', '52', '53', '54');
INSERT INTO `tc_kongtiao` VALUES ('998042288', '998', '2015-07-06 15:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '11', '12', '13', '14', '16', '15', '17', '17', '18', '19', '20', '21', '22', '23', '24', '24', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35', '36', '37', '38', '39', '40', '41', '42', '43', '44', '45', '45', '47', '48', '48', '50', '51', '52', '53', '54');
INSERT INTO `tc_kongtiao` VALUES ('998049029', '998', '2015-07-06 15:00:00', '模拟量', '26', '22.6', '50', '23', '5', '6', '7', '8', '9', '0', '11', '开启', '运行', '停止', '停止', '运行', '运行', '运行', '正常', '报警', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');
INSERT INTO `tc_kongtiao` VALUES ('998049030', '998', '2015-07-06 15:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '11', '12', '13', '14', '16', '15', '17', '17', '18', '19', '20', '21', '22', '23', '24', '24', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35', '36', '37', '38', '39', '40', '41', '42', '43', '44', '45', '45', '47', '48', '48', '50', '51', '52', '53', '54');
INSERT INTO `tc_kongtiao` VALUES ('998049031', '998', '2015-07-06 15:00:00', '模拟量', '38', '18.2', '50', '23', '5', '6', '7', '8', '9', '0', '11', '开启', '运行', '停止', '停止', '停止', '运行', '运行', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');
INSERT INTO `tc_kongtiao` VALUES ('998049032', '998', '2015-07-06 15:00:00', '模拟量', '899.5', '899.5', '899.5', '899.5', '5', '6', '7', '8', '9', '0', '11', '关闭', '停止', '停止', '停止', '停止', '停止', '停止', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');
INSERT INTO `tc_kongtiao` VALUES ('998049027', '998', '2015-07-06 15:00:00', '模拟量', '26.5', '22.3', '50', '23', '5', '6', '7', '8', '9', '0', '11', '开启', '停止', '停止', '停止', '运行', '运行', '运行', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');
