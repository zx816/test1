import java.util.Scanner;
/*2063study*/
public class A65 {
    private static int[][] relation_pic;
    private static int[] used;
    private static int[] boy;
    private static int girl_num;
    private static int boy_num ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int count = sc.nextInt();
            if (count == 0) break;
            girl_num = sc.nextInt();
            boy_num = sc.nextInt();
            relation_pic = new int[girl_num + 1][boy_num + 1];
            used = new int[boy_num + 1];
            boy = new int[boy_num + 1];
            while (count-- != 0) {
                int girl_no = sc.nextInt();
                int boy_no = sc.nextInt();
                relation_pic[girl_no][boy_no] = 1;
            }

            int res = 0;
            for(int i = 1;i<=girl_num;++i){
                for(int j = 1;j<=boy_num;++j)
                    used[j] = 0;
                if(find(i))
                    res++;
            }

            System.out.println(res);
        }
    }

    private static boolean find(int girl_no){
        for(int i = 1;i <= boy_num;++i){
            if(relation_pic[girl_no][i]==1&&used[i]==0){
                used[i] = 1;
                if(boy[i] == 0 || find(boy[i])){
                    boy[i] = girl_no;
                    return true;
                }

            }
        }
        return false;
    }
}
