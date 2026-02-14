
import java.util.*;
public class FootballTeamHeightStatistics{
    public static int[] generate(){
        int[] arr=new int[11];
        for(int i=0;i<11;i++) arr[i]=(int)(Math.random()*101)+150;
        return arr;
    }
    public static void main(String[] args){
        int[] h=generate();
        System.out.println(Arrays.toString(h));
    }
}
