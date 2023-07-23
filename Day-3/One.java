//Remove dupliates from given array

import java.util.Arrays;

public class One {
    public static void main(String args[]){
        int a[]={1,2,3,1,2,3,4,5,5,6,7,8,9};
        Arrays.sort(a);
        int b[]=new int[a.length];
        int k=0;
        for (int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                b[k++]=a[i];
            }
        }
        b[k]=a[a.length-1];
        for (int i=0;i<=k;i++){
            System.out.print(b[i]+" ");
        }
    }
}
