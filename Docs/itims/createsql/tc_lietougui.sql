/*
Navicat MySQL Data Transfer

Source Server         : 157.16.17.147
Source Server Version : 50512
Source Host           : 157.16.17.147:3306
Source Database       : dmsn_998

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2016-03-09 16:38:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tc_lietougui
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
INSERT INTO `tc_lietougui` VALUES ('998049023', '998', '2015-07-07 12:00:00', '模拟量', '381.3', '381.1', '381.7', '221', '220', '219.5', '13.9', '10.5', '15.7', '63', '63', '63', '21.9', '16.6', '27.1', '0', '50', '7712.1', '9813.6', '6261.3', '0.8', '0.9', '0.8', '15.1', '16.4', '13.8', '27.8', '20.3', '31.4', '30', '22.5', '33.5', '0.92', '0.9', '0.93');
INSERT INTO `tc_lietougui` VALUES ('998042289', '998', '2015-07-07 12:00:00', '模拟量', '387.7', '381.9', '375.1', '219.5', '221', '219.7', '67', '31.5', '21.5', '200', '200', '200', '33.5', '15.7', '10.7', '1000', '50', '32625.2', '31729', '26670.2', '1.5', '1.3', '2.1', '11.8', '8.6', '13.8', '141.2', '67.1', '45.6', '147.7', '69.8', '47.8', '0.95', '0.96', '0.95');
INSERT INTO `tc_lietougui` VALUES ('998049020', '998', '2015-07-07 12:00:00', '模拟量', '389', '382.2', '375.1', '220.6', '220.6', '221.5', '41.5', '60.5', '29.5', '200', '200', '200', '20.7', '30', '14.7', '0', '50', '37785.7', '30097.6', '32990.2', '1.8', '2.4', '1.8', '6.6', '13.9', '13.7', '91.8', '126.7', '58.5', '91.8', '133.7', '64.9', '1', '0.94', '0.9');
INSERT INTO `tc_lietougui` VALUES ('998049022', '998', '2015-07-07 12:00:00', '模拟量', '382.4', '382.4', '383.2', '220.8', '220.4', '222.3', '42', '52.2', '43.2', '250', '250', '250', '16.3', '20.8', '17.2', '0', '50', '21503.2', '35864.3', '28488.1', '1.2', '0.8', '0.8', '14', '7.1', '11.4', '86.3', '110.8', '92.8', '92.8', '116', '96.6', '0.93', '0.95', '0.96');
INSERT INTO `tc_lietougui` VALUES ('998049024', '998', '2015-07-07 12:00:00', '模拟量', '382.8', '381.9', '383.2', '221.2', '219.7', '221.7', '13.3', '13.2', '20.2', '63', '63', '63', '21.1', '22', '24.9', '0', '50', '10303.2', '9551.1', '7522.5', '1.3', '1.1', '1.3', '15.5', '14.8', '15.7', '26.7', '26.5', '40.3', '28.9', '28.2', '43.5', '0.92', '0.93', '0.92');
INSERT INTO `tc_lietougui` VALUES ('998049021', '998', '2015-07-07 12:00:00', '模拟量', '382.8', '383.2', '384.1', '221.7', '221.5', '222.1', '45', '51.6', '40.8', '250', '250', '250', '17.7', '20.6', '16', '0', '49.9', '24745', '34974.9', '31032.1', '1.4', '1.6', '1.4', '15.5', '7.6', '12.5', '94.1', '108.9', '87', '100.5', '115.3', '90.8', '0.93', '0.94', '0.95');
