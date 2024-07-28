/*
Navicat MySQL Data Transfer

Source Server         : linux
Source Server Version : 50736
Source Host           : 192.168.168.138:3306
Source Database       : work

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2024-01-15 10:07:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for round
-- ----------------------------
DROP TABLE IF EXISTS `round`;
CREATE TABLE `round` (
  `round_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '场次id',
  `hourse_id` int(11) DEFAULT NULL COMMENT '放映厅id',
  `movie_id` int(11) DEFAULT NULL COMMENT '电影id',
  `round_start` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '开始时间',
  `round_end` timestamp NOT NULL DEFAULT '2000-10-10 10:09:09' COMMENT '结束时间',
  `round_price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`round_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of round
-- ----------------------------
INSERT INTO `round` VALUES ('35', '1', '10', '2024-01-18 12:10:00', '2024-01-18 13:10:00', null);
INSERT INTO `round` VALUES ('36', '3', '11', '2024-01-18 19:01:00', '2024-01-18 20:01:00', null);
INSERT INTO `round` VALUES ('37', '3', '12', '2024-01-18 10:01:00', '2024-01-18 11:01:00', null);
INSERT INTO `round` VALUES ('38', '3', '13', '2024-01-18 06:01:00', '2024-01-18 07:01:00', null);
INSERT INTO `round` VALUES ('39', '1', '14', '2024-01-18 09:15:00', '2024-01-18 11:15:00', null);
