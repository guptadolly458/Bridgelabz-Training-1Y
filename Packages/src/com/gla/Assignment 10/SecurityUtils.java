interface SecurityUtils {
    static boolean isStrong(String password) {
        return password.length() >= 8;
    }
}

public class TestSecurity {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrong("abc12345"));
    }
}