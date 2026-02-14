
import java.util.*;
public class StudentVoteChecker{
    public static boolean canVote(int age){
        if(age<0) return false;
        return age>=18;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
            System.out.println(canVote(sc.nextInt()));
        sc.close();
    }
}
