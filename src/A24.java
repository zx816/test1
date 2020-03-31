import java.util.Scanner;
/*2022pass借鉴*/
public class A24 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while (sn.hasNext()) {
            int m = sn.nextInt();
            int n = sn.nextInt();
            int[][] arr = new int[m][n];
            int indexX = 0;
            int indexY = 0;
            int MM = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    //边初始化数据边完成题目要求
                    arr[i][j] = sn.nextInt();
                    if(Math.abs(arr[i][j]) > Math.abs(MM)) {
                        MM = arr[i][j];
                        indexX = i+1;
                        indexY = j+1;
                    }
                }
            }
            System.out.println(indexX + " " + indexY + " " + MM);
        }
    }
}
