-- 用户表
CREATE TABLE IF NOT EXISTS `t_user_profiles` (
    `id` INT AUTO_INCREMENT COMMENT '表id',
    `uid` INT NOT NULL COMMENT '客户id',
    `name` VARCHAR(50) NOT NULL COMMENT '用户名称',
    `birth` DATE COMMENT '用户生日',
    `gender` CHAR(10) COMMENT '性别',
    `location` VARTCHAR(20) COMMENT '地区',
    `country` VARCHAR(40) COMMENT '国家',
    `signature` VARCHAR(100) COMMENT '用户签名',
    `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT '用户信息表';

-- 用户口令Authentication表
CREATE TABLE IF NOT EXISTS `t_user_local_auth`(
    `id` INT AUTO_INCREMENT COMMENT '表id',
    `uid` INT NOT NULL COMMENT '客户id',
    `username` VARCHAR(30) NOT NULL COMMENT '登录用户名',
    `password` VARCHAR(100) NOT NULL COMMENT '登录密码'
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT '用户口令Authentication表';

-- 第三方微博用户登录Authentication表
CREATE TABLE IF NOT EXISTS `t_oauth_third_party_info`(
    `id` INT AUTO_INCREMENT COMMENT '表id',
    `uid` INT NOT NULL COMMENT '客户id',
    `oauth_id` VARCHAR(50) NOT NULL COMMENT '用户对应的auth id',
    `oauth_name` VARCHAR(50) NOT NULL COMMENT '用户对应的auth name',
    `oauth_access_token` VARCHAR(100) NOT NULL COMMENT '对应的微博token',
    `oauth_expires` TIMESTAMP NOT NULL COMMENT '对应的微博token过期时间'
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT '第三方用户登录Authentication表';

-- 第三方用户登录对应mapping表
CREATE TABLE IF NOT EXISTS `t_oauth_mapping`(

)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT '第三方用户登录对应mapping表';