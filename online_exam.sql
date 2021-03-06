/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50734
 Source Host           : localhost:3306
 Source Schema         : online_exam

 Target Server Type    : MySQL
 Target Server Version : 50734
 File Encoding         : 65001

 Date: 10/11/2021 17:16:57
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for 学生信息
-- ----------------------------
DROP TABLE IF EXISTS `学生信息`;
CREATE TABLE `学生信息`  (
  `studentID` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生id',
  `studentName` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生姓名',
  `studentPwd` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生密码',
  `studentPhone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生电话',
  `studentMajor` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生专业',
  `studentGrade` int(11) NOT NULL COMMENT '学生年级',
  PRIMARY KEY (`studentID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for 教师信息
-- ----------------------------
DROP TABLE IF EXISTS `教师信息`;
CREATE TABLE `教师信息`  (
  `teacherID` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师id',
  `teacherName` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师姓名',
  `teacherPwd` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师密码',
  `teacherPhone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教师电话',
  PRIMARY KEY (`teacherID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for 班级信息
-- ----------------------------
DROP TABLE IF EXISTS `班级信息`;
CREATE TABLE `班级信息`  (
  `classID` int(11) NOT NULL COMMENT '班级id',
  `teacherID` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师id',
  `className` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级名称',
  `paperID` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`classID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for 班级学生信息
-- ----------------------------
DROP TABLE IF EXISTS `班级学生信息`;
CREATE TABLE `班级学生信息`  (
  `studentID` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `classID` int(11) NOT NULL COMMENT '班级号',
  PRIMARY KEY (`studentID`, `classID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for 答卷信息
-- ----------------------------
DROP TABLE IF EXISTS `答卷信息`;
CREATE TABLE `答卷信息`  (
  `paperID` int(11) NOT NULL COMMENT '试卷号',
  `studentID` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `score` float NOT NULL COMMENT '总分',
  `submitTime` datetime(6) NOT NULL COMMENT '提交时间',
  PRIMARY KEY (`paperID`, `studentID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for 答题信息
-- ----------------------------
DROP TABLE IF EXISTS `答题信息`;
CREATE TABLE `答题信息`  (
  `studentID` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `questionID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题号',
  `paperID` int(11) NOT NULL COMMENT '试卷号',
  `studentAnswer` tinyint(1) NULL DEFAULT NULL COMMENT '学生答案',
  `studentScore` float NOT NULL COMMENT '学生得分',
  PRIMARY KEY (`studentID`, `questionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for 管理员信息
-- ----------------------------
DROP TABLE IF EXISTS `管理员信息`;
CREATE TABLE `管理员信息`  (
  `managerID` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员id',
  `managerUserName` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员用户名',
  `managerPwd` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`managerID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for 试卷信息
-- ----------------------------
DROP TABLE IF EXISTS `试卷信息`;
CREATE TABLE `试卷信息`  (
  `paperID` int(11) NOT NULL COMMENT '试卷号',
  `paperName` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试卷名',
  `startTime` datetime NOT NULL COMMENT '开始时间',
  `endTime` datetime NOT NULL COMMENT '结束时间',
  `totalScore` float NOT NULL COMMENT '总分',
  `tips` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '提示',
  `paperState` tinyint(1) NOT NULL,
  `teacherID` int(11) NOT NULL,
  `singleScore` float NOT NULL,
  `mutipleScore` float NOT NULL,
  PRIMARY KEY (`paperID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for 选择题信息
-- ----------------------------
DROP TABLE IF EXISTS `选择题信息`;
CREATE TABLE `选择题信息`  (
  `questionID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题id',
  `paperID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试卷id',
  `questionTitle` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题名称',
  `optionA` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '答案A题目',
  `optionB` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '答案B题目',
  `optionC` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '答案C题目',
  `optionD` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '答案D题目',
  `questionScore` float NOT NULL COMMENT '分值',
  `questionAnalyse` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '解析',
  `questionType` tinyint(1) NOT NULL COMMENT '选择题类型（单选/多选）',
  `questionAnswer` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '试题答案',
  PRIMARY KEY (`questionID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;
