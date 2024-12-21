import employee.*;
import humanResourse.*;

public class CaseStudy {
    public static void main(String[]args){
        Employee e1=new Employee(1,"TPY",100000);
        Employee e2=new Employee(2,"TYT",100000);
        Employee e3=new Employee(3,"SZW",100000);
        Employee e4 = new Employee(4, "TJW", 100000);
        Employee e5 = new Employee(5, "TWO", 100000);
        
        
        Department d = new Department("IT");
        d.addEmp(e1);
        d.addEmp(e2);
        d.addEmp(e3);
        d.addEmp(e4);
        d.addEmp(e5);
  
        
        Employee[]emp=d.getEmp(); 
        
        for(Employee e:emp){
            System.out.println(e.toString());
            System.out.println("---------------------------------");
        }
        System.out.println("Total salary: RM "+d.getTotalSalary());
        System.out.println("Average salary: RM "+d.getAverageSalary());
        System.out.println("---------------------------------");
        System.out.println(d.getByID(1));
        
        
    }
}

