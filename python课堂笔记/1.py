class Human:
    name=""
    def __init__(self):
        self.__sex=''
    def SetValue(self,n,s):
        Human.name=n
        self.__sex=s
    def ShowValue(self):
        print("性别：%s"%(self.__sex))

h = Human()
h.SetValue('姚征兵','男')
h.ShowValue()
