import java.util.Scanner;
/*2063study 匈牙利算法*/
public class A65 {
    //哪个女孩与哪个男孩是搭档
    private static int[][] relation_pic;
    private static int[] used;
    private static int[] boy;
    private static int girl_num;
    private static int boy_num ;
    /*1）依次给每个女生安排搭档，当一个女生所理想的搭档被选择时，前面的女生“尝试”让位(即有“备胎”的就选“备胎”)，安排不了就此女生就遗憾退场；
      2）清空所有男生的预约，再次给女生匹配搭档，但此时女生不能选择“以前”（前面的方案）选择过的男生；
     3）若步骤2中成功找到另一种方案，则为成功找到一条增广路径，组合数+1，继续执行步骤1~2。*/
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
                //恢复每个男生单身的身份
                for(int j = 1;j<=boy_num;++j)
                    used[j] = 0;
                /*帮女孩找配对
                  成功找到一个新的增广路径
                  男生和女生相互确认*/
                if(find(i))
                    res++;
            }
            System.out.println(res);
        }
    }

    private static boolean find(int girl_no){
        for(int i = 1;i <= boy_num;++i){
            //若女生x曾试图找这个男生i做搭档，这次就没机会
            if(relation_pic[girl_no][i]==1&&used[i]==0){
                used[i] = 1;
                //男生i还没有搭档，或者男生i可以将之前的搭档安排给别人
                if(boy[i] == 0 || find(boy[i])){
                    boy[i] = girl_no;
                    return true;
                }
            }
        }
        return false;
    }
}
