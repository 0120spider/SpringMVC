/*
Navicat MySQL Data Transfer

Source Server         : linux
Source Server Version : 50736
Source Host           : 192.168.168.138:3306
Source Database       : work

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2024-01-15 10:07:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hourse
-- ----------------------------
DROP TABLE IF EXISTS `hourse`;
CREATE TABLE `hourse` (
  `hourse_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '放映厅id',
  `hourse_name` varchar(40) DEFAULT NULL COMMENT '放映厅名字',
  PRIMARY KEY (`hourse_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of hourse
-- ----------------------------
INSERT INTO `hourse` VALUES ('1', '党员会议厅');
INSERT INTO `hourse` VALUES ('2', '1-201会议室');
INSERT INTO `hourse` VALUES ('3', '领导办公室');
INSERT INTO `hourse` VALUES ('4', '131会议室');
INSERT INTO `hourse` VALUES ('5', '巨幕全景厅');
