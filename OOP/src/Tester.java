public class Tester extends Employee {
    String title;
    String soLuongBug;

    public Tester(){
        super();
    }

    public Tester( String ID, String name,
                   int basicSalary, String PhuCap,
                   String title, String soLuongBug) {
        super(ID, name, basicSalary, PhuCap);
        this.title = title;
        this.soLuongBug = soLuongBug;
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " + this.title);
        System.out.println("Số Lượng Bug: " + this.soLuongBug);
    }
}
