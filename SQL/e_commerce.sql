/*
 Navicat Premium Data Transfer

 Source Server         : 东软
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : 101.201.254.128:13306
 Source Schema         : e_commerce

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 23/07/2020 16:42:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for brd_brand
-- ----------------------------
DROP TABLE IF EXISTS `brd_brand`;
CREATE TABLE `brd_brand`  (
  `brd_id` int unsigned NOT NULL COMMENT ' 主键',
  `man_id` int(0) NULL DEFAULT NULL COMMENT '公司信息，外键关联man表主键',
  `name_en` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司英文名',
  `name_cn` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司中文名',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`brd_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '品牌信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cat_category
-- ----------------------------
DROP TABLE IF EXISTS `cat_category`;
CREATE TABLE `cat_category`  (
  `cat_id` int unsigned NOT NULL COMMENT '分类ID',
  `cat_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `cat_father_id` int(0) NULL DEFAULT NULL COMMENT '父分类ID',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`cat_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cdm_code_master
-- ----------------------------
DROP TABLE IF EXISTS `cdm_code_master`;
CREATE TABLE `cdm_code_master`  (
  `cdm_id` int unsigned NOT NULL COMMENT ' 主键',
  `code_type` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典类型',
  `description` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用途描述',
  `type_cd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '编码',
  `code_val` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '编码值',
  `seq_no` int(0) NULL DEFAULT NULL COMMENT '排序',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`cdm_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '数据字典表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for drp_dropship_price
-- ----------------------------
DROP TABLE IF EXISTS `drp_dropship_price`;
CREATE TABLE `drp_dropship_price`  (
  `drp_id` int unsigned NOT NULL COMMENT ' 主键',
  `ofp_id` int(0) NULL DEFAULT NULL COMMENT '商品价格id',
  `dsr_id` int(0) NULL DEFAULT NULL COMMENT '借卖方id',
  `war_id` int(0) NULL DEFAULT NULL COMMENT '仓库id',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`drp_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '借卖价格表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dsr_dropshipper
-- ----------------------------
DROP TABLE IF EXISTS `dsr_dropshipper`;
CREATE TABLE `dsr_dropshipper`  (
  `dsr_id` int unsigned NOT NULL COMMENT ' 主键',
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT ' 借卖方名称',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `register_date` timestamp(0) NULL DEFAULT NULL COMMENT '注册时间',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `phone_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`dsr_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10091 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '借卖方表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for eba_ebay_authprization
-- ----------------------------
DROP TABLE IF EXISTS `eba_ebay_authprization`;
CREATE TABLE `eba_ebay_authprization`  (
  `eba_id` int unsigned NOT NULL COMMENT ' 主键',
  `str_id` int(0) NULL DEFAULT NULL COMMENT '网店ID',
  `app_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ebay账号id',
  `secret_key` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ebay密钥',
  `token` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT 'ebay TOKEN',
  `last_modified_time` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单更新时间\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `exp_date` datetime(0) NULL DEFAULT NULL COMMENT 'token失效时间',
  `cancel_date` datetime(0) NULL DEFAULT NULL COMMENT '取消授权时间',
  `account_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`eba_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 240 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '网店授权记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for freight_cost
-- ----------------------------
DROP TABLE IF EXISTS `freight_cost`;
CREATE TABLE `freight_cost`  (
  `province_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '国家及省份编码的组合，作为主键',
  `province_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `shipping_fee` double(11, 2) NULL DEFAULT -1.00 COMMENT '运费',
  PRIMARY KEY (`province_code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goa_government_area
-- ----------------------------
DROP TABLE IF EXISTS `goa_government_area`;
CREATE TABLE `goa_government_area`  (
  `goa_id` int unsigned NOT NULL COMMENT ' 主键',
  `zip_code` int(0) NULL DEFAULT NULL COMMENT '右边',
  `state` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '洲',
  `state_shorthand` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '洲简称',
  `city` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`goa_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '地区表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for img_image
-- ----------------------------
DROP TABLE IF EXISTS `img_image`;
CREATE TABLE `img_image`  (
  `img_id` int unsigned NOT NULL COMMENT ' 主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名字',
  `width` int(0) NULL DEFAULT NULL COMMENT '图片宽，pixel',
  `height` int(0) NULL DEFAULT NULL COMMENT '图片高，pixel',
  `uri` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片地址',
  `type_cd` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'O - 原图 M - 中图 （用于列表) L - 大图 (用于详情页) M2 - 中图(2x) L2 - 大图(2x)\r\n',
  `entity_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联表的主键id',
  `entity_cd` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联自定义的code，PM表示商品类主图',
  `seq_no` int(0) NULL DEFAULT NULL COMMENT '如果一个产品有多图时，要按小到大的顺序进行显示\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`img_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '图片表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for man_manufacturer
-- ----------------------------
DROP TABLE IF EXISTS `man_manufacturer`;
CREATE TABLE `man_manufacturer`  (
  `man_id` int unsigned NOT NULL COMMENT '主键，制造商ID',
  `name_en` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '制造商英文名',
  `name_cn` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '制造商中文名',
  `gmc_report_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌商认证类型 1-TUV,2-UL',
  `gmc_report_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '证书地址',
  `description` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '品牌商公司介绍',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`man_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公司信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for mor_monitor_result
-- ----------------------------
DROP TABLE IF EXISTS `mor_monitor_result`;
CREATE TABLE `mor_monitor_result`  (
  `mor_id` int unsigned NOT NULL COMMENT '主键',
  `class_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类名',
  `json_string` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'Json字符串',
  `create_by` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `sts_cd` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`mor_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = ' 接口表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ofp_offer_price
-- ----------------------------
DROP TABLE IF EXISTS `ofp_offer_price`;
CREATE TABLE `ofp_offer_price`  (
  `ofp_id` int(0) NOT NULL AUTO_INCREMENT,
  `man_id` int(0) NULL DEFAULT NULL COMMENT '制造商ID',
  `effective_start_date` timestamp(0) NULL DEFAULT NULL COMMENT '价格有效期开始时间',
  `effective_end_date` timestamp(0) NULL DEFAULT NULL COMMENT '价格有效期结束时间',
  `pro_id` int(0) NULL DEFAULT NULL COMMENT '外键->商品ID 外键关联pro表',
  `price` decimal(8, 2) NULL DEFAULT NULL COMMENT '单价',
  `type_cd` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对应master表的PRICE_TYPE PUB - 公开借卖价 PRO - 促销价 VIP - 专享价',
  `dsr_id` int(0) NULL DEFAULT NULL COMMENT '借卖方id，关联专享价用，其他类型该字段为空',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁 ',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '有效性',
  `period` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否自动设置价格（1为自动以相同价格进入下一个周期）',
  PRIMARY KEY (`ofp_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for par_parameter
-- ----------------------------
DROP TABLE IF EXISTS `par_parameter`;
CREATE TABLE `par_parameter`  (
  `par_id` int unsigned NOT NULL COMMENT '主键',
  `param_cd` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参数主键',
  `param_value` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参数值',
  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '参数说明',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  ` creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`par_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pck_package_info
-- ----------------------------
DROP TABLE IF EXISTS `pck_package_info`;
CREATE TABLE `pck_package_info`  (
  `pck_id` int unsigned NOT NULL COMMENT '主键',
  `war_id` int(0) NULL DEFAULT NULL COMMENT '仓库ID',
  `pro_id` int(0) NULL DEFAULT NULL COMMENT '绑定的 PRO_ID 与 VAR_ID 只可能有一个',
  `type_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对应master 表PAC_REGISTER M - 厂家设定 W - 仓库注册',
  `width` decimal(7, 2) NULL DEFAULT NULL COMMENT '宽 - cm',
  `height` decimal(7, 2) NULL DEFAULT NULL COMMENT '高 - cm',
  `length` decimal(7, 2) NULL DEFAULT NULL COMMENT '长 - cm',
  `weight` decimal(5, 2) NULL DEFAULT NULL COMMENT '重 - kg',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_updete_date` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `heavy_cargo` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '卡车管道',
  `logistics_company` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管道公司',
  PRIMARY KEY (`pck_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pdn_product_description
-- ----------------------------
DROP TABLE IF EXISTS `pdn_product_description`;
CREATE TABLE `pdn_product_description`  (
  `pdn_id` int unsigned NOT NULL COMMENT '主键',
  `pro_id` int(0) NULL DEFAULT NULL COMMENT '外键->关联pro表主键',
  `type_cd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对应master表TEXTTYPE RICH_TEXT - 图文信息 SIMPLE_TEXT - 简单信息，用于 amazon SELLING_POINTS - 卖点，用于 amazon',
  `descrition` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品描述（富文本、纯文本、卖点）',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创健时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `platform_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '平台类型，ebay：2，Amazon：1',
  PRIMARY KEY (`pdn_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for prc_product_category
-- ----------------------------
DROP TABLE IF EXISTS `prc_product_category`;
CREATE TABLE `prc_product_category`  (
  `prc_id` int unsigned NOT NULL COMMENT '主键id',
  `pro_id` int(0) NULL DEFAULT NULL COMMENT '商品ID',
  `category_id` int(0) NULL DEFAULT NULL COMMENT '分类id',
  `category_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类别名称',
  `category_path` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类别全路径如 ce>digital>mp3',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `call_int` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT ' 状态',
  `platform_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT ' 平台类型,ebay：2，Amazon：1',
  PRIMARY KEY (`prc_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 60 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pro_product
-- ----------------------------
DROP TABLE IF EXISTS `pro_product`;
CREATE TABLE `pro_product`  (
  `pro_id` int unsigned NOT NULL COMMENT '主键id',
  `sku_cd` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品sku编码',
  `brd_id` int(0) NULL DEFAULT NULL COMMENT '外键->关联品牌id',
  `man_id` int(0) NULL DEFAULT NULL COMMENT '外键->关联man_id',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `upc` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'upc编码',
  `ean` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ena编码',
  `model` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '型号',
  `warranty_day` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '保修期（单位有年、月、日）',
  `retail_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '建议零售价',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `call_int` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态（a，b，c，d分别为待入仓、入仓中、待上架、上架中）',
  `mininum_retail_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '最低零售价',
  `replenishment_period` int(0) NULL DEFAULT NULL COMMENT '补货期（天）',
  `key_words` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关键字，预留后续搜索使用',
  `warranty` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '保修政策说明',
  `time_unit` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '保修期单位 1、年 2、月 3、日',
  `stockseting` int(0) NULL DEFAULT NULL COMMENT '库存预警设置（当低于预警值时发出警告）',
  `prc_id` int(0) NULL DEFAULT NULL COMMENT '主分类ID',
  PRIMARY KEY (`pro_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sal_sales_order_line_item
-- ----------------------------
DROP TABLE IF EXISTS `sal_sales_order_line_item`;
CREATE TABLE `sal_sales_order_line_item`  (
  `sal_id` int unsigned NOT NULL COMMENT ' 主键',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `sao_id` int(0) NULL DEFAULT NULL COMMENT '销售订单表主id',
  `pro_id` int(0) NULL DEFAULT NULL COMMENT '商品ID',
  `qty` int(0) NULL DEFAULT NULL COMMENT '商品数量',
  `price` decimal(8, 2) NULL DEFAULT NULL COMMENT '商品单价',
  `sol_id` int(0) NULL DEFAULT NULL COMMENT '同步数据id',
  `tracking_no` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物流跟踪号',
  `wsp_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快递公司',
  PRIMARY KEY (`sal_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 108 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '销售订单明细' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sao_sales_order
-- ----------------------------
DROP TABLE IF EXISTS `sao_sales_order`;
CREATE TABLE `sao_sales_order`  (
  `sao_id` int unsigned NOT NULL COMMENT ' 主键',
  `created_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `man_id` int(0) NULL DEFAULT NULL COMMENT '制造商ID',
  `war_id` int(0) NULL DEFAULT NULL COMMENT '仓库ID',
  `sync_date` timestamp(0) NULL DEFAULT NULL COMMENT '第一次同步时间',
  `payment_date` timestamp(0) NULL DEFAULT NULL COMMENT '支付时间',
  `push_date` timestamp(0) NULL DEFAULT NULL COMMENT '推送到仓库的时间',
  `track_no_date` timestamp(0) NULL DEFAULT NULL COMMENT '取得物流跟踪号的时间',
  `fulfillment_date` timestamp(0) NULL DEFAULT NULL COMMENT '物流妥投的时间',
  `settlement_date` timestamp(0) NULL DEFAULT NULL COMMENT '结款时间',
  `product_amount` decimal(8, 2) NULL DEFAULT NULL COMMENT '订单价格',
  `freight_cost` decimal(8, 2) NULL DEFAULT NULL COMMENT '运费',
  `handling_fee` decimal(8, 2) NULL DEFAULT NULL COMMENT '订单处理费',
  `customer_remark` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消费者备注',
  `order_no` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单编号, SO + 8位数字: 例如: SO00000001 , 当订单号多于一千万时，第一位变为由A到Z\r\n',
  `order_sts` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单状态: 1. AwaitingPayment 2. AwaitingShipment 3. SHIPPED 已发货 4. Complete 已完成5. Canceled已取消\r\n',
  `refund_sts` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '退款状态 1. OPEN - 开启 2. CLOSE - 已完结\r\n',
  `delivery_sts` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发货状态 1. SYNC - 已同步到仓库 2. STOCK_OUT - 已出库 3. SHIPPING - 发货中 4. FULFILLED - 已妥投\r\n',
  `sto_id` int(0) NULL DEFAULT NULL COMMENT 'GM 平台订单, 已拆单 按 仓库 / 厂家 进行拆单\r\n',
  `last_freight_cost` decimal(8, 2) NULL DEFAULT NULL COMMENT '斑马返回物流费用',
  `cancel_time` timestamp(0) NULL DEFAULT NULL COMMENT '取消时间',
  `auto_pay_status` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0自动，1非自动，2取消，3异常，4完成\r\n',
  `buyer_checkout_message` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户留言',
  `auto_pay_time` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单自动支付时间',
  PRIMARY KEY (`sao_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 230 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '销售订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sdi_store_dropship_item
-- ----------------------------
DROP TABLE IF EXISTS `sdi_store_dropship_item`;
CREATE TABLE `sdi_store_dropship_item`  (
  `dil_id` int unsigned NOT NULL COMMENT '主键',
  `pro_id` int(0) NULL DEFAULT NULL COMMENT '商品id',
  `str_id` int(0) NULL DEFAULT NULL COMMENT '网店id',
  `store_retention` int(0) NULL DEFAULT NULL COMMENT '网店预留量',
  `dropship_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '借卖价格',
  `dropship_status` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0-提交 1-上架 2-下架\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `shelf_stock` int(0) NULL DEFAULT NULL COMMENT '网店上架商品数量',
  `prefer_date` timestamp(0) NULL DEFAULT NULL COMMENT '商品网店上架时间',
  PRIMARY KEY (`dil_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '网店与sku的关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sequence
-- ----------------------------
DROP TABLE IF EXISTS `sequence`;
CREATE TABLE `sequence`  (
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '序列名称',
  `current_value` int(0) NULL DEFAULT NULL COMMENT '当前值',
  `increment` int(0) NULL DEFAULT NULL COMMENT '增长值',
  `initial` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '首字母'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sha_shipping_address
-- ----------------------------
DROP TABLE IF EXISTS `sha_shipping_address`;
CREATE TABLE `sha_shipping_address`  (
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
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
  `sto_id` int(0) NULL DEFAULT NULL COMMENT '外键关联sto_store_order表主键',
  `carrier_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '快递公司名称'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单收货地址' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sol_store_order_line_item
-- ----------------------------
DROP TABLE IF EXISTS `sol_store_order_line_item`;
CREATE TABLE `sol_store_order_line_item`  (
  `sol_id` int unsigned NOT NULL COMMENT ' 主键',
  `order_item_id` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '第三方平台line_item_id',
  `sto_id` int(0) NULL DEFAULT NULL COMMENT '主表主键ID',
  `sales_price` decimal(8, 2) NULL DEFAULT NULL COMMENT '商品单价',
  `qty` int(0) NULL DEFAULT NULL COMMENT '商品数量',
  `sku_no` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品SKU编号',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `buyer_checkout_message` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户留言',
  PRIMARY KEY (`sol_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '原始订单明细' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for spa_specific_attribute
-- ----------------------------
DROP TABLE IF EXISTS `spa_specific_attribute`;
CREATE TABLE `spa_specific_attribute`  (
  `spa_id` int unsigned NOT NULL COMMENT '主键id',
  `pro_id` int(0) NULL DEFAULT NULL COMMENT '外键-> 关联pro表id',
  `name_en` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性中文\r\n',
  `name_cn` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '属性英文',
  `seq_no` int(0) NULL DEFAULT NULL COMMENT '排序\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `sts_cd` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  PRIMARY KEY (`spa_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for spv_specific_attribute_value
-- ----------------------------
DROP TABLE IF EXISTS `spv_specific_attribute_value`;
CREATE TABLE `spv_specific_attribute_value`  (
  `spv_id` int unsigned NOT NULL COMMENT '主键id',
  `spa_id` int(0) NULL DEFAULT NULL COMMENT '外键->关联spa表主键',
  `name_en` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '英文属性描述',
  `name_cn` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '中文属性描述',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`spv_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sto_store_order
-- ----------------------------
DROP TABLE IF EXISTS `sto_store_order`;
CREATE TABLE `sto_store_order`  (
  `sto_id` int unsigned NOT NULL COMMENT '主键',
  `str_id` int(0) NULL DEFAULT NULL COMMENT '网店ID，外键关联str表主键',
  `order_id` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'AMAZON / EBAY 平台的订单 ID 例如: AMAZON : 058-1233752-8214740 EBAY : 865826\r\n',
  `order_created_time` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单创建时间\r\n',
  `paid_time` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付时间\r\n',
  `last_modified_time` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单更新时间\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态，1-待支付，2-待发货，3-已发货，4-已完成，5-已取消',
  `platform_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '平台类别 1、amazon 2、ebay\r\n',
  `cancel_compile_date` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单取消时间\r\n',
  PRIMARY KEY (`sto_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '原始订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for str_store
-- ----------------------------
DROP TABLE IF EXISTS `str_store`;
CREATE TABLE `str_store`  (
  `str_id` int unsigned NOT NULL COMMENT ' 主键',
  `dsr_id` int(0) NULL DEFAULT NULL COMMENT '借卖id',
  `platform_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '平台类别,1:Amazon;2:ebay\r\n',
  `store_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网店名 - 从api中取得\r\n',
  `store_sts_cd` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'API 对接状态 1. INI - 刚授权 2. WIP - 正常对接 3. EXP - token 过期 4. ERR - token 出错 5. CLS - 网店关闭\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`str_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12347 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '网店记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `parent_id` bigint(0) NULL DEFAULT NULL COMMENT '父级ID',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `level` int(0) NULL DEFAULT NULL COMMENT '菜单级数',
  `sort` int(0) NULL DEFAULT NULL COMMENT '菜单排序',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '前端名称',
  `icon` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '前端图标',
  `hidden` int(0) NULL DEFAULT NULL COMMENT '前端隐藏',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `pid` bigint(0) NULL DEFAULT NULL COMMENT '父级权限id',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `value` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限值',
  `icon` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图标',
  `type` int(0) NULL DEFAULT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
  `uri` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '前端资源路径',
  `status` int(0) NULL DEFAULT NULL COMMENT '启用状态；0->禁用；1->启用',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `sort` int(0) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '后台用户权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(0) NULL DEFAULT NULL COMMENT '资源分类ID',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源名称',
  `url` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源URL',
  `description` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_resource_category
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource_category`;
CREATE TABLE `sys_resource_category`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `sort` int(0) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `description` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `admin_count` int(0) NULL DEFAULT NULL COMMENT '后台用户数量',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `status` int(0) NULL DEFAULT 1 COMMENT '启用状态：0->禁用；1->启用',
  `sort` int(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_role_menu_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu_relation`;
CREATE TABLE `sys_role_menu_relation`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(0) NULL DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(0) NULL DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 59 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_role_resource_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_resource_relation`;
CREATE TABLE `sys_role_resource_relation`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(0) NULL DEFAULT NULL COMMENT '角色ID',
  `resource_id` bigint(0) NULL DEFAULT NULL COMMENT '资源ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `icon` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `nick_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `login_time` datetime(0) NULL DEFAULT NULL COMMENT '最后登录时间',
  `status` int(0) NULL DEFAULT 1 COMMENT '帐号启用状态：0->禁用；1->启用',
  `man_id` int(0) NULL DEFAULT NULL COMMENT '公司id',
  `man_buyer_id` int(0) NULL DEFAULT NULL COMMENT '借卖方id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user_login_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_login_log`;
CREATE TABLE `sys_user_login_log`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `member_id` bigint(0) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `ip` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `login_type` int(0) NULL DEFAULT NULL COMMENT '登录类型：0->PC；1->android;2->ios;3->小程序',
  `province` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 225 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '会员登录记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user_login_logout_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_login_logout_log`;
CREATE TABLE `sys_user_login_logout_log`  (
  `ull_id` int unsigned NOT NULL COMMENT '主键',
  `usi_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户表主键',
  `token` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户登录token',
  `terminal_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '终端版本类别 1-APP 2-web',
  `operating_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '1-login 2-logout',
  `operating_date` timestamp(0) NULL DEFAULT NULL COMMENT '操作时间',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`ull_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role_relation`;
CREATE TABLE `sys_user_role_relation`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(0) NULL DEFAULT NULL,
  `role_id` bigint(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for waa_wallet_account
-- ----------------------------
DROP TABLE IF EXISTS `waa_wallet_account`;
CREATE TABLE `waa_wallet_account`  (
  `buyer_id` int unsigned NOT NULL COMMENT '主键',
  `account_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户名',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `password` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付密码，加密串',
  `available_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '可用金额',
  `depositing_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '充值中金额',
  `withdrawing_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '提现中金额',
  `status` tinyint(0) NULL DEFAULT NULL COMMENT '状态  7 -正常,  17 -冻结',
  `create_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_time` timestamp(0) NULL DEFAULT NULL COMMENT '最后更新时间',
  `account_type` int(0) NULL DEFAULT NULL COMMENT '账户类型:1-客户 2-厂家',
  `auto_pay_status` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0-FALSE 1-TRUE',
  `currency` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '币种：USD,RMB',
  PRIMARY KEY (`buyer_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10094 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for wit_wishlist
-- ----------------------------
DROP TABLE IF EXISTS `wit_wishlist`;
CREATE TABLE `wit_wishlist`  (
  `wit_id` int unsigned NOT NULL COMMENT '主键',
  `dsr_id` int(0) NULL DEFAULT NULL COMMENT '借卖方ID，关联dsr表',
  `pro_id` int(0) NULL DEFAULT NULL COMMENT '外键 关联Pro表主键\r\n',
  `created_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `creation_date` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_date` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `call_cnt` int(0) NULL DEFAULT NULL COMMENT '乐观锁',
  `remark` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `sts_cd` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态：0表示无效，1表示有效',
  PRIMARY KEY (`wit_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = ' 借卖方心愿单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for wta_wallet_transaction_aduit
-- ----------------------------
DROP TABLE IF EXISTS `wta_wallet_transaction_aduit`;
CREATE TABLE `wta_wallet_transaction_aduit`  (
  `transaction_audit_id` int unsigned NOT NULL COMMENT '主键',
  `buyer_id` int(0) NULL DEFAULT NULL COMMENT '买家id',
  `transaction_id` int(0) NULL DEFAULT NULL COMMENT '业务记录id',
  `available_money_before` decimal(10, 4) NULL DEFAULT NULL COMMENT '前可用余额',
  `depositing_money_before` decimal(10, 4) NULL DEFAULT NULL COMMENT '前充值中金额',
  `withdrawing_money_before` decimal(10, 4) NULL DEFAULT NULL COMMENT '前提现中金额',
  `operate_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '操作金额',
  `operate_type` tinyint(0) NULL DEFAULT NULL COMMENT '操作类型 1-申请 2-提现 3-消费 4-退款',
  `available_money_after` decimal(10, 4) NULL DEFAULT NULL COMMENT '变更后可用余额',
  `depositing_money_after` decimal(10, 4) NULL DEFAULT NULL COMMENT '变更后充值中金额',
  `withdrawing_money_after` decimal(10, 4) NULL DEFAULT NULL COMMENT '变更后提现中金额',
  `operate_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人',
  `status` tinyint(0) NULL DEFAULT NULL COMMENT '操作状态 2-申请 , 4 -完成 , -1-失败',
  `create_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_time` timestamp(0) NULL DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`transaction_audit_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for wtr_wallet_transaction_record
-- ----------------------------
DROP TABLE IF EXISTS `wtr_wallet_transaction_record`;
CREATE TABLE `wtr_wallet_transaction_record`  (
  `transaction_id` int unsigned NOT NULL COMMENT '主键',
  `buyer_id` int(0) NULL DEFAULT NULL COMMENT '买家id',
  `bank_card_id` int(0) NULL DEFAULT NULL COMMENT '银行卡id for 充值、提现、退款,  卡账户消费情况下为空',
  `transaction_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流水号，GM应用生成',
  `transaction_type` tinyint(0) NULL DEFAULT NULL COMMENT '业务类型 1-充值 2-提现 3-消费 4-退款',
  `account_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'gmcp$account.account_name 账户名',
  `transaction_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '金额',
  `commission` decimal(10, 4) NULL DEFAULT NULL COMMENT '手续费',
  `discount_commission` decimal(10, 4) NULL DEFAULT NULL COMMENT '折后手续费',
  `transaction_method` tinyint(0) NULL DEFAULT NULL COMMENT '方式 0-T/T 1-Paypal 2-现金 3消费',
  `complete_time` datetime(0) NULL DEFAULT NULL COMMENT '完成时间',
  `status` tinyint(0) NULL DEFAULT NULL COMMENT '状态 2 -申请 , 4 -完成 , -1-失败',
  `actual_money` decimal(10, 4) NULL DEFAULT NULL COMMENT '实际金额',
  `actual_commission` decimal(10, 4) NULL DEFAULT NULL COMMENT '实际手续费',
  `actual_discount_commission` decimal(10, 4) NULL DEFAULT NULL COMMENT '折后实际手续费',
  `balance` decimal(10, 4) NULL DEFAULT NULL COMMENT '余额',
  `business_id` int(0) NULL DEFAULT NULL COMMENT '订单id 针对消费,  gmsales.trade.id',
  `finance_type` tinyint(0) NULL DEFAULT NULL COMMENT '类型 1-入款 2-出款',
  `note` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `operator_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人',
  `operator_ip` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人IP',
  `create_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_by` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `last_update_time` timestamp(0) NULL DEFAULT NULL COMMENT '最后更新时间',
  `bank_receipt_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行请求地址',
  `exchange_rate` decimal(10, 4) NULL DEFAULT NULL COMMENT '转换汇率',
  `transaction_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流水描述',
  `foreign_exchange_fee` decimal(10, 4) NULL DEFAULT NULL COMMENT '外汇',
  `withdraw_fee` decimal(10, 4) NULL DEFAULT NULL COMMENT '处理费',
  PRIMARY KEY (`transaction_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 159 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
