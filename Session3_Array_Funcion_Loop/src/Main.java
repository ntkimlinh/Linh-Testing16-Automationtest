//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    static void inPhanTuMang (int [] arrNum) {
        for (int i = 0; i < arrNum.length; i++) {       //In các phần tử của mảng
            System.out.print(arrNum[i] + " ");
        }
        System.out.println();
    }
    static int TongPhanTuMang (int [] arrNum) {
        int sum = 0;
        for ( int i = 0; i < arrNum.length; i++) {
            sum += arrNum[i];
        }
        System.out.println("Sum = " + sum);
        return sum;
    }
    static int[] MaxMinArray (int [] arrNum1) {
        int max = arrNum1[0];
        int min = arrNum1[0];
        for (int i = 1; i < arrNum1.length; i++) {
            if (arrNum1[i] > max) {
                max = arrNum1[i];
            }
            if (arrNum1[i] < min) {
                min = arrNum1[i];
            }
        }
        return new int[]{max,min};
    }
    static int SecondMax (int [] arrNum1) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for (int i = 0; i < arrNum1.length; i++) {
            if ( arrNum1[i] > max ){
                secondMax = max;
                max = arrNum1[i];
            }else if (arrNum1[i] > secondMax  && arrNum1[i] < max){
                secondMax = arrNum1[i];
            }
        }
        return secondMax;
    }
    static String removeNguyenAm(String str){
        String result = "";       //String <=> char[]
        //Cách 1:
        for (int i = 0; i < str.length(); i++) {
            char c =  str.charAt(i); //chuyển ký tự về chữ thường
            char lowerC = Character.toLowerCase(c);
            if (lowerC != 'u' && lowerC != 'e' && lowerC != 'o' && lowerC != 'a' && lowerC != 'i') {
                result += c;
            }
        }
        return  result;
    }

//  tính tổng các chữ số của 1 số
    static int SumChuSo(int number){
        int sum = 0;

//        C1: chia theo mãng và cộng từng số lại
        String strNum = String.valueOf(number);
        for (int i = 0; i < strNum.length(); i++) {
            String character = Character.toString(strNum.charAt(i));
            sum += Integer.parseInt(character);
        }

//      C2: Lấy nguyên mãng chia 10
//        while (number > 0) {
//            sum += number % 10;
//            number /= 10;
//        }
        return sum;
    }

//  Đếm số chữ số của 1 số
    static int DemChuSo(long number1){
        int count = 0;

        while (number1 > 0) {
            count ++;
            number1 = number1 / 10;
        }
        return count;

    }

//  Đảo số
    static long DaoSo(long number1){
        long SoDaoNguoc = 0;


        while (number1 > 0) {
            long ChuSoCuoi = number1 % 10;
            SoDaoNguoc = SoDaoNguoc * 10 + ChuSoCuoi;
            number1 = number1 / 10;
        }

        return SoDaoNguoc;
    }

//  In hình chữ nhật
    static void InHinChuNhat(int dai, int rong) {
        for (int i = 0; i < rong; i++) {
            for (int j = 0; j < dai; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//  In hình tam giác vuông
    static void InHinhTamGiacVuong (int DoDai){
        for (int i = 1; i <= DoDai; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    //MẢNG
        //Mảng số nguyên
        //Tạo mảng & có gán giá trị
        int[] arrNum ={1,2,3,4,5,6,7};
        int[] arrNum1 ={1,2,3,4,5,6,7};
//
        inPhanTuMang(arrNum);

        int sum=TongPhanTuMang(arrNum);
        System.out.println("=======================");
        int max = MaxMinArray(arrNum1)[0];
        int min = MaxMinArray(arrNum1)[1];
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        System.out.println("=======================");
        int secondMax = SecondMax(arrNum1);
        System.out.println("Số lớn thứ 2 là " + secondMax);

        System.out.println("=======================");
        String str= "Cybersoft";
        String result = removeNguyenAm(str);
        System.out.println(result);

        System.out.println("=======================");
        int number =1234;
        int tong=SumChuSo(number);

        System.out.println("Tổng các chữ số "+ number + ": "+ tong);

        System.out.println("=======================");
        long number1 =56728;
        int dem=DemChuSo(number1);
        System.out.println("Số "+ number1 + " có "+ dem);

        System.out.println("=======================");
        long DaoSo = DaoSo(number1);
        System.out.println("Số ban đầu là " +number1+ ". Số được đảo lại là "+ DaoSo);

        System.out.println("=======================");
        InHinChuNhat(5,3);

        System.out.println("=======================");
        InHinhTamGiacVuong(5);




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



    }
}