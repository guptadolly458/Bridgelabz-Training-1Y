
import java.util.*;
public class YoungestAndTallestFinder{
    public static int findYoungest(int[] ages){
        int min=ages[0];
        for(int v:ages) if(v<min) min=v;
        return min;
    }
    public static int findTallest(int[] heights){
        int max=heights[0];
        for(int v:heights) if(v>max) max=v;
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[3];
        int[] heights=new int[3];
        for(int i=0;i<3;i++) ages[i]=sc.nextInt();
        for(int i=0;i<3;i++) heights[i]=sc.nextInt();
        System.out.println(findYoungest(ages));
        System.out.println(findTallest(heights));
        sc.close();
    }
}
