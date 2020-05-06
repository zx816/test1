import java.util.*;
/*2024pass借鉴 C语言合法标识符*/
public class A26 {
    static boolean think(String s) {
        char[] k = s.toCharArray();
        if (k[0] == '_' || (k[0] >= 'a' && k[0] <= 'z') || (k[0] >= 'A' && k[0] <= 'Z')) {
            for (int i = 1; i < s.length(); i++) {
                if (!(k[i] == '_' || (k[i] >= 'a' && k[i] <= 'z') || (k[i] >= 'A' && k[i] <= 'Z')
                        || (k[i] >= '0' && k[i] <= '9'))) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    String s1 = sc.nextLine();
                }
                //可包含空字符
                String s = sc.nextLine();
                if (think(s) == true) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }

    }

}
