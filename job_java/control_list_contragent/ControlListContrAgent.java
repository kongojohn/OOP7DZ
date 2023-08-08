package job_java.control_list_contragent;

import job_java.communication_method.ListCommunicationMethod;
import job_java.contragent.ContrAgent;
import job_java.list_contragent.ListContrAgent;

public class ControlListContrAgent extends AbstractControlContrAgent{

    ListCommunicationMethod listCommunicationMethod;
    ContrAgent contrAgent;
    ListContrAgent listContrAgent;

public ControlListContrAgent(ListContrAgent listContrAgent) {
        this.listContrAgent = listContrAgent;
        this.listCommunicationMethod = new ListCommunicationMethod();
    }
// добавить метод связи
    public void addNewComminicationMethodVk(ContrAgent contrAgent, String vk) {
        contrAgent.getListCommunicationMethod().addVkMethod(vk);
    }
    public void addNewComminicationMethodTelegram(ContrAgent contrAgent, String telegtam){
        contrAgent.getListCommunicationMethod().addTelegramMethod(telegtam);
    }
    public void addNewComminicationMethodEmail(ContrAgent contrAgent, String email){
        contrAgent.getListCommunicationMethod().addEmailMethod(email);
    }
    public void addNewComminicationMethodPhoneNumber(ContrAgent contrAgent, String number){
        contrAgent.getListCommunicationMethod().addPhoneNumberMethod(number);
    }
    public void addNewComminicationMethodAdress(ContrAgent contrAgent, String adress){
        contrAgent.getListCommunicationMethod().addAdressMethod(adress);
    }
// удалить метод связи
    public void delComminicationMethodVk(ContrAgent contrAgent, int index) {
        contrAgent.getListCommunicationMethod().deleteVkMethod(index);
    }
    public void delComminicationMethodTelegram(ContrAgent contrAgent, int index){
        contrAgent.getListCommunicationMethod().deleteTelegramMethod(index);
    }
    public void delComminicationMethodEmail(ContrAgent contrAgent, int index){
        contrAgent.getListCommunicationMethod().deleteEmailMethod(index);
    }
    public void delComminicationMethodPhoneNumber(ContrAgent contrAgent, int index){
        contrAgent.getListCommunicationMethod().deletePhoneNumberMethod(index);
    }
    public void delComminicationMethodAdress(ContrAgent contrAgent, int index){
        contrAgent.getListCommunicationMethod().deleteAdressMethod(index);
    }
// удалить контрагента
    public void deleteContrAgent(ContrAgent contrAgent, ListContrAgent listContrAgent) {listContrAgent.deleteContrAgent(contrAgent);}
// распечатать список контр агентов
    public void printListContrAgent() {
        listContrAgent.printListContrAgent();}  
// поиск по имени контрагента
    public void serchContrAgent(String name) {
        for (ContrAgent contrAgent : listContrAgent.getListContrAgent()) {
            if(contrAgent.getName() == name){
                System.out.print(contrAgent.getName());
                contrAgent.getListCommunicationMethod().printListCommunicationMethod();
            }
            if(contrAgent.getNameCompany() == name){
                System.out.print(contrAgent.getNameCompany());
                contrAgent.getListCommunicationMethod().printListCommunicationMethod();
            }
        }  
        System.out.println();
    }
// создать нового контрагента
    public void addNewContrAgent(ListContrAgent listContrAgent, ContrAgent contrAgent){
        listContrAgent.addContrAgentInList(contrAgent);
    }
}