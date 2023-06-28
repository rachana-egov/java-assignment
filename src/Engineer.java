public class Engineer extends Employee{
    private double benefits;
    public Engineer(String Name, double BaseSalary, double Gratuity, long JoiningDate, double benefits){
        super(Name, BaseSalary, Gratuity, JoiningDate);
        this.benefits = benefits;
    }
    public void displayTotalSalary(){
        double totalSalary = BaseSalary + Gratuity + benefits;
        System.out.println("Total salary is: "+totalSalary + " per month");
    }
    public void displayEmployeeRole(){
        System.out.println("I am an instance of type Engineer, I build stuff!");
    }
}
