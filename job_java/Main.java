package job_java;

import job_java.list_contragent.ListContrAgent;
import job_java.communication_method.ListCommunicationMethod;
import job_java.contragent.ContrAgent;
import job_java.control_list_contragent.ControlListContrAgent;

public class Main{
    public static void main(String[] args) {
// создание способов связаться с контрагентами
        ListCommunicationMethod alexListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod saraListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod flagmanListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod blackCoubListCommunicationMethod = new ListCommunicationMethod();
// Создание контрагентов
        ContrAgent alex = new ContrAgent("Alex", 23, alexListCommunicationMethod);
        ContrAgent sara = new ContrAgent("Sara", 27, saraListCommunicationMethod);
        ContrAgent flagman = new ContrAgent("Flagman",flagmanListCommunicationMethod);
        ContrAgent blackCoub = new ContrAgent("blackCoub", blackCoubListCommunicationMethod);
// распечатать по одному контрагенту
        // System.out.println(alex);
        // System.out.println(sara);
        // System.out.println(flagman);
        // System.out.println(blackCoub);
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// создание списка контрагентов
        ListContrAgent listContragent = new ListContrAgent();
// добавление контрагентов в список контрагентов
        listContragent.addContrAgentInList(alex);
        listContragent.addContrAgentInList(sara);
        listContragent.addContrAgentInList(flagman);
        listContragent.addContrAgentInList(blackCoub);
// распечатать список контрагентов
        // listContragent.printListContrAgent();
// Добавление способов связи
        alexListCommunicationMethod.addVkMethod("vk/111111");
        alexListCommunicationMethod.addVkMethod("vk/222222");
        alexListCommunicationMethod.addAdressMethod("ул.Пушкина дом 4");
        alexListCommunicationMethod.addEmailMethod("fonoteka@mail.ru");
        alexListCommunicationMethod.addTelegramMethod("@telebot");
        alexListCommunicationMethod.addPhoneNumberMethod("89523467766");

        saraListCommunicationMethod.addPhoneNumberMethod("8952435678");
        saraListCommunicationMethod.addVkMethod("vk/777777");
        saraListCommunicationMethod.addAdressMethod("ул.Голубева дом 77");

        flagmanListCommunicationMethod.addPhoneNumberMethod("2794356");
        flagmanListCommunicationMethod.addPhoneNumberMethod("2798899");
        flagmanListCommunicationMethod.addPhoneNumberMethod("2798822");
        flagmanListCommunicationMethod.addTelegramMethod("@flagmanTrue");
        flagmanListCommunicationMethod.addEmailMethod("flagmaGolg@mail.ru");

        blackCoubListCommunicationMethod.addVkMethod("vk/blackCoub");
        blackCoubListCommunicationMethod.addAdressMethod("ул.Воронова дом 666");
        blackCoubListCommunicationMethod.addPhoneNumberMethod("2798811");
        blackCoubListCommunicationMethod.addPhoneNumberMethod("2793300");
        blackCoubListCommunicationMethod.addTelegramMethod("@blackCoub");
        blackCoubListCommunicationMethod.addEmailMethod("blackCoub@mail.ru");
//контроллер списка контрагентв
        ControlListContrAgent controlListContrAgent = new ControlListContrAgent(listContragent);
// распечатпть список контрагентов
        controlListContrAgent.printListContrAgent();
// поиск конрагентов по имени
        controlListContrAgent.serchContrAgent("Flagman");
        controlListContrAgent.serchContrAgent("Sara");
// добавить способ связи с контрагентом
        controlListContrAgent.addNewComminicationMethodPhoneNumber(flagman, "22534");
// удалить способ связи с контрагентом
        controlListContrAgent.delComminicationMethodPhoneNumber(flagman, 0);
// добавить в список нового контрагента
        // controlListContrAgent.addNewContrAgent(listContragent, newName);
    }
}