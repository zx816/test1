import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
/*2084study*/
public class A86{

    public static void Cpoy(ArrayList<Integer> a, ArrayList<Integer> b) {
        for(int i=0; i<b.size(); ++i)
            a.add(b.get(i));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(stdin.readLine());
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> pre = new ArrayList<>();
        for(int k=0; k<t; ++k) {
            ans.clear();
            int n = Integer.parseInt(stdin.readLine());
            ans.add(Integer.parseInt(stdin.readLine()));
            for(int i=1; i<n; ++i) {
                ans.add(0);
                pre = ans;
                pre.clear();
                Cpoy(pre, ans);
                String[] mid = stdin.readLine().split(" ");
                ans.set(0,pre.get(0)+Integer.parseInt(mid[0]));
                for(int j=1; j<i; ++j) {
                    int temp = Math.max(pre.get(j-1), pre.get(j));
                    ans.set(j, temp+Integer.parseInt(mid[j]));
                }
                ans.set(i, pre.get(i-1)+Integer.parseInt(mid[i]));
            }
            System.out.println(Collections.max(ans));
        }
    }
}

