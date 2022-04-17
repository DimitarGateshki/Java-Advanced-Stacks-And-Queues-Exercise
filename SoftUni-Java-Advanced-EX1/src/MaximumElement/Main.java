package MaximumElement;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        int lines=Integer.parseInt(sc.nextLine());

        String[] tokens;
        int[] operators;


        for (int i = 0; i < lines; i++) {
            tokens=sc.nextLine().split("\\s+");
            operators=parser(tokens);

            switch (operators[0]){
                case 1 :
                    stack.push(operators[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
            }
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
