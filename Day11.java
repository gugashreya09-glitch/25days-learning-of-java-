import java.util.Scanner;
public class Day11 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[5];
          int[] arr2=new int[5];
        for(int i=0;i<5;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr1[i]+"");
                    break;
                }
            }
        }
    }
}
