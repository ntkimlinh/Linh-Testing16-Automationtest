import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // input: Nhập vào 1 số
//        System.out.print("Nhập số tuổi: ");
//        float number2 = scan.nextFloat();
//        scan.nextLine();
//        int number = input.nextInt();
// 1. If Else
//        // BT1: output: âm or dương
//        if (number >=0 ) {
//            System.out.println("Số bạn nhập là số dương");
//        }else {
//            System.out.println("Số bạn nhập la số âm");
//        }
//
//        //BT2: Kiểm tra số chẵn/lẻ
//        if(number %2 ==0 ){
//            System.out.println("Số là số chẵn");
//        }else {
//            System.out.println("Số là số lẻ");
//        }

        //BT3:Xếp loại học sinh (9->10: Xuất xắc, 8->9: Giỏi, 6,5->8: Khá, 5->6,5: Trung Bình, dưới 5: Yếu)
//         if(number2 <0 || number2 >10) {
//             System.out.println("Sai yêu cầu, vui lòng nhập lại!");
//         }
//
//        if (number2 >= 9 && number2 <= 10) {
//            System.out.println("Học sinh xuất sắc");
//        } else if (number2 >= 8 && number2 < 9) {
//            System.out.println("Học sinh Giỏi");
//        } else if (number2 >= 6.5 && number2 < 8) {
//            System.out.println("Học sinh Khá");
//        } else if (number2 >= 5 && number2 < 6.5) {
//            System.out.println("Học sinh Trung Bình");
//        } else {
//            System.out.println("Học sinh Yếu");
//        }

        //BT4: đăng nhập

//        String username = "admin";
//        String password = "123456";
//        boolean isActive = true;
//        if (username.isEmpty() || password.isEmpty()) {
//            System.out.println("Lỗi");
//        } else if (!isActive) {
//            System.out.println("Lỗi tài khoản đã bị khóa");
//        } else if (username.equals("admin")== false || password.equals("123456") == false) {
//            System.out.println("Lỗi tài khoản hoặc mật khẩu không đúng");
//        } else {
//            System.out.println("Đăng nhập thành công");
//        }

        //BT5: Tính tiền vé theo độ tuổi (child < 12t: free, người lớn >=60t: 50k cho mỗi lỗi vé, người lớn: VIP 200K - thường 150k)
//        if (number2 < 12){
//            System.out.println("Trẻ em vé miễn phí");
//        }else if (number2 >=60){
//            System.out.println("Người lớn trên 60 tuổi: 50.000");
//        }else {
//            System.out.println("Người lớn");
//
//        System.out.print("Nhập loại vé (VIP/Thường): ");
//        String loaiVe = scan.nextLine();
//        if (loaiVe.equalsIgnoreCase("VIP")) {
//            System.out.println("Giá vé: 200.000 VNĐ");
//        } else if (loaiVe.equalsIgnoreCase("Thuong")) {
//            System.out.println("Giá vé: 150.000 VNĐ");
//        } else {
//            System.out.println("Loại vé không hợp lệ! Tự động tính theo vé thường.");
//        }}

        //BT6: Tìm số Maximun trong 3 số
//        System.out.print("Nhập số thứ nhất (a): ");
//        int a = scan.nextInt();
//        System.out.print("Nhập số thứ hai (b): ");
//        int b = scan.nextInt();
//        System.out.print("Nhập số thứ ba (c): ");
//        int c = scan.nextInt();
//        int max = a;
//        if (a >= b && a >= c) {
//            max = a;
//        } else if (b >= a && b >= c) {
//            max = b;
//        } else {
//            max = c;
//        }
//        // kết quả
//        System.out.println("Số lớn nhất trong 3 số là: " + max);
//        scan.close();



// 2. Vòng Lập (Loop)
        int n = 50;

        //BT1: In các số từ 1 -> 50
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //BT2: In các số chẵn từ 1->50
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //BT3: Tính tổng các số từ 1 -> n
        int tong=0;
        for (int i = 0; i <= n; i++) {
            tong=tong+i;
        }
        System.out.println("Tổng từ 1 đến n: "+tong);

        //BT4: Nhập bản cửu chương
        System.out.print("Nhập số bảng cửu chương bạn muốn: ");
        int a = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(a+ "x"+ i+ "="+(a*i) );
        }




    }
}