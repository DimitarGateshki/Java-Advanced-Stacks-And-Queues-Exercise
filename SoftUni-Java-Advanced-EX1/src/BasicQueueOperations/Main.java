package BasicQueueOperations;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        ArrayDeque<Integer> queue=new ArrayDeque<>();



        String[] tokens=sc.nextLine().split("\\s+");
        int[] operators=parser(tokens);

        String[] stackInfo=sc.nextLine().split("\\s+");

        for (int i = 0; i < operators[0]; i++) {
            int cur=Integer.parseInt(stackInfo[i]);
            queue.add(cur);
        }

        for (int i = 0; i <operators[1] ; i++) {
            queue.poll();
        }

        if (queue.contains(operators[2])){
            System.out.println("true");
        }else if (queue.isEmpty()){
            System.out.println(0);
        }else {
            System.out.println(Collections.min(queue));
        }




    }
    private  static  int[] parser(String[] tokens){
        int[] numbs=new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            int cur=Integer.parseInt(tokens[i]);
            numbs[i]=cur;
        }
        return numbs;
    }
}
