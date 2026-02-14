
import java.util.*;
public class OTPGeneratorValidator{
    public static int generate(){ return (int)(Math.random()*900000)+100000; }
    public static void main(String[] args){
        int[] arr=new int[10];
        for(int i=0;i<10;i++) arr[i]=generate();
        System.out.println(Arrays.toString(arr));
    }
}
