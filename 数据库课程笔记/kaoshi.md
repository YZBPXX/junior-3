C D C B C
D C B D D
C B C D C

B B D C B

4简答题:
1. 
	1. 先声明游标 
	2. 定义后需要打开游标以供使用
	3. 取出索引 
	4. 最后关闭游标
2. 错误日志, 二进制日志,通用查询日志,慢查询日志. 
3. 读未提交, 读提交, 可重复读, 串行化 

5程序设计题:
1. 
CREATE table student ( Sno VARCHAR(8) PRIMARY KEY, Sname VARCHAR(12) UNIQUE NOT NULL, Ssex ENUM('男','女'), Sage DATE, Sdept VARCHAR(20) DEFAULT '计算机系');
2.  SELECT *FROM Course WHERE Cname LIKE '计算机%设__';
3.  INSERT INTO sc VALUES('s10','c4');
4. Grade < 55
5. INTO table 
6. GROUP BY
7. sc, SELECT Cno FROM Course;
8. GRAND 
9. 
SELECT sno , sname FROM student WHERE sno in (SELECT sno FROM sc WHERE score<60)
10. 给表sc添加一行flag属性, 用于判断该行数据是否被删除了, 其中1表示被删除了0 表示没有没删除, 执行语句如下:
```mysql
alter table sc add column flag int(1) default 0
update sc set flag=1 where sno='20182020';
```

