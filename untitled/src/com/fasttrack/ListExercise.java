package com.fasttrack;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(6);
        list.add(0, 3);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(1));
    }
}
