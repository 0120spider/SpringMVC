/*
Navicat MySQL Data Transfer

Source Server         : linux
Source Server Version : 50736
Source Host           : 192.168.168.138:3306
Source Database       : work

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2024-01-15 10:07:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for movie
-- ----------------------------
DROP TABLE IF EXISTS `movie`;
CREATE TABLE `movie` (
  `movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(40) DEFAULT NULL,
  `movie_pic` varchar(255) DEFAULT NULL,
  `movie_start` datetime DEFAULT NULL,
  `movie_end` datetime DEFAULT NULL,
  `movie_length` int(11) DEFAULT NULL,
  PRIMARY KEY (`movie_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of movie
-- ----------------------------
INSERT INTO `movie` VALUES ('10', '张三', '女', '2024-01-18 12:00:00', '2024-01-18 13:00:00', '3600');
INSERT INTO `movie` VALUES ('11', '李四', '男', '2024-01-13 19:01:00', '2024-01-31 19:01:00', '3600');
INSERT INTO `movie` VALUES ('12', '王五', '男', '2024-01-13 19:01:00', '2024-01-31 19:01:00', '3600');
INSERT INTO `movie` VALUES ('13', '赵六', '男', '2024-01-13 19:01:00', '2024-01-31 19:01:00', '3600');
INSERT INTO `movie` VALUES ('14', '徐狗吧', '女生', '2024-01-18 00:00:00', '2024-01-31 09:14:00', '7200');
