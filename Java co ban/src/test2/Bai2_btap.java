package test2;

import java.util.Scanner;

public class Bai2_btap
{
    //Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
    //VD: 1 -> Một, 2 -> Hai,
    public static void main(String[] args)
    {
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen = ");
        m = scanner.nextInt();
        switch (m)
        {
            case 0: System.out.println("Khong"); break;
            case 1: System.out.println("Mot"); break;
            case 2: System.out.println("Hai"); break;
            case 3: System.out.println("Ba"); break;
            case 4: System.out.println("Bon"); break;
            case 5: System.out.println("Nam"); break;
            case 6: System.out.println("Sau"); break;
            case 7: System.out.println("Bay"); break;
            case 8: System.out.println("Tam"); break;
            case 9: System.out.println("Chin"); break;
            default:
                break;
        }
    }
}
