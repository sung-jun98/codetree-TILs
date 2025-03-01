import java.util.*;
import java.io.*;


public class Main {
    static int K, N;
    static ArrayList<Integer> arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new ArrayList<>();

        perm(0);
    }

    static void perm(int pos) {
        if(pos == N){
            for(int answer : arr){
                System.out.print(answer + " ");
            }
            System.out.println();
            
            return ;
        }

        for(int i=1; i<=K; i++){
            arr.add(i);
            perm(pos + 1);
            arr.remove(arr.size() - 1);
        }

        return ;
    }
}