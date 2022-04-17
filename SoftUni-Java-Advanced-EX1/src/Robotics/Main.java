package Robotics;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Map<String,Integer> robots=new LinkedHashMap<>();


        String[] tokens=sc.nextLine().split("\\;");
        for (int i = 0; i < tokens.length; i++) {
            String[] curr=tokens[i].split("\\-");
            robots.put(curr[0],Integer.parseInt(curr[1]));
        }
        int[] workTime=new int[robots.size()];


        String startTime=sc.nextLine();
        int hours=Integer.parseInt(startTime.split(":")[0]);
        int min=Integer.parseInt(startTime.split(":")[1]);
        int sec=Integer.parseInt(startTime.split(":")[2]);
        long totalTimeSec=hours*3600+min*60+sec;
        String product=sc.nextLine();

        ArrayDeque<String> materials=new ArrayDeque<>();
        while (!product.equals("End")){
            materials.offer(product);

            product=sc.nextLine();
        }

        while (!materials.isEmpty()){
            String current=materials.poll();
            boolean assign=false;
            totalTimeSec++;
            for (int i = 0; i <workTime.length ; i++) {
                if (workTime[i]>0){
                    workTime[i]--;
                }
            }
            for (int i = 0; i <workTime.length ; i++) {
                if (workTime[i]==0) {
                    int count=0;
                    for (Map.Entry<String, Integer> robot:robots.entrySet()) {
                        if (count==i){
                            workTime[i]=robot.getValue();
                            long endH=totalTimeSec/3600 %24;
                            long endM=totalTimeSec%3600 /60;
                            long endS=totalTimeSec%60;
                            System.out.println(String.format("%s - %s [%02d:%02d:%02d]",robot.getKey(),current,endH,endM,endS));
                            assign = true;
                            break;
                        }
                        count++;
                    }
                    break;
                }
            }
            if (!assign){
                materials.offer(current);
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
