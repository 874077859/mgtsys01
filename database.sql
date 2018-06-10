CREATE DATABASE mgtsys;

// 店家信息
DROP TABLE IF EXISTS tbl_sys_employer;
CREATE TABLE tbl_sys_employer (
  sid CHAR(13) NOT NULL,
  employer_id VARCHAR(12) NOT NULL,
  employer_pwd VARCHAR(12) NOT NULL,
  employer_name VARCHAR(20),
  employer_permission VARCHAR(20),
  employer_tel VARCHAR(20),
  employer_address VARCHAR(100),
  employer_mail VARCHAR(50) NOT NULL,
  employer_status CHAR(2) NOT NULL,
  login_status CHAR(1) NULL,
  last_login CHAR(8) NULL,
  create_user CHAR(20) DEFAULT NULL,
  create_time DATETIME DEFAULT NULL,
  update_user CHAR(20) DEFAULT NULL,
  update_time DATETIME DEFAULT NULL,
  delete_flag CHAR(1) DEFAULT '0',
  PRIMARY KEY (sid, employer_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

// 员工信息
DROP TABLE IF EXISTS tbl_sys_employee;
CREATE TABLE tbl_sys_employee (
  sid CHAR(13) NOT NULL,
  employee_id VARCHAR(12) NOT NULL,
  employee_pwd VARCHAR(12) NOT NULL,
  employee_name VARCHAR(20) NOT NULL,
  employee_tel VARCHAR(20) NOT NULL,
  employee_type CHAR(2) NOT NULL,
  employee_status CHAR(2) NOT NULL,
  login_status CHAR(1) NULL,
  create_user CHAR(20) DEFAULT NULL,
  create_time DATETIME DEFAULT NULL,
  update_user CHAR(20) DEFAULT NULL,
  update_time DATETIME DEFAULT NULL,
  delete_flag CHAR(1) DEFAULT '0',
  PRIMARY KEY (sid, employee_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

// 会员信息
DROP TABLE IF EXISTS tbl_sys_customer;
CREATE TABLE tbl_sys_customer (
  sid CHAR(13) NOT NULL,
  customer_id CHAR(11) NOT NULL,
  customer_pwd VARCHAR(12) NOT NULL,
  customer_name VARCHAR(20) NOT NULL,
  customer_status CHAR(2) NOT NULL,
  customer_age DECIMAL(3,0) NOT NULL DEFAULT 0,
  customer_sex CHAR(1) NOT NULL,
  create_user CHAR(20) DEFAULT NULL,
  create_time DATETIME DEFAULT NULL,
  update_user CHAR(20) DEFAULT NULL,
  update_time DATETIME DEFAULT NULL,
  delete_flag CHAR(1) DEFAULT '0',
  PRIMARY KEY (sid, customer_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

// 会员账户信息
DROP TABLE IF EXISTS tbl_sys_customer_account;
CREATE TABLE tbl_sys_customer_account (
  sid CHAR(13) NOT NULL,
  customer_id CHAR(11) NOT NULL,
  customer_level CHAR(1) NOT NULL,
  amount DECIMAL(8,1) NOT NULL DEFAULT 0.0,
  point DECIMAL(8) NOT NULL DEFAULT 0,
  create_user CHAR(20) DEFAULT NULL,
  create_time DATETIME DEFAULT NULL,
  update_user CHAR(20) DEFAULT NULL,
  update_time DATETIME DEFAULT NULL,
  delete_flag CHAR(1) DEFAULT '0',
  PRIMARY KEY (sid, customer_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

// 会员交易记录
DROP TABLE IF EXISTS tbl_sys_customer_deals;
CREATE TABLE tbl_sys_customer_deals (
  sid CHAR(13) NOT NULL,
  customer_id CHAR(11) NOT NULL,
  deal_day CHAR(8) NOT NULL,
  deal_no DECIMAL(8,0) NOT NULL DEFAULT 1,
  deal_detail_no DECIMAL(8,0) NOT NULL DEFAULT 1,
  goods_id CHAR(6) NOT NULL,
  goods_count DECIMAL(8,2) NOT NULL DEFAULT 0.00,
  deal_amount DECIMAL(8,2) NOT NULL DEFAULT 0.00,
  deal_point DECIMAL(8) NOT NULL DEFAULT 0,
  balance DECIMAL(8) NOT NULL DEFAULT 0,
  create_user CHAR(20) DEFAULT NULL,
  create_time DATETIME DEFAULT NULL,
  update_user CHAR(20) DEFAULT NULL,
  update_time DATETIME DEFAULT NULL,
  delete_flag CHAR(1) DEFAULT '0',
  PRIMARY KEY (sid, customer_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

// 商品信息
DROP TABLE IF EXISTS tbl_sys_goods;
CREATE TABLE tbl_sys_goods (
  sid CHAR(13) NOT NULL,
  goods_id CHAR(6) NOT NULL,
  goods_name VARCHAR(50) NOT NULL,
  goods_unit_price DECIMAL(8,2) NOT NULL DEFAULT 0.00,
  goods_unit VARCHAR(10) NOT NULL,
  create_user CHAR(20) DEFAULT NULL,
  create_time DATETIME DEFAULT NULL,
  update_user CHAR(20) DEFAULT NULL,
  update_time DATETIME DEFAULT NULL,
  delete_flag CHAR(1) DEFAULT '0',
  PRIMARY KEY (sid, goods_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

// 积分规则
DROP TABLE IF EXISTS tbl_sys_point_rule;
CREATE TABLE tbl_sys_point_rule (
  sid CHAR(13) NOT NULL,
  point_rule_no DECIMAL(8) NOT NULL DEFAULT 0,
  point_unit DECIMAL(8) NOT NULL DEFAULT 0,
  start_date CHAR(8) NOT NULL,
  end_date CHAR(8) NOT NULL,
  create_user CHAR(20) DEFAULT NULL,
  create_time DATETIME DEFAULT NULL,
  update_user CHAR(20) DEFAULT NULL,
  update_time DATETIME DEFAULT NULL,
  delete_flag CHAR(1) DEFAULT '0',
  PRIMARY KEY (sid, point_rule_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

// 员工类别
DROP TABLE IF EXISTS tbl_sys_employee_type;
CREATE TABLE tbl_sys_employee_type (
  sid CHAR(13) NOT NULL,
  employee_type CHAR(2) NOT NULL,
  employee_type_name VARCHAR(20) NOT NULL,
  create_user CHAR(20) DEFAULT NULL,
  create_time DATETIME DEFAULT NULL,
  update_user CHAR(20) DEFAULT NULL,
  update_time DATETIME DEFAULT NULL,
  delete_flag CHAR(1) DEFAULT '0',
  PRIMARY KEY (sid, employee_type)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

// 员工状态
DROP TABLE IF EXISTS tbl_sys_employee_status;
CREATE TABLE tbl_sys_employee_status (
  sid CHAR(13) NOT NULL,
  employee_status CHAR(2) NOT NULL,
  employee_status_name VARCHAR(20) NOT NULL,
  create_user CHAR(20) DEFAULT NULL,
  create_time DATETIME DEFAULT NULL,
  update_user CHAR(20) DEFAULT NULL,
  update_time DATETIME DEFAULT NULL,
  delete_flag CHAR(1) DEFAULT '0',
  PRIMARY KEY (sid, employee_status)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;