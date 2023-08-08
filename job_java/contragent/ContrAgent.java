package job_java.contragent;

import job_java.communication_method.ListCommunicationMethod;


public class ContrAgent extends AbstractContrAgent{
    private ListCommunicationMethod listCommunicationMethod;

    public ContrAgent(String name, int age, ListCommunicationMethod listCommunicationMethod) {
        super.name = name;
        super.age = age;
        this.listCommunicationMethod = listCommunicationMethod;
    }

    public ContrAgent(String nameCompany, ListCommunicationMethod listCommunicationMethod) {
        super.nameCompany = nameCompany;
        this.listCommunicationMethod = listCommunicationMethod;
    }

    public int getAge() {return age;}
    public String getName() {return name;}
    public String getNameCompany() {return nameCompany;}
    public ListCommunicationMethod getListCommunicationMethod() {return listCommunicationMethod;}
    

    @Override
    public String toString() {
        if(age != 0 ){
            return "ContrAgent [ " + name + ", " + age + " ]";
        }
        else{
            return "ContrAgent [ " + nameCompany + " ]";
        }
    }
}
