CREATE TABLE IF NOT EXISTS `t_api_perf_details` (
    `id` INT AUTO_INCREMENT COMMENT '性能表主键ID',
    `client_id` INT UNSIGNED NOT NULL COMMENT '客户端ID',
  	`business_id` INT UNSIGNED NOT NULL COMMENT '业务线ID',
    `domain_name` VARCHAR(50) NOT NULL COMMENT '域名',
    `url` VARCHAR(255) NOT NULL COMMENT '页面地址（可包含参数）',
    `router_path` VARCHAR(40) NOT NULL COMMENT '路由地址',
    `page_name` VARCHAR(50) NOT NULL COMMENT '发起请求的页面名称',
    `api_duration` DECIMAL NOT NULL COMMENT 'API调用消时',
    `tcp_duration` DECIMAL NULL COMMENT 'TCP连接耗时',
    `ttfb_duration` DECIMAL NULL COMMENT 'TTFB耗时',
    `dns_duration` DECIMAL NULL COMMENT 'DNS耗时',
    `created_at` TIMESTAMP NOT NULL COMMENT '性能数据创建时间',
    PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 COMMENT '接口性能详情表';

CREATE TABLE IF NOT EXISTS `t_business_lines` (
    `id` INT UNSIGNED AUTO_INCREMENT COMMENT '业务线主键ID',
    `business_code` VARCHAR(10) NOT NULL COMMENT '业务线代号',
    `business_name` VARCHAR(10) NOT NULL COMMENT '业务线名称',
    `business_desc` VARCHAR(80) DEFAULT NULL COMMENT '业务线描述',
    PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 COMMENT '业务线表';

CREATE TABLE IF NOT EXISTS `t_navigation_types` (
    `id` INT UNSIGNED AUTO_INCREMENT COMMENT '来源主键ID',
    `navigation_type` VARCHAR(20) NOT NULL COMMENT '网页类型名称：0 - TYPE_NAVIGATENEXT、1 - TYPE_RELOAD、2 - TYPE_BACK_FORWARD、255 - TYPE_UNDEFINED',
    `navigation_desc` VARCHAR(40) DEFAULT NULL COMMENT '来源描述',
    PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 COMMENT '网页加载来源mapping表';

CREATE TABLE IF NOT EXISTS `t_web_clients` (
    `id` INT UNSIGNED AUTO_INCREMENT COMMENT '客户端主键ID',
    `client_name` VARCHAR(10) NOT NULL COMMENT 'client名称:PC、H5、WeChat(微信)、Weex、Android、iOS、Flutter等',
    `client_desc` VARCHAR(40) DEFAULT NULL COMMENT 'client端描述',
    PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 COMMENT '对应client端mapping表';