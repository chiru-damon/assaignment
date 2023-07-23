//        1
//       2 3
//      4 5 6
//     7 8 9 10
//

import java.util.Scanner;

public class Five {
    public static void main(String Args[]){
        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=1;
            sc.close();
            for(int i=0;i<n;i++){
                for(int j=n-i-1;j>0;j--){
                    System.out.print(" ");
                }
                for(int j=0;j<i+1;j++){
                    System.out.print(k+++" ");
                }
            System.out.println();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
