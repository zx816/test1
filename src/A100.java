import java.util.Scanner;
/*2098素数和 注意超时问题*/
public class A100 {

    public static boolean check(int num){
        for(int i=2;i<=Math.sqrt((double)num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        while (Input.hasNext())
        {
            int number=Input.nextInt();
            int count=0;
            if(number==0)
                break;
            else {
                for(int i=2;i<number/2;i++)//如果条件成立，那么一定一个数大于所求数的1/2，一个数小于所求数的1/2
                    if(check(i)&&check(number-i))
                        count++;
                System.out.println(count);
            }
        }
    }
}

