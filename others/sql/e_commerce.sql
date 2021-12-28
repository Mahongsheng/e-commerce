/*
 Navicat MySQL Data Transfer

 Source Server         : 阿里云RDS
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : rm-2ze9yhykfp2r5m1l9jo.mysql.rds.aliyuncs.com:3306
 Source Schema         : e_commerce

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 28/12/2021 20:00:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for brd_brand
-- ----------------------------
DROP TABLE IF EXISTS `brd_brand`;
CREATE TABLE `brd_brand`  (
  `brd_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT ' 主键',
  `man_id` int(11) NULL DEFAULT NULL COMMENT '公司信息，外键关联man表主键',
  `name_en` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司英文名',
  `name_cn` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司中文名',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`brd_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '品牌信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of brd_brand
-- ----------------------------
INSERT INTO `brd_brand` VALUES (1, 1, 'Apple', '苹果', NULL, NULL, 'admin', '2021-05-18 16:11:29', NULL, '', NULL);
INSERT INTO `brd_brand` VALUES (2, 1, 'Google', '谷歌', NULL, NULL, 'admin', '2020-07-21 20:14:43', NULL, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1595333687172.jpeg?Expires=1910693682&OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&Signature=aWYYaJcB8z57TJOCpQRwR2C16GA%3D', NULL);
INSERT INTO `brd_brand` VALUES (3, 1, 'fake apple', '', 'admin', '2020-07-24 14:53:12', 'admin', '2020-07-24 14:53:12', NULL, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1595573592737.jpeg?Expires=1910933589&OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&Signature=AYtWZn6noOpu%2FuApI81oMzRLC9k%3D', '');

-- ----------------------------
-- Table structure for cat_category
-- ----------------------------
DROP TABLE IF EXISTS `cat_category`;
CREATE TABLE `cat_category`  (
  `cat_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `cat_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `cat_father_id` int(11) NULL DEFAULT NULL COMMENT '父分类ID',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`cat_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cat_category
-- ----------------------------
INSERT INTO `cat_category` VALUES (1, '大家电', NULL, 'admin', '2020-07-06 17:18:31', NULL, NULL);
INSERT INTO `cat_category` VALUES (2, '空调', 1, 'admin', '2020-07-07 11:39:05', NULL, NULL);
INSERT INTO `cat_category` VALUES (3, '洗衣机', 1, 'admin', '2020-07-07 15:04:19', NULL, NULL);
INSERT INTO `cat_category` VALUES (4, '化妆品', NULL, 'admin', '2020-07-07 15:04:41', NULL, NULL);
INSERT INTO `cat_category` VALUES (5, '粉底', 4, 'admin', '2020-07-07 15:05:01', NULL, NULL);
INSERT INTO `cat_category` VALUES (6, '电子用品', NULL, 'admin', '2020-07-21 15:04:16', NULL, NULL);
INSERT INTO `cat_category` VALUES (7, '手机', 6, 'admin', '2020-07-21 15:04:29', NULL, NULL);

-- ----------------------------
-- Table structure for cdm_code_master
-- ----------------------------
DROP TABLE IF EXISTS `cdm_code_master`;
CREATE TABLE `cdm_code_master`  (
  `cdm_id` int(10) UNSIGNED NOT NULL COMMENT ' 主键',
  `code_type` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典类型',
  `description` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用途描述',
  `type_cd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '编码',
  `code_val` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '编码值',
  `seq_no` int(11) NULL DEFAULT NULL COMMENT '排序',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`cdm_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '数据字典表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cdm_code_master
-- ----------------------------
INSERT INTO `cdm_code_master` VALUES (1, 'SEX', '用户性别', 'SE', '男', NULL, NULL, NULL, 'admin', '2021-12-25 08:45:31', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for drp_dropship_price
-- ----------------------------
DROP TABLE IF EXISTS `drp_dropship_price`;
CREATE TABLE `drp_dropship_price`  (
  `drp_id` int(10) UNSIGNED NOT NULL COMMENT ' 主键',
  `ofp_id` int(11) NULL DEFAULT NULL COMMENT '商品价格id',
  `dsr_id` int(11) NULL DEFAULT NULL COMMENT '借卖方id',
  `war_id` int(11) NULL DEFAULT NULL COMMENT '仓库id',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`drp_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '借卖价格表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dsr_dropshipper
-- ----------------------------
DROP TABLE IF EXISTS `dsr_dropshipper`;
CREATE TABLE `dsr_dropshipper`  (
  `dsr_id` int(10) UNSIGNED NOT NULL COMMENT ' 主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT ' 借卖方名称',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `register_date` timestamp NULL DEFAULT NULL COMMENT '注册时间',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `phone_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`dsr_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '借卖方表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dsr_dropshipper
-- ----------------------------
INSERT INTO `dsr_dropshipper` VALUES (1, 'cmj', '', NULL, 'admin', '2021-12-25 08:43:15', NULL, '', '', NULL, 'abc', '123');
INSERT INTO `dsr_dropshipper` VALUES (2, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dsr_dropshipper` VALUES (3, '3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dsr_dropshipper` VALUES (4, 'test', '', NULL, '', NULL, NULL, '', '', NULL, 'test00', 'test');
INSERT INTO `dsr_dropshipper` VALUES (11, 'qiuxiaolin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dsr_dropshipper` VALUES (22, 'qiuxiaolin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dsr_dropshipper` VALUES (33, 'qiuxiaolin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dsr_dropshipper` VALUES (44, 'qiuxiaolin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dsr_dropshipper` VALUES (55, 'qiuxiaolin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dsr_dropshipper` VALUES (66, 'qiuxiaolin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dsr_dropshipper` VALUES (10086, 'updateqxl', 'qxl', NULL, NULL, NULL, 0, NULL, NULL, NULL, '10086', '10086');
INSERT INTO `dsr_dropshipper` VALUES (10087, 'hideonbush', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-17 11:29:15', 'qiuxiaolin@qq.com', NULL);
INSERT INTO `dsr_dropshipper` VALUES (10088, 'string', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-19 13:05:57', 'string', NULL);
INSERT INTO `dsr_dropshipper` VALUES (10089, 'string', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-19 13:09:01', 'string', NULL);
INSERT INTO `dsr_dropshipper` VALUES (10090, 'string', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-19 13:19:51', 'string', NULL);

-- ----------------------------
-- Table structure for eba_ebay_authprization
-- ----------------------------
DROP TABLE IF EXISTS `eba_ebay_authprization`;
CREATE TABLE `eba_ebay_authprization`  (
  `eba_id` int(10) UNSIGNED NOT NULL COMMENT ' 主键',
  `str_id` int(11) NULL DEFAULT NULL COMMENT '网店ID',
  `app_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ebay账号id',
  `secret_key` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ebay密钥',
  `token` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT 'ebay TOKEN',
  `last_modified_time` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单更新时间\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `exp_date` datetime NULL DEFAULT NULL COMMENT 'token失效时间',
  `cancel_date` datetime NULL DEFAULT NULL COMMENT '取消授权时间',
  `account_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`eba_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '网店授权记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of eba_ebay_authprization
-- ----------------------------
INSERT INTO `eba_ebay_authprization` VALUES (123, 0, '123', '123', '123', '123', '123', '2020-07-13 11:08:55', '123', '2020-07-13 11:08:55', 123, '123', '1', '2020-07-13 11:08:55', '2020-07-13 11:08:55', '123');
INSERT INTO `eba_ebay_authprization` VALUES (234, 0, '123', '123', '123', '123', '123', '2020-07-13 11:08:55', '123', '2020-07-13 11:08:55', 123, '123', '1', '2020-07-13 11:08:55', '2020-07-13 11:08:55', '123');
INSERT INTO `eba_ebay_authprization` VALUES (235, 0, '123', '123', '123', '123', '123', '2020-07-13 11:08:55', '123', '2020-07-13 11:08:55', 123, '123', '1', '2020-07-13 11:08:55', '2020-07-13 11:08:55', '123');
INSERT INTO `eba_ebay_authprization` VALUES (236, 0, '123', '123', '123', '123', '123', '2020-07-13 11:08:55', '123', '2020-07-13 11:08:55', 123, '123', '1', '2020-07-13 11:08:55', '2020-07-13 11:08:55', '123');
INSERT INTO `eba_ebay_authprization` VALUES (237, 0, '123', '123', '123', '123', '123', '2020-07-13 11:08:55', '123', '2020-07-13 11:08:55', 123, '123', '1', '2020-07-13 11:08:55', '2020-07-13 11:08:55', '123');
INSERT INTO `eba_ebay_authprization` VALUES (238, 0, '123', '123', '123', '123', '123', '2020-07-13 11:08:55', '123', '2020-07-13 11:08:55', 123, '123', '1', '2020-07-13 11:08:55', '2020-07-13 11:08:55', '123');
INSERT INTO `eba_ebay_authprization` VALUES (239, 0, '123', '123', '123', '123', '123', '2020-07-13 11:08:55', '123', '2020-07-13 11:08:55', 123, '123', '1', '2020-07-13 11:08:55', '2020-07-13 11:08:55', '123');

-- ----------------------------
-- Table structure for freight_cost
-- ----------------------------
DROP TABLE IF EXISTS `freight_cost`;
CREATE TABLE `freight_cost`  (
  `province_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '国家及省份编码的组合，作为主键',
  `province_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `shipping_fee` double(11, 2) NULL COMMENT '运费',
  PRIMARY KEY (`province_code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of freight_cost
-- ----------------------------
INSERT INTO `freight_cost` VALUES ('110000', '北京', 17.00);
INSERT INTO `freight_cost` VALUES ('120000', '天津', 19.00);
INSERT INTO `freight_cost` VALUES ('130000', '河北省', 14.00);
INSERT INTO `freight_cost` VALUES ('140000', '山西省', 13.00);
INSERT INTO `freight_cost` VALUES ('150000', '内蒙古自治区', 14.00);
INSERT INTO `freight_cost` VALUES ('210000', '辽宁省', 13.00);
INSERT INTO `freight_cost` VALUES ('220000', '吉林省', 15.00);
INSERT INTO `freight_cost` VALUES ('230000', '黑龙江省', 13.00);
INSERT INTO `freight_cost` VALUES ('310000', '上海', 12.00);
INSERT INTO `freight_cost` VALUES ('320000', '江苏省', 11.00);
INSERT INTO `freight_cost` VALUES ('330000', '浙江省', 10.00);
INSERT INTO `freight_cost` VALUES ('340000', '安徽省', 17.00);
INSERT INTO `freight_cost` VALUES ('350000', '福建省', 15.00);
INSERT INTO `freight_cost` VALUES ('360000', '江西省', 16.00);
INSERT INTO `freight_cost` VALUES ('370000', '山东省', 15.00);
INSERT INTO `freight_cost` VALUES ('410000', '河南省', 16.00);
INSERT INTO `freight_cost` VALUES ('420000', '湖北省', 14.00);
INSERT INTO `freight_cost` VALUES ('430000', '湖南省', 16.00);
INSERT INTO `freight_cost` VALUES ('440000', '广东省', 15.00);
INSERT INTO `freight_cost` VALUES ('450000', '广西壮族自治区', 10.00);
INSERT INTO `freight_cost` VALUES ('460000', '海南省', 16.00);
INSERT INTO `freight_cost` VALUES ('500000', '重庆', 19.00);
INSERT INTO `freight_cost` VALUES ('510000', '四川省', 17.00);
INSERT INTO `freight_cost` VALUES ('520000', '贵州省', 18.00);
INSERT INTO `freight_cost` VALUES ('530000', '云南省', 11.00);
INSERT INTO `freight_cost` VALUES ('540000', '西藏自治区', 11.00);
INSERT INTO `freight_cost` VALUES ('610000', '陕西省', 14.00);
INSERT INTO `freight_cost` VALUES ('620000', '甘肃省', 16.00);
INSERT INTO `freight_cost` VALUES ('630000', '青海省', 17.00);
INSERT INTO `freight_cost` VALUES ('640000', '宁夏回族自治区', 18.00);
INSERT INTO `freight_cost` VALUES ('650000', '新疆维吾尔自治区', 19.00);
INSERT INTO `freight_cost` VALUES ('710000', '台湾省', 13.00);
INSERT INTO `freight_cost` VALUES ('810000', '香港特别行政区', 16.00);
INSERT INTO `freight_cost` VALUES ('820000', '澳门特别行政区', 14.00);
INSERT INTO `freight_cost` VALUES ('990000', '海外', 13.00);
INSERT INTO `freight_cost` VALUES ('ChinaGuangXi', NULL, 20.00);
INSERT INTO `freight_cost` VALUES ('ChinaHeNan', NULL, 10.00);
INSERT INTO `freight_cost` VALUES ('ChinaLiaoNing', NULL, 0.00);
INSERT INTO `freight_cost` VALUES ('shanghai', NULL, 50.00);
INSERT INTO `freight_cost` VALUES ('taiwan', NULL, 100.00);

-- ----------------------------
-- Table structure for goa_government_area
-- ----------------------------
DROP TABLE IF EXISTS `goa_government_area`;
CREATE TABLE `goa_government_area`  (
  `goa_id` int(10) UNSIGNED NOT NULL COMMENT ' 主键',
  `zip_code` int(11) NULL DEFAULT NULL COMMENT '右边',
  `state` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '洲',
  `state_shorthand` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '洲简称',
  `city` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`goa_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '地区表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for img_image
-- ----------------------------
DROP TABLE IF EXISTS `img_image`;
CREATE TABLE `img_image`  (
  `img_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT ' 主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名字',
  `width` int(11) NULL DEFAULT NULL COMMENT '图片宽，pixel',
  `height` int(11) NULL DEFAULT NULL COMMENT '图片高，pixel',
  `uri` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片地址',
  `type_cd` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'O - 原图 M - 中图 （用于列表) L - 大图 (用于详情页) M2 - 中图(2x) L2 - 大图(2x)\r\n',
  `entity_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联表的主键id',
  `entity_cd` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联自定义的code，PM表示商品类主图',
  `seq_no` int(11) NULL DEFAULT NULL COMMENT '如果一个产品有多图时，要按小到大的顺序进行显示\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`img_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '图片表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of img_image
-- ----------------------------
INSERT INTO `img_image` VALUES (2, '1', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200721item-detail-4.jpg', NULL, '16', 'PM', 1, NULL, NULL, NULL, NULL, NULL, NULL, '1');
INSERT INTO `img_image` VALUES (3, '1', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200721item-detail-2.jpg', NULL, '16', '', 2, NULL, NULL, NULL, NULL, NULL, NULL, '1');
INSERT INTO `img_image` VALUES (4, '1', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200721item-detail-3.jpg', NULL, '16', NULL, 3, NULL, NULL, NULL, NULL, NULL, NULL, '1');
INSERT INTO `img_image` VALUES (5, '1', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200721item-detail-1.jpg', NULL, '16', 'PM', 4, NULL, NULL, NULL, NULL, NULL, NULL, '1');
INSERT INTO `img_image` VALUES (6, '20200716item-detail-1.jpg', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200721123.png', NULL, '16', 'PM', 5, '', '2020-07-16 12:16:14', NULL, NULL, NULL, NULL, '1');
INSERT INTO `img_image` VALUES (7, '20200721item-detail-1.jpg', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200721item-detail-1.jpg', NULL, '17', 'PM', 1, '', '2020-07-21 15:06:49', 'admin', '2020-07-21 15:38:54', NULL, NULL, '1');
INSERT INTO `img_image` VALUES (8, '20200721item-detail-2.jpg', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200721item-detail-2.jpg', NULL, '17', 'PM', 2, '', '2020-07-21 15:06:49', 'admin', '2020-07-21 15:38:54', NULL, NULL, '1');
INSERT INTO `img_image` VALUES (9, '20200721item-detail-4.jpg', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200721item-detail-4.jpg', NULL, '17', 'PM', 3, '', '2020-07-21 15:06:49', 'admin', '2020-07-21 15:38:54', NULL, NULL, '1');
INSERT INTO `img_image` VALUES (10, '20200721item-detail-3.jpg', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200721item-detail-3.jpg', NULL, '17', 'PM', 4, '', '2020-07-21 15:06:49', 'admin', '2020-07-21 15:38:54', NULL, NULL, '1');
INSERT INTO `img_image` VALUES (11, '20200721item-detail-1.jpg', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200721item-detail-1.jpg', NULL, '17', 'PM', 5, '', '2020-07-21 15:11:29', NULL, NULL, NULL, NULL, '0');
INSERT INTO `img_image` VALUES (13, '20200724123.png', 220, 220, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200724123.png', NULL, '12', 'PM', 1, 'admin', '2020-07-24 08:00:08', NULL, NULL, NULL, NULL, '1');
INSERT INTO `img_image` VALUES (14, '20200724item-detail-1.jpg', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200724item-detail-1.jpg', NULL, '22', 'PM', 1, 'admin', '2020-07-24 14:10:42', NULL, NULL, NULL, NULL, '1');
INSERT INTO `img_image` VALUES (15, '20200724item-detail-2.jpg', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200724item-detail-2.jpg', NULL, '22', 'PM', 2, 'admin', '2020-07-24 14:10:42', NULL, NULL, NULL, NULL, '1');
INSERT INTO `img_image` VALUES (16, '20200724item-detail-4.jpg', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200724item-detail-4.jpg', NULL, '22', 'PM', 3, 'admin', '2020-07-24 14:10:42', NULL, NULL, NULL, NULL, '1');
INSERT INTO `img_image` VALUES (17, '20200724item-detail-3.jpg', 350, 350, 'http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/20200724item-detail-3.jpg', NULL, '22', 'PM', 4, 'admin', '2020-07-24 14:10:42', NULL, NULL, NULL, NULL, '1');

-- ----------------------------
-- Table structure for man_manufacturer
-- ----------------------------
DROP TABLE IF EXISTS `man_manufacturer`;
CREATE TABLE `man_manufacturer`  (
  `man_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键，制造商ID',
  `name_en` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '制造商英文名',
  `name_cn` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '制造商中文名',
  `gmc_report_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌商认证类型 1-TUV,2-UL',
  `gmc_report_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '证书地址',
  `description` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '品牌商公司介绍',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`man_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公司信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of man_manufacturer
-- ----------------------------
INSERT INTO `man_manufacturer` VALUES (1, 'BitSoft', '北理', '1', '1', '<p>Company Introduction.</p>', 'admin', '2021-05-17 18:17:54', 'admin', '2021-05-17 18:17:54', NULL, '', '');
INSERT INTO `man_manufacturer` VALUES (2, 'ASD', 'ASD', '2', '2', 'HIDEONBUSH', '123', '2020-07-29 21:58:05', '123', '2020-07-15 21:57:59', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for mor_monitor_result
-- ----------------------------
DROP TABLE IF EXISTS `mor_monitor_result`;
CREATE TABLE `mor_monitor_result`  (
  `mor_id` int(10) UNSIGNED NOT NULL COMMENT '主键',
  `class_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类名',
  `json_string` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'Json字符串',
  `create_by` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `sts_cd` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`mor_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = ' 接口表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ofp_offer_price
-- ----------------------------
DROP TABLE IF EXISTS `ofp_offer_price`;
CREATE TABLE `ofp_offer_price`  (
  `ofp_id` int(11) NOT NULL AUTO_INCREMENT,
  `man_id` int(11) NULL DEFAULT NULL COMMENT '制造商ID',
  `effective_start_date` timestamp NULL DEFAULT NULL COMMENT '价格有效期开始时间',
  `effective_end_date` timestamp NULL DEFAULT NULL COMMENT '价格有效期结束时间',
  `pro_id` int(11) NULL DEFAULT NULL COMMENT '外键->商品ID 外键关联pro表',
  `price` decimal(8, 2) NULL DEFAULT NULL COMMENT '单价',
  `type_cd` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对应master表的PRICE_TYPE PUB - 公开借卖价 PRO - 促销价 VIP - 专享价',
  `dsr_id` int(11) NULL DEFAULT NULL COMMENT '借卖方id，关联专享价用，其他类型该字段为空',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁 ',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '有效性',
  `period` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否自动设置价格（1为自动以相同价格进入下一个周期）',
  PRIMARY KEY (`ofp_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for par_parameter
-- ----------------------------
DROP TABLE IF EXISTS `par_parameter`;
CREATE TABLE `par_parameter`  (
  `par_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `param_cd` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参数主键',
  `param_value` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参数值',
  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '参数说明',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  ` creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`par_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of par_parameter
-- ----------------------------
INSERT INTO `par_parameter` VALUES (1, 'STOCK_TIME', '7', '库存预警天数', '1', '2020-07-13 16:31:33', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `par_parameter` VALUES (5, '马洪升测试用2', '6', '马洪升测试', '1', '2020-07-13 16:45:12', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `par_parameter` VALUES (10, 'qxlTest', 'qiuxiaolin', 'Hi', 'qiuxiaolin', '2020-07-17 10:48:58', NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for pck_package_info
-- ----------------------------
DROP TABLE IF EXISTS `pck_package_info`;
CREATE TABLE `pck_package_info`  (
  `pck_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `war_id` int(11) NULL DEFAULT NULL COMMENT '仓库ID',
  `pro_id` int(11) NULL DEFAULT NULL COMMENT '绑定的 PRO_ID 与 VAR_ID 只可能有一个',
  `type_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对应master 表PAC_REGISTER M - 厂家设定 W - 仓库注册',
  `width` decimal(7, 2) NULL DEFAULT NULL COMMENT '宽 - cm',
  `height` decimal(7, 2) NULL DEFAULT NULL COMMENT '高 - cm',
  `length` decimal(7, 2) NULL DEFAULT NULL COMMENT '长 - cm',
  `weight` decimal(5, 2) NULL DEFAULT NULL COMMENT '重 - kg',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_updete_date` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `heavy_cargo` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '卡车管道',
  `logistics_company` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管道公司',
  PRIMARY KEY (`pck_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pck_package_info
-- ----------------------------
INSERT INTO `pck_package_info` VALUES (3, NULL, 1, NULL, 1.00, 1.00, 1.00, 1.00, '', '2020-07-06 10:34:47', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (4, NULL, 1, NULL, 1.00, 1.00, 1.00, 1.00, '', '2020-07-06 10:38:07', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (5, NULL, 1, NULL, 1.00, 1.00, 1.00, 1.00, '', '2020-07-06 10:41:13', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (6, NULL, 1, NULL, 123.00, 3.00, 12.00, 123.00, '', '2020-07-06 10:46:49', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (7, NULL, 1, NULL, 1.00, 1.00, 123.00, 1.00, '', '2020-07-06 10:47:52', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (8, NULL, 1, NULL, 123.00, 123.00, 123.00, 123.00, '', '2020-07-06 10:54:23', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (9, NULL, 1, NULL, 123.00, 123.00, 123.00, 123.00, '', '2020-07-06 11:00:43', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (10, NULL, 1, NULL, 1.00, 1.00, 1.00, 1.00, '', '2020-07-06 11:00:52', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (11, NULL, NULL, NULL, 123.00, 123.00, 123.00, 123.00, '', '2020-07-06 11:37:13', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (13, NULL, 16, NULL, 1.00, 1.00, 1.00, 1.00, '', '2020-07-06 12:02:48', '', '2020-07-06 14:44:52', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (15, NULL, 23, NULL, 500.00, 10.00, 10.00, 500.00, '', '2020-07-16 01:04:21', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (16, NULL, 24, NULL, 123.00, 123.00, 123.00, 123.00, '', '2020-07-16 01:28:15', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (17, NULL, 25, NULL, 1.00, 1.00, 1.00, 1.00, '', '2020-07-16 01:33:36', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (18, NULL, 28, NULL, 123.00, 3.00, 123.00, 123.00, '', '2020-07-16 01:36:57', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (19, NULL, 29, NULL, 1.00, 1.00, 12.00, 1.00, '', '2020-07-16 01:40:13', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (20, NULL, 30, NULL, 1.00, 1.00, 1.00, 1.00, '', '2020-07-16 01:44:34', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (21, NULL, 31, NULL, 1.00, 1.00, 1.00, 1.00, '', '2020-07-16 01:47:24', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (22, NULL, 32, NULL, 1.00, 1.00, 1.00, 1.00, '', '2020-07-16 11:13:03', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (23, NULL, 17, NULL, 0.50, 13.00, 10.00, 0.50, '', '2020-07-21 11:58:56', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (27, NULL, 21, NULL, 3.00, 1.00, 2.00, 3.00, 'qxl12345', '2020-07-22 17:22:13', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pck_package_info` VALUES (29, NULL, 23, NULL, 1.00, 1.00, 1.00, 1.00, 'admin', '2021-05-18 17:46:59', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for pdn_product_description
-- ----------------------------
DROP TABLE IF EXISTS `pdn_product_description`;
CREATE TABLE `pdn_product_description`  (
  `pdn_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `pro_id` int(11) NULL DEFAULT NULL COMMENT '外键->关联pro表主键',
  `type_cd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对应master表TEXTTYPE RICH_TEXT - 图文信息 SIMPLE_TEXT - 简单信息，用于 amazon SELLING_POINTS - 卖点，用于 amazon',
  `descrition` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品描述（富文本、纯文本、卖点）',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创健时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `platform_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '平台类型，ebay：2，Amazon：1',
  PRIMARY KEY (`pdn_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pdn_product_description
-- ----------------------------
INSERT INTO `pdn_product_description` VALUES (1, 13, 'RICH_TEXT', '<p>这是一<strong>个测试<u>阿斯蒂芬按时</u></strong><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1594832663105.jpeg?Expires=1910192658&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=uysO61lT6BroDHgcluVONhFPQmI%3D\"></p>', '', '2020-07-16 01:04:21', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (2, 13, 'RICH_TEXT', '<p>这是一<strong>个测试<u>阿斯蒂芬按时</u></strong><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1594832663105.jpeg?Expires=1910192658&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=uysO61lT6BroDHgcluVONhFPQmI%3D\"></p>', '', '2020-07-16 01:04:21', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (3, 24, 'RICH_TEXT', '<p>这是一<strong>个测试<u>阿斯蒂芬按时</u></strong><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1594832663105.jpeg?Expires=1910192658&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=uysO61lT6BroDHgcluVONhFPQmI%3D\"></p>', '', '2020-07-16 01:28:15', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (4, 24, 'RICH_TEXT', '<p>阿达发<strong>顺丰</strong></p>', '', '2020-07-16 01:28:15', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (5, 25, 'RICH_TEXT', '<p>这是一<strong>个测试<u>阿斯蒂芬按时</u></strong><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1594832663105.jpeg?Expires=1910192658&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=uysO61lT6BroDHgcluVONhFPQmI%3D\"></p>', '', '2020-07-16 01:33:36', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (6, 25, 'SIMPLE_TEXT', '<p>撒<strong>旦法师法</strong></p>', '', '2020-07-16 01:33:37', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (7, 28, 'RICH_TEXT', '<p>这是一<strong>个测试<u>阿斯蒂芬按时</u></strong><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1594832663105.jpeg?Expires=1910192658&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=uysO61lT6BroDHgcluVONhFPQmI%3D\"></p>', '', '2020-07-16 01:36:57', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (8, 28, 'SIMPLE_TEXT', '<p>阿萨德<strong>发三份</strong></p>', '', '2020-07-16 01:36:57', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (9, 29, 'RICH_TEXT', '<p>阿萨德发<strong>生的发的是</strong></p>', '', '2020-07-16 01:40:13', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (10, 29, 'SIMPLE_TEXT', '<p>这是一<strong>个测试<u>阿斯蒂芬按时</u></strong><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1594832663105.jpeg?Expires=1910192658&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=uysO61lT6BroDHgcluVONhFPQmI%3D\"></p>', '', '2020-07-16 01:40:13', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (11, 30, 'RICH_TEXT', '<p>按时发达三<strong>点发的s</strong></p>', '', '2020-07-16 01:44:34', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (12, 30, 'SIMPLE_TEXT', '<p>这是一<strong>个测试<u>阿斯蒂芬按时</u></strong><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1594832663105.jpeg?Expires=1910192658&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=uysO61lT6BroDHgcluVONhFPQmI%3D\"></p>', '', '2020-07-16 01:44:34', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (13, 31, 'RICH_TEXT', '<p>这是一<strong>个测试<u>阿斯蒂芬按时</u></strong><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1594832663105.jpeg?Expires=1910192658&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=uysO61lT6BroDHgcluVONhFPQmI%3D\"></p>', '', '2020-07-16 01:47:24', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (14, 31, 'SIMPLE_TEXT', '<p>这是一<strong>个测试<u>阿斯蒂芬按时</u></strong><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1594832663105.jpeg?Expires=1910192658&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=uysO61lT6BroDHgcluVONhFPQmI%3D\"></p>', '', '2020-07-16 01:47:24', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (15, 32, 'RICH_TEXT', '<p>as<strong>df</strong></p>', '', '2020-07-16 11:13:04', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (16, 32, 'SIMPLE_TEXT', '<p><strong>saebayDe</strong>scription</p>', '', '2020-07-16 11:13:04', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (17, 17, 'RICH_TEXT', '<h2 class=\"ql-align-center\"><strong>史上最强的iPhone！走过路过不要错过！</strong></h2><p><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1595303886417.jpeg?Expires=1910663885&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=gz86eem5Rhl3cI0Xw0Bk%2Bqtz0Yk%3D\"></p><p><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1595303901772.jpeg?Expires=1910663895&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=keoDqnRlP5VeZrLT5Px3PWODWmY%3D\"></p>', '', '2020-07-21 11:58:56', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (18, 17, 'SIMPLE_TEXT', '<h2 class=\"ql-align-center\"><strong>史上最强的iPhone！走过路过不要错过！</strong></h2><p><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1595303849939.jpeg?Expires=1910663844&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=tnEATnL5cF30zz3GpXmJlj4tr%2BQ%3D\"></p><p><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1595303866595.jpeg?Expires=1910663857&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=5Dw974oYBp%2FjmA5rCnOjecPEtp8%3D\"></p>', '', '2020-07-21 11:58:56', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (19, 18, 'RICH_TEXT', '', 'admin', '2020-07-21 12:54:05', 'admin', '2020-07-21 14:04:21', NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (20, 18, 'RICH_TEXT', '', 'admin', '2020-07-21 12:54:05', 'admin', '2020-07-21 14:04:21', NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (21, 19, 'RICH_TEXT', '', 'admin', '2020-07-21 20:45:13', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (22, 19, 'RICH_TEXT', '', 'admin', '2020-07-21 20:45:13', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (23, 20, 'RICH_TEXT', NULL, 'qxl12345', '2020-07-22 11:42:57', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (24, 20, 'RICH_TEXT', NULL, 'qxl12345', '2020-07-22 11:42:57', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (25, 21, 'RICH_TEXT', NULL, 'qxl12345', '2020-07-22 17:22:13', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (26, 21, 'RICH_TEXT', NULL, 'qxl12345', '2020-07-22 17:22:13', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (27, 22, 'RICH_TEXT', '<p>a<strong>dfs</strong>dfs<img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1595571007178.jpeg?Expires=1910930997&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=VK8ZyitJWDcySfhqioE73LbePsY%3D\"></p>', 'admin', '2020-07-24 14:10:08', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (28, 22, 'RICH_TEXT', '<p><strong>asdfsdfsd</strong></p><p><img src=\"http://e-commerce-oss.oss-cn-beijing.aliyuncs.com/images/1595570987820.jpeg?Expires=1910930985&amp;OSSAccessKeyId=LTAI4GEPFYczatnVE49qRUTX&amp;Signature=lOE9kxIRDnNHyncql%2FHtHsjTRyw%3D\"></p>', 'admin', '2020-07-24 14:10:09', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (29, 23, 'RICH_TEXT', '', 'admin', '2021-05-18 17:46:59', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (30, 23, 'RICH_TEXT', '', 'admin', '2021-05-18 17:46:59', NULL, NULL, NULL, NULL, '1', '2');
INSERT INTO `pdn_product_description` VALUES (31, 20, 'RICH_TEXT', '', 'admin', '2021-12-25 09:13:58', NULL, NULL, NULL, NULL, '1', '1');
INSERT INTO `pdn_product_description` VALUES (32, 20, 'RICH_TEXT', '', 'admin', '2021-12-25 09:13:58', NULL, NULL, NULL, NULL, '1', '2');

-- ----------------------------
-- Table structure for prc_product_category
-- ----------------------------
DROP TABLE IF EXISTS `prc_product_category`;
CREATE TABLE `prc_product_category`  (
  `prc_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `pro_id` int(11) NULL DEFAULT NULL COMMENT '商品ID',
  `category_id` int(11) NULL DEFAULT NULL COMMENT '分类id',
  `category_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类别名称',
  `category_path` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类别全路径如 ce>digital>mp3',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `call_int` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT ' 状态',
  `platform_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT ' 平台类型,ebay：2，Amazon：1',
  PRIMARY KEY (`prc_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 68 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of prc_product_category
-- ----------------------------
INSERT INTO `prc_product_category` VALUES (1, 3, 1, '大家电', '大家电/空调', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (4, 16, 1, '大家电', '大家电/空调', '', '2020-07-07 14:30:03', '', '2020-07-07 14:30:03', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (5, 16, 2, '空调', '大家电/空调', '', '2020-07-07 14:30:03', '', '2020-07-07 14:30:03', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (20, 11, 1, '大家电', '大家电/洗衣机', '', '2020-07-13 19:06:13', '', '2020-07-13 19:06:13', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (21, 11, 3, '洗衣机', '大家电/洗衣机', '', '2020-07-13 19:06:13', '', '2020-07-13 19:06:13', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (22, 10, 1, '大家电', '大家电/洗衣机', '', '2020-07-13 20:12:44', '', '2020-07-13 20:12:44', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (23, 10, 3, '洗衣机', '大家电/洗衣机', '', '2020-07-13 20:12:44', '', '2020-07-13 20:12:44', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (26, 10, 1, '大家电', '大家电/洗衣机', '', '2020-07-16 12:14:07', '', '2020-07-16 12:14:07', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (27, 10, 3, '洗衣机', '大家电/洗衣机', '', '2020-07-16 12:14:07', '', '2020-07-16 12:14:07', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (28, 10, 1, '大家电', '大家电/洗衣机', '', '2020-07-16 12:16:14', '', '2020-07-16 12:16:14', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (29, 10, 3, '洗衣机', '大家电/洗衣机', '', '2020-07-16 12:16:14', '', '2020-07-16 12:16:14', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (58, 13, 1, '大家电', '大家电/空调', 'QXL123', '2020-07-22 17:22:15', 'QXL123', '2020-07-22 17:22:15', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (59, 13, 2, '空调', '大家电/空调', 'QXL123', '2020-07-22 17:22:15', 'QXL123', '2020-07-22 17:22:15', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (62, 12, 1, '大家电', '大家电/空调', 'admin', '2020-07-24 08:00:07', 'admin', '2020-07-24 08:00:07', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (63, 12, 2, '空调', '大家电/空调', 'admin', '2020-07-24 08:00:07', 'admin', '2020-07-24 08:00:07', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (64, 22, 1, '大家电', '大家电/洗衣机', 'admin', '2020-07-24 14:10:42', 'admin', '2020-07-24 14:10:42', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (65, 22, 3, '洗衣机', '大家电/洗衣机', 'admin', '2020-07-24 14:10:42', 'admin', '2020-07-24 14:10:42', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (66, 18, 1, '大家电', '大家电/空调', 'admin', '2021-12-25 09:14:38', 'admin', '2021-12-25 09:14:38', NULL, NULL, NULL, NULL);
INSERT INTO `prc_product_category` VALUES (67, 18, 2, '空调', '大家电/空调', 'admin', '2021-12-25 09:14:38', 'admin', '2021-12-25 09:14:38', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for pro_product
-- ----------------------------
DROP TABLE IF EXISTS `pro_product`;
CREATE TABLE `pro_product`  (
  `pro_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `sku_cd` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品sku编码',
  `brd_id` int(11) NULL DEFAULT NULL COMMENT '外键->关联品牌id',
  `man_id` int(11) NULL DEFAULT NULL COMMENT '外键->关联man_id',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `upc` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'upc编码',
  `ean` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ena编码',
  `model` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '型号',
  `warranty_day` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '保修期（单位有年、月、日）',
  `retail_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '建议零售价',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `call_int` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态（a，b，c，d分别为待入仓、入仓中、待上架、上架中）',
  `mininum_retail_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '最低零售价',
  `replenishment_period` int(11) NULL DEFAULT NULL COMMENT '补货期（天）',
  `key_words` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关键字，预留后续搜索使用',
  `warranty` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '保修政策说明',
  `time_unit` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '保修期单位 1、年 2、月 3、日',
  `stockseting` int(11) NULL DEFAULT NULL COMMENT '库存预警设置（当低于预警值时发出警告）',
  `prc_id` int(11) NULL DEFAULT NULL COMMENT '主分类ID',
  PRIMARY KEY (`pro_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pro_product
-- ----------------------------
INSERT INTO `pro_product` VALUES (1, 'QXL', NULL, 11, 'Iphone 11 pro', NULL, NULL, NULL, NULL, 123.00, NULL, '2020-07-06 12:02:48', NULL, '2020-07-06 12:02:48', NULL, NULL, 'a', 10.00, NULL, NULL, NULL, NULL, NULL, 2);
INSERT INTO `pro_product` VALUES (2, 'SDSD', NULL, 2, 'Iphone 11 pro', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'd', 123.00, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pro_product` VALUES (3, 'qxl3', NULL, 3, 'Iphone 11 pro', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'd', 10.00, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pro_product` VALUES (4, 'WWW', NULL, 4, 'Iphone 11 pro', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'd', 10.00, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pro_product` VALUES (5, 'mhs5', NULL, 5, 'Iphone 11 pro', '', '1', '1', '2020-06-05', 1.00, '', '2020-07-06 10:34:47', NULL, NULL, NULL, NULL, 'a', 10.00, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pro_product` VALUES (6, 'qxl6', NULL, 6, 'Iphone 11 pro', '', '', '', '', 1.00, '', '2020-07-06 10:37:58', NULL, NULL, NULL, NULL, 'd', 10.00, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pro_product` VALUES (7, '44', NULL, 7, '测试2', '', '', '', '', 1.00, '', '2020-07-06 10:38:07', NULL, NULL, NULL, NULL, 'd', 10.00, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pro_product` VALUES (8, '44', NULL, 8, '2020年7月6日10:41:07', '', '', '', '', 123123.00, '', '2020-07-06 10:41:13', NULL, NULL, NULL, NULL, 'd', 123.00, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `pro_product` VALUES (12, '264798', NULL, 1, '测试1', NULL, NULL, NULL, NULL, 10.00, NULL, NULL, NULL, NULL, NULL, NULL, 'c', 10.00, NULL, NULL, NULL, NULL, NULL, 62);
INSERT INTO `pro_product` VALUES (16, '2556', NULL, 1, '测试用例', '', '', '', '', 666.00, '', '2020-07-06 12:02:48', '', '2020-07-06 14:44:52', NULL, NULL, 'd', 123.00, NULL, NULL, NULL, NULL, NULL, 4);
INSERT INTO `pro_product` VALUES (17, 'SKU001', NULL, 1, 'iPhone11 Pro', '', 'EAN001', 'iPhone 11', '12 Day', 4188.00, '', '2020-07-21 11:58:56', NULL, NULL, NULL, NULL, 'd', 4000.00, NULL, NULL, NULL, NULL, NULL, 44);
INSERT INTO `pro_product` VALUES (18, '1', NULL, 1, '测试项目啊啊', '', '1', '1', '1', 1.00, 'admin', '2021-12-25 09:12:04', NULL, NULL, NULL, NULL, 'a', NULL, NULL, NULL, NULL, NULL, NULL, 66);

-- ----------------------------
-- Table structure for sal_sales_order_line_item
-- ----------------------------
DROP TABLE IF EXISTS `sal_sales_order_line_item`;
CREATE TABLE `sal_sales_order_line_item`  (
  `sal_id` int(10) UNSIGNED NOT NULL COMMENT ' 主键',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `sao_id` int(11) NULL DEFAULT NULL COMMENT '销售订单表主id',
  `pro_id` int(11) NULL DEFAULT NULL COMMENT '商品ID',
  `qty` int(11) NULL DEFAULT NULL COMMENT '商品数量',
  `price` decimal(8, 2) NULL DEFAULT NULL COMMENT '商品单价',
  `sol_id` int(11) NULL DEFAULT NULL COMMENT '同步数据id',
  `tracking_no` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物流跟踪号',
  `wsp_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快递公司',
  PRIMARY KEY (`sal_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '销售订单明细' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sal_sales_order_line_item
-- ----------------------------
INSERT INTO `sal_sales_order_line_item` VALUES (1, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 1, 1, 10, 100.00, NULL, 'saoid101', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (2, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 2, 2, 20, 200.00, NULL, 'B12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (3, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 3, 3, 30, 300.00, NULL, 'C12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (4, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 4, 4, 4, 400.00, NULL, 'D12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (5, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 5, 5, 5, 500.00, NULL, 'E12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (6, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 6, 6, 6, 600.00, NULL, 'F12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (7, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 223, 1, 1, 123.00, NULL, 'G12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (8, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 224, 2, 2, 231.00, NULL, 'H12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (9, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 225, 3, 3, 432.00, NULL, 'I12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (10, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 222, 4, 40, 111.00, NULL, 'J12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (11, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 12, 4, 4, 4.00, NULL, '123456', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (12, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 11, 1, 123, 123.00, NULL, 'K12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (13, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 226, 2, 12, 123.00, NULL, '20200721', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (14, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 227, 2, 23, 123.00, NULL, 'M12345', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (15, NULL, '2020-07-08 14:15:50', NULL, NULL, NULL, NULL, NULL, 228, 1, 34, 123.00, NULL, 'ASAS1234', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (100, 'QXL', '2020-07-14 16:36:24', NULL, NULL, NULL, NULL, NULL, 100, 1, 1, 123.00, NULL, '123456', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (101, 'QXL', '2020-07-14 16:36:24', NULL, NULL, NULL, NULL, NULL, 101, 2, 123, 123.00, NULL, 'saoid101', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (102, 'QXL', '2020-07-14 16:36:24', NULL, NULL, NULL, NULL, NULL, 102, 3, 123, 123.00, NULL, 'Z1234100101102', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (103, 'QXL', '2020-07-14 16:36:24', NULL, NULL, NULL, NULL, NULL, 103, 2, 123, 123.00, NULL, '0', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (104, 'QXL', '2020-07-14 16:36:24', NULL, NULL, NULL, NULL, NULL, 104, 1, 123, 123.00, NULL, 'Z1234100101102103104', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (105, 'QXL', '2020-07-14 16:36:24', NULL, NULL, NULL, NULL, NULL, 105, 2, 123, 123.00, NULL, 'Z1234100101102103104105', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (106, 'QXL', '2020-07-14 16:36:24', NULL, NULL, NULL, NULL, NULL, 106, 3, 123, 123.00, NULL, 'Z1234100101102103104105106', NULL);
INSERT INTO `sal_sales_order_line_item` VALUES (107, 'QXL', '2020-07-21 15:06:03', NULL, NULL, NULL, NULL, NULL, 229, 1, 12, 12.00, NULL, 'ASD123123', NULL);

-- ----------------------------
-- Table structure for sao_sales_order
-- ----------------------------
DROP TABLE IF EXISTS `sao_sales_order`;
CREATE TABLE `sao_sales_order`  (
  `sao_id` int(10) UNSIGNED NOT NULL COMMENT ' 主键',
  `created_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `man_id` int(11) NULL DEFAULT NULL COMMENT '制造商ID',
  `war_id` int(11) NULL DEFAULT NULL COMMENT '仓库ID',
  `sync_date` timestamp NULL DEFAULT NULL COMMENT '第一次同步时间',
  `payment_date` timestamp NULL DEFAULT NULL COMMENT '支付时间',
  `push_date` timestamp NULL DEFAULT NULL COMMENT '推送到仓库的时间',
  `track_no_date` timestamp NULL DEFAULT NULL COMMENT '取得物流跟踪号的时间',
  `fulfillment_date` timestamp NULL DEFAULT NULL COMMENT '物流妥投的时间',
  `settlement_date` timestamp NULL DEFAULT NULL COMMENT '结款时间',
  `product_amount` decimal(8, 2) NULL DEFAULT NULL COMMENT '订单价格',
  `freight_cost` decimal(8, 2) NULL DEFAULT NULL COMMENT '运费',
  `handling_fee` decimal(8, 2) NULL DEFAULT NULL COMMENT '订单处理费',
  `customer_remark` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消费者备注',
  `order_no` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单编号, SO + 8位数字: 例如: SO00000001 , 当订单号多于一千万时，第一位变为由A到Z\r\n',
  `order_sts` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单状态: 1. AwaitingPayment 2. AwaitingShipment 3. SHIPPED 已发货 4. Complete 已完成5. Canceled已取消\r\n',
  `refund_sts` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '退款状态 1. OPEN - 开启 2. CLOSE - 已完结\r\n',
  `delivery_sts` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发货状态 1. SYNC - 已同步到仓库 2. STOCK_OUT - 已出库 3. SHIPPING - 发货中 4. FULFILLED - 已妥投\r\n',
  `sto_id` int(11) NULL DEFAULT NULL COMMENT 'GM 平台订单, 已拆单 按 仓库 / 厂家 进行拆单\r\n',
  `last_freight_cost` decimal(8, 2) NULL DEFAULT NULL COMMENT '斑马返回物流费用',
  `cancel_time` timestamp NULL DEFAULT NULL COMMENT '取消时间',
  `auto_pay_status` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0自动，1非自动，2取消，3异常，4完成\r\n',
  `buyer_checkout_message` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户留言',
  `auto_pay_time` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单自动支付时间',
  PRIMARY KEY (`sao_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '销售订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sao_sales_order
-- ----------------------------
INSERT INTO `sao_sales_order` VALUES (1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '11', '2', NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 22, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '22', '1', NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 33, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '33', '3', NULL, NULL, 3, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (4, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 44, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '44', '4', NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 55, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '55', '5', NULL, NULL, 5, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (6, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 66, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '66', '2', NULL, NULL, 6, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (7, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 77, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '77', '2', NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (8, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 88, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '88', '3', NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (9, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 99, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '99', '4', NULL, NULL, 3, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (10, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 110, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '110', '5', NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (11, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 10, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '10', '1', NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (12, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '123', '5', NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (100, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '123', '3', NULL, NULL, 3, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (101, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '123', '4', NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (102, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '123', '5', NULL, NULL, 5, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (103, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '123', '1', NULL, NULL, 6, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (104, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '123', '2', NULL, NULL, 7, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (105, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '123', '3', NULL, NULL, 8, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (106, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '123', '4', NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (226, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '133', '5', '', NULL, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (227, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '134', '1', NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (228, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '134', '2', NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sao_sales_order` VALUES (229, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'SO12345678', '3', NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sdi_store_dropship_item
-- ----------------------------
DROP TABLE IF EXISTS `sdi_store_dropship_item`;
CREATE TABLE `sdi_store_dropship_item`  (
  `dil_id` int(10) UNSIGNED NOT NULL COMMENT '主键',
  `pro_id` int(11) NULL DEFAULT NULL COMMENT '商品id',
  `str_id` int(11) NULL DEFAULT NULL COMMENT '网店id',
  `store_retention` int(11) NULL DEFAULT NULL COMMENT '网店预留量',
  `dropship_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '借卖价格',
  `dropship_status` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0-提交 1-上架 2-下架\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `shelf_stock` int(11) NULL DEFAULT NULL COMMENT '网店上架商品数量',
  `prefer_date` timestamp NULL DEFAULT NULL COMMENT '商品网店上架时间',
  PRIMARY KEY (`dil_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '网店与sku的关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sequence
-- ----------------------------
DROP TABLE IF EXISTS `sequence`;
CREATE TABLE `sequence`  (
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '序列名称',
  `current_value` int(11) NULL DEFAULT NULL COMMENT '当前值',
  `increment` int(11) NULL DEFAULT NULL COMMENT '增长值',
  `initial` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '首字母'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sha_shipping_address
-- ----------------------------
DROP TABLE IF EXISTS `sha_shipping_address`;
CREATE TABLE `sha_shipping_address`  (
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `family_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓',
  `given_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名',
  `country_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国家',
  `country_iso_cd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国家编码',
  `state_or_province_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省份或洲名称',
  `state_or_province_cd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省份或洲编码',
  `city_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市名',
  `address_line1` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址1',
  `address_line2` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址2',
  `address_line3` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址3',
  `postal_cd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮编',
  `contact_phone_no` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `email` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `sto_id` int(11) NULL DEFAULT NULL COMMENT '外键关联sto_store_order表主键',
  `carrier_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快递公司名称'
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单收货地址' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sha_shipping_address
-- ----------------------------
INSERT INTO `sha_shipping_address` VALUES (NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '中国', 'China', '辽宁', 'LiaoNing', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL);
INSERT INTO `sha_shipping_address` VALUES (NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '中国', 'China', '广西', 'GuangXi', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2, NULL);
INSERT INTO `sha_shipping_address` VALUES (NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '中国', 'China', '河南', 'HeNan', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 3, NULL);

-- ----------------------------
-- Table structure for sol_store_order_line_item
-- ----------------------------
DROP TABLE IF EXISTS `sol_store_order_line_item`;
CREATE TABLE `sol_store_order_line_item`  (
  `sol_id` int(10) UNSIGNED NOT NULL COMMENT ' 主键',
  `order_item_id` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '第三方平台line_item_id',
  `sto_id` int(11) NULL DEFAULT NULL COMMENT '主表主键ID',
  `sales_price` decimal(8, 2) NULL DEFAULT NULL COMMENT '商品单价',
  `qty` int(11) NULL DEFAULT NULL COMMENT '商品数量',
  `sku_no` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品SKU编号',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `buyer_checkout_message` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户留言',
  PRIMARY KEY (`sol_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '原始订单明细' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for spa_specific_attribute
-- ----------------------------
DROP TABLE IF EXISTS `spa_specific_attribute`;
CREATE TABLE `spa_specific_attribute`  (
  `spa_id` int(10) UNSIGNED NOT NULL COMMENT '主键id',
  `pro_id` int(11) NULL DEFAULT NULL COMMENT '外键-> 关联pro表id',
  `name_en` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性中文\r\n',
  `name_cn` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性英文',
  `seq_no` int(11) NULL DEFAULT NULL COMMENT '排序\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `sts_cd` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  PRIMARY KEY (`spa_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for spv_specific_attribute_value
-- ----------------------------
DROP TABLE IF EXISTS `spv_specific_attribute_value`;
CREATE TABLE `spv_specific_attribute_value`  (
  `spv_id` int(10) UNSIGNED NOT NULL COMMENT '主键id',
  `spa_id` int(11) NULL DEFAULT NULL COMMENT '外键->关联spa表主键',
  `name_en` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '英文属性描述',
  `name_cn` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '中文属性描述',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`spv_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sto_store_order
-- ----------------------------
DROP TABLE IF EXISTS `sto_store_order`;
CREATE TABLE `sto_store_order`  (
  `sto_id` int(10) UNSIGNED NOT NULL COMMENT '主键',
  `str_id` int(11) NULL DEFAULT NULL COMMENT '网店ID，外键关联str表主键',
  `order_id` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'AMAZON / EBAY 平台的订单 ID 例如: AMAZON : 058-1233752-8214740 EBAY : 865826\r\n',
  `order_created_time` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单创建时间\r\n',
  `paid_time` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付时间\r\n',
  `last_modified_time` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单更新时间\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态，1-待支付，2-待发货，3-已发货，4-已完成，5-已取消',
  `platform_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '平台类别 1、amazon 2、ebay\r\n',
  `cancel_compile_date` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单取消时间\r\n',
  PRIMARY KEY (`sto_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '原始订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sto_store_order
-- ----------------------------
INSERT INTO `sto_store_order` VALUES (1, 1, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL);
INSERT INTO `sto_store_order` VALUES (2, 1, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2', NULL, NULL);
INSERT INTO `sto_store_order` VALUES (3, 1, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '3', NULL, NULL);
INSERT INTO `sto_store_order` VALUES (4, 1, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '4', NULL, NULL);
INSERT INTO `sto_store_order` VALUES (5, 1, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '5', NULL, NULL);
INSERT INTO `sto_store_order` VALUES (6, 1, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '5', NULL, NULL);
INSERT INTO `sto_store_order` VALUES (7, 11, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL);
INSERT INTO `sto_store_order` VALUES (8, 12, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2', NULL, NULL);

-- ----------------------------
-- Table structure for str_store
-- ----------------------------
DROP TABLE IF EXISTS `str_store`;
CREATE TABLE `str_store`  (
  `str_id` int(10) UNSIGNED NOT NULL COMMENT ' 主键',
  `dsr_id` int(11) NULL DEFAULT NULL COMMENT '借卖id',
  `platform_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '平台类别,1:Amazon;2:ebay\r\n',
  `store_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网店名 - 从api中取得\r\n',
  `store_sts_cd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'API 对接状态 1. INI - 刚授权 2. WIP - 正常对接 3. EXP - token 过期 4. ERR - token 出错 5. CLS - 网店关闭\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`str_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '网店记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of str_store
-- ----------------------------
INSERT INTO `str_store` VALUES (1, 1, '1', 'Amazon#1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `str_store` VALUES (11, 1, '2', 'EBay#1', 'string', 'string', '2020-07-13 11:21:41', 'string', '2020-07-13 11:21:41', 0, 'string', '1');
INSERT INTO `str_store` VALUES (12, 1, '1', 'Amazon#2', 'string', 'string', '2020-07-13 11:26:35', 'string', '2020-07-13 11:26:35', 0, 'string', '1');
INSERT INTO `str_store` VALUES (13, 1, '2', 'EBay#2', NULL, 'string', '2020-07-13 11:26:35', 'string', '2020-07-13 11:26:35', 0, 'string', '1');
INSERT INTO `str_store` VALUES (14, 1, '1', 'Amazon#3', 'string', 'string', '2020-07-13 11:26:35', 'string', '2020-07-13 11:26:35', 0, 'string', '1');
INSERT INTO `str_store` VALUES (15, 1, '2', 'EBay#3', 'string', 'string', '2020-07-13 11:26:35', 'string', '2020-07-13 11:26:35', 0, 'string', '1');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `parent_id` bigint(20) NULL DEFAULT NULL COMMENT '父级ID',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `level` int(11) NULL DEFAULT NULL COMMENT '菜单级数',
  `sort` int(11) NULL DEFAULT NULL COMMENT '菜单排序',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '前端名称',
  `icon` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '前端图标',
  `hidden` int(11) NULL DEFAULT NULL COMMENT '前端隐藏',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES (1, 0, '2020-07-17 18:08:36', 'MVO', 0, 0, 'mvo', 'peoples', 0);
INSERT INTO `sys_menu` VALUES (2, 1, '2020-07-17 22:20:50', 'My Info', 1, 0, 'mvoMyinfo', 'form', 0);
INSERT INTO `sys_menu` VALUES (3, 1, '2020-07-17 22:21:21', 'Product Entry', 1, 0, 'productAdd', 'edit', 0);
INSERT INTO `sys_menu` VALUES (4, 1, '2020-07-17 22:21:52', 'Product Images', 1, 0, 'productImage', 'icon', 0);
INSERT INTO `sys_menu` VALUES (5, 1, '2020-07-17 22:22:14', 'Order Manage', 1, 0, 'mvoOrderManagement', 'list', 0);
INSERT INTO `sys_menu` VALUES (6, 1, '2020-07-17 22:24:26', 'My Wallet', 1, 0, 'mvoWallet', 'money', 0);
INSERT INTO `sys_menu` VALUES (7, 1, '2020-07-17 22:25:32', 'Available Money', 1, 0, 'mvoAvailableMoney', 'nested', 1);
INSERT INTO `sys_menu` VALUES (8, 1, '2020-07-17 22:25:59', 'Transaction Record', 1, 0, 'mvoTransactionRecord', 'nested', 1);
INSERT INTO `sys_menu` VALUES (9, 1, '2020-07-17 22:26:24', 'Company Info', 1, 0, 'mvoCompanyInfo', 'nested', 1);
INSERT INTO `sys_menu` VALUES (10, 0, '2020-07-17 22:30:19', 'BVO', 0, 0, 'bvo', 'user', 0);
INSERT INTO `sys_menu` VALUES (11, 10, '2020-07-17 22:30:54', 'My Info', 1, 0, 'bvoMyinfo', 'form', 0);
INSERT INTO `sys_menu` VALUES (12, 10, '2020-07-17 22:30:54', 'Store Management', 1, 0, 'storeManagement', 'component', 0);
INSERT INTO `sys_menu` VALUES (13, 10, '2020-07-17 22:30:54', 'Product Browse', 1, 0, 'productBrowse', 'search', 0);
INSERT INTO `sys_menu` VALUES (14, 10, '2020-07-17 22:30:54', 'Product Detail', 1, 0, 'bvoProductDetail', 'nested', 0);
INSERT INTO `sys_menu` VALUES (15, 10, '2020-07-17 22:30:54', 'WishList', 1, 0, 'wishList', 'star', 0);
INSERT INTO `sys_menu` VALUES (16, 10, '2020-07-17 22:30:54', 'Order Management', 1, 0, 'bvoOrderManagement', 'list', 0);
INSERT INTO `sys_menu` VALUES (17, 10, '2020-07-17 22:30:54', 'My Wallet', 1, 0, 'bvoWallet', 'money', 0);
INSERT INTO `sys_menu` VALUES (18, 10, '2020-07-17 22:30:54', 'Available Money', 1, 0, 'bvoAvailableMoney', 'nested', 1);
INSERT INTO `sys_menu` VALUES (19, 10, '2020-07-17 22:36:42', 'Transaction Record', 1, 0, 'bvoTransactionRecord', 'nested', 1);
INSERT INTO `sys_menu` VALUES (20, 10, '2020-07-17 22:30:54', 'Choose', 1, 0, 'bvoChoose', 'nested', 1);
INSERT INTO `sys_menu` VALUES (21, 10, '2020-07-17 22:30:54', 'Add Amazon', 1, 0, 'bvoAddAmazon', 'nested', 1);
INSERT INTO `sys_menu` VALUES (22, 10, '2020-07-17 22:30:54', 'Add eBay', 1, 0, 'bvoAddEbay', 'nested', 1);
INSERT INTO `sys_menu` VALUES (23, 0, '2020-07-17 22:30:54', 'Admin', 0, 0, 'admin', 'bug', 0);
INSERT INTO `sys_menu` VALUES (24, 23, '2020-07-17 22:38:29', 'Code Manage', 1, 0, 'code', 'form', 0);
INSERT INTO `sys_menu` VALUES (25, 23, '2020-07-17 22:30:54', 'Parameter Manage', 1, 0, 'parameterManage', 'component', 0);
INSERT INTO `sys_menu` VALUES (26, 23, '2020-07-17 22:30:54', 'Withdraw Aduit', 1, 0, 'withdraw', 'money', 0);
INSERT INTO `sys_menu` VALUES (27, 23, '2020-07-17 22:30:54', 'Menu Manage', 1, 0, 'menu', 'tab', 0);
INSERT INTO `sys_menu` VALUES (28, 23, '2020-07-17 22:30:54', 'Role Manage', 1, 0, 'role', 'user', 0);
INSERT INTO `sys_menu` VALUES (29, 0, '2020-07-17 22:41:09', 'Other', 0, 0, 'other', 'money', 0);
INSERT INTO `sys_menu` VALUES (30, 29, '2020-07-17 22:30:54', 'Pay', 1, 0, 'pay', 'money', 0);
INSERT INTO `sys_menu` VALUES (31, 29, '2020-07-17 22:30:54', 'Express', 1, 0, 'express', 'shopping', 0);
INSERT INTO `sys_menu` VALUES (32, 1, '2020-07-19 17:24:03', 'Product Detail', 1, 0, 'mvoProductDetail', 'search', 1);

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) NULL DEFAULT NULL COMMENT '父级权限id',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `value` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限值',
  `icon` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图标',
  `type` int(11) NULL DEFAULT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
  `uri` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '前端资源路径',
  `status` int(11) NULL DEFAULT NULL COMMENT '启用状态；0->禁用；1->启用',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `sort` int(11) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '后台用户权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) NULL DEFAULT NULL COMMENT '资源分类ID',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源名称',
  `url` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源URL',
  `description` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_resource
-- ----------------------------
INSERT INTO `sys_resource` VALUES (1, 1, '2020-07-16 15:56:21', '用户信息维护以及交互', '/user/**', '提供用户的注册，登录，刷新token，修改密码，获取当前用户信息等功能');
INSERT INTO `sys_resource` VALUES (2, 1, '2020-07-16 15:56:17', '管理员功能', '/admin/**', '提供权限管理功能：对于用户角色的管理，对于角色菜单权限的管理以及对于角色接口权限的管理');
INSERT INTO `sys_resource` VALUES (3, 1, '2020-07-16 15:56:13', '数据字典信息维护', '/dataDictionary/**', '提供数据字典的各项增删查改功能');
INSERT INTO `sys_resource` VALUES (4, 1, '2020-07-16 15:56:07', '参数信息维护', '/parameter/**', '提供参数的各项增删查改功能');
INSERT INTO `sys_resource` VALUES (5, 5, '2020-07-16 16:06:08', '钱包信息维护', '/wallet/**', '提供钱包账户的注册，获取信息，更改密码功能');
INSERT INTO `sys_resource` VALUES (6, 5, '2020-07-16 16:07:47', '钱包流水信息维护', '/walletFlow/**', '提供提现/充值以及对订单的支付/申请退款功能');
INSERT INTO `sys_resource` VALUES (7, 1, '2020-07-16 16:08:42', '管理员审核功能', '/walletAdmin/**', '提供查询待审核账单以及审核功能');
INSERT INTO `sys_resource` VALUES (8, 3, '2020-07-17 07:10:10', '品牌商订单管理', '/order/**', '管理品牌商的订单发货等功能');
INSERT INTO `sys_resource` VALUES (9, 3, '2020-07-17 07:11:57', '借卖方订单管理', '/bvoOrder/**', '管理借卖方的订单支付等功能');
INSERT INTO `sys_resource` VALUES (10, 4, '2020-07-18 13:35:40', '借卖方商品浏览', '/productBrowse/**', '借卖方商品浏览等功能');
INSERT INTO `sys_resource` VALUES (11, 4, '2020-07-18 13:35:43', '借卖方愿望清单', '/productWishlist/**', '借卖方愿望清单添加等功能');
INSERT INTO `sys_resource` VALUES (12, 4, '2020-07-18 13:37:23', '品牌方商品主图', '/productImage/**', '品牌方商品主图增删查改功能');
INSERT INTO `sys_resource` VALUES (13, 4, '2020-07-18 13:37:27', '品牌方商品录入', '/productEntry/**', '品牌方商品录入增删查改功能');
INSERT INTO `sys_resource` VALUES (14, 2, '2020-07-18 13:37:27', '借卖方信息维护', '/bvoInfo/**', '借卖方信息维护增查改功能');
INSERT INTO `sys_resource` VALUES (15, 2, '2020-07-18 13:37:27', '店铺信息维护', '/store/**', '借卖方店铺维护增查功能');
INSERT INTO `sys_resource` VALUES (16, 2, '2020-07-18 13:37:27', '品牌方公司信息维护', '/man/**', '品牌方公司信息维护增查改功能');
INSERT INTO `sys_resource` VALUES (17, 2, '2020-07-18 13:37:27', '品牌方品牌信息维护', '/brand/**', '品牌方品牌信息维护增删查改功能');
INSERT INTO `sys_resource` VALUES (18, 7, '2020-07-18 22:23:00', '上传图片到阿里云OSS', '/upload/**', '上传图片到阿里云');
INSERT INTO `sys_resource` VALUES (19, 7, '2020-07-18 22:23:29', '服务端签证直传形式上传到阿里云OSS', '/aliyun/**', '服务端签证模式上传到阿里云');

-- ----------------------------
-- Table structure for sys_resource_category
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource_category`;
CREATE TABLE `sys_resource_category`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `sort` int(11) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_resource_category
-- ----------------------------
INSERT INTO `sys_resource_category` VALUES (1, '2020-07-16 15:53:56', '管理员模块', NULL);
INSERT INTO `sys_resource_category` VALUES (2, '2020-07-16 15:53:59', '基础信息维护模块', NULL);
INSERT INTO `sys_resource_category` VALUES (3, '2020-07-16 15:54:05', '订单模块', NULL);
INSERT INTO `sys_resource_category` VALUES (4, '2020-07-16 15:53:49', '产品模块', NULL);
INSERT INTO `sys_resource_category` VALUES (5, '2020-07-16 15:54:25', '钱包模块', NULL);
INSERT INTO `sys_resource_category` VALUES (7, '2020-07-18 22:22:51', '上传模块', NULL);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `description` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `admin_count` int(11) NULL DEFAULT NULL COMMENT '后台用户数量',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `status` int(11) NULL DEFAULT 1 COMMENT '启用状态：0->禁用；1->启用',
  `sort` int(11) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, 'Admin', '超级管理员，拥有一切权限', 0, '2020-07-14 20:33:12', 1, 0);
INSERT INTO `sys_role` VALUES (2, 'MVO', '只拥有MVO模块相关权限', 0, '2020-07-15 10:26:49', 1, 0);
INSERT INTO `sys_role` VALUES (3, 'BVO', '只拥有BVO模块相关权限', 0, '2020-07-15 10:26:59', 1, 0);

-- ----------------------------
-- Table structure for sys_role_menu_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu_relation`;
CREATE TABLE `sys_role_menu_relation`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(20) NULL DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 125 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_menu_relation
-- ----------------------------
INSERT INTO `sys_role_menu_relation` VALUES (1, 1, 1);
INSERT INTO `sys_role_menu_relation` VALUES (2, 1, 2);
INSERT INTO `sys_role_menu_relation` VALUES (3, 1, 3);
INSERT INTO `sys_role_menu_relation` VALUES (4, 1, 4);
INSERT INTO `sys_role_menu_relation` VALUES (5, 1, 5);
INSERT INTO `sys_role_menu_relation` VALUES (6, 1, 6);
INSERT INTO `sys_role_menu_relation` VALUES (7, 1, 7);
INSERT INTO `sys_role_menu_relation` VALUES (8, 1, 8);
INSERT INTO `sys_role_menu_relation` VALUES (9, 1, 9);
INSERT INTO `sys_role_menu_relation` VALUES (10, 1, 10);
INSERT INTO `sys_role_menu_relation` VALUES (11, 1, 11);
INSERT INTO `sys_role_menu_relation` VALUES (12, 1, 12);
INSERT INTO `sys_role_menu_relation` VALUES (13, 1, 13);
INSERT INTO `sys_role_menu_relation` VALUES (14, 1, 14);
INSERT INTO `sys_role_menu_relation` VALUES (15, 1, 15);
INSERT INTO `sys_role_menu_relation` VALUES (16, 1, 16);
INSERT INTO `sys_role_menu_relation` VALUES (17, 1, 17);
INSERT INTO `sys_role_menu_relation` VALUES (18, 1, 18);
INSERT INTO `sys_role_menu_relation` VALUES (19, 1, 19);
INSERT INTO `sys_role_menu_relation` VALUES (20, 1, 20);
INSERT INTO `sys_role_menu_relation` VALUES (21, 1, 21);
INSERT INTO `sys_role_menu_relation` VALUES (22, 1, 22);
INSERT INTO `sys_role_menu_relation` VALUES (23, 1, 23);
INSERT INTO `sys_role_menu_relation` VALUES (24, 1, 24);
INSERT INTO `sys_role_menu_relation` VALUES (25, 1, 25);
INSERT INTO `sys_role_menu_relation` VALUES (26, 1, 26);
INSERT INTO `sys_role_menu_relation` VALUES (27, 1, 27);
INSERT INTO `sys_role_menu_relation` VALUES (28, 1, 28);
INSERT INTO `sys_role_menu_relation` VALUES (29, 1, 29);
INSERT INTO `sys_role_menu_relation` VALUES (30, 1, 30);
INSERT INTO `sys_role_menu_relation` VALUES (31, 1, 31);
INSERT INTO `sys_role_menu_relation` VALUES (32, 2, 1);
INSERT INTO `sys_role_menu_relation` VALUES (33, 2, 2);
INSERT INTO `sys_role_menu_relation` VALUES (34, 2, 3);
INSERT INTO `sys_role_menu_relation` VALUES (35, 2, 4);
INSERT INTO `sys_role_menu_relation` VALUES (36, 2, 5);
INSERT INTO `sys_role_menu_relation` VALUES (37, 2, 6);
INSERT INTO `sys_role_menu_relation` VALUES (38, 2, 7);
INSERT INTO `sys_role_menu_relation` VALUES (39, 2, 8);
INSERT INTO `sys_role_menu_relation` VALUES (40, 2, 9);
INSERT INTO `sys_role_menu_relation` VALUES (41, 3, 10);
INSERT INTO `sys_role_menu_relation` VALUES (42, 3, 11);
INSERT INTO `sys_role_menu_relation` VALUES (43, 3, 12);
INSERT INTO `sys_role_menu_relation` VALUES (44, 3, 13);
INSERT INTO `sys_role_menu_relation` VALUES (45, 3, 14);
INSERT INTO `sys_role_menu_relation` VALUES (46, 3, 15);
INSERT INTO `sys_role_menu_relation` VALUES (47, 3, 16);
INSERT INTO `sys_role_menu_relation` VALUES (48, 3, 17);
INSERT INTO `sys_role_menu_relation` VALUES (49, 3, 18);
INSERT INTO `sys_role_menu_relation` VALUES (50, 3, 19);
INSERT INTO `sys_role_menu_relation` VALUES (51, 3, 20);
INSERT INTO `sys_role_menu_relation` VALUES (52, 3, 21);
INSERT INTO `sys_role_menu_relation` VALUES (53, 3, 22);
INSERT INTO `sys_role_menu_relation` VALUES (54, 1, 32);

-- ----------------------------
-- Table structure for sys_role_resource_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_resource_relation`;
CREATE TABLE `sys_role_resource_relation`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
  `resource_id` bigint(20) NULL DEFAULT NULL COMMENT '资源ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_resource_relation
-- ----------------------------
INSERT INTO `sys_role_resource_relation` VALUES (1, 1, 1);
INSERT INTO `sys_role_resource_relation` VALUES (2, 1, 2);
INSERT INTO `sys_role_resource_relation` VALUES (3, 1, 3);
INSERT INTO `sys_role_resource_relation` VALUES (4, 1, 4);
INSERT INTO `sys_role_resource_relation` VALUES (5, 1, 5);
INSERT INTO `sys_role_resource_relation` VALUES (6, 1, 6);
INSERT INTO `sys_role_resource_relation` VALUES (7, 1, 7);
INSERT INTO `sys_role_resource_relation` VALUES (8, 1, 8);
INSERT INTO `sys_role_resource_relation` VALUES (9, 1, 9);
INSERT INTO `sys_role_resource_relation` VALUES (10, 2, 1);
INSERT INTO `sys_role_resource_relation` VALUES (11, 2, 2);
INSERT INTO `sys_role_resource_relation` VALUES (12, 2, 3);
INSERT INTO `sys_role_resource_relation` VALUES (13, 2, 4);
INSERT INTO `sys_role_resource_relation` VALUES (14, 2, 5);
INSERT INTO `sys_role_resource_relation` VALUES (15, 2, 6);
INSERT INTO `sys_role_resource_relation` VALUES (16, 2, 7);
INSERT INTO `sys_role_resource_relation` VALUES (17, 2, 8);
INSERT INTO `sys_role_resource_relation` VALUES (18, 2, 9);
INSERT INTO `sys_role_resource_relation` VALUES (19, 3, 1);
INSERT INTO `sys_role_resource_relation` VALUES (20, 3, 2);
INSERT INTO `sys_role_resource_relation` VALUES (21, 3, 3);
INSERT INTO `sys_role_resource_relation` VALUES (22, 3, 4);
INSERT INTO `sys_role_resource_relation` VALUES (23, 3, 5);
INSERT INTO `sys_role_resource_relation` VALUES (24, 3, 6);
INSERT INTO `sys_role_resource_relation` VALUES (25, 3, 7);
INSERT INTO `sys_role_resource_relation` VALUES (26, 3, 8);
INSERT INTO `sys_role_resource_relation` VALUES (27, 3, 9);
INSERT INTO `sys_role_resource_relation` VALUES (29, 1, 10);
INSERT INTO `sys_role_resource_relation` VALUES (30, 1, 11);
INSERT INTO `sys_role_resource_relation` VALUES (31, 1, 12);
INSERT INTO `sys_role_resource_relation` VALUES (32, 1, 13);
INSERT INTO `sys_role_resource_relation` VALUES (35, 1, 14);
INSERT INTO `sys_role_resource_relation` VALUES (36, 1, 15);
INSERT INTO `sys_role_resource_relation` VALUES (37, 1, 16);
INSERT INTO `sys_role_resource_relation` VALUES (38, 1, 17);
INSERT INTO `sys_role_resource_relation` VALUES (39, 1, 18);
INSERT INTO `sys_role_resource_relation` VALUES (40, 1, 19);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `icon` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `nick_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `login_time` datetime NULL DEFAULT NULL COMMENT '最后登录时间',
  `status` int(11) NULL DEFAULT 1 COMMENT '帐号启用状态：0->禁用；1->启用',
  `man_id` int(11) NULL DEFAULT NULL COMMENT '公司id',
  `man_buyer_id` int(11) NULL DEFAULT NULL COMMENT '借卖方id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'admin', '$2a$10$qAJmEMdf59MrE7VMBMzY3eu/oIAgTRbE3I4apMliRnvh2c3lLZfx6', 'string', 'string', 'string', 'string', '2020-07-14 13:40:58', '2021-12-25 11:05:49', 1, 1, 1);
INSERT INTO `sys_user` VALUES (2, 'mvo', '$2a$10$qAJmEMdf59MrE7VMBMzY3eu/oIAgTRbE3I4apMliRnvh2c3lLZfx6', 'qxlicon', 'qiuxiaolin@qq.com', 'hideonbush', 'testRegister', '2020-07-17 11:29:15', '2021-12-25 11:05:34', 1, 1, NULL);
INSERT INTO `sys_user` VALUES (3, 'bvo', '$2a$10$qAJmEMdf59MrE7VMBMzY3eu/oIAgTRbE3I4apMliRnvh2c3lLZfx6', 'string', 'string', 'string', 'string', '2020-07-17 14:42:02', '2021-12-25 08:40:32', 1, NULL, 1);
INSERT INTO `sys_user` VALUES (4, 'qiuxiaolin', '$2a$10$qAJmEMdf59MrE7VMBMzY3eu/oIAgTRbE3I4apMliRnvh2c3lLZfx6', 'string', 'string', 'string', 'string', '2020-07-17 14:42:02', '2020-07-18 00:07:00', 1, NULL, NULL);
INSERT INTO `sys_user` VALUES (8, 'yousabla', '$2a$10$M9AES/NUs.NTMzY7iS9Qk.R/gc7wn7ScXC6YBt6dd5d1nX2ijB.4i', 'string', 'string', 'string', 'string', '2020-07-21 17:57:07', '2020-07-21 21:35:53', 1, NULL, NULL);

-- ----------------------------
-- Table structure for sys_user_login_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_login_log`;
CREATE TABLE `sys_user_login_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_id` bigint(20) NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `ip` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `login_type` int(11) NULL DEFAULT NULL COMMENT '登录类型：0->PC；1->android;2->ios;3->小程序',
  `province` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 271 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '会员登录记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_login_log
-- ----------------------------
INSERT INTO `sys_user_login_log` VALUES (1, 1, '2020-07-15 13:30:18', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (2, 1, '2020-07-15 15:21:10', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (3, 1, '2020-07-15 15:58:19', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (4, 1, '2020-07-15 16:04:44', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (5, 1, '2020-07-15 16:07:13', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (6, 1, '2020-07-15 16:16:36', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (7, 1, '2020-07-15 17:43:04', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (8, 1, '2020-07-15 17:52:10', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (9, 1, '2020-07-15 18:33:27', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (10, 1, '2020-07-15 18:35:23', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (11, 1, '2020-07-15 18:45:58', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (12, 1, '2020-07-15 18:47:37', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (13, 1, '2020-07-15 19:52:13', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (14, 1, '2020-07-15 20:55:35', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (15, 1, '2020-07-15 21:10:48', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (16, 1, '2020-07-15 21:11:25', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (17, 1, '2020-07-15 21:13:03', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (18, 1, '2020-07-15 21:56:12', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (19, 1, '2020-07-15 22:11:18', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (20, 1, '2020-07-15 22:41:38', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (21, 1, '2020-07-17 11:10:48', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (22, 1, '2020-07-17 11:23:26', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (23, 1, '2020-07-17 12:12:46', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (24, 1, '2020-07-17 12:47:39', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (25, 1, '2020-07-17 12:47:56', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (26, 1, '2020-07-17 12:58:23', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (27, 1, '2020-07-17 12:58:45', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (28, 1, '2020-07-17 13:07:59', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (29, 1, '2020-07-17 13:15:42', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (30, 1, '2020-07-17 13:34:00', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (31, 1, '2020-07-17 14:21:21', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (32, 1, '2020-07-17 14:38:43', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (33, 3, '2020-07-17 14:45:02', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (34, 3, '2020-07-17 14:48:39', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (35, 1, '2020-07-17 14:52:16', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (36, 1, '2020-07-17 15:33:22', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (37, 1, '2020-07-17 15:52:13', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (38, 1, '2020-07-17 16:23:27', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (39, 1, '2020-07-17 16:26:37', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (40, 1, '2020-07-17 16:30:18', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (41, 1, '2020-07-17 16:56:23', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (42, 1, '2020-07-17 16:56:28', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (43, 1, '2020-07-17 16:59:46', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (44, 1, '2020-07-17 17:00:00', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (45, 1, '2020-07-17 17:03:33', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (46, 1, '2020-07-17 17:04:39', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (47, 1, '2020-07-17 17:10:20', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (48, 1, '2020-07-17 17:12:42', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (49, 1, '2020-07-17 17:15:21', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (50, 1, '2020-07-17 17:15:39', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (51, 1, '2020-07-17 17:22:32', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (52, 1, '2020-07-17 17:42:35', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (53, 1, '2020-07-17 17:43:02', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (54, 1, '2020-07-17 17:45:49', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (55, 1, '2020-07-17 17:46:27', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (56, 1, '2020-07-17 17:48:02', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (57, 1, '2020-07-17 17:50:11', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (58, 1, '2020-07-17 17:56:51', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (59, 1, '2020-07-17 17:58:05', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (60, 1, '2020-07-17 18:03:01', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (61, 1, '2020-07-17 18:03:21', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (62, 1, '2020-07-17 18:03:39', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (63, 1, '2020-07-17 22:14:14', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (64, 1, '2020-07-17 22:18:36', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (65, 1, '2020-07-17 22:22:53', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (66, 1, '2020-07-17 22:23:53', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (67, 1, '2020-07-17 22:26:56', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (68, 1, '2020-07-17 22:27:35', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (69, 1, '2020-07-17 23:12:50', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (70, 4, '2020-07-17 23:27:36', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (71, 4, '2020-07-17 23:32:22', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (72, 1, '2020-07-17 23:52:14', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (73, 4, '2020-07-17 23:53:11', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (74, 4, '2020-07-17 23:58:04', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (75, 4, '2020-07-17 23:59:06', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (76, 1, '2020-07-18 00:01:45', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (77, 4, '2020-07-18 00:01:51', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (78, 4, '2020-07-18 00:02:34', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (79, 4, '2020-07-18 00:05:59', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (80, 4, '2020-07-18 00:07:00', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (81, 1, '2020-07-18 00:11:52', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (82, 1, '2020-07-18 00:22:45', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (83, 3, '2020-07-18 00:23:01', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (84, 1, '2020-07-18 00:24:07', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (85, 2, '2020-07-18 00:24:14', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (86, 1, '2020-07-18 00:36:05', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (87, 1, '2020-07-18 00:40:27', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (88, 1, '2020-07-18 00:42:02', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (89, 1, '2020-07-18 00:42:16', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (90, 1, '2020-07-18 00:42:20', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (91, 1, '2020-07-18 00:44:54', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (92, 1, '2020-07-18 00:49:24', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (93, 2, '2020-07-18 00:58:52', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (94, 1, '2020-07-18 13:29:51', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (95, 1, '2020-07-18 13:38:58', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (96, 1, '2020-07-18 13:39:35', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (97, 1, '2020-07-18 13:41:11', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (98, 1, '2020-07-18 15:54:19', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (99, 1, '2020-07-18 17:12:10', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (100, 1, '2020-07-18 17:12:21', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (101, 1, '2020-07-18 17:15:15', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (102, 1, '2020-07-18 17:15:37', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (103, 1, '2020-07-18 18:09:51', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (104, 1, '2020-07-18 21:14:48', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (105, 1, '2020-07-18 21:34:03', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (106, 1, '2020-07-18 21:41:07', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (107, 1, '2020-07-18 21:48:26', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (108, 1, '2020-07-18 21:53:53', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (109, 1, '2020-07-18 21:57:29', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (110, 1, '2020-07-18 22:04:23', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (111, 1, '2020-07-18 22:05:34', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (112, 1, '2020-07-18 22:05:53', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (113, 3, '2020-07-18 22:06:05', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (114, 1, '2020-07-18 22:06:11', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (115, 1, '2020-07-18 22:08:34', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (116, 1, '2020-07-18 22:17:15', '127.0.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (117, 1, '2020-07-18 22:19:40', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (118, 1, '2020-07-18 22:20:06', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (119, 1, '2020-07-18 22:26:03', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (120, 1, '2020-07-18 22:26:24', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (121, 1, '2020-07-18 22:57:28', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (122, 1, '2020-07-18 23:09:35', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (123, 1, '2020-07-18 23:13:12', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (124, 1, '2020-07-18 23:13:27', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (125, 3, '2020-07-18 23:18:42', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (126, 1, '2020-07-18 23:22:46', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (127, 2, '2020-07-18 23:44:44', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (128, 1, '2020-07-18 23:58:29', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (129, 1, '2020-07-19 12:35:49', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (130, 1, '2020-07-19 14:10:33', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (131, 1, '2020-07-19 14:53:51', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (132, 1, '2020-07-19 15:31:37', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (133, 1, '2020-07-19 16:07:45', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (134, 1, '2020-07-19 16:09:07', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (135, 1, '2020-07-19 16:10:06', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (136, 1, '2020-07-19 16:18:52', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (137, 1, '2020-07-19 16:24:53', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (138, 1, '2020-07-19 16:31:02', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (139, 1, '2020-07-19 16:43:16', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (140, 1, '2020-07-19 16:47:03', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (141, 1, '2020-07-19 16:50:41', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (142, 1, '2020-07-19 16:52:42', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (143, 1, '2020-07-19 17:01:22', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (144, 1, '2020-07-19 17:19:20', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (145, 1, '2020-07-19 17:52:16', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (146, 1, '2020-07-19 17:56:00', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (147, 1, '2020-07-19 18:22:43', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (148, 1, '2020-07-19 18:23:19', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (149, 1, '2020-07-19 18:33:49', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (150, 1, '2020-07-19 18:41:17', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (151, 1, '2020-07-19 19:55:29', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (152, 1, '2020-07-19 19:59:29', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (153, 1, '2020-07-20 10:12:18', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (154, 1, '2020-07-20 10:31:50', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (155, 1, '2020-07-20 10:49:37', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (156, 1, '2020-07-20 10:50:32', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (157, 1, '2020-07-20 12:45:40', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (158, 1, '2020-07-20 12:46:02', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (159, 1, '2020-07-20 12:46:08', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (160, 1, '2020-07-20 12:49:41', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (161, 1, '2020-07-20 12:53:46', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (162, 1, '2020-07-20 12:53:58', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (163, 1, '2020-07-20 13:04:47', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (164, 1, '2020-07-20 13:12:08', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (165, 1, '2020-07-20 14:35:39', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (166, 1, '2020-07-20 14:54:37', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (167, 1, '2020-07-20 16:09:50', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (168, 1, '2020-07-20 16:46:00', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (169, 1, '2020-07-20 17:22:56', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (170, 1, '2020-07-20 17:47:25', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (171, 1, '2020-07-20 18:45:15', '127.0.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (172, 1, '2020-07-20 19:01:49', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (173, 1, '2020-07-20 19:15:16', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (174, 1, '2020-07-20 19:21:30', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (175, 1, '2020-07-20 20:39:22', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (176, 1, '2020-07-20 20:49:31', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (177, 1, '2020-07-20 20:57:07', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (178, 1, '2020-07-20 21:28:28', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (179, 1, '2020-07-21 00:35:01', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (180, 1, '2020-07-21 06:38:37', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (181, 1, '2020-07-21 09:31:48', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (182, 1, '2020-07-21 10:22:22', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (183, 1, '2020-07-21 10:36:21', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (184, 1, '2020-07-21 10:39:05', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (185, 1, '2020-07-21 10:52:26', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (186, 1, '2020-07-21 15:29:00', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (187, 1, '2020-07-21 15:38:13', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (188, 1, '2020-07-21 15:42:04', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (189, 1, '2020-07-21 15:42:13', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (190, 1, '2020-07-21 15:52:55', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (191, 1, '2020-07-21 15:53:28', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (192, 1, '2020-07-21 16:18:38', '127.0.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (193, 1, '2020-07-21 16:31:28', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (194, 1, '2020-07-21 16:41:56', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (195, 1, '2020-07-21 17:48:04', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (196, 8, '2020-07-21 17:58:59', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (197, 1, '2020-07-21 20:01:19', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (198, 1, '2020-07-21 20:13:49', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (199, 1, '2020-07-21 20:22:16', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (200, 1, '2020-07-21 20:32:51', '127.0.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (201, 1, '2020-07-21 20:36:36', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (202, 1, '2020-07-21 20:45:10', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (203, 8, '2020-07-21 21:35:53', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (204, 1, '2020-07-21 21:51:39', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (205, 2, '2020-07-21 21:59:02', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (206, 3, '2020-07-21 21:59:25', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (207, 3, '2020-07-21 21:59:40', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (208, 3, '2020-07-21 22:01:30', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (209, 3, '2020-07-21 22:03:23', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (210, 1, '2020-07-21 22:05:11', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (211, 1, '2020-07-21 23:34:22', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (212, 3, '2020-07-22 00:02:29', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (213, 1, '2020-07-22 00:05:46', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (214, 1, '2020-07-22 01:03:56', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (215, 1, '2020-07-22 09:37:10', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (216, 3, '2020-07-22 09:53:43', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (217, 1, '2020-07-22 09:54:17', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (218, 1, '2020-07-22 09:54:18', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (219, 1, '2020-07-22 10:04:12', '127.0.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (220, 1, '2020-07-22 10:04:46', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (221, 1, '2020-07-22 10:11:08', '127.0.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (222, 1, '2020-07-22 10:11:59', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (223, 1, '2020-07-22 10:30:40', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (224, 1, '2020-07-22 11:53:56', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (225, 1, '2020-07-22 18:15:23', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (226, 1, '2020-07-22 18:25:30', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (227, 3, '2020-07-22 18:25:41', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (228, 1, '2020-07-22 18:25:51', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (229, 1, '2020-07-23 14:27:28', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (230, 1, '2020-07-23 14:47:32', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (231, 1, '2020-07-23 14:59:13', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (232, 1, '2020-07-23 16:37:15', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (233, 1, '2020-07-24 07:29:27', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (234, 1, '2020-07-24 07:56:48', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (235, 3, '2020-07-24 07:57:01', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (236, 1, '2020-07-24 07:57:10', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (237, 1, '2020-07-24 07:59:18', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (238, 1, '2020-07-24 08:28:20', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (239, 1, '2020-07-24 09:18:23', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (240, 1, '2020-07-24 11:15:31', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (241, 1, '2020-07-24 11:52:20', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (242, 3, '2020-07-24 11:58:22', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (243, 1, '2020-07-24 13:46:25', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (244, 3, '2020-07-24 14:08:26', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (245, 1, '2020-07-24 14:08:41', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (246, 1, '2020-07-24 14:32:24', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (247, 1, '2020-07-24 14:36:04', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (248, 1, '2020-07-24 14:36:58', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (249, 1, '2020-07-24 14:51:58', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (250, 1, '2021-05-14 21:08:33', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (251, 1, '2021-05-16 17:35:08', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (252, 1, '2021-05-17 13:37:11', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (253, 1, '2021-05-18 15:50:13', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (254, 1, '2021-11-01 11:01:35', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (255, 1, '2021-11-29 20:38:49', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (256, 1, '2021-11-29 21:14:37', '127.0.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (257, 1, '2021-11-29 22:34:18', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (258, 1, '2021-12-01 13:42:05', '0:0:0:0:0:0:0:1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (259, 1, '2021-12-01 14:35:49', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (260, 1, '2021-12-02 16:19:42', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (261, 1, '2021-12-04 14:05:45', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (262, 1, '2021-12-04 14:20:06', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (263, 1, '2021-12-23 21:31:22', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (264, 3, '2021-12-25 08:40:32', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (265, 1, '2021-12-25 08:41:01', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (266, 1, '2021-12-25 09:11:21', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (267, 1, '2021-12-25 09:15:25', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (268, 1, '2021-12-25 11:04:09', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (269, 2, '2021-12-25 11:05:34', '172.17.0.1', NULL, NULL, NULL);
INSERT INTO `sys_user_login_log` VALUES (270, 1, '2021-12-25 11:05:49', '172.17.0.1', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for sys_user_login_logout_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_login_logout_log`;
CREATE TABLE `sys_user_login_logout_log`  (
  `ull_id` int(10) UNSIGNED NOT NULL COMMENT '主键',
  `usi_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户表主键',
  `token` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户登录token',
  `terminal_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '终端版本类别 1-APP 2-web',
  `operating_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '1-login 2-logout',
  `operating_date` timestamp NULL DEFAULT NULL COMMENT '操作时间',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`ull_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role_relation`;
CREATE TABLE `sys_user_role_relation`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(20) NULL DEFAULT NULL,
  `role_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_role_relation
-- ----------------------------
INSERT INTO `sys_user_role_relation` VALUES (1, 1, 1);
INSERT INTO `sys_user_role_relation` VALUES (2, 2, 2);
INSERT INTO `sys_user_role_relation` VALUES (9, 3, 3);
INSERT INTO `sys_user_role_relation` VALUES (10, 4, 1);
INSERT INTO `sys_user_role_relation` VALUES (11, 1, 1);
INSERT INTO `sys_user_role_relation` VALUES (12, 6, 1);
INSERT INTO `sys_user_role_relation` VALUES (13, 1, 1);
INSERT INTO `sys_user_role_relation` VALUES (14, 1, 0);
INSERT INTO `sys_user_role_relation` VALUES (15, 8, 1);

-- ----------------------------
-- Table structure for waa_wallet_account
-- ----------------------------
DROP TABLE IF EXISTS `waa_wallet_account`;
CREATE TABLE `waa_wallet_account`  (
  `buyer_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户名',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `password` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付密码，加密串',
  `available_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '可用金额',
  `depositing_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '充值中金额',
  `withdrawing_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '提现中金额',
  `status` tinyint(4) NULL DEFAULT NULL COMMENT '状态  7 -正常,  17 -冻结',
  `create_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_time` timestamp NULL DEFAULT NULL COMMENT '最后更新时间',
  `account_type` int(11) NULL DEFAULT NULL COMMENT '账户类型:1-客户 2-厂家',
  `auto_pay_status` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0-FALSE 1-TRUE',
  `currency` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '币种：USD,RMB',
  PRIMARY KEY (`buyer_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10091 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of waa_wallet_account
-- ----------------------------
INSERT INTO `waa_wallet_account` VALUES (10, 'yousa', 'yousa@163.com', '7c4a8d09ca3762af61e59520943dc26494f8941b', 0.0000, 100.0000, 100.0000, 7, NULL, '2020-07-05 22:28:10', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `waa_wallet_account` VALUES (11, '20200707', '20200707@qq.com', 'b714abd3fde769514e5c6776098500f5f7c7f90a', 995932.0000, 10000.0000, 10.0000, 7, NULL, '2020-07-07 15:41:53', NULL, '2020-07-10 21:12:39', NULL, NULL, NULL);
INSERT INTO `waa_wallet_account` VALUES (31, 'str', 'sa@163.com', 'ecb252044b5ea0f679ee78ec1a12904739e2904d', 0.0000, 0.0000, 0.0000, 7, NULL, '2020-07-08 11:38:38', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `waa_wallet_account` VALUES (32, '20200708', '20200708@qq.com', '4d58f6014df02dbc1190ae1d6bbcf885ea049c79', 0.0000, 0.0000, 0.0000, 7, NULL, '2020-07-08 11:49:11', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `waa_wallet_account` VALUES (33, '20270808', '2020070808@qq.com', '6b265d3fc4439ad97c0a9f5cdcc1c29ef45aace4', 0.0000, 0.0000, 0.0000, 7, NULL, '2020-07-08 11:49:33', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `waa_wallet_account` VALUES (10086, 'qiuxiaolin', 'qiuxiaolin@qq.com', '123456', 1000.0000, 0.0000, 0.0000, 7, NULL, '2020-07-17 09:03:02', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `waa_wallet_account` VALUES (10090, 'admin', NULL, 'ecb252044b5ea0f679ee78ec1a12904739e2904d', 703264.0000, 100.0000, 100.0000, 7, NULL, '2020-07-20 11:10:37', NULL, '2021-05-17 19:26:40', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for wit_wishlist
-- ----------------------------
DROP TABLE IF EXISTS `wit_wishlist`;
CREATE TABLE `wit_wishlist`  (
  `wit_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dsr_id` int(11) NULL DEFAULT NULL COMMENT '借卖方ID，关联dsr表',
  `pro_id` int(11) NULL DEFAULT NULL COMMENT '外键 关联Pro表主键\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态：0表示无效，1表示有效',
  PRIMARY KEY (`wit_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = ' 借卖方心愿单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wit_wishlist
-- ----------------------------
INSERT INTO `wit_wishlist` VALUES (1, 1, 16, 'admin', '2021-12-25 08:59:13', NULL, NULL, NULL, NULL, '1');

-- ----------------------------
-- Table structure for wta_wallet_transaction_aduit
-- ----------------------------
DROP TABLE IF EXISTS `wta_wallet_transaction_aduit`;
CREATE TABLE `wta_wallet_transaction_aduit`  (
  `transaction_audit_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `buyer_id` int(11) NULL DEFAULT NULL COMMENT '买家id',
  `transaction_id` int(11) NULL DEFAULT NULL COMMENT '业务记录id',
  `available_money_before` decimal(10, 4) NULL DEFAULT NULL COMMENT '前可用余额',
  `depositing_money_before` decimal(10, 4) NULL DEFAULT NULL COMMENT '前充值中金额',
  `withdrawing_money_before` decimal(10, 4) NULL DEFAULT NULL COMMENT '前提现中金额',
  `operate_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '操作金额',
  `operate_type` tinyint(4) NULL DEFAULT NULL COMMENT '操作类型 1-申请 2-提现 3-消费 4-退款',
  `available_money_after` decimal(10, 4) NULL DEFAULT NULL COMMENT '变更后可用余额',
  `depositing_money_after` decimal(10, 4) NULL DEFAULT NULL COMMENT '变更后充值中金额',
  `withdrawing_money_after` decimal(10, 4) NULL DEFAULT NULL COMMENT '变更后提现中金额',
  `operate_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人',
  `status` tinyint(4) NULL DEFAULT NULL COMMENT '操作状态 2-申请 , 4 -完成 , -1-失败',
  `create_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_time` timestamp NULL DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`transaction_audit_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for wtr_wallet_transaction_record
-- ----------------------------
DROP TABLE IF EXISTS `wtr_wallet_transaction_record`;
CREATE TABLE `wtr_wallet_transaction_record`  (
  `transaction_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `buyer_id` int(11) NULL DEFAULT NULL COMMENT '买家id',
  `bank_card_id` int(11) NULL DEFAULT NULL COMMENT '银行卡id for 充值、提现、退款,  卡账户消费情况下为空',
  `transaction_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流水号，GM应用生成',
  `transaction_type` tinyint(4) NULL DEFAULT NULL COMMENT '业务类型 1-充值 2-提现 3-消费 4-退款',
  `account_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'gmcp$account.account_name 账户名',
  `transaction_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '金额',
  `commission` decimal(10, 4) NULL DEFAULT NULL COMMENT '手续费',
  `discount_commission` decimal(10, 4) NULL DEFAULT NULL COMMENT '折后手续费',
  `transaction_method` tinyint(4) NULL DEFAULT NULL COMMENT '方式 0-T/T 1-Paypal 2-现金 3消费',
  `complete_time` datetime NULL DEFAULT NULL COMMENT '完成时间',
  `status` tinyint(4) NULL DEFAULT NULL COMMENT '状态 2 -申请 , 4 -完成 , -1-失败',
  `actual_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '实际金额',
  `actual_commission` decimal(10, 4) NULL DEFAULT NULL COMMENT '实际手续费',
  `actual_discount_commission` decimal(10, 4) NULL DEFAULT NULL COMMENT '折后实际手续费',
  `balance` decimal(10, 4) NULL DEFAULT NULL COMMENT '余额',
  `business_id` int(11) NULL DEFAULT NULL COMMENT '订单id 针对消费,  gmsales.trade.id',
  `finance_type` tinyint(4) NULL DEFAULT NULL COMMENT '类型 1-入款 2-出款',
  `note` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `operator_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人',
  `operator_ip` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人IP',
  `create_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_time` timestamp NULL DEFAULT NULL COMMENT '最后更新时间',
  `bank_receipt_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行请求地址',
  `exchange_rate` decimal(10, 4) NULL DEFAULT NULL COMMENT '转换汇率',
  `transaction_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流水描述',
  `foreign_exchange_fee` decimal(10, 4) NULL DEFAULT NULL COMMENT '外汇',
  `withdraw_fee` decimal(10, 4) NULL DEFAULT NULL COMMENT '处理费',
  PRIMARY KEY (`transaction_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 175 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wtr_wallet_transaction_record
-- ----------------------------
INSERT INTO `wtr_wallet_transaction_record` VALUES (5, 9, NULL, '20200706155611388169', 4, 'qxltest', 100.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, '20200706155611388169', NULL, NULL, NULL, '2020-07-06 15:56:11', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (6, 9, NULL, '20200706160114151854', 4, 'qxltest', 100.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, '？', NULL, NULL, NULL, '2020-07-06 16:01:15', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (7, 9, NULL, '20200706160632429697', 4, 'qxltest', 100.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, '20200706160632429697', NULL, NULL, NULL, '2020-07-06 16:06:33', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (8, 9, NULL, '20200706161121948497', 3, 'qxltest', 50.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, '20200706161121948497', NULL, NULL, NULL, '2020-07-06 16:11:21', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (9, 9, NULL, '20200706161149345572', 1, 'qxltest', 100.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, 'zzz', NULL, NULL, NULL, '2020-07-06 16:11:50', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (10, 11, NULL, '20200707194109314541', 1, 'qxltest', 20.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, 'aaaa', NULL, NULL, NULL, '2020-07-07 19:41:10', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (11, 11, NULL, '20200707194254289162', 2, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, '整挺好', NULL, NULL, NULL, '2020-07-07 19:42:55', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (12, 11, NULL, '20200707202937686765', 1, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, 'aaa', NULL, NULL, NULL, '2020-07-07 20:29:38', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (13, 11, NULL, '2020070720304114080', 1, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, 'aaa', NULL, NULL, NULL, '2020-07-07 20:30:41', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (14, 11, NULL, '2020070720495493304', 2, 'qxltest', 1.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, 'aaa', NULL, NULL, NULL, '2020-07-07 20:49:55', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (15, 11, NULL, '20200707205034820192', 2, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, NULL, NULL, '2020-07-07 20:50:34', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (16, 11, NULL, '20200707205121587755', 1, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-07 20:51:21', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (17, 11, NULL, '20200707205209719407', 1, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, 'aaa', NULL, NULL, NULL, '2020-07-07 20:52:10', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (18, 11, NULL, '20200707205449617327', 1, 'qxltest', 100.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, NULL, NULL, '2020-07-07 20:54:50', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (19, 11, NULL, '20200707205507582654', 2, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, '', NULL, NULL, NULL, '2020-07-07 20:55:08', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (20, 11, NULL, '20200707210642680661', 2, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, 'aaa', NULL, NULL, NULL, '2020-07-07 21:06:43', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (21, 11, NULL, '20200707210817776461', 2, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, '..', NULL, NULL, NULL, '2020-07-07 21:08:18', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (22, 11, NULL, '20200707210842406507', 2, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, 'pass', NULL, NULL, NULL, '2020-07-07 21:08:43', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (23, 11, NULL, '20200707210935840055', 2, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, 'pass', NULL, NULL, NULL, '2020-07-07 21:09:35', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (24, 11, NULL, '20200707211107471152', 2, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, 'pass', NULL, NULL, NULL, '2020-07-07 21:11:08', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (25, 11, NULL, '20200707231309427873', 1, 'qxltest', 10.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, 'pass', NULL, NULL, NULL, '2020-07-07 23:13:09', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (26, 11, NULL, '20200707231314707843', 1, 'admin', 10.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, 'pass', NULL, NULL, NULL, '2020-07-07 23:13:15', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (27, 11, NULL, '20200707231402294371', 1, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-07 23:14:02', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (29, 11, NULL, '20200707231433685514', 1, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-07 23:14:33', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (30, 11, NULL, '20200707231505401440', 1, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-07 23:15:05', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (31, 11, NULL, '20200707231611473395', 1, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-07 23:16:11', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (32, 11, NULL, '20200707231851412356', 2, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-07 23:18:52', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (33, 11, NULL, '20200708170101207904', 1, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-08 17:01:02', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (34, 9, NULL, '20200709213423954899', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 21:34:23', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (35, 9, NULL, '2020070921371420106', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 21:37:14', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (36, 9, NULL, '20200709214200273653', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 21:42:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (37, 9, NULL, '20200709214445744753', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 21:44:46', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (38, 9, NULL, '2020070921512115219', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 21:51:22', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (39, 9, NULL, '20200709220215906260', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 22:02:16', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (40, 9, NULL, '20200709221923802534', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 22:19:24', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (41, 9, NULL, '2020070922243869427', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 22:24:38', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (42, 9, NULL, '20200709222821781079', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 22:28:21', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (43, 9, NULL, '20200709223201228432', 3, 'admin', 1.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 22:32:02', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (44, 9, NULL, '2020070922400118179', 3, 'admin', 1.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-09 22:40:01', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (45, 11, NULL, '20200710170531279676', 3, 'admin', 0.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 17:05:32', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (46, 11, NULL, '20200710173633398995', 3, 'admin', 0.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 17:36:34', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (47, 11, NULL, '20200710183450583165', 3, 'admin', 0.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 18:34:50', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (48, 11, NULL, '20200710183955580558', 3, 'admin', 0.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 18:39:55', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (49, 11, NULL, '2020071020191245677', 3, 'admin', 0.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 20:19:12', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (50, 9, NULL, '20200710204258672804', 3, 'admin', 1.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 20:42:58', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (51, 9, NULL, '20200710204320977596', 4, 'admin', 1.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 20:43:21', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (52, 11, NULL, '20200710205855668541', 3, 'admin', 0.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 20:58:56', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (53, 11, NULL, '20200710210037693436', 3, 'admin', 0.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 21:00:37', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (54, 11, NULL, '20200710210526544171', 1, 'admin', 10000.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, '必须通过', NULL, NULL, NULL, '2020-07-10 21:05:26', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (55, 11, NULL, '20200710210711708850', 3, 'admin', 0.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, 'aaaa', NULL, NULL, NULL, '2020-07-10 21:07:12', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (56, 11, NULL, '20200710210742915814', 3, 'admin', 2034.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 21:07:42', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (57, 11, NULL, '20200710211057792323', 3, 'admin', 1017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 21:10:58', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (58, 11, NULL, '20200710211239475900', 3, 'admin', 1017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-10 21:12:39', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (59, 10086, NULL, '12345678901234567890', 3, 'admin', 2048.0000, NULL, NULL, NULL, NULL, 4, NULL, NULL, NULL, NULL, NULL, NULL, 'test_case', NULL, NULL, NULL, '2020-07-16 18:01:25', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (60, 10086, NULL, '20200717090510192439', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-17 09:05:11', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (61, 10086, NULL, '20200717091005796179', 2, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-17 09:10:06', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (62, 10086, NULL, '20200717095123864087', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-17 09:51:24', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (63, 9, NULL, '20200717095423668839', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-17 09:54:24', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (77, 9, NULL, '20200721091821236975', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 09:18:22', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (78, 9, NULL, '20200721092428439568', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 09:24:28', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (79, 9, NULL, '20200721093748966437', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 09:37:48', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (80, 9, NULL, '20200721094412929074', 3, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 09:44:12', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (81, 9, NULL, '20200721101955591267', 4, 'admin', 10.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 10:19:56', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (82, 10090, NULL, '20200721160505804233', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:05:05', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (83, 10090, NULL, '20200721161430867522', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:14:31', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (84, 10090, NULL, '20200721161513100634', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:15:13', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (85, 10090, NULL, '20200721161907845343', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:19:08', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (86, 10090, NULL, '20200721161928863759', 3, 'admin', 8034.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:19:29', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (87, 10090, NULL, '20200721162941181736', 3, 'admin', 20085.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:29:42', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (88, 10090, NULL, '20200721163158743693', 3, 'admin', 24102.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:31:58', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (89, 10090, NULL, '2020072116322259055', 3, 'admin', 28119.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:32:22', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (90, 10090, NULL, '20200721163310205685', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:33:11', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (91, 10090, NULL, '20200721163554828958', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:35:54', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (92, 10090, NULL, '20200721163558854700', 3, 'admin', 8034.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:35:59', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (93, 10090, NULL, '20200721163601539086', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:36:02', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (94, 10090, NULL, '20200721163638182265', 3, 'admin', 8034.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:36:38', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (95, 10090, NULL, '2020072116370552050', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:37:05', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (96, 10090, NULL, '20200721163833876207', 3, 'admin', 13017.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:38:34', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (97, 10090, NULL, '20200721164311970949', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:43:11', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (98, 10090, NULL, '20200721164327553177', 3, 'admin', 8034.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:43:27', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (99, 10090, NULL, '20200721164331661926', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:43:32', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (100, 10090, NULL, '20200721164344340729', 3, 'admin', 12051.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:43:44', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (101, 10090, NULL, '2020072116435121275', 3, 'admin', 16068.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:43:52', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (102, 10090, NULL, '20200721164429610812', 3, 'admin', 20085.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:44:30', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (103, 10090, NULL, '2020072116465836675', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:46:59', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (104, 10090, NULL, '20200721164858851458', 3, 'admin', 13017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:48:59', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (105, 10090, NULL, '20200721164910765205', 3, 'admin', 26034.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:49:10', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (106, 10090, NULL, '20200721165507938088', 3, 'admin', 13017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:55:07', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (107, 10090, NULL, '20200721165510130250', 3, 'admin', 26034.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:55:10', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (108, 10090, NULL, '20200721165718781694', 3, 'admin', 17.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:57:18', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (109, 10090, NULL, '20200721165756858032', 3, 'admin', 17.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:57:57', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (110, 10090, NULL, '20200721165816125071', 3, 'admin', 34.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:58:17', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (111, 10090, NULL, '20200721165836958155', 3, 'admin', 51.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:58:37', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (112, 10090, NULL, '20200721165931139903', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 16:59:32', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (113, 10090, NULL, '20200721170150230447', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 17:01:51', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (114, 10090, NULL, '20200721170224470959', 3, 'admin', 8034.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 17:02:24', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (115, 10090, NULL, '20200721170547160595', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 17:05:48', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (116, 10090, NULL, '20200721170830455493', 3, 'admin', 8034.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 17:08:30', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (117, 10090, NULL, '20200721170837971142', 3, 'admin', 12051.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 17:08:38', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (118, 10090, NULL, '20200721171033339018', 3, 'admin', 16068.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 17:10:33', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (119, 10090, NULL, '20200721190827669256', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 19:08:27', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (120, 10090, NULL, '20200721190920815942', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 19:09:20', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (121, 10090, NULL, '20200721190927831579', 3, 'admin', 8034.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 19:09:27', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (122, 10090, NULL, '20200721191118305271', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 19:11:19', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (123, 10090, NULL, '20200721194606135029', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 19:46:07', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (124, 10090, NULL, '20200721194737810883', 3, 'admin', 4017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 19:47:37', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (125, 10090, NULL, '20200721195628848398', 3, 'admin', 9017.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 19:56:29', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (126, 10090, NULL, '20200721195632953146', 3, 'admin', 18034.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 19:56:32', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (127, 10090, NULL, '20200721202249256697', 3, 'admin', 17.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 20:22:49', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (128, 10090, NULL, '20200721202305341263', 3, 'admin', 17.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 20:23:06', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (129, 10090, NULL, '20200721202423586672', 3, 'admin', 9017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 20:24:23', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (130, 10090, NULL, '20200721202504662807', 3, 'admin', 9017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 20:25:05', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (131, 10090, NULL, '20200721202845423661', 3, 'admin', 9017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 20:28:46', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (132, 10090, NULL, '20200721203830882875', 3, 'admin', 4014.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 20:38:31', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (133, 10090, NULL, '20200721210935911319', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 21:09:36', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (134, 10090, NULL, '20200721212203259881', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 21:22:03', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (135, 10090, NULL, '20200721212210685842', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 21:22:11', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (136, 10090, NULL, '20200721212218905365', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 21:22:18', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (139, 10090, NULL, '20200721212754402902', 2, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 21:27:54', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (140, 10090, NULL, '20200721213056215943', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 21:30:57', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (141, 10090, NULL, '20200721213115814738', 2, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 21:31:15', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (142, 10090, NULL, '20200721233438387393', 2, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 23:34:39', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (143, 10090, NULL, '20200721233516221654', 2, 'admin', 1000.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 23:35:17', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (144, 10090, NULL, '20200721233527863149', 2, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 23:35:27', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (145, 10090, NULL, '20200721235410908545', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 23:54:10', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (146, 10090, NULL, '20200721235603141446', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 23:56:04', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (147, 10090, NULL, '20200721235725335184', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 23:57:26', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (148, 10090, NULL, '20200721235845683564', 2, 'admin', 800000.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 23:58:45', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (149, 10090, NULL, '20200721235919464179', 2, 'admin', 100.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-21 23:59:20', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (150, 10090, NULL, '20200722095737308096', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-22 09:57:38', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (151, 10090, NULL, '20200722095831330655', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-22 09:58:31', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (152, 10090, NULL, '20200722095955822506', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-22 09:59:55', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (153, 10090, NULL, '20200722100127775099', 2, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-22 10:01:27', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (154, 10090, NULL, '20200722100243165718', 2, 'admin', 100.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-22 10:02:44', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (155, 10090, NULL, '20200722100636815793', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-22 10:06:37', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (156, 10090, NULL, '20200722100826761716', 1, 'admin', 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-22 10:08:27', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (157, 10090, NULL, '20200722100847188376', 2, 'admin', 800000.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-22 10:08:48', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (158, 10090, NULL, '20200722101614248607', 1, 'admin', 123456.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-22 10:16:15', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (159, 10090, NULL, '2020072408383340636', 2, NULL, 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-24 08:38:34', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (160, 10090, NULL, '20200724084729138759', 3, NULL, 1019.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-24 08:47:29', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (161, 10090, NULL, '20200724085130514026', 1, NULL, 100.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-24 08:51:31', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (162, 10090, NULL, '20200724085138258312', 1, NULL, 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-24 08:51:39', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (163, 10090, NULL, '20200724101717788900', 3, NULL, 3617.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-24 10:17:18', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (164, 10090, NULL, '20200724102015432249', 1, NULL, 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-24 10:20:15', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (165, 10090, NULL, '20200724103328648088', 3, NULL, 5014.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-24 10:33:28', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (166, 10090, NULL, '20200724113431307780', 2, NULL, 100.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2020-07-24 11:34:32', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (167, 10090, NULL, '20210517192456380569', 3, NULL, 2034.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-17 19:24:56', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (168, 10090, NULL, '20210517192456145260', 3, NULL, 1017.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-17 19:24:56', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (169, 10090, NULL, '20210517192521311949', 3, NULL, 3051.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-17 19:25:22', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (170, 10090, NULL, '2021051719252656745', 3, NULL, 4068.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-17 19:25:26', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (171, 10090, NULL, '20210517192530922091', 3, NULL, 5085.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-17 19:25:30', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (172, 10090, NULL, '20210517192534786420', 3, NULL, 6102.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-17 19:25:35', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (173, 10090, NULL, '20210517192540288911', 3, NULL, 7119.0000, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-17 19:25:41', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `wtr_wallet_transaction_record` VALUES (174, 10090, NULL, '20210517192640954557', 3, NULL, 1017.0000, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2021-05-17 19:26:40', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
