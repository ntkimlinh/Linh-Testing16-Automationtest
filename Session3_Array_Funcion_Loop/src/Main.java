//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    //MẢNG
        //Mảng số nguyên
        //Tạo mảng & có gán giá trị
//        int[] arrNum ={1,2,3,4,5,6,7};
//        //bắt đầu từ:  0 1 2 3 4 5 6
//        System.out.println(arrNum[0]);     //In 1 số chỉ định
//
//        for (int i = 0; i < arrNum.length; i++) {       //In các phần tử của mảng
//            System.out.print(arrNum[i] + " ");
//        }

        //2.Nhập từng phần tử của mảng

//        System.out.println("Nhập số lượng phần tử của mảng: ");
//        n = scan.nextInt();
//
//        int[] arrNum1 = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Phần tử thứ " + (i + 1));
//            arrNum1[i] = scan.nextInt();
//        }
//        System.out.println("Các giá trị trong ArrayNum 1: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arrNum1[i] + " ");
//        }

        //BT3:
//        System.out.print("Nhập số lượng phần tử của mảng: ");
//        int n = scan.nextInt();
//
//        int[] arrNum1 = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Phần tử thứ " + (i + 1) + ": ");
//            arrNum1[i] = scan.nextInt();
//       }
//
//        System.out.print("Nhập vào số cần tìm kiếm: ");
//        int soCanTim = scan.nextInt();
//
//        int ketQua = -1;
//
//        for (int i = 0; i < n; i++) {
//            if (arrNum1[i] == soCanTim) {
//                ketQua = i;
//            }
//        }
//
//        System.out.println("Kết quả: Phân tử thứ " + ketQua);

        //BT4: Tìm số lớn thứ 2 trong mảng

//        int max = Integer.MIN_VALUE;
//        int secondMax = Integer.MAX_VALUE;
//        for (int i = 0; i <n; i++) {
//            if ( arrNum1[i] > max ){
//                secondMax = max;
//                max = arrNum1[i];
//            }else if (arrNum1[i] > secondMax  && arrNum1[i] < max){
//                secondMax = arrNum1[i];
//            }
//        }
//        System.out.println("Số lớn thứ 2 là: " + secondMax);

        //BT5: Xóa nguyên âm (u,e,o,a,i)
        //input: Cybersoft
        //output: Cybrsft

        String str= "Cybersoft";  //String là tập hợp các ký tự
        String result = "";       //String <=> char[]
        //Cách 1:
        for (int i = 0; i < str.length(); i++) {
            char c =  str.charAt(i); //chuyển ký tự về chữ thường
            char lowerC = Character.toLowerCase(c);
            if (lowerC != 'u' && lowerC != 'e' && lowerC != 'o' && lowerC != 'a' && lowerC != 'i') {
                result += c;
            }
        }
        System.out.println(result);

        String str= "Cybersoft";  //String là tập hợp các ký tự
        String result = "";       //String <=> char[]
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); //chuyển ký tự về chữ thường
            char lowerC = Character.toLowerCase(c);
            //Cách 2:
            if ("ueoai".contains(String.valueOf(lowerC)) == false) {
                result += c:
            }
        }






    }
}