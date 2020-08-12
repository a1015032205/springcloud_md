![image-20200812203616636](seata.assets/image-20200812203616636.png)

![image-20200812203133447](seata.assets/image-20200812203133447.png)



![image-20200812203059497](seata.assets/image-20200812203059497.png)

![image-20200812203200636](seata.assets/image-20200812203200636.png)



![image-20200812203626904](seata.assets/image-20200812203626904.png)

![image-20200812203503478](seata.assets/image-20200812203503478.png)

![image-20200812203816468](seata.assets/image-20200812203816468.png)

![image-20200812203834768](seata.assets/image-20200812203834768.png)

![image-20200812204601252](seata.assets/image-20200812204601252.png)

![image-20200812204733721](seata.assets/image-20200812204733721.png)

![image-20200812204816538](seata.assets/image-20200812204816538.png)

自定义事务组名

![image-20200812204902260](seata.assets/image-20200812204902260.png)

DB

![image-20200812205008280](seata.assets/image-20200812205008280.png)

![image-20200812205026952](seata.assets/image-20200812205026952.png)

![image-20200812205107500](seata.assets/image-20200812205107500.png)

![image-20200812205226140](seata.assets/image-20200812205226140.png)

```mysql
-- the table to store GlobalSession data
drop table if exists `global_table`;
create table `global_table` (
  `xid` varchar(128)  not null,
  `transaction_id` bigint,
  `status` tinyint not null,
  `application_id` varchar(32),
  `transaction_service_group` varchar(32),
  `transaction_name` varchar(128),
  `timeout` int,
  `begin_time` bigint,
  `application_data` varchar(2000),
  `gmt_create` datetime,
  `gmt_modified` datetime,
  primary key (`xid`),
  key `idx_gmt_modified_status` (`gmt_modified`, `status`),
  key `idx_transaction_id` (`transaction_id`)
);

-- the table to store BranchSession data
drop table if exists `branch_table`;
create table `branch_table` (
  `branch_id` bigint not null,
  `xid` varchar(128) not null,
  `transaction_id` bigint ,
  `resource_group_id` varchar(32),
  `resource_id` varchar(256) ,
  `lock_key` varchar(128) ,
  `branch_type` varchar(8) ,
  `status` tinyint,
  `client_id` varchar(64),
  `application_data` varchar(2000),
  `gmt_create` datetime,
  `gmt_modified` datetime,
  primary key (`branch_id`),
  key `idx_xid` (`xid`)
);

-- the table to store lock data
drop table if exists `lock_table`;
create table `lock_table` (
  `row_key` varchar(128) not null,
  `xid` varchar(96),
  `transaction_id` long ,
  `branch_id` long,
  `resource_id` varchar(256) ,
  `table_name` varchar(32) ,
  `pk` varchar(36) ,
  `gmt_create` datetime ,
  `gmt_modified` datetime,
  primary key(`row_key`)
);
```

启动

![image-20200812214711884](seata.assets/image-20200812214711884.png)

![image-20200812214830977](seata.assets/image-20200812214830977.png)

![image-20200812214858168](seata.assets/image-20200812214858168.png)

![image-20200812215024902](seata.assets/image-20200812215024902.png)

```mysql
CREATE DATABASE seata_order;
CREATE DATABASE seata_storage;
CREATE DATABASE seata_account;
```

![image-20200812215328729](seata.assets/image-20200812215328729.png)

![image-20200812215348538](seata.assets/image-20200812215348538.png)

![image-20200812215408170](seata.assets/image-20200812215408170.png)

![image-20200812215426004](seata.assets/image-20200812215426004.png)

![image-20200812220932982](seata.assets/image-20200812220932982.png)

```mysql

CREATE TABLE `undo_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'increment id',
  `branch_id` bigint(20) NOT NULL COMMENT 'branch transaction id',
  `xid` varchar(100) NOT NULL COMMENT 'global transaction id',
  `context` varchar(128) NOT NULL COMMENT 'undo_log context,such as serialization',
  `rollback_info` longblob NOT NULL COMMENT 'rollback info',
  `log_status` int(11) NOT NULL COMMENT '0:normal status,1:defense status',
  `log_created` datetime NOT NULL COMMENT 'create datetime',
  `log_modified` datetime NOT NULL COMMENT 'modify datetime',
  `ext` varchar(100) DEFAULT NULL COMMENT 'reserved field',
  PRIMARY KEY (`id`),
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='AT transaction mode undo table';
```

![image-20200812221250658](seata.assets/image-20200812221250658.png)

![image-20200812221355520](seata.assets/image-20200812221355520.png)

![image-20200812221707419](seata.assets/image-20200812221707419.png)

![image-20200812221738642](seata.assets/image-20200812221738642.png)

![image-20200812224653903](seata.assets/image-20200812224653903.png)

将file.conf和registy.conf复制进去呀

![image-20200812224855063](seata.assets/image-20200812224855063.png)