### 习题1笔记
- 默认字符集python2 ascii， python3 unicode
- 编码问题： 计算机内存中是unicode编码， 最先出现ascii编码， 中国制定了GB2312编码支持了中午(GBK是扩展GB，英文1个字节，中文2个字节)， unicode将所有语言统一在一起2个字节表示， 但是有些字母用不了2个字节，会出现浪费， 所以出现了utf8，将字母分为1-6个字节(汉子3个字节)。所以utf8可以看作unicode 的扩展
### 习题2笔记
- python3 中没有了long型和short，当数据溢出时会自动转换成long
- sqrt() 用法,import math ;math.sqrt()
- print函数有sep（默认空格），end(默认换行)，flush（是否强制刷新流,默认关闭），file（类文件对象）
- 仅()，表示一个空元祖
- python3 中/表示结果保留浮点除，//表示只保存整型，注意结果类型与c一样，只是保存下来的不一样
- python中没有char类型，只有str
- python中表示虚数用j或J做虚部后缀，实部和虚部都是浮点型
- bin可以返回一个数值的二进制表示(hex,oct)
- python3中没有&&，||，用and，or替换，同时and在有0时返回0，否则返回后一个值，or如果只有一个0，返回一个非0的，没有0返回第一个
- python成员运算符 in,not in，身份运算符is (not),前者比较一个数，后者比较一块区域。后者可以用id()函数达到同样效果
- nonlocal 定义上一层嵌套的局部变量
### 习题3笔记
- python 没有switch语句
### 习题4笔记
- string.title() 首字母大写
- string.strip() 删除头尾空格
- string.index() 返回第一个索引，如果没有就抛出异常
### 习题5笔记
- 集合：{1,2,3,4} ，字典：{key:value,...}
- 字典添加元素：dic.__setitem__(keys,values)
- 输出字典下标：dic.keys()
- 输出字典值：dic.values()
### 习题6笔记
- lambda 匿名函数
```python
x = lambda 参数1, 参数2...:函数体
```
- 带默认值的参数必须放到最后
- locals()返回所有局部变量，nonlocal 定义是上一层函数的变量，global 声明全局变量
```python
def test1():
    x=1;
    def test2():
        x=2
        def test3():
            nonlocal x
            x=3
        test3()
        print(x)
    test2()
    print(x)
test1()
# 3 1
```
### 习题9笔记
- NameError: 使用没定义的字母
- IndexError: 越界
- KeyError: 使用空的键值
- raise 的使用方法：
```python
raise # RuntimeError
raise NameError #NameError 
raise NameError("NO") #NameError : NO
```
- assert 的使用方法
```python
assert False #AssertError
```
- except 后面可以不接参数，与接Exception一样
- 编写异常类
```python
class testException(Exception):
	def __init__(self,height):
		self.height=height
	def __str__(self):#类的描述信息，print(类)
		if self.height<30:
			print("身高过矮")
		elif self.height>250:
			print("身高过高")
```
- raise :
	- 不带参数: 如果捕获到了异常返回当前捕获的异常, 否则RuntimeError
	- 带类名: 没有描述信息
	- 实例化异常类:有描述信息
- 垃圾回收del 可以立刻清楚内存空间(也是调用对象的__del__()方法), 析构函数 __del__()
### 习题11笔记
- python 命名规范 
	- 类:首字符都大写如 MySon (类似驼峰命名法)
	- 方法:全小写,用下划线分割(蛇形命名法)
	- 常量:所有字母大写用下划线分割
	- 文件名, 包,模块:小写
	- 如果与关键字冲突 使用后缀下划线
	- [参考](https://www.cnblogs.com/EmptyRabbit/p/7679093.html)
- 类由:类名,属性,方法 三部分构成
- 类属性可以通过类名或者实例名访问
### 习题12笔记
- __add(self, others)__
- @staticmethod 使得类和实例都可访问
- 静态方法不能访问实例属性的值,没有参数,所以当然访问不了实例属性值
- @classmethod 使用类名访问
- 类方法只能调用类属性, 第一个参数是cls，当类名使用
- 当使用super(cls, self).__init__() 初始化父类对象后 可以直接使用super(). 来访问父类的成员, 即使不再一个方法里也行
```python
class Person:
	def __init__(self, name, sex):
		self.__name = name
		slef.__sex = sex
	
	def setValue(self, n, s):
		self.__name = n
		self.__sex = s
	
	def display(self):
		print(self.__name, self.__sex)

class Student(Person):
	def __init__(self, name, sex, sno):
		self._sno=sno
		super(Student, self).__init__(name, sex)
	
	def display(self):
		print(self._sno)
		super().display()

p = Student('yzb', 'male', 18)
p.display()
```

