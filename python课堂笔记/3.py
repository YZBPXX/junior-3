class Human():
    def __init__(self, sex, name):
        self.__sex = sex
        self.name = name

    def SetValue(self, n, s):
        self.__sex = n
        self.name = s

    def ShowValue(self):
        return self.__sex, self.name


h = Human("男", "商立泽")
h.SetValue("男", "商立泽")
print(h.ShowValue())
