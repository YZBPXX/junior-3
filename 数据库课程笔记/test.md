视图: 
- 创建:create view as select 字段名 from 表名(with check option)
- 查询视图:select *from viewName 
- 修改视图(会影响基本表):update viewName set job='asd' where empno=7369;
- 显示视图创建情况: show create view viewName
- 查看视图: show table status 
- 删除视图: drop view viewName
- 重复名视图: rename  table viewName to newName
视图可跟新的条件(满足所有):
- 不包含聚集函数
- 不包含Group by
- 包含主键
视图的优缺点 : 
- 使用视图可以加快查询语句的编写
- 减慢查询语句的执行速度

存储过程:
- 局部变量: declare a int. 只有局部变量可以声明
- 用户变量: set @a =''
- 会话变量: set @@a = ''
- 全局变量: set @@a = ''
- 存储过程创建:
```sql
mysql> delimiter $$　　#将语句的结束符号从分号;临时改为两个$$(可以是自定义)
mysql> CREATE PROCEDURE delete_matches(IN p_playerno INTEGER)
    -> BEGIN
    -> 　　DELETE FROM MATCHES
    ->    WHERE playerno = p_playerno;
    -> END$$
Query OK, 0 rows affected (0.01 sec)
mysql> delimiter;　　#将语句的结束符号恢复为分号
```

触发器(特殊的存储过程):
- new old关键字:
	- insert 只有new , 表示插入完的表
	- delete 只有old , 表示删除前的表
	- update new和old 都有
	- new 可以使用set赋值, 如:set new.age=19;
	- old 只能读
```mysql
create trigger trig1 after insert 
on work for each row
begin 
	insert into time values(now());
	insert into time values(now());
end
```

游标(只能在存储过程和函数等地方使用):
- 定义:declare 游标名 cursor for 查询语法
- 打开游标: open 游标名称
- 取出游标中的数据: fetch 游标名称 info column
- 关闭游标: close 游标名称
- 释放游标: deallocate 游标名称

函数(与存储过程的区别是有返回值)
- 定义: 
```mysql
create function f(exam varchar(20)) returns varchar
begin 
	.....
	return ...;
end //
#调用
select f();
#如果开启了二进制日志文件就需要定义函数是某种类型的
set global log_bin_trust_function_creators=TRUE
```

