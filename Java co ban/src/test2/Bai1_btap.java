package test2;

import java.util.Scanner;

public class Bai1_btap
{
    public static void main(String[] args)
    {
        int m;
        System.out.println("Nhap vao mot so nguyen = ");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        if (m >= 0)
        {
            System.out.println("Day la so nguyen duong");
        }
        else
        {
            System.out.println("Day la so nguyen am");
        }
    }
}
