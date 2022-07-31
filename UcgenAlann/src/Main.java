import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        double d,u;

        Scanner area = new Scanner(System.in);

        System.out.println("1. Kenar : ");
        a = area.nextInt();

        System.out.println("2. Kenar : ");
        b = area.nextInt();

        System.out.println("3. Kenar : ");
        c = area.nextInt();

        u = (a+b+c)/2;
        d =Math.sqrt( u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı :" +d );
    }
}