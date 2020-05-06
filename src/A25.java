import java.util.Scanner;
/*2023借鉴 假设一个班有n(n<=50)个学生，每人考m(m<=5)门课，求每个学
生的平均成绩和每门课的平均成绩，并输出各科成绩均大于等于平均成绩的学生数量*/
public class A25 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while (sn.hasNext()) {
            int n = sn.nextInt();
            int m = sn.nextInt();
            double[] stuAvg = new double[n];
            double[] gradeAvg = new double[m];
            double[][] arr = new double[n][m];
            for (int i = 0; i < n; i++) {
                double stuAv = 0;
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sn.nextDouble();
                    stuAv = stuAv + arr[i][j];
                }
                stuAvg[i] = stuAv / m;
            }
            for(int i = 0;i < n-1 ;i++)
                //此处不同
                System.out.print(String.format("%.2f", stuAvg[i]) +" ");
            System.out.println(String.format("%.2f", stuAvg[n-1]));
            for (int i = 0; i < m; i++) {
                double gradeAv = 0;
                for (int j = 0; j < n; j++)
                    gradeAv = gradeAv + arr[j][i];
                gradeAvg[i] = gradeAv / n;
            }
            for(int i = 0;i < m-1 ;i++)
                System.out.print(String.format("%.2f", gradeAvg[i]) +" ");
            System.out.println(String.format("%.2f", gradeAvg[m-1]));
            int count = 0;
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if(arr[i][j] < gradeAvg[j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag == true)
                    count++;
            }
            System.out.println(count);
            System.out.println();
        }
    }
}

