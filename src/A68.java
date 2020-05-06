import java.util.*;
/*输入数据有多组，每组的第一行是三个整数T，S和D，表示有T条路，
和草儿家相邻的城市的有S个，草儿想去的地方有D个；
接着有T行，每行有三个整数a，b，time,表示a,b城市之间的车程是time小时；
(1=<(a,b)<=1000;a,b 之间可能有多条路)
接着的第T+1行有S个数，表示和草儿家相连的城市；
接着的第T+2行有D个数，表示草儿想去地方。
输出草儿能去某个喜欢的城市的最短时间
求单源最短路径的算法是Dijkstra算法。
*/
public class A68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int T,S,D;
            T=sc.nextInt();
            S=sc.nextInt();
            D=sc.nextInt();
            Map<Integer,String> route=new HashMap<>();
            List<Integer> start=new ArrayList<>();
            List<Integer> relate=new ArrayList<>();
            List<Integer> like=new ArrayList<>();
            for (int i=0;i<T;i++){
                start.add(sc.nextInt());
                int b=sc.nextInt();
                int c=sc.nextInt();
                String s=b+","+c;
                route.put(i,s);
            }
            for (int i=0;i<S;i++)
                relate.add(sc.nextInt());
            for (int i=0;i<D;i++)
                like.add(sc.nextInt());

            //最小时间
            int min=100000;
            int sum=0;
            //暂存起始点
            int a;
            int temp=0;
            //存储路径
            Deque<Integer> deque=new ArrayDeque<>();
            //记录当前路径某个点运行了几次
            int[] t=new int[10];
            //记录上一个点在哪个值结束的
            int[] last=new int[10];

            //从临近点开始出发
            for (int i=0;i<S;i++){
                if (deque.isEmpty()) {
                    a = relate.get(i);
                    deque.push(a);
                    t[0]=0;
                    temp = i;
                }
                else {
                    a = deque.pop();
                    deque.push(a);
                    i = temp;
                }
                //找到该起始点所有路
                if (start.contains(a)){
                    for (int j=last[deque.size()-1];j<start.size();j++){
                        t[deque.size()-1]++;
                        //找到每条路的索引
                        if (a==start.get(j)){
                            String s=route.get(j);
                            String[] ss=s.split(",");
                            int end=Integer.parseInt(ss[0]);
                            int time=Integer.parseInt(ss[1]);
                            sum+=time;
                            //到了想去的地方
                            if (like.contains(end)){
                                //看是否是用时最短的
                                if (sum<min)
                                    min=sum;
                                sum=0;
                                //找其他的路
                            }else {  //未到想去的地方
                                last[deque.size()-1]=j+1;
                                deque.push(end);
                                t[deque.size()-1]=0;
                                break;
                            }
                        }
                    }
                    if (t[deque.size()-1]==6) {
                        t[deque.size()-1]=0;
                        last[deque.size()-1]=0;
                        deque.pop();
                    }
                }
            }
            System.out.println(min);
        }
    }
}
