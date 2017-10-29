/*
 Navicat MySQL Data Transfer

 Source Server         : localMysql
 Source Server Version : 50719
 Source Host           : localhost
 Source Database       : springboot_learning

 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 10/29/2017 21:34:45 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(64) NOT NULL,
  `user_name` varchar(128) NOT NULL,
  `user_address` varchar(128) NOT NULL,
  `deleted` tinyint(4) NOT NULL DEFAULT '0',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Records of `user_info`
-- ----------------------------
BEGIN;
INSERT INTO `user_info` VALUES ('1', 'weqweqweqw', 'zjb', 'test', '0', '2017-10-29 18:29:13', '2017-10-29 18:29:13');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
