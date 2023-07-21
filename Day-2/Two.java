//      1
//     22
//    333
//   4444
//  55555
import java.util.Scanner;

public class Two {
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.close();
            for (int i=0;i<n;i++){
                for(int j=n-i;j>0;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<i+2;k++){
                    System.out.print(i+1);
                }
                System.out.println();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}
