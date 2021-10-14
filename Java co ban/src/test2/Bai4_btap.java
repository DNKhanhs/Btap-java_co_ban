package test2;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào 3 số
//Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuong hay không.

public class Bai4_btap
{
    public static void main(String[] args)
    {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 3 so");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        if ( a*a==b*b+c*c || b*b==a*a+c*c || c*c==b*b+a*a)
        {
            System.out.println("a,b,c la 3 canh cua tam giac vuong");
        } else
        {
            System.out.println("a,b,c khong phai la 3 canh cua tam giac vuong");
        }
    }
}
