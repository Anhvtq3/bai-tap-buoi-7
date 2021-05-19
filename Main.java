import jdk.internal.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        StringArr();
        StringArr1();
    }

    static void StringArr() {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int size = sc.nextInt();
        int strArr[] = new int[size];
        for (int i = 0; i < strArr.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            strArr[i] = sc.nextInt();
        }
        show(strArr);
        //Tìm số lớn nhất trong mảng và index của phần tử đó
        int maxvalue = strArr[0];
        int index1 = 0;
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i] > maxvalue) {
                maxvalue = strArr[i];
                index1 = i;
            }
        }

        System.out.println("Giá trị lớn nhất của mảng là: " + maxvalue + " và index của phần tử này là: " + index1);

        //tìm số lớn thứ 2 trong mảng
        int max1 = strArr[0];
        int max2 = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i] > max1) {
                max1 = strArr[i];
            }
            for (int j = 1; j < strArr.length; j++) {
                if ((strArr[j] > max2) && (strArr[j] < max1)) {
                    max2 = strArr[j];
                }
            }
        }

        System.out.println("Giá trị lớn thứ 2 trong mảng: " + max2);
        //Tìm số bé nhất trong mảng
        int minvalue = strArr[0];
        int index2 = 0;
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i] < minvalue) {
                minvalue = strArr[i];
                index2 = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + minvalue + " và index của phần tử trong mảng là: " + index2);

    }

    //Bài tập thứ 2
    static void StringArr1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = sc.nextInt();

        String strArr1[] = new String[size];
        for (int i = 0; i < strArr1.length; i++) {
            System.out.printf("\nNhập phần tử thứ %d ", i);
            strArr1[i] = sc.next();

        }
        show1(strArr1);
        String version1="java";

        int count=0;
        for (int i = 0; i < strArr1.length; i++){
            if(strArr1[i].equalsIgnoreCase(version1)){
                count+=1;
            }

        }
        System.out.println("Số lần xuất hiện java= "+count);
    }

    public static void show(int[] arr) {
        System.out.println("Đây là mảng");


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void show1(String[] arr) {
        System.out.println("Đây là mảng");


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

