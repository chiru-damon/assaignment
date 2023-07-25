// Rotating an array

import java.util.Scanner;

public class Three{
    public static void main(String Args[]){
        try{
            Scanner sc=new Scanner(System.in);
            int key =sc.nextInt();
            sc.close();
            int a[]={1,2,3,4,5,6,7,8}        ;
            int i=1;
            int n=a.length;
            while (i<=key){
                int temp=a[n-1];
                for (int j=n-2;j>=0;j--){
                    a[j+1]=a[j];
                }
                a[0]=temp;
                System.out.println("\nAfter "+i+"Cyclic rotation");
                for(int j:a){
                    System.out.print(j+" ");
                }
                i++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}