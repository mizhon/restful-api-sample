CREATE DATABASE `api_perf_tracker`;

CREATE TABLE IF NOT EXISTS `t_api_perf_details` (
    `id` INT UNSIGNED AUTO_INCREMENT COMMENT '性能表主键id',
    `uid` INT NOT NULL COMMENT '用户对应uid',
    `device_id` VARCHAR(50) COMMENT '客户端设备号',
    `network_type` VARCHAR(10) COMMENT '网络类型：wifi, 4g, other等',
    `client_id` INT UNSIGNED NOT NULL COMMENT '客户端ID',
  	`business_id` INT UNSIGNED NOT NULL COMMENT '业务线ID',
    `domain_name` VARCHAR(50) NOT NULL COMMENT '域名',
    `url` VARCHAR(255) NOT NULL COMMENT '页面地址（可包含参数）',
    `router_path` VARCHAR(40) NOT NULL COMMENT '路由地址',
    `page_name` VARCHAR(50) NOT NULL COMMENT '发起请求的页面名称',
    `page_load_time` DECIMAL NULL COMMENT '页面加载耗时',
    `api_duration` FLOAT NOT NULL COMMENT 'API调用消时',
    `tcp_duration` DECIMAL NULL COMMENT 'TCP连接耗时',
    `ttfb_duration` DECIMAL NULL COMMENT 'TTFB耗时',
    `dns_duration` DECIMAL NULL COMMENT 'DNS耗时',
    `has_error` BOOLEAN NULL COMMENT '接口是否包含错误',
    `error_info` VARCHAR(255) NULL COMMENT '包含的错误信息',
    `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '性能数据创建时间',
    PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT '接口性能详情表';

CREATE TABLE IF NOT EXISTS `t_business_lines` (
    `id` INT UNSIGNED AUTO_INCREMENT COMMENT '业务线主键ID',
    `business_code` VARCHAR(20) NOT NULL COMMENT '业务线代号',
    `business_name` VARCHAR(20) NOT NULL COMMENT '业务线名称',
    `business_desc` VARCHAR(80) DEFAULT NULL COMMENT '业务线描述',
    `active` BOOLEAN NOT NULL COMMENT '业务线状态是否激活，默认true',
    `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '业务线数据创建时间',
    `updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '业务线数据修改时间',
    PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT '业务线表';

CREATE TABLE IF NOT EXISTS `t_web_clients` (
    `id` INT UNSIGNED AUTO_INCREMENT COMMENT '客户端主键ID',
    `client_name` VARCHAR(10) NOT NULL COMMENT 'client名称:PC、H5、WeChat、Weex、Android、iOS、Flutter等',
    `client_desc` VARCHAR(30) DEFAULT NULL COMMENT 'client端描述',
    `active` BOOLEAN NOT NULL COMMENT 'Web端状态是否激活，默认true',
    `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '客户端信息创建时间',
    `updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '客户端信息修改时间',
    PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT '对应client端mapping表';