# 用户基本信息表
CREATE TABLE `user_info_tab` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `uuid` char(50) NOT NULL COMMENT 'uuid',
  `email` varchar(100) NOT NULL,
  `pick_name` CHAR (50) NOT NULL COMMENT '昵称',
  `photo` char(100) default '/images/default_photo.jpg' COMMENT '头像',
  `password` char(100) NOT NULL COMMENT '密码',
  `mobile` char(11) DEFAULT NULL COMMENT '手机号',
  `weixin` char(11) DEFAULT NULL COMMENT '微信号',
  `qq` char(11) DEFAULT NULL COMMENT 'qq号',
  `state` char(30)  NOT NULL default 'wait_auth' COMMENT'账号状态',
  `extra_info` text COMMENT '扩展字段',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_email_uuid` (`email`,`uuid`),
  KEY `idx_uuid_email` (`uuid`, `email`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;