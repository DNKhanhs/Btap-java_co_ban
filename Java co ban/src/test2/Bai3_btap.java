package test2;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào 3 số thực
//Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.

public class Bai3_btap
{
    public static void main(String[] args)
    {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 3 so thuc");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        if (a + b > c && b + c > a && c + a > b)
        {
            System.out.println("a,b,c la 3 canh cua 1 tam giac");
        } else
        {
            System.out.println("a,b,c khong phai la 3 canh cua 1 tam giac");
        }
    }
}

