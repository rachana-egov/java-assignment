public class Employee {
    private String name;
    protected double BaseSalary;
    protected double Gratuity;
    private long JoiningDate;
    public Employee(String name, double BaseSalary, double Gratuity, long JoiningDate){
        this.name = name;
        this.BaseSalary = BaseSalary;
        this.Gratuity = Gratuity;
        this.JoiningDate = JoiningDate;
    }
    public void displayTotalSalary(){
        double totalSalary = BaseSalary + Gratuity;
        System.out.println("Total salary is: "+totalSalary + " per month");
    }
    public void displayEmployeeRole(){
        System.out.println("I am an instance of the type employee, I can do anything!");
    }

}
