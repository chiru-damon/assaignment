//          1
//         121
//        12321
//       1234321

import java.util.Scanner;

public class One {
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.close();
            for(int i=0;i<n;i++){
                for (int j=n-i-1;j>0;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<i+2;k++){
                    System.out.print(k);
                }
                for(int k=i;k>0;k--){
                    System.out.print(k);
                }
                System.out.println();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
