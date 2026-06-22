import java.util.Scanner;
public class Day5 {
    public static void main(String args[])
    {
        Scanner Scan = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i=0;i<=4;i++)
        {
            marks[i] = Scan.nextInt();

        }
        for(int i=0;i<=4;i++)
        {
            System.out.println(marks[i]);
        }
    }
    
}
