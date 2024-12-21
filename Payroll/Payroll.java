package Payroll;
import employee.*;
import humanResourse.*;


public class Payroll {
    private double baseSalary;
    private double penaltyPercentage = 0.1;

    public Payroll(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary*(1-penaltyPercentage);
    }
}
