package Basics;

import java.io.*;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;


class Result {

    /*
     * Complete the 'processLogs' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY logs
     *  2. INTEGER maxSpan
     */

    public  List<Integer> processLogs(List<String> logs, int maxSpan) {
        // Write your code here


        Map<Integer, List<Logs>> integerLogsMap = new HashMap<>();

        for(String s : logs) {
            Logs log = new Logs();
            String[] details = s.split(" ");

            log.setId(Integer.parseInt(details[0]));
            log.setTimeStamp(Integer.parseInt(details[1]));
            log.setMessage(details[2]);

            List<Logs> logsList = integerLogsMap.get(log.getId());

            if(logsList == null)
            {
                logsList = new ArrayList<>();
            }

            logsList.add(log);
            integerLogsMap.put(log.getId(), logsList);
            System.out.println(logsList);
        }

        System.out.println("----------");
        System.out.println(integerLogsMap);
        List<Integer> validUserIds = new ArrayList<>();
        for(int userId : integerLogsMap.keySet())
        {
            List<Logs> logsList = integerLogsMap.get(userId);

            Logs logFirst = logsList.get(0);
            Logs logSecond = logsList.get(1);

            if(logSecond.getTimeStamp()-logFirst.getTimeStamp() <= maxSpan)
            {
                validUserIds.add(userId);
            }
        }

        Map<Integer,Integer> treeMap = new TreeMap<>();
//        for(int candle : candles){
//            if(!treeMap.containsKey(candle))
//            treeMap.put(candle,1);
//            else
//                treeMap.put(candle,treeMap.get(candle)+1);
//        }
        treeMap.get(treeMap.size());



       return validUserIds;
}

class Logs{
    private int id;
    private int timeStamp;
    private String message;

    public Logs(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Logs{" +
                "id=" + id +
                ", timeStamp=" + timeStamp +
                ", message='" + message + '\'' +
                '}';
    }
}
}
class Solution {
    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>();
        list.add("99 1 sign-in");
        list.add("100 10 sign-in");
        list.add("50 20 sign-in");
        list.add("100 15 sign-out");
        list.add("50 26 sign-out");
        list.add("99 2 sign-out");
        Result result = new Result();

        Calendar calendar = Calendar.getInstance();

        LocalDate date = LocalDate.of(2017,8,14);
        System.out.println(date.getDayOfWeek().toString());

        List<Integer> grades = new ArrayList<>();
        for(Integer grade : grades){
            if(grade>37 && grade < 100)
            {
                if(grade % 5 >= 3)
                {
                    while(grade % 5 != 0)
                        grade++;
                }
            }
        }

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(result.processLogs(list, 5));


    }


}
