
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_web_site
-- ----------------------------
DROP TABLE IF EXISTS `tb_web_site`;
CREATE TABLE `tb_web_site` (
  `web_id` varchar(36) DEFAULT NULL,
  `web_url` varchar(128) DEFAULT NULL,
  `web_name` varchar(50) DEFAULT NULL,
  `web_desc` varchar(128) DEFAULT NULL,
  `web_open` varchar(10) DEFAULT NULL,
  `add_time` varchar(19) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for tb_web_page
-- ----------------------------
DROP TABLE IF EXISTS `tb_web_page`;
CREATE TABLE `tb_web_page` (
  `page_id` varchar(36) DEFAULT NULL,
  `category_id` varchar(36) DEFAULT NULL,
  `page_no` int(10) DEFAULT NULL,
  `page_href` varchar(128) DEFAULT NULL,
  `page_name` varchar(50) DEFAULT NULL,
  `page_mark` varchar(10) DEFAULT NULL,
  `link_tag` varchar(128) DEFAULT NULL,
  `link_tag_attr` varchar(200) DEFAULT NULL,
  `link_keys` varchar(50) DEFAULT NULL,
  `link_total` int(10) DEFAULT NULL,
  `add_time` varchar(19) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for tb_web_category
-- ----------------------------
DROP TABLE IF EXISTS `tb_web_category`;
CREATE TABLE `tb_web_category` (
  `category_id` varchar(36) DEFAULT NULL,
  `web_id` varchar(36) DEFAULT NULL,
  `parent_id` varchar(36) DEFAULT NULL,
  `category_url` varchar(128) DEFAULT NULL,
  `category_name` varchar(50) DEFAULT NULL,
  `category_mark` varchar(10) DEFAULT NULL,
  `page_tag` varchar(128) DEFAULT NULL,
  `page_tag_attr` varchar(200) DEFAULT NULL,
  `page_keys` varchar(50) DEFAULT NULL,
  `page_total` int(10) DEFAULT NULL,
  `add_time` varchar(19) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for tb_web_link
-- ----------------------------
DROP TABLE IF EXISTS `tb_web_link`;
CREATE TABLE `tb_web_link` (
  `link_id` varchar(36) DEFAULT NULL,
  `page_id` varchar(36) DEFAULT NULL,
  `link_no` int(10) DEFAULT NULL,
  `link_href` varchar(128) DEFAULT NULL,
  `link_name` varchar(50) DEFAULT NULL,
  `link_valid` varchar(10) DEFAULT NULL,
  `img_tag` varchar(128) DEFAULT NULL,
  `img_tag_attr` varchar(200) DEFAULT NULL,
  `link_mark` varchar(50) DEFAULT NULL,
  `pic_total` int(10) DEFAULT NULL,
  `add_time` varchar(19) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for tb_web_pic
-- ----------------------------
DROP TABLE IF EXISTS `tb_web_pic`;
CREATE TABLE `tb_web_pic` (
  `pic_id` varchar(36) DEFAULT NULL,
  `link_id` varchar(36) DEFAULT NULL,
  `pic_addr` varchar(200) DEFAULT NULL,
  `pic_name` varchar(128) DEFAULT NULL,
  `pic_oldName` varchar(128) DEFAULT NULL,
  `pic_desc` varchar(200) DEFAULT NULL,
  `pic_suffix` varchar(10) DEFAULT NULL,
  `pic_type` varchar(10) DEFAULT NULL,
  `pic_size` int(11) DEFAULT NULL,
  `pic_path` varchar(128) DEFAULT NULL,
  `pic_del` varchar(2) DEFAULT NULL,
  `pic_mark` varchar(2) DEFAULT NULL,
  `pic_no` int(10) DEFAULT NULL,
  `add_time` varchar(19) DEFAULT NULL,
  `pic_content` blob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_url
-- ----------------------------
DROP TABLE IF EXISTS `tb_url`;
CREATE TABLE `tb_url` (
  `id` varchar(36) DEFAULT NULL,
  `addr_name` varchar(128) DEFAULT NULL,
  `addr_desc` varchar(120) DEFAULT NULL,
  `is_del` varchar(18) DEFAULT NULL,
  `is_mark` varchar(10) DEFAULT NULL,
  `is_fetch` varchar(10) DEFAULT NULL,
  `addr_code` varchar(30) DEFAULT NULL,
  `add_time` varchar(19) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for tb_pic
-- ----------------------------
DROP TABLE IF EXISTS `tb_pic`;
CREATE TABLE `tb_pic` (
  `pic_id` varchar(36) DEFAULT NULL,
  `url_id` varchar(36) DEFAULT NULL,
  `pic_addr` varchar(256) DEFAULT NULL,
  `pic_name` varchar(128) DEFAULT NULL,
  `pic_oldName` varchar(128) DEFAULT NULL,
  `pic_suffix` varchar(10) DEFAULT NULL,
  `pic_type` varchar(10) DEFAULT NULL,
  `pic_size` bigint(10) DEFAULT NULL,
  `pic_path` varchar(256) DEFAULT NULL,
  `pic_del` varchar(5) DEFAULT NULL,
  `pic_mark` varchar(5) DEFAULT NULL,
  `pic_no` varchar(10) DEFAULT NULL,
  `pic_desc` varchar(10) DEFAULT NULL,
  `pic_content` blob,
  `add_time` varchar(19) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;