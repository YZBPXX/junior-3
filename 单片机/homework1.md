1.  
	- ALE(地址锁存信号):ALE脚对问系统时钟进行6分频输出, 同时ALE可以将地址锁存
	- EA(内程序选择信号):高电平是访问程序内部存储器, 低电平是访问外部程序存储器
2. CPU 由控制单元,运算单元和存储单元构成. 其中控制器使CPU有条不紊的执行机器命令, 运算器进行各种算术运算和逻辑运算, 寄存器用来暂时存放中间数据
3. 第一条指令地址是0000H, 
4. 晶体无内部时钟电路, 晶振有内部时钟电路
5. 
	- 直插电解电容: 长脚正,短脚负(或者有灰色一条的是负极)
	- 贴片电解电容:黑色一带为负,另一段是正
	- 钽电容: 对于贴片来说有一条横线的是正极,另一段是负极
6. 机器周期= 6状态周期= 12 个时钟周期
7. 
	- 上电时保持20ms以上高电平,
	- 上电后需要2个机器周期以上的高电平
8. 
	- 两种分别是自动复位和手动复位
	- 电解电容
	- C=10uF/16V,R=8.2KΩ  
9.   
	- PC: 0000H
	- SP: 07H
	- P0,P1,P2,P3: 00FFH
	- ACC: 00H
	- PSW: 00H
10. 当系统工作异常时自动产生一个复位信号,在硬件无故障时,使系统恢复正常工作  
11. 
	- 地址: 0xC1

位序号|D7|D6|D5|D4|D3|D2|D1|D0|
-|-|-|-|-|-|-|-|-
位符号|--|--|EN_WDT|CLR_WDT|IDLE_WDT|PS2|PS1|PS0|

- EN_WDT: 看门狗允许位, 设置为1 启动看门狗
- CLR_WDT: 看门狗清0位, 设置为1,看门狗定时器重新计数.
- IDLE_WDT: 看门狗IDLE模式位, 设置位1时, 看门狗定时器在单片机的空闲模式计数, 清0时 看门狗定时器在单片机空闲模式不计数
- PS2,PS1,PS0:看门狗定时器分频值, 用于控制喂狗时间

12. 
	- 节点方式有几种:空闲方式, 掉电方式
	- 将PCON的IDL置为1进入空闲方式, 将PCON的PD置为1进入掉电方式
	- 空闲方式下CPU处于休眠状态,其他硬件是活跃状态, 掉电方式下CPU,定时器,窗口全部停止工作, 只有外部中断继续工作
	- 空闲方式下各个寄存器保持原有数据, 只有RAM继续保持数据, 其他的例如四个端口复位到0FFH
	- 恢复方式:
		- 空闲方式:
			1. 被允许的中断源发送中断请求
			2. 硬件复位
		- 掉电方式:
			1. 只有硬件复位
