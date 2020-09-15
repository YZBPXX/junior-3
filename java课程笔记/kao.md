java特点:跨平台, 
java程序开发过程; 源程序-->java编译器-->字节码程序(跨平台--》java解释器执行
文件有多个类的时候只有一个public ,且同时会生成多个class文件, 
- 主类用public修饰

2. java基知识
	- 标示符命名规则: A-Z,a-z,_,\$. 首字符不能时数字
	- 数据类型
	- 类型转换:扩展转换, 窄化转换
	- 条件表达式
	- 按为运算符
3. 类和方法
定义:[修饰符] class 类名[extends 父类][implements 接口名]
{
	1. 变量定义
	2. 方法定义
}
	- 类方法只能操作类变量(static), 实例方法可以操作类变量和实例变量
	- 局部变量和成员变量:
	- package 语句向已有的包添加新类
4. 常用类
	- 字符串相关类(String(不可变), StirngBugger(可变))
		- charAt(int index)
		- length() 数组不加
		- indexOf(Stting str)
		- equalsIgnoreCase(String another)
		- startsWith, endsWith
		- toUpperCase(), toLowerCase()
		- substring
		- trim()
	- 基本数据类型包装类
	- Math类
	- File类
		- boolean canRead()
		- boolean canWrite()
		- boolean exiis()
		- boolean isDirectoty()
		- boolean isFile()
		- long lastModified()
		- long length()
		- String getName()
		- String getPath()
5. 异常处理
	- 异常概念
	- 异常分类
	- Throwable 所有异常的父类
	- 注意python except java catch( someException e **没有as**)
	
6. 流的分类
	- 输入输出流
	- 字节流 字符流
	- 节点流 
7. java 多线程机制
- java 有几种方法实现多线程编程?有什么异同
- java多线程生命周期
- 同步机制
- 唤醒机制
