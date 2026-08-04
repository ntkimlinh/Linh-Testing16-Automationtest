//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng người dùng

//        VD2: Quản lý nhân viên
//        Developer, Tester, ProjectManager
//        Thông tin chung: employeeID, name, basic salary, level
//        Đặc trưng riêng từng title
//        Dev: Salary: fresher (6tr), Junior (11tr + phụ cấp), middle (11tr + phụ cấp + hiệu suất công việc)
//
//        Tester: Fresher (6tr), Junior (10tr + phuj )
        Developer dev1 = new Developer("Dev01", "Nguyen Van A", 11000000, "Gửi xe", "Junior", "A");
        dev1.showInfo();

    }

}