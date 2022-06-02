package com.fasttrack;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {

    public static void main(String[] args) {
        Set<Long> set = new HashSet<>();

        set.add(3L);
        set.add(3L);
        set.add(3L);
        set.add(2L);

        System.out.println(set);

        for (Long l : set) {
            System.out.println(l);
        }
    }
}
