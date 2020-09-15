sql 语句分3类:DML, DDl, DCL(GRANT,REVOKE)
- 使用C和C++编写
- 单进程多线程

启动和关闭mysql
- net start mysql
- net stop mysql 
mac:
- sudo /usr/local/mysql/support-files/mysql.server start
- sudo /usr/local/mysql/support-files/mysql.server stop

连接
- mysql -hlocalhost(登陆本地可省略) -uroot -p
- 退出quit; exit;
看mysql支持那些引擎: show engines;
engines:支持事物,外键
myisam:不支持外键

给mysql数据库添加用户
- create user 'myuser'@'localhost' identified by 'mypassword';
- 数据类型--时间:
	- date, time, datetime, timestamp
	- curtime(), curdate(), now(), current_stamp()
- 赋予权限
	- ALL: 所有可用的权限
	- CREATE: 创建库、表和索引
	- LOCK_TABLES: 锁定表
	- ALTER: 修改表
	- DELETE: 删除表
	- INSERT: 插入表或列
	- SELECT: 检索表或列的数据
	- CREATE_VIEW: 创建视图
	- SHOW_DATABASES: 列出数据库
	- DROP: 删除库、表和视图
	- grant <privileges>(权限列表可以用*表示全部) on <database> to 'myuser'@'localhost';
---

- 注意创建数据库后设置数据库的字符集: alter database databaseName character set ustf8;
- 查询是否为空用 column IS NOT NULL 切记不能用column=null
- 数据库中的逻辑运算符 AND, OR, 
- 聚合函数(功能看单词意思):AVG(), MAX()等注意配合GROUP BY使用
- 删除表:drop table table_name
- 修改表名:alter table old_table_name rename to new_table_name;
- 跟新数据:update tableName set colume=xx where ...
- 删除数据:DELETE FROM table_name [WHERE Clause]
- 分组: SELECT *FROM student GROUP BY SNo 
- 使用聚合函数塞选的时候需要用having 代替where
- 加limit 限制表中数据范围
- 排序:order by column desc(降序)<ASC>(升序)
- 显示时消去重复行:select distinct column from table
- x between 80 and 100 等于$80<x<100$
- 通配符 LIKE %任意字符, /_一个字符

- 复制表:create table newName as select*from oldName 
- 复制表且包含其中的结果:create table newName as select*from oldName where 1=2;
- 复制的表主键需要自己添加:alter table tableName Modify SNo Char(8) Primaty Key;
- 自然连接:SELECT column FROM table1, table2 WHERE column1=column2;
- 内连接:SELECT column FROM table1 JOIN table2 ON table1.column=table2.colum
- 自身连接:SELECT column FROM table1 FIRST, table2 SECOND WHERE FIRST.column=SECOND.column. 类似于这种标号的可以在查询的记过集里在操作类似与this指针
- 左外连接:select column FROM table1 LEFT OUTER JOIN table2 USING(column); USING类似于ON 但它会取出重复列
- 右外连接:SELECT column FROM table1 RIGHT OUTER JOIN table2USING(column);
- 
- 嵌套查询(尤其注意 给表命名)
- 判断某个字段于另一个查询结果集中的字段是否相等:SELECT column FROM table WHERE column IN (SELECT column FROM table2 WHERE column2="xx"). 子集中由多个结果时用IN 否则=也行
- 找出超过自己选修课程平均成绩的课程号:SELECT SNo,CNo FROM SC x WHERE Score>=(SELECT AVG(Score)FROM SC y  WHERE y.SNO=x.SNo); 难点在于如何保持记录同步 即标号然后判断主键是否相等
- 全称谓词ALL,ANY:SELECT colum FROM table1 WHERE column\<ANL(SELECT clolun FROM table2)
- 基于派生表查询:SELECT column FROM table ,(SELECT column FROM table2) as a WHERE table.SNo=a.sno; 也可以用连接实现,




----

- 自然连接: select * from student, sc where student.SNo=sc.SNo;

