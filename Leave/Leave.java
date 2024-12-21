package Leave;
import employee.Employee;

public class Leave {
    public static void applyLeave(Employee employee, int leaveTaken) {
        int leaveBalance = employee.getLeaveBalance();
        if (leaveTaken > 14) {
            double penalty = employee.getSalary() * 0.10;
            employee.setSalary(employee.getSalary() - penalty);
            System.out.println("Employee\t\t:" + employee.getName());
            System.out.println("Penalty\t\t\t:RM " + penalty);
            System.out.println("Remaining Salary\t:RM " + employee.getSalary());
        }
        employee.setLeaveBalance(leaveBalance - leaveTaken);
    }
}