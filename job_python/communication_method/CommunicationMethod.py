class CommunicationMethod:

    def __init__(self):
        self.__vk =[]
        self.__telegram = []
        self.__email = []
        self.__phoneNumber = []
        self.__adress = []
    
    @property
    def getVk (self):
        return self.__vk
    
    @property
    def getVk (self): return self.__vk
    @property
    def getTelegram (self): return self.__telegram
    @property
    def getEmail (self): return self.__email
    @property
    def getPhoneNumber (self): return self.__phoneNumber
    @property
    def getAdress (self): return self.__adress

    def addVkMethod(self, vkId): self.__vk.append(vkId)
    def addTelegramMethod(self, telegramName): self.__telegram.append(telegramName)
    def addEmailMethod(self, emailAdres): self.__email.append(emailAdres)
    def addPhoneNumberMethod(self, phoneNum): self.__phoneNumber.append(phoneNum)
    def addAdressMethod(self, adressLocation): self.__adress.append(adressLocation)

    def deleteVkMethod(self, vkIndex): self.__vk.remove(vkIndex)
    def deleteTelegramMethod(self, telegramIndex): self.__vk.remove(telegramIndex)
    def deleteEmailMethod(self, emailIndex): self.__vk.remove(emailIndex)
    def deletePhoneNumberMethod(self, phoneNumberIndex): self.__vk.remove(phoneNumberIndex)
    def deleteAdressMethod(self, adressIndex): self.__vk.remove(adressIndex)

    def printListCommunicationMethod(self):
        if len(self.__vk)>0:
            print("   vk - ")
            for i in self.__vk:
                print(i)
        if len(self.__telegram)>0:
            print("   telegram - ")
            for i in self.__telegram:
                print(i)
        if len(self.__email) > 0:
            print("   email - ")
            for i in self.__email:
                print(i)
        if len(self.__phoneNumber)>0:
            print("   phoneNumber - ")
            for i in self.__phoneNumber:
                print(i)
        if len(self.__adress)>0:
            print("   adress - ")
            for i in self.__adress:
                print(i)
        print("\n")
