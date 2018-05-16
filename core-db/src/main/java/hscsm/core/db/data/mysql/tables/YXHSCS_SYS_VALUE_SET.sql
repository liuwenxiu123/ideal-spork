Create Table YXHSCS_SYS_VALUE_SET
(
  VALUE_SET_ID bigint Not Null auto_increment primary key,
  VALUE_SET_NAME Varchar(200),
  VALUE Varchar(200),
  DESCRIPTION Varchar(200),
  ENABLED_FLAG Varchar(1) Default 'Y',
  PROGRAM_ID BigInt,
  REQUEST_ID BigInt,
  OBJECT_VERSION_NUMBER BigInt Not Null Default 1,
  CREATION_DATE  datetime Not Null Default CURRENT_TIMESTAMP,
  CREATED_BY BigInt Not Null Default -1,
  LAST_UPDATED_BY BigInt Not Null Default -1,
  LAST_UPDATE_DATE datetime Not Null Default CURRENT_TIMESTAMP,
  LAST_UPDATE_LOGIN BigInt Default -1,
  ATTRIBUTE_CATEGORY VARCHAR(30),
  ATTRIBUTE1 VARCHAR(150),
  ATTRIBUTE2 VARCHAR(150),
  ATTRIBUTE3 VARCHAR(150),
  ATTRIBUTE4 VARCHAR(150),
  ATTRIBUTE5 VARCHAR(150),
  ATTRIBUTE6 VARCHAR(150),
  ATTRIBUTE7 VARCHAR(150),
  ATTRIBUTE8 VARCHAR(150),
  ATTRIBUTE9 VARCHAR(150),
  ATTRIBUTE10 VARCHAR(150),
  ATTRIBUTE11 VARCHAR(150),
  ATTRIBUTE12 VARCHAR(150),
  ATTRIBUTE13 VARCHAR(150),
  ATTRIBUTE14 VARCHAR(150),
  ATTRIBUTE15 VARCHAR(150)
);
ALTER TABLE YXHSCS_SYS_VALUE_SET COMMENT '数据字典 目标表';
ALTER TABLE YXHSCS_SYS_VALUE_SET MODIFY `VALUE_SET_ID` bigint Not Null auto_increment Comment '表ID，主键，供其他表做外键';
ALTER TABLE YXHSCS_SYS_VALUE_SET MODIFY `VALUE_SET_NAME` Varchar(200) Comment '值集名称';
ALTER TABLE YXHSCS_SYS_VALUE_SET MODIFY `VALUE` Varchar(200) Comment '值';
ALTER TABLE YXHSCS_SYS_VALUE_SET MODIFY `DESCRIPTION` Varchar(200) Comment '说明';
ALTER TABLE YXHSCS_SYS_VALUE_SET MODIFY `ENABLED_FLAG` Varchar(1) Default 'Y' Comment '是否有效Y/N';
ALTER TABLE YXHSCS_SYS_VALUE_SET MODIFY `OBJECT_VERSION_NUMBER` BigInt Not Null Default 1 Comment '行版本号，用来处理锁';

ALTER TABLE `YXHSCS_SYS_VALUE_SET` ADD UNIQUE (`VALUE_SET_ID`);
