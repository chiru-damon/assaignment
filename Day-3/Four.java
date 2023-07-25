// First Repeating element in array

import java.util.Scanner;

public class Four{
    public static void main(String args[]){
        try{
            int a[]={10,20,20,30,40,50};
            int ans=0;
            for(int i=0;i<a.length;i++){
                for (int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        ans=a[i];
                        break;
                    }
                }
                if(ans>0){
                    break;
                }
            }
            System.out.println(ans);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}