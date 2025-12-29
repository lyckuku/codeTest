package com.example.statepattern.test;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author luoyongchun
 * @description
 * @date 2025/2/17
 */
public class Test02 {

    @Test
    public  void  test1(){

        ArrayList<Integer> integers = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(1222, 12, 1111111)));
        integers.forEach(p->{
            System.out.println(p);
            System.out.println(p);
        });

        List<Integer> newList = Arrays.asList(1, 23, 1).stream().distinct().collect(Collectors.toList());
        newList.forEach(p->{
            System.out.println(p);
        });
    }

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 23, 3));
        Test02 test02 = new Test02();
        test02.getName();
        integers.forEach(p->{
            System.out.println(p);
        });

    }
    public    String getName(){
        return "6666";
    }
}
