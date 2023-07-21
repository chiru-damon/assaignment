//Intersection and union
import java.util.*;


class One{
    public static void main(String args[]){
        int n1=10,n2=5;

        int l1[]=new int[n1];
        int l2[]=new int[n2];
        try{
            Scanner sc=new Scanner(System.in);
            
            for (int i=0;i<n1;i++){
                l1[i]=sc.nextInt();
            }
            for (int i=0;i<n2;i++){
                l2[i]=sc.nextInt();
            }
            Intersection(l1,l2);
            union(l1,l2);
            sc.close();
        }catch(Exception e){
            System.out.print(e);
        }
    }
    public static void Intersection(int[] l1,int[] l2){
        int res[];
        res=l1.length>l2.length?new int[l2.length]:new int[l1.length];
        int k=0;
        for(int i=0;i<l1.length;i++){
            for (int j=0;j<l2.length;j++){
                if(l1[i]==l2[j]){
                    res[k++]=l1[i];
                    break;
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(res[i]+" ");
        }System.out.println();
    }
    public static void union(int[] l1,int []l2){
        int res[];
        res=new int[l1.length+l2.length];
        int k=0;
        for(int i=0;i<l1.length;i++){
            res[k++]=l1[i];
        }
        for (int j=0;j<l2.length;j++){
            int t=0;
            for(int i=0;i<l1.length;i++){
                
                if (l1[i]==l2[j]){
                    break;
                }else{
                    t+=1;
                }
            }
            if(t==l1.length){
                res[k++]=l2[j];
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(res[i]+" ");
        }
    }
}