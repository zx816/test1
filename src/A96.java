import java.util.Scanner;
/*2094 总共的不同人的数目，减去输的不同的人的数目。
如果等于一，输出yes，其他的为no。*/
public class A96 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
             int m=sc.nextInt();
             if (m==0)break;
             String[] a = new String[2*m];
             int[] b = new int[2*m];
             for(int i=0;i<2*m;i++){
                 b[i]=1;
             }
             int[] c = new int[2*m];
             for(int i=1;i<2*m;i=i+2){
                 c[i]=1;
             }
             for(int i=0;i<2*m;i++){
                a[i]=sc.next();
             }
             int name =0;
             int time =0;
             for(int i=0;i<2*m-1;i++){
                 for(int j=i+1;j<2*m;j++){
                    if(a[j].equals(a[i])){
                        b[j]=0;
                    }
                }
             }
             for(int i=0;i<2*m;i++){
                name+=b[i];
             }
             for(int i=1;i<2*m-2;i=i+2){
                 for(int j=i+2;j<2*m;j=j+2){
                    if(a[j].equals(a[i])){
                        c[j]=0;
                    }
                 }
             }
             for(int i=1;i<2*m;i=i+2){
                time +=c[i];
             }
             //有一个人没有输
             if(name-time==1){
                System.out.println("Yes");
             }else{
                System.out.println("No");
             }
        }
    }
}
