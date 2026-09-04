import java.util.Scanner;
public class Day10 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        int total=0;
        for(int i=1;i<=6;i++)
        {
            total=total+i;
        }
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        int missing=total-sum;
        System.out.println(missing);
        }
        }