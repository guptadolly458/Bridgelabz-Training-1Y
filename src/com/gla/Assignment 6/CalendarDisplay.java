
import java.util.*;
public class CalendarDisplay{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int year=sc.nextInt();
        Calendar cal=Calendar.getInstance();
        cal.set(year,month-1,1);
        int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        sc.close();
    }
}
