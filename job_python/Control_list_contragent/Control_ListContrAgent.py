from List_contragent.listContrAgent import ListContrAgent
from Contragent.contrAgent import ContrAgent


class ControlListContrAgent:

    def __init__(self, listContrAgent = ListContrAgent()):
        self.__listContrAgent = listContrAgent

    @property
    def getListContrAgent(self):
        return self.__listContrAgent

    def printListContrAgents(self):
        self.__listContrAgent.printListContrAgent()

#     def serchContrAgent()

    def addNewContrAgentInList(self,contrAgent: ContrAgent):
        self.__listContrAgent.addContAgent(contrAgent)

    def deletreContrAgentInList(self,contrAgent: ContrAgent):
        self.__listContrAgent.getListContrAgent.remove(contrAgent)

#     def addNewComminicationMethod()
#     добавить готовые методы из модуля ComminicationMethod
#     def deleteNewComminicationMethod()
#     добавить готовые методы из модуля ComminicationMethod