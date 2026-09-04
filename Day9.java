import java.util.Scanner;
public class Day9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<5;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
            }
            while(index<5)
            {
                arr[index]=0;
                index++;
            }
        
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]+"");
        }
            }
        }
        
