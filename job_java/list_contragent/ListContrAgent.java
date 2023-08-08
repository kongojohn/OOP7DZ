package job_java.list_contragent;
import job_java.contragent.ContrAgent;
import java.util.ArrayList;
import java.util.List;

public class ListContrAgent extends AbstractListContrAgent<ContrAgent>{
    private List<ContrAgent> listContrAgent = new ArrayList<>();

    public List<ContrAgent> getListContrAgent() {return listContrAgent;}

    public void addContrAgentInList(ContrAgent contrAgent){
        listContrAgent.add(contrAgent);        
    }

    public void deleteContrAgent(ContrAgent contrAgent){
        listContrAgent.remove(contrAgent);
    }

    public void printListContrAgent(){
        for (ContrAgent contrAgent : listContrAgent) {
            System.out.println(contrAgent);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListContrAgent [\n" + listContrAgent + "]";
    }
    
}
