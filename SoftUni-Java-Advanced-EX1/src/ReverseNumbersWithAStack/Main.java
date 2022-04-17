package ReverseNumbersWithAStack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        String[] numbers=sc.nextLine().split("\\s+");
        for (int i = 0; i < numbers.length; i++) {
            int current=Integer.parseInt(numbers[i]);
            stack.push(current);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" " )   ;
        }
    }
}
