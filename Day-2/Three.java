//   A
//   AB
//   ABC
//   ABCD
//   ABCDE

import java.util.Scanner;

public class Three {
    public static void main(String ar[]){
        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.close();
            for(int i=0;i<n;i++){
                for(int j=0;j<i+1;j++){
                    System.out.print((char)(j+65));
                }
                System.out.println();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
