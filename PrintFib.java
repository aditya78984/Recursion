public class PrintFib {
    public static int fib(int n, boolean[] vis){
        if(n == 1 || n==0){
            if(!vis[n]){
                vis[n] = true;
                System.out.println(n);
            }
            return n;
        }
        // if(n == 2){
        //     if(!vis[n-1]){
        //         vis[n-1] = true;
        //         System.out.println(1);
        //     }
        //     return 1;
        // }
        int sum = fib(n-2 , vis) + fib(n-1 , vis) ;
        if(!vis[n]){
            vis[n] = true;
            System.out.println(sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fib(8, new boolean[9]));
    }
}
