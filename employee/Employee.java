package employee;


public class Employee{
    private int id;
    private String name;
    private double salary;
    private int leaveBalance=14;

    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String toString(){
        return "Employee ID\t: "+id+"\nEmployee Name\t: "+name+"\nEmployee Salary : RM "+salary;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(int leaveBalance) {
        this.leaveBalance = leaveBalance;
    }
}