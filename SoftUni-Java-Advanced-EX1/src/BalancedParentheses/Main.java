package BalancedParentheses;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayDeque<Character> queue=new ArrayDeque<>();
        ArrayDeque<Character> stack=new ArrayDeque<>();

        String line= sc.nextLine();
        if (line.length()%2!=0){
            System.out.println("NO");
        }else {
            for (int i = 0; i < line.length()/2; i++) {
                stack.push(line.charAt(i));
            }
            for (int i = line.length()/2; i < line.length(); i++) {
                queue.add(line.charAt(i));
            }

            boolean similar=true;
            while (similar){
                if (stack.pop()!=queue.poll()){
                    similar=false;
                }
            }
            System.out.println("YES");
        }




    }

}
