
import java.util.*;
public class StudentScorecardGenerator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] marks=new int[5][3];
        for(int i=0;i<5;i++)
            for(int j=0;j<3;j++)
                marks[i][j]=sc.nextInt();
        System.out.println(Arrays.deepToString(marks));
        sc.close();
    }
}
