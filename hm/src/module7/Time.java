package module7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Time {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();

        long start = System.currentTimeMillis();
        for(int i = 0, j = 999 ; i < 1000; i ++, j++) {
            listInt.add(j*3);
        }
        long finish = System.currentTimeMillis();
        long a = finish - start;
        System.out.println("add for 1000 elements: " + a);


        long start1 = System.currentTimeMillis();
        for(int i = 2, j = 999 ; i < 1000; i ++, j++) {
            listInt.set(i, j*2);
        }
        long finish1 = System.currentTimeMillis();
        long a1 = finish1 - start1;
        System.out.println("set for 1000 elements: " + a1);

        long start2 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i ++) {
            listInt.get(i);
        }
        long finish2 = System.currentTimeMillis();
        long a2 = finish2 - start2;
        System.out.println("get for 1000 elements: " + a2);

        long start3 = System.currentTimeMillis();
        for(int i = 0; i < 100; i ++) {
            listInt.remove(i);
        }
        long finish3 = System.currentTimeMillis();
        long a3 = finish3 - start3;
        System.out.println("remove for 1000 elements: " + a3);



        List<Integer> listInt1 = new LinkedList<>();

        long start4 = System.currentTimeMillis();
        for(int i = 0, j = 999 ; i < 1000; i ++, j++) {
            listInt1.add(j*3);
        }
        long finish4 = System.currentTimeMillis();
        long a4 = finish4 - start4;
        System.out.println("add for 1000 elements: " + a4);


        long start5 = System.currentTimeMillis();
        for(int i = 2, j = 999 ; i < 1000; i ++, j++) {
            listInt1.set(i, j*2);
        }
        long finish5 = System.currentTimeMillis();
        long a5 = finish5 - start5;
        System.out.println("set for 1000 elements: " + a5);

        long start6 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i ++) {
            listInt1.get(i);
        }
        long finish6 = System.currentTimeMillis();
        long a6 = finish6 - start6;
        System.out.println("get for 1000 elements: " + a6);

        long start7 = System.currentTimeMillis();
        for(int i = 0; i < 100; i ++) {
            listInt.remove(i);
        }
        long finish7 = System.currentTimeMillis();
        long a7 = finish7 - start7;
        System.out.println("remove for 1000 elements: " + a7);



        List<String> listStr = new ArrayList<>();

        long start8 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i ++) {
            listStr.add("aasd");
        }
        long finish8 = System.currentTimeMillis();
        long a8 = finish8 - start8;
        System.out.println("add for 1000 elements: " + a8);


        long start9 = System.currentTimeMillis();
        for(int i = 2; i < 1000; i ++) {
            listStr.set(i, "shtrhe");
        }
        long finish9 = System.currentTimeMillis();
        long a9 = finish9 - start9;
        System.out.println("set for 1000 elements: " + a9);

        long start10 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i ++) {
            listStr.get(i);
        }
        long finish10 = System.currentTimeMillis();
        long a10 = finish10 - start10;
        System.out.println("get for 1000 elements: " + a10);

        long start11 = System.currentTimeMillis();
        for(int i = 0; i < 100; i ++) {
            listStr.remove(i);
        }
        long finish11 = System.currentTimeMillis();
        long a11 = finish11 - start11;
        System.out.println("remove for 1000 elements: " + a11);


        List<String> listStr1 = new LinkedList<>();

        long start12 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i ++) {
            listStr1.add("aasd");
        }
        long finish12 = System.currentTimeMillis();
        long a12 = finish12 - start12;
        System.out.println("add for 1000 elements: " + a12);


        long start13 = System.currentTimeMillis();
        for(int i = 2; i < 1000; i ++) {
            listStr1.set(i, "shtrhe");
        }
        long finish13 = System.currentTimeMillis();
        long a13 = finish13 - start13;
        System.out.println("set for 1000 elements: " + a13);

        long start14 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i ++) {
            listStr1.get(i);
        }
        long finish14 = System.currentTimeMillis();
        long a14 = finish14 - start14;
        System.out.println("get for 1000 elements: " + a14);

        long start15 = System.currentTimeMillis();
        for(int i = 0; i < 100; i ++) {
            listStr1.remove(i);
        }
        long finish15 = System.currentTimeMillis();
        long a15 = finish15 - start15;
        System.out.println("remove for 1000 elements: " + a15);
    }
}
