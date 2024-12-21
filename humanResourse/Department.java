package humanResourse;
import employee.Employee;

public class Department {
    private String name;
    private Employee[]employee = new Employee[10];
    private int counter=-1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addEmp(Employee employees){
        if(counter<employee.length){
            counter++;
            employee[counter]=employees;
        }
    }
    
    /*return an array of employee*/
    public Employee[] getEmp(){
        Employee [] e = new Employee[counter+1];
        
        for(int i=0;i<e.length;i++){
            e[i]=employee[i];
        }
        return e;
    }
    
    /*number of employee*/
    public int getEmpNum(){
        return counter+1; //counter start with 0
    }
    
    public Employee getByID(int empID) {
        for (Employee emp : employee) {
            if (emp != null) {
                if (empID == emp.getId()) {
                    return emp;
                }
            }
        }
        return null;
    }
    
    public double getTotalSalary(){
        double total=0;
        for(int i=0;i<=counter;i++){
            total+=employee[i].getSalary();
        }
        return total;
    }
    
    public double getAverageSalary(){
        if(counter>-1){
            return getTotalSalary()/getEmpNum();
        }
        return 0;
    }
}
