import java.util.Scanner;
class Day3{
    public static void main(String args[])
    {
        Scanner Scan = new Scanner(System.in);
        String name = Scan.nextLine();
        int age = Scan.nextInt();
        Scan.nextLine();
        String address = Scan.nextLine();
        System.out.println("My name is"+name);
        System.out.println("My age is"+age);
        System.out.println("My address is"+address);
        Scan.close();

    }
}