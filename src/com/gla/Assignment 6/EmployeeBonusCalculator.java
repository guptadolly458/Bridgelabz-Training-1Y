
import java.util.*;
public class EmployeeBonusCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] data=new int[10][2];
        for(int i=0;i<10;i++){
            data[i][0]=sc.nextInt();
            data[i][1]=data[i][0]/10;
        }
        System.out.println(Arrays.deepToString(data));
        sc.close();
    }
}
