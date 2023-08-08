from Contragent.contrAgent import ContrAgent
from List_contragent.listContrAgent import ListContrAgent
from communication_method.CommunicationMethod import CommunicationMethod
from Control_list_contragent.Control_ListContrAgent import ControlListContrAgent

saraCommunicationMethod = CommunicationMethod()
boobCommunicationMethod = CommunicationMethod()
jonCommunicationMethod = CommunicationMethod()
leoCommunicationMethod = CommunicationMethod()
neoCommunicationMethod = CommunicationMethod()

sara = ContrAgent("Sara",34,saraCommunicationMethod)
boob = ContrAgent("Bob", 27, boobCommunicationMethod)
jon = ContrAgent("Jon", 19, jonCommunicationMethod)
leo = ContrAgent("Leo",35, leoCommunicationMethod)
neo = ContrAgent("Neo", 45, neoCommunicationMethod)

listContrAgent = ListContrAgent()
listContrAgent.getListContrAgent.append(sara)
listContrAgent.getListContrAgent.append(boob)
listContrAgent.getListContrAgent.append(jon)
listContrAgent.getListContrAgent.append(leo)

saraCommunicationMethod.addPhoneNumberMethod("8952435678")
saraCommunicationMethod.addVkMethod("vk/777777")
saraCommunicationMethod.addAdressMethod("ул.Голубева дом 77")

boobCommunicationMethod.addVkMethod("vk/111111")
boobCommunicationMethod.addVkMethod("vk/222222")
boobCommunicationMethod.addAdressMethod("ул.Пушкина дом 4")
boobCommunicationMethod.addEmailMethod("fonoteka@mail.ru")
boobCommunicationMethod.addTelegramMethod("@telebot")
boobCommunicationMethod.addPhoneNumberMethod("89523467766")

jonCommunicationMethod.addPhoneNumberMethod("2794356")
jonCommunicationMethod.addPhoneNumberMethod("2798899")
jonCommunicationMethod.addPhoneNumberMethod("2798822")
jonCommunicationMethod.addTelegramMethod("@flagmanTrue")
jonCommunicationMethod.addEmailMethod("flagmaGolg@mail.ru")

leoCommunicationMethod.addVkMethod("vk/blackCoub")
leoCommunicationMethod.addAdressMethod("ул.Воронова дом 666")
leoCommunicationMethod.addPhoneNumberMethod("2798811")
leoCommunicationMethod.addPhoneNumberMethod("2793300")
leoCommunicationMethod.addTelegramMethod("@blackCoub")
leoCommunicationMethod.addEmailMethod("blackCoub@mail.ru")

neoCommunicationMethod.addPhoneNumberMethod("89524444463")

# sara.communicationMethod.printListCommunicationMethod()
# boob.communicationMethod.printListCommunicationMethod()
# jon.communicationMethod.printListCommunicationMethod()
# leo.communicationMethod.printListCommunicationMethod()

controllerListContrAgent = ControlListContrAgent(listContrAgent)


controllerListContrAgent.addNewContrAgentInList(neo)
controllerListContrAgent.printListContrAgents()
controllerListContrAgent.deletreContrAgentInList(neo)
controllerListContrAgent.printListContrAgents()