package design_patterns.prototype;

import java.util.List;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp = new Employee();
        emp.loadEmp();

        //Use the clone method to get the Employee object
        Employee emp1 = (Employee) emp.clone();
        Employee emp2 = (Employee) emp.clone();
        List<String> addEmpInEmp1 = emp1.getListEmp();
        addEmpInEmp1.add("kaibalya");
        List<String> addEmpInEmp2 = emp2.getListEmp();
        addEmpInEmp2.add("Akshay");
        System.out.println("emps List: "+emp.getListEmp());
        System.out.println("empsNew List: "+addEmpInEmp1);
        System.out.println("empsNew1 List: "+addEmpInEmp2);

    }
}
