import java.util.Scanner;
/*2027pass*/
public class A29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < x; j++) {
                String s = sc.nextLine();
                char[] cs = s.toCharArray();
                int a = 0;
                int b = 0;
                int c = 0;
                int d = 0;
                int e = 0;
                for (int i = 0; i < cs.length; i++) {
                    switch (cs[i]) {
                        case 'a':
                            a++;
                            break;
                        case 'e':
                            b++;
                            break;
                        case 'i':
                            c++;
                            break;
                        case 'o':
                            d++;
                            break;
                        case 'u':
                            e++;
                            break;
                    }
                }
                System.out.println("a:" + a);
                System.out.println("e:" + b);
                System.out.println("i:" + c);
                System.out.println("o:" + d);
                System.out.println("u:" + e);
                if (j!=x-1)
                    System.out.println();
            }
        }
    }
}
