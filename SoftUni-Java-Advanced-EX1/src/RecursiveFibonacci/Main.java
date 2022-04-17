package RecursiveFibonacci;

import java.util.Scanner;

public class Main {
    public static long[] mem;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        mem=new long[input+1];

        System.out.println(fib(input));
    }

    public static long fib(int input) {

        if(input<=1){
            return 1;
        }
        if (mem[input]!=0){
            return mem[input];
        }
        return mem[input]=fib(input-1)+fib(input-2);
    }

}
