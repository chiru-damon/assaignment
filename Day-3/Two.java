//Nth minimum element

import java.util.Arrays;
import java.util.Scanner;

public class Two{
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.close();
            int a[]={1,2,3,4,5,6,7,8, 9,10};
            Arrays.sort(a);
            System.out.println(a[n-1]);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}