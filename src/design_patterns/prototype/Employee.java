package design_patterns.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee implements Cloneable{

    List<String> listEmp ;

    public Employee(){
        listEmp = new ArrayList<>();
    }
    public Employee(List<String> listEmp){
        this.listEmp = listEmp;
    }
    public List<String> getListEmp(){
        return listEmp;
    }
    public void loadEmp(){
        listEmp.add("ayush");
        listEmp.add("karthik");
        listEmp.add("yz");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        for (String str : listEmp){
            list.add(str);
        }
        return new Employee(list);
    }
}
