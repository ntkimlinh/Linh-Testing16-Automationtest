public class Employee {
    String ID;
    String name;
    int basicSalary;
    String PhuCap;

    public Employee(){
        basicSalary = 6000000;
    }
    public Employee(String ID, String name, int basicSalary, String PhuCap) {
        this.ID = ID;
        this.name = name;
        this.basicSalary = basicSalary;
        this.PhuCap = PhuCap;
    }
    public void showInfo(){
        System.out.println("================================");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Phu Cap: " + PhuCap);
    }


}
