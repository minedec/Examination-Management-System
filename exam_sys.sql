/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : exam_sys

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-07-29 15:35:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `a_id` varchar(255) NOT NULL,
  `a_pwd` varchar(255) DEFAULT NULL,
  `a_role` enum('ADMINISTRATOR','TEACHER','STUDENT') NOT NULL COMMENT '角色，管理员，老师，学生',
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '', 'ADMINISTRATOR');
INSERT INTO `account` VALUES ('2', '', 'TEACHER');
INSERT INTO `account` VALUES ('3', '', 'STUDENT');

-- ----------------------------
-- Table structure for ans_collection
-- ----------------------------
DROP TABLE IF EXISTS `ans_collection`;
CREATE TABLE `ans_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '一条做题记录编号',
  `student_id` varchar(255) NOT NULL,
  `paper_id` int(11) NOT NULL COMMENT '试卷ID',
  `question_id` int(255) NOT NULL,
  `q_option` varchar(255) DEFAULT NULL,
  `q_content` varchar(255) DEFAULT NULL COMMENT '回答的内容',
  `q_iscorrect` varchar(255) NOT NULL COMMENT '是否正确',
  `q_score` int(11) NOT NULL COMMENT '该回答的得分',
  `q_documenteer` varchar(255) DEFAULT NULL COMMENT '批改人编号',
  `datetime` datetime NOT NULL COMMENT '批改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='回答记录列表，记录学生回答问题的记录，每一条记录记录了学生id，试题id，试卷id和回答内容等';

-- ----------------------------
-- Records of ans_collection
-- ----------------------------

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `c_id` varchar(20) NOT NULL COMMENT '自然班id',
  `c_grade` varchar(50) NOT NULL,
  `c_major` varchar(50) NOT NULL,
  `c_name` varchar(50) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------

-- ----------------------------
-- Table structure for classroom
-- ----------------------------
DROP TABLE IF EXISTS `classroom`;
CREATE TABLE `classroom` (
  `cr_id` varchar(20) NOT NULL COMMENT '教室id',
  `cr_name` varchar(255) NOT NULL,
  PRIMARY KEY (`cr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classroom
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` varchar(20) NOT NULL,
  `course_name` varchar(50) NOT NULL,
  `course_major` varchar(50) DEFAULT NULL,
  `course_academy` varchar(50) DEFAULT NULL,
  `course_credit` float NOT NULL COMMENT '学分',
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for exams
-- ----------------------------
DROP TABLE IF EXISTS `exams`;
CREATE TABLE `exams` (
  `e_id` int(11) NOT NULL,
  `e_title` varchar(50) NOT NULL,
  `e_semester` varchar(20) NOT NULL COMMENT '学期',
  `e_online` enum('ONLINE','OFFLINE') NOT NULL COMMENT '线上/线下',
  `e_type` enum('NORMAL','LATER','MAKEUP') NOT NULL COMMENT '正常/补考/缓考',
  `e_paperid` int(11) NOT NULL,
  `e_course` varchar(255) NOT NULL,
  `e_datetime` datetime NOT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exams
-- ----------------------------

-- ----------------------------
-- Table structure for exam_collection
-- ----------------------------
DROP TABLE IF EXISTS `exam_collection`;
CREATE TABLE `exam_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(255) NOT NULL,
  `paper_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `exam_id` int(11) NOT NULL,
  `status` enum('COMPLETED','ONGOING','UNSTART') NOT NULL COMMENT '考试状态',
  `result` enum('UNPASS','PASS') NOT NULL COMMENT '考试的结果，通过未通过',
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='考试与人员的关系表，保存某个人与某场考试的关系';

-- ----------------------------
-- Records of exam_collection
-- ----------------------------

-- ----------------------------
-- Table structure for options
-- ----------------------------
DROP TABLE IF EXISTS `options`;
CREATE TABLE `options` (
  `o_id` int(11) NOT NULL AUTO_INCREMENT,
  `o_question_id` int(11) NOT NULL,
  `o_content` varchar(255) NOT NULL,
  `o_iscorrect` varchar(255) NOT NULL,
  `o_analysis` varchar(255) DEFAULT NULL COMMENT '试题解析，选填',
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of options
-- ----------------------------

-- ----------------------------
-- Table structure for papers
-- ----------------------------
DROP TABLE IF EXISTS `papers`;
CREATE TABLE `papers` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(50) NOT NULL,
  `p_date` date NOT NULL,
  `p_author` varchar(50) DEFAULT NULL,
  `p_questionnum` int(11) NOT NULL,
  `p_score` float NOT NULL,
  `p_course` varchar(20) NOT NULL COMMENT 'id形式',
  `p_major` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of papers
-- ----------------------------

-- ----------------------------
-- Table structure for paper_question
-- ----------------------------
DROP TABLE IF EXISTS `paper_question`;
CREATE TABLE `paper_question` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paper_id` int(11) NOT NULL,
  `question_id` int(11) NOT NULL,
  `question_score` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paper_question
-- ----------------------------

-- ----------------------------
-- Table structure for questions
-- ----------------------------
DROP TABLE IF EXISTS `questions`;
CREATE TABLE `questions` (
  `q_id` int(11) NOT NULL AUTO_INCREMENT,
  `q_content` varchar(255) NOT NULL COMMENT '题干内容',
  `q_picture` mediumblob,
  `q_type` enum('MULTIPLE','SINGLE','JUDGE','FILL','TOPIC') NOT NULL COMMENT '题目类型',
  `q_score` float NOT NULL COMMENT '分值',
  `q_course` varchar(20) NOT NULL COMMENT '以id形式',
  `q_difficulty` enum('HARD','MIDDLE','EASY') NOT NULL COMMENT '难度',
  `q_major` varchar(50) DEFAULT NULL,
  `q_datetime` datetime NOT NULL COMMENT '出题时间',
  `q_author` varchar(50) DEFAULT NULL COMMENT '出题人',
  PRIMARY KEY (`q_id`,`q_content`),
  UNIQUE KEY `q_id` (`q_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of questions
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `s_id` varchar(20) NOT NULL,
  `s_icon` blob,
  `s_name` varchar(50) NOT NULL,
  `s_sex` enum('MALE','FEMALE') NOT NULL,
  `s_nation` varchar(50) NOT NULL,
  `s_email` varchar(50) DEFAULT NULL,
  `s_identity` varchar(20) NOT NULL,
  `s_address` varchar(255) DEFAULT NULL,
  `s_phone` varchar(20) DEFAULT NULL,
  `s_class` varchar(20) NOT NULL,
  `s_academy` varchar(50) DEFAULT NULL,
  `s_major` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`s_id`,`s_class`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for student_course
-- ----------------------------
DROP TABLE IF EXISTS `student_course`;
CREATE TABLE `student_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `s_id` varchar(255) NOT NULL,
  `c_id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_course
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `t_id` varchar(255) NOT NULL,
  `t_icon` blob,
  `t_name` varchar(50) NOT NULL,
  `t_sex` enum('MALE','FEMALE') NOT NULL,
  `t_nation` varchar(50) NOT NULL,
  `t_email` varchar(50) DEFAULT NULL,
  `t_identity` varchar(20) NOT NULL,
  `t_address` varchar(255) DEFAULT NULL,
  `t_phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------

-- ----------------------------
-- Table structure for teacher_course
-- ----------------------------
DROP TABLE IF EXISTS `teacher_course`;
CREATE TABLE `teacher_course` (
  `t_id` varchar(255) NOT NULL,
  `t_name` varchar(255) NOT NULL,
  `c_id` varchar(255) NOT NULL,
  `c_name` varchar(255) NOT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_course
-- ----------------------------
