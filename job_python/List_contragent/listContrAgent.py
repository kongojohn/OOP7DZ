from Contragent.contrAgent import ContrAgent

class ListContrAgent:
    
    def __init__(self):
        self.__listContrAgent = []

    @property
    def getListContrAgent(self):
        return self.__listContrAgent
    
    def printListContrAgent(self):
        for i in self.__listContrAgent:
            print("Имя - ",i.getName, "возраст: ", i.getAge)
            i.communicationMethod.printListCommunicationMethod()
    
    def addContAgent(self, contrAgent: ContrAgent):
        self.__listContrAgent.append(contrAgent)
    
    def delContAgent(self, contrAgent: ContrAgent):
        self.__listContrAgent.remove(contrAgent)