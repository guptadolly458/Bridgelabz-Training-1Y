
import java.util.*;
public class FactorsArrayOperations{
    public static int[] findFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++) if(n%i==0) count++;
        int[] arr=new int[count];
        int k=0;
        for(int i=1;i<=n;i++) if(n%i==0) arr[k++]=i;
        return arr;
    }
    public static int sum(int[] arr){
        int s=0;
        for(int v:arr) s+=v;
        return s;
    }
    public static int product(int[] arr){
        int p=1;
        for(int v:arr) p*=v;
        return p;
    }
    public static double sumOfSquares(int[] arr){
        double s=0;
        for(int v:arr) s+=Math.pow(v,2);
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] f=findFactors(n);
        System.out.println(Arrays.toString(f));
        System.out.println(sum(f));
        System.out.println(product(f));
        System.out.println(sumOfSquares(f));
        sc.close();
    }
}
