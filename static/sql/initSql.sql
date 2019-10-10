CREATE DATABASE projectTodo;

CREATE TABLE `user` (
  `id` BIGINT(20) NOT NULL COMMENT 'id',
  `nickName` VARCHAR(30) NOT NULL COMMENT '微信昵称',
  `gender` INT(2) NOT NULL DEFAULT 0 COMMENT '性别 0：未知、1：男、2：女',
  `province` VARCHAR(20) NOT NULL COMMENT '省份',
  `city` VARCHAR(20) NOT NULL COMMENT '城市',
  `country` VARCHAR(20) NOT NULL COMMENT '国家',
  `signature` VARCHAR(30) NOT NULL COMMENT '签名',
  `create_time` DATETIME NOT NULL DEFAULT '1949-10-01 00:00:00' COMMENT '添加时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `user_login_log` (
  `id` BIGINT(20) NOT NULL COMMENT 'id',
  `user_id` BIGINT(20) NOT NULL COMMENT '用户id',
  `login_ip` VARCHAR(20) NOT NULL COMMENT '登录ip',
  `login_time` DATETIME NOT NULL DEFAULT '1949-10-01 00:00:00' COMMENT '登录时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `IDX_user_id` (`user_id`) USING BTREE
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='用户登录日志';

CREATE TABLE `user_task` (
     `id` BIGINT(20) NOT NULL COMMENT 'id',
     `user_id` BIGINT(20) NOT NULL COMMENT '用户id',
     `title` VARCHAR(50) NOT NULL COMMENT '任务标题',
     `content` TEXT NOT NULL COMMENT '任务内容',
     `priority` INT(11) NOT NULL COMMENT '优先级',
     `percent` DECIMAL(18,2) NOT NULL COMMENT '任务进度',
     `finished` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否完成',
     `deleted` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
     `expiration_time` DATETIME NOT NULL DEFAULT '1949-10-01 00:00:00' COMMENT '任务过期时间',
     `finish_time` DATETIME NOT NULL DEFAULT '1949-10-01 00:00:00' COMMENT '任务完成时间',
     `create_time` DATETIME NOT NULL DEFAULT '1949-10-01 00:00:00' COMMENT '任务创建时间',
     PRIMARY KEY (`id`) USING BTREE,
     KEY `IDX_user_id` (`user_id`) USING BTREE
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='用户任务表';

CREATE TABLE `user_task_log` (
     `id` BIGINT(20) NOT NULL COMMENT 'id',
     `task_id` BIGINT(20) NOT NULL COMMENT '任务id',
     `user_id` BIGINT(20) NOT NULL COMMENT '用户id',
     `operation` VARCHAR(30) NOT NULL COMMENT '操作类型',
     `description` VARCHAR(500) NOT NULL COMMENT '操作描述',
     `create_time` DATETIME NOT NULL DEFAULT '1949-10-01 00:00:00' COMMENT '创建时间',
     PRIMARY KEY (`id`) USING BTREE,
     KEY `IDX_task_id` (`task_id`) USING BTREE
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='用户任务操作日志';