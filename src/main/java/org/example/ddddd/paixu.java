package org.example.ddddd;

import java.util.ArrayDeque;
import java.util.Deque;

public class paixu {


    public static int minAddToMakeValid(String stringIN){
        Deque<Character> deque=new ArrayDeque<>();
        for (char target:stringIN.toCharArray()) {
            if (deque.size()!=0&&deque.peekFirst().equals("(")&&")".equals(target)){
                deque.removeFirst();
            }else {
                deque.add(target);
            }
        }

        return deque.size();
    }


    public static void main(String[] args) {
        String spaces ="()))))(((";
        int num=minAddToMakeValid(spaces);
        System.out.println("num:" +num);
    }


}
