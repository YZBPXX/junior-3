class Human:
    name = ''
    def __init__(self,name,sex):
        self.__sex = sex
        Human.name = name

    def SetValue(self,n,s):
        self.__sex = n
        Human.name = s

    def ShowValue(self):
        print("性别:%s"%(self.__sex))

class Teacher(Human):
    def __init__(self,name,sex,tno):
        super(Teacher,self).__init__(name,sex)
        self._tno = tno
    def ShowValue(self):
        print("工号：%d, 姓名：%s,性别"%(self._tno,Human.name,super()._Human__sex))#成员变量仅包含工号

t = Teacher('姚征兵','男',18)
t.ShowValue()
