
import java.util.*;
public class RandomNumberStatistics{
    public static int[] generate(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=(int)(Math.random()*9000)+1000;
        return arr;
    }
    public static double[] stats(int[] arr){
        int min=arr[0],max=arr[0],sum=0;
        for(int v:arr){
            if(v<min) min=v;
            if(v>max) max=v;
            sum+=v;
        }
        return new double[]{(double)sum/arr.length,min,max};
    }
    public static void main(String[] args){
        int[] arr=generate(5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(stats(arr)));
    }
}
