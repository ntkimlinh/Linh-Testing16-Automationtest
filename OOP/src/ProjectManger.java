public class ProjectManger extends Employee{
    int soLuongProject;
    String thuongDuAn;

    public ProjectManger(){
        super();
    }

    public ProjectManger(String ID, String name,
                         int basicSalary, String PhuCap,
                         int soLuongProject, String thuongDuAn) {
        super(ID, name, basicSalary, PhuCap);
        this.soLuongProject = soLuongProject;
        this.thuongDuAn = thuongDuAn;
    }

    @Override
    public void showInfo() {
        System.out.println("Thuongwt dự án: " + this.thuongDuAn);
        System.out.println("Số lượng dự án: " + this.soLuongProject);
    }
}
