package exCreatedUser.entities;

public class CreatUser {
    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;

    public double netSalary(){
        return grossSalary - tax;
    }

    public double increaseSalary(){
        return (grossSalary * (percentage / 100)) - tax;
    }
    
    public String toString(){
        return "Name: " + name + "\nGross Salary: " + grossSalary + "\nTax: " + tax;
    }






}
