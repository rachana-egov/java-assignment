public class Main {
    public static void main(String[] arg){
        Employee employee1 = new Employee("R", 0, 0, 0);
        employee1.displayEmployeeRole();
        employee1.displayTotalSalary();
        Engineer engineer1 = new Engineer("P", 0, 0, 0, 0);
        engineer1.displayEmployeeRole();
        engineer1.displayTotalSalary();
    }
}
