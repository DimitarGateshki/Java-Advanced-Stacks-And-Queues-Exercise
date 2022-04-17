package BasicStackOperations;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        int max =999999999;

        String[] tokens=sc.nextLine().split("\\s+");
        int[] operators=parser(tokens);

        String[] stackInfo=sc.nextLine().split("\\s+");

        for (int i = 0; i < operators[0]; i++) {
            int cur=Integer.parseInt(stackInfo[i]);
            stack.push(cur);
        }

        for (int i = 0; i <operators[1] ; i++) {
            stack.pop();
        }

        if (stack.contains(operators[2])){
            System.out.println("true");
        }else if (stack.isEmpty()){
            System.out.println('0');
        }else {
            while (!stack.isEmpty()){
                if (stack.peek()<max) {
                    max = stack.pop();
                }else {
                    stack.pop();
                }
            }
            System.out.println(max);
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
