public class Developer extends Employee {
    String title;
    String HieuSuatCV;

    public Developer(){
        super();
    }

    public Developer(String ID, String name, int basicSalary,
                     String PhuCap, String title, String HieuSuat) {
        super(ID, name, basicSalary, PhuCap);
        this.title = title;
        this.HieuSuatCV = HieuSuat;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Title: " + title);
        System.out.println("Hiệu suất CV: " + this.HieuSuatCV);
    }
}
