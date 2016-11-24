/*
Navicat MySQL Data Transfer

Source Server         : itims_v
Source Server Version : 50512
Source Host           : 192.168.226.3:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2015-07-07 15:53:41
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `tc_baojing`
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
INSERT INTO `tc_baojing` VALUES ('998000036', '998', '2015-07-07 12:00:00', '模拟量', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');

-- ----------------------------
-- Table structure for `tc_dianchijia`
-- ----------------------------
DROP TABLE IF EXISTS `tc_dianchijia`;
CREATE TABLE `tc_dianchijia` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `A1` varchar(50) DEFAULT NULL COMMENT '电池1电压',
  `A2` varchar(50) DEFAULT NULL COMMENT '电池2电压',
  `A3` varchar(50) DEFAULT NULL COMMENT '电池3电压',
  `A4` varchar(50) DEFAULT NULL COMMENT '电池4电压',
  `A5` varchar(50) DEFAULT NULL COMMENT '电池5电压',
  `A6` varchar(50) DEFAULT NULL COMMENT '电池6电压',
  `A7` varchar(50) DEFAULT NULL COMMENT '电池7电压',
  `A8` varchar(50) DEFAULT NULL COMMENT '电池8电压',
  `A9` varchar(50) DEFAULT NULL COMMENT '电池9电压',
  `A10` varchar(50) DEFAULT NULL COMMENT '电池10电压',
  `A11` varchar(50) DEFAULT NULL COMMENT '电池11电压',
  `A12` varchar(50) DEFAULT NULL COMMENT '电池12电压',
  `A13` varchar(50) DEFAULT NULL COMMENT '电池13电压',
  `A14` varchar(50) DEFAULT NULL COMMENT '电池14电压',
  `A15` varchar(50) DEFAULT NULL COMMENT '电池15电压',
  `A16` varchar(50) DEFAULT NULL COMMENT '电池16电压',
  `A17` varchar(50) DEFAULT NULL COMMENT '电池17电压',
  `A18` varchar(50) DEFAULT NULL COMMENT '电池18电压',
  `A19` varchar(50) DEFAULT NULL COMMENT '电池19电压',
  `A20` varchar(50) DEFAULT NULL COMMENT '电池20电压',
  `A21` varchar(50) DEFAULT NULL COMMENT '电池21电压',
  `A22` varchar(50) DEFAULT NULL COMMENT '电池22电压',
  `A23` varchar(50) DEFAULT NULL COMMENT '电池23电压',
  `A24` varchar(50) DEFAULT NULL COMMENT '电池24电压',
  `A25` varchar(50) DEFAULT NULL COMMENT '电池25电压',
  `A26` varchar(50) DEFAULT NULL COMMENT '电池26电压',
  `A27` varchar(50) DEFAULT NULL COMMENT '电池27电压',
  `A28` varchar(50) DEFAULT NULL COMMENT '电池28电压',
  `A29` varchar(50) DEFAULT NULL COMMENT '电池29电压',
  `A30` varchar(50) DEFAULT NULL COMMENT '电池30电压',
  `A31` varchar(50) DEFAULT NULL COMMENT '电池31电压',
  `A32` varchar(50) DEFAULT NULL COMMENT '电池32电压',
  `A35` varchar(50) DEFAULT NULL COMMENT '总电压',
  `A36` varchar(50) DEFAULT NULL COMMENT '充放电电流'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_dianchijia
-- ----------------------------
INSERT INTO `tc_dianchijia` VALUES ('998000014', '998', '2015-07-06 15:00:00', '模拟量', '4', '3', '4', '7', '4', '9', '4', '2', '3', '4', '6', '5', '7', '3', '2', '4', '9', '6', '8', '5', '9', '7', '3', '6', '7', '4', '3', '6', '7', '4', '3', '6', '7', '4');
INSERT INTO `tc_dianchijia` VALUES ('998000015', '998', '2015-07-06 15:00:00', '模拟量', '2', '2', '5', '4', '5', '6', '3', '2', '3', '4', '6', '5', '7', '3', '2', '4', '7', '7', '2', '6', '8', '5', '2', '7', '8', '3', '22', '7', '8', '3', '2', '7', '8', '3');
INSERT INTO `tc_dianchijia` VALUES ('998000016', '998', '2015-07-06 15:00:00', '模拟量', '1', '1', '6', '3', '6', '4', '3', '3', '3', '4', '6', '5', '7', '3', '2', '4', '8', '8', '3', '8', '7', '4', '1', '8', '9', '2', '1', '8', '9', '2', '1', '8', '9', '2');
INSERT INTO `tc_dianchijia` VALUES ('998000013', '998', '2015-07-06 15:00:00', '模拟量', '6', '7', '8', '8', '8', '8', '8', '8', '9', '4', '6', '9', '99', '0', '0', '7', '6', '6', '6', '6', '6', '6', '6', '6', '5', '5', '5', '5', '6', '5', '4', '5', '6', '5');

-- ----------------------------
-- Table structure for `tc_fanglei`
-- ----------------------------
DROP TABLE IF EXISTS `tc_fanglei`;
CREATE TABLE `tc_fanglei` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT 'UPS1防雷器开关',
  `D2` varchar(50) DEFAULT NULL COMMENT 'UPS1防雷器状态',
  `D3` varchar(50) DEFAULT NULL COMMENT 'UPS2防雷器开关',
  `D4` varchar(50) DEFAULT NULL COMMENT 'UPS2防雷器状态',
  `D5` varchar(50) DEFAULT NULL COMMENT '小型机房1防雷器状态',
  `D6` varchar(50) DEFAULT NULL COMMENT '小型机房2防雷器状态',
  `D7` varchar(50) DEFAULT NULL COMMENT '服务器机房1防雷器状态',
  `D8` varchar(50) DEFAULT NULL COMMENT '服务器机房2防雷器状态',
  `D9` varchar(50) DEFAULT NULL COMMENT '网络机房1防雷器状态',
  `D10` varchar(50) DEFAULT NULL COMMENT '网络机房2防雷器状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_fanglei
-- ----------------------------
INSERT INTO `tc_fanglei` VALUES ('998000023', '998', '2015-07-07 12:00:00', '模拟量', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');

-- ----------------------------
-- Table structure for `tc_jinshui`
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
INSERT INTO `tc_jinshui` VALUES ('998000032', '998', '2015-07-07 12:00:00', '状态量', '正常');

-- ----------------------------
-- Table structure for `tc_kongtiao`
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
INSERT INTO `tc_kongtiao` VALUES ('998000026', '998', '2015-07-07 12:00:00', '模拟量/状态量', '12', '34', '56', '78', '90', '98', '76', '54', '32', '12', '34', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');
INSERT INTO `tc_kongtiao` VALUES ('998000025', '998', '2015-07-07 12:00:00', '模拟量/状态量', '12', '34', '56', '78', '90', '98', '76', '54', '32', '12', '34', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');
INSERT INTO `tc_kongtiao` VALUES ('998000024', '998', '2015-07-07 12:00:00', '模拟量/状态量', '12', '34', '56', '78', '90', '98', '76', '54', '32', '12', '34', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');
INSERT INTO `tc_kongtiao` VALUES ('998000030', '998', '2015-07-07 12:00:00', '模拟量/状态量', '12', '34', '56', '78', '90', '98', '76', '54', '32', '12', '34', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');
INSERT INTO `tc_kongtiao` VALUES ('998000028', '998', '2015-07-07 12:00:00', '模拟量/状态量', '12', '34', '56', '78', '90', '98', '76', '54', '32', '12', '34', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');
INSERT INTO `tc_kongtiao` VALUES ('998000029', '998', '2015-07-07 12:00:00', '模拟量/状态量', '12', '34', '56', '78', '90', '98', '76', '54', '32', '12', '34', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');
INSERT INTO `tc_kongtiao` VALUES ('998000027', '998', '2015-07-07 12:00:00', '模拟量/状态量', '12', '34', '56', '78', '90', '98', '76', '54', '32', '12', '34', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');

-- ----------------------------
-- Table structure for `tc_lietougui`
-- ----------------------------
DROP TABLE IF EXISTS `tc_lietougui`;
CREATE TABLE `tc_lietougui` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `A1` varchar(50) DEFAULT NULL COMMENT '源1 AB线电压(V)',
  `A2` varchar(50) DEFAULT NULL COMMENT '源1 BC线电压(V)',
  `A3` varchar(50) DEFAULT NULL COMMENT '源1 CA线电压(V)',
  `A4` varchar(50) DEFAULT NULL COMMENT '源1 A相电压(V)',
  `A5` varchar(50) DEFAULT NULL COMMENT '源1 B相电压(V)',
  `A6` varchar(50) DEFAULT NULL COMMENT '源1 C相电压(V)',
  `A7` varchar(50) DEFAULT NULL COMMENT '源1 A相电流(V)',
  `A8` varchar(50) DEFAULT NULL COMMENT '源1 B相电流(V)',
  `A9` varchar(50) DEFAULT NULL COMMENT '源1 C相电流(V)',
  `A10` varchar(50) DEFAULT NULL COMMENT '源1 AB相额定电流(A)',
  `A11` varchar(50) DEFAULT NULL COMMENT '源1 BC相额定电流(A)',
  `A12` varchar(50) DEFAULT NULL COMMENT '源1 CA相额定电流(A)',
  `A13` varchar(50) DEFAULT NULL COMMENT '源1 A相电流百分比(%)',
  `A14` varchar(50) DEFAULT NULL COMMENT '源1 B相电流百分比(%)',
  `A15` varchar(50) DEFAULT NULL COMMENT '源1 C相电流百分比(%)',
  `A16` varchar(50) DEFAULT NULL COMMENT '源1 零线电流(A)',
  `A17` varchar(50) DEFAULT NULL COMMENT '源1 频率(Hz)',
  `A18` varchar(50) DEFAULT NULL COMMENT '源1 A相电能(Kwh)',
  `A19` varchar(50) DEFAULT NULL COMMENT '源1 B相电能(Kwh)',
  `A20` varchar(50) DEFAULT NULL COMMENT '源1 C相电能(Kwh)',
  `A21` varchar(50) DEFAULT NULL COMMENT '源1 A相电压谐波百分比(%)',
  `A22` varchar(50) DEFAULT NULL COMMENT '源1 B相电压谐波百分比(%)',
  `A23` varchar(50) DEFAULT NULL COMMENT '源1 C相电压谐波百分比(%)',
  `A24` varchar(50) DEFAULT NULL COMMENT '源1 A相电流谐波百分比(%)',
  `A25` varchar(50) DEFAULT NULL COMMENT '源1 B相电流谐波百分比(%)',
  `A26` varchar(50) DEFAULT NULL COMMENT '源1 C相电流谐波百分比(%)',
  `A27` varchar(50) DEFAULT NULL COMMENT '源1 A相有功功率(kW)',
  `A28` varchar(50) DEFAULT NULL COMMENT '源1 B相有功功率(kW)',
  `A29` varchar(50) DEFAULT NULL COMMENT '源1 C相有功功率(kW)',
  `A30` varchar(50) DEFAULT NULL COMMENT '源1 A相视在功率(kVA)',
  `A31` varchar(50) DEFAULT NULL COMMENT '源1 B相视在功率(kVA)',
  `A32` varchar(50) DEFAULT NULL COMMENT '源1 C相视在功率(kVA)',
  `A33` varchar(50) DEFAULT NULL COMMENT '源1 A相功率因素',
  `A34` varchar(50) DEFAULT NULL COMMENT '源1 B相功率因素',
  `A35` varchar(50) DEFAULT NULL COMMENT '源1 C相功率因素'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_lietougui
-- ----------------------------
INSERT INTO `tc_lietougui` VALUES ('998000018', '998', '2015-07-07 12:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35');
INSERT INTO `tc_lietougui` VALUES ('998000019', '998', '2015-07-07 12:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35');
INSERT INTO `tc_lietougui` VALUES ('998000020', '998', '2015-07-07 12:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35');
INSERT INTO `tc_lietougui` VALUES ('998000021', '998', '2015-07-07 12:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35');
INSERT INTO `tc_lietougui` VALUES ('998000022', '998', '2015-07-07 12:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35');
INSERT INTO `tc_lietougui` VALUES ('998000017', '998', '2015-07-07 12:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35');

-- ----------------------------
-- Table structure for `tc_loushui`
-- ----------------------------
DROP TABLE IF EXISTS `tc_loushui`;
CREATE TABLE `tc_loushui` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `A13` varchar(50) DEFAULT NULL COMMENT '漏水点位置',
  `A17` varchar(50) DEFAULT NULL COMMENT '红绿线电阻(绳长度)',
  `D5` varchar(50) DEFAULT NULL COMMENT '漏水检测',
  `D6` varchar(50) DEFAULT NULL COMMENT '灰尘及小水珠检测',
  `D7` varchar(50) DEFAULT NULL COMMENT '漏水绳检测'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_loushui
-- ----------------------------
INSERT INTO `tc_loushui` VALUES ('998000031', '998', '2015-07-07 12:00:00', '模拟/状态量', '2', '3', '正常', '正常', '正常');

-- ----------------------------
-- Table structure for `tc_menjin1`
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
INSERT INTO `tc_menjin1` VALUES ('998000037', '998', '2015-07-07 12:00:00', '模拟量', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');

-- ----------------------------
-- Table structure for `tc_menjin2`
-- ----------------------------
DROP TABLE IF EXISTS `tc_menjin2`;
CREATE TABLE `tc_menjin2` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '机房入口防火门状态',
  `D2` varchar(50) DEFAULT NULL COMMENT '机房缓冲区玻璃门状态',
  `D3` varchar(50) DEFAULT NULL COMMENT '服务器机房1号门状态',
  `D4` varchar(50) DEFAULT NULL COMMENT '小型机机房1号门状态',
  `D5` varchar(50) DEFAULT NULL COMMENT '机房入口防火门按钮开门',
  `D7` varchar(50) DEFAULT NULL COMMENT '机房缓冲区玻璃门按钮开门',
  `D9` varchar(50) DEFAULT NULL COMMENT '服务器机房1号门按钮开门',
  `D11` varchar(50) DEFAULT NULL COMMENT '小型机机房1号门按钮开门'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_menjin2
-- ----------------------------
INSERT INTO `tc_menjin2` VALUES ('998000037', '998', '2015-07-07 12:00:00', '模拟量', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');

-- ----------------------------
-- Table structure for `tc_menjin3`
-- ----------------------------
DROP TABLE IF EXISTS `tc_menjin3`;
CREATE TABLE `tc_menjin3` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '电池间1防火门状态',
  `D2` varchar(50) DEFAULT NULL COMMENT 'UPS电源间防火门状态',
  `D3` varchar(50) DEFAULT NULL COMMENT '小型机机房2号玻璃门状态',
  `D4` varchar(50) DEFAULT NULL COMMENT '网络机房玻璃门状态',
  `D5` varchar(50) DEFAULT NULL COMMENT '电池间1防火门按钮开门',
  `D7` varchar(50) DEFAULT NULL COMMENT 'UPS电源间防火门按钮开门',
  `D9` varchar(50) DEFAULT NULL COMMENT '小型机机房2号玻璃门按钮开门',
  `D11` varchar(50) DEFAULT NULL COMMENT '网络机房防火门按钮开门'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_menjin3
-- ----------------------------
INSERT INTO `tc_menjin3` VALUES ('998000037', '998', '2015-07-07 12:00:00', '状态量', '正常', '正常', '正常', '正常', '正常', '正常', '正常', '正常');

-- ----------------------------
-- Table structure for `tc_menjin4`
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
INSERT INTO `tc_menjin4` VALUES ('998000037', '998', '2015-07-07 12:00:00', '状态量', '正常', '正常');

-- ----------------------------
-- Table structure for `tc_menjin5`
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
INSERT INTO `tc_menjin5` VALUES ('998000037', '998', '2015-07-07 12:00:00', '状态量', '正常', '正常', '正常', '正常', '正常', '正常');

-- ----------------------------
-- Table structure for `tc_peidiangui`
-- ----------------------------
DROP TABLE IF EXISTS `tc_peidiangui`;
CREATE TABLE `tc_peidiangui` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `A1` varchar(50) DEFAULT NULL COMMENT '相电压Ua',
  `A2` varchar(50) DEFAULT NULL COMMENT '线电压Uca',
  `A3` varchar(50) DEFAULT NULL COMMENT 'A相电流',
  `A4` varchar(50) DEFAULT NULL COMMENT 'A相有功功率P',
  `A5` varchar(50) DEFAULT NULL COMMENT 'A相功率因数',
  `A6` varchar(50) DEFAULT NULL COMMENT 'A相无功功率Q',
  `A7` varchar(50) DEFAULT NULL COMMENT 'A相视在功率S'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_peidiangui
-- ----------------------------
INSERT INTO `tc_peidiangui` VALUES ('998000003', '998', '2015-07-02 12:00:00', '模拟量', '10V', '10V', '10A', '10P', '10%', '9P', '10P');
INSERT INTO `tc_peidiangui` VALUES ('998000004', '998', '2015-07-02 12:00:00', '模拟量', '9v', '9v', '9a', '9p', '9%', '9p', '9p');
INSERT INTO `tc_peidiangui` VALUES ('998000005', '998', '2015-07-02 12:00:00', '模拟量', '8v', '8v', '8a', '8p', '8%', '8p', '8p');
INSERT INTO `tc_peidiangui` VALUES ('998000006', '998', '2015-07-02 12:00:00', '模拟量', '7v', '7v', '7a', '7p', '7%', '7p', '7p');
INSERT INTO `tc_peidiangui` VALUES ('998000007', '998', '2015-07-02 12:00:00', '模拟量', '6v', '6v', '6a', '6p', '6%', '6p', '6p');
INSERT INTO `tc_peidiangui` VALUES ('998000008', '998', '2015-07-02 12:00:00', '模拟量', '5v', '5v', '5a', '5p', '5%', '5p', '5p');

-- ----------------------------
-- Table structure for `tc_sts`
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
  `A23` varchar(50) DEFAULT NULL COMMENT 'A相负载百分比',
  `A24` varchar(50) DEFAULT NULL COMMENT 'B相负载百分比',
  `A25` varchar(50) DEFAULT NULL COMMENT 'C相负载百分比',
  `A26` varchar(50) DEFAULT NULL COMMENT '总视在功率',
  `A27` varchar(50) DEFAULT NULL COMMENT '总有功功率',
  `A28` varchar(50) DEFAULT NULL COMMENT 'A相功率因数',
  `A29` varchar(50) DEFAULT NULL COMMENT 'B相功率因数',
  `A30` varchar(50) DEFAULT NULL COMMENT 'C相功率因数',
  `A31` varchar(50) DEFAULT NULL COMMENT '零序电流'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_sts
-- ----------------------------
INSERT INTO `tc_sts` VALUES ('998000012', '998', '2015-07-06 15:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '8', '9', '9', '9', '0', '9', '9', '9', '8', '12', '7', '7', '6', '6', '5', '12', '5', '45', '4', '4', '4', '5', '5');

-- ----------------------------
-- Table structure for `tc_stskaiguan1`
-- ----------------------------
DROP TABLE IF EXISTS `tc_stskaiguan1`;
CREATE TABLE `tc_stskaiguan1` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '服务器机房列头柜2开关A相',
  `D2` varchar(50) DEFAULT NULL COMMENT '服务器机房列头柜2开关B相',
  `D3` varchar(50) DEFAULT NULL COMMENT '服务器机房列头柜2开关C相',
  `D4` varchar(50) DEFAULT NULL COMMENT '备用A相',
  `D5` varchar(50) DEFAULT NULL COMMENT '备用B相',
  `D6` varchar(50) DEFAULT NULL COMMENT '备用C相',
  `D7` varchar(50) DEFAULT NULL COMMENT '二层配电箱开关A相',
  `D8` varchar(50) DEFAULT NULL COMMENT '二层配电箱开关B相'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_stskaiguan1
-- ----------------------------
INSERT INTO `tc_stskaiguan1` VALUES ('998000011', '998', '2015-07-06 10:00:00', '模拟量', '1', '1', '1', '1', '1', '1', '1', '正常');

-- ----------------------------
-- Table structure for `tc_stskaiguan2`
-- ----------------------------
DROP TABLE IF EXISTS `tc_stskaiguan2`;
CREATE TABLE `tc_stskaiguan2` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '二层配电箱开关C相',
  `D2` varchar(50) DEFAULT NULL COMMENT '网络机房列头柜2开关A相',
  `D3` varchar(50) DEFAULT NULL COMMENT '网络机房列头柜2开关B相',
  `D4` varchar(50) DEFAULT NULL COMMENT '网络机房列头柜2开关C相',
  `D5` varchar(50) DEFAULT NULL COMMENT '备用A相',
  `D6` varchar(50) DEFAULT NULL COMMENT '备用B相',
  `D7` varchar(50) DEFAULT NULL COMMENT '备用C相',
  `D8` varchar(50) DEFAULT NULL COMMENT '小型机电源开关'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_stskaiguan2
-- ----------------------------
INSERT INTO `tc_stskaiguan2` VALUES ('998000011', '998', '2015-07-06 10:00:00', '模拟量', '2', '2', '2', '2', '2', '2', '2', '正常');

-- ----------------------------
-- Table structure for `tc_ups`
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
  `A20` varchar(50) DEFAULT NULL COMMENT '旁路频率(Hz)',
  `A21` varchar(50) DEFAULT NULL COMMENT '电池电流(A)',
  `A22` varchar(50) DEFAULT NULL COMMENT 'A相输出功率因数',
  `A23` varchar(50) DEFAULT NULL COMMENT 'B相输出功率因数',
  `A24` varchar(50) DEFAULT NULL COMMENT 'C相输出功率因数',
  `A25` varchar(50) DEFAULT NULL COMMENT 'A相输出峰值比',
  `A26` varchar(50) DEFAULT NULL COMMENT 'B相输出峰值比',
  `A27` varchar(50) DEFAULT NULL COMMENT 'C相输出峰值比'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_ups
-- ----------------------------
INSERT INTO `tc_ups` VALUES ('998000009', '998', '2015-07-03 14:00:00', '模拟量', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `tc_ups` VALUES ('998000010', '998', '2015-07-03 14:00:00', '模拟量', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2');

-- ----------------------------
-- Table structure for `tc_wenshidu`
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
INSERT INTO `tc_wenshidu` VALUES ('998000033', '998', '2015-07-07 12:00:00', '模拟量', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35', '36');

-- ----------------------------
-- Table structure for `tc_xiaofang`
-- ----------------------------
DROP TABLE IF EXISTS `tc_xiaofang`;
CREATE TABLE `tc_xiaofang` (
  `mosn` int(11) DEFAULT NULL,
  `dmsn` int(11) DEFAULT NULL,
  `fCollectTime` char(19) DEFAULT '',
  `fPartID` varchar(50) DEFAULT NULL,
  `D1` varchar(50) DEFAULT NULL COMMENT '消防'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tc_xiaofang
-- ----------------------------
INSERT INTO `tc_xiaofang` VALUES ('998000035', '998', '2015-07-07 12:00:00', '模拟量', '正常');

-- ----------------------------
-- Table structure for `tc_xinfengji`
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
INSERT INTO `tc_xinfengji` VALUES ('998000034', '998', '2015-07-07 12:00:00', '状态量', '正常', '正常', '正常', '正常', '正常');
