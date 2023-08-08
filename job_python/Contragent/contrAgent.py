from communication_method.CommunicationMethod import CommunicationMethod

class ContrAgent:

    def __init__(self,name: str, age: int, communicationMethod = CommunicationMethod()):
        self.communicationMethod = communicationMethod
        self.__name = name
        self.__age = age

    @property
    def getName(self): return self.__name
    @property
    def getAge(self): return self.__age

    def getCommunication(self): return self.communicationMethod

