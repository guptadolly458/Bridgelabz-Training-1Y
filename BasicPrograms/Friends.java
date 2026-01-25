import java.util.Scanner;

class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();

        int heightAmar = sc.nextInt();
        int heightAkbar = sc.nextInt();
        int heightAnthony = sc.nextInt();

        int youngest = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallest = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        System.out.println("Youngest Age = " + youngest);
        System.out.println("Tallest Height = " + tallest);
    }
}
