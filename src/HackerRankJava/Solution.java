package HackerRankJava;
import java.util.*;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a+b;
            for(int k=1;k<=n;k++)
            {
              System.out.print(sum+" ");
              int mod=1;
              for(int j=1;j<=i;k++){
                 mod=mod*2;
              }
              sum=sum+mod*2;
            }
        }
        in.close();
    }
}
