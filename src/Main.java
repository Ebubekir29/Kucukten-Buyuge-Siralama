import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1,sayi2,sayi3;

        System.out.print("1.Sayiyi giriniz : ");
        sayi1 = scan.nextInt();
        System.out.print("2.Sayiyi giriniz : ");
        sayi2 = scan.nextInt();
        System.out.print("3.Sayiyi giriniz : ");
        sayi3 = scan.nextInt();

        if(sayi1<sayi2 && sayi1<sayi3)
        {
            if(sayi2<sayi3)
                System.out.println(sayi1+"<"+sayi2+"<"+sayi3);
            else
                System.out.println(sayi1+"<"+sayi3+"<"+sayi2);
        }
        else if(sayi2<sayi1 &&sayi2<sayi3)
        {
            if(sayi1<sayi3)
                System.out.println(sayi2+"<"+sayi1+"<"+sayi3);
            else
                System.out.println(sayi2+"<"+sayi3+"<"+sayi1);
        }
        else
        {
            if(sayi1<sayi2)
             System.out.println(sayi3 +"<"+sayi1+"<"+sayi2);
            else
                System.out.println(sayi3+"<"+sayi2+"<"+sayi1);
        }

    }
}
