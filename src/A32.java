import java.util.Scanner;
/*2030pass借鉴*/
public class A32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int x=sc.nextInt();
            sc.nextLine();
            for (int i=0;i<x;i++){
                String s=sc.nextLine();
                byte[] bytes=s.getBytes();
                int count=0;
                for (int j=0;j<bytes.length;j++) {
                    if (bytes[j]<0)
                        count++;
                }
                System.out.println(count/2);
            }
        }
    }
}
