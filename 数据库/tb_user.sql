/*
Navicat MySQL Data Transfer

Source Server         : linux
Source Server Version : 50736
Source Host           : 192.168.168.138:3306
Source Database       : work

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2024-01-15 10:07:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'test001', '123456', 'admin');
INSERT INTO `tb_user` VALUES ('2', 'test002', '123456', 'user');
INSERT INTO `tb_user` VALUES ('3', 'test003', '123456', 'user');
INSERT INTO `tb_user` VALUES ('4', 'h001', '111', 'god');
