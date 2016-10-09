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


        List<Integer> listInt2 = new ArrayList<>();

        long start16 = System.currentTimeMillis();
        for(int i = 0, j = 999 ; i < 10000; i ++, j++) {
            listInt.add(j*3);
        }
        long finish16 = System.currentTimeMillis();
        long a16 = finish16 - start16;
        System.out.println("add for 1000 elements: " + a16);


        long start17 = System.currentTimeMillis();
        for(int i = 2, j = 999 ; i < 10000; i ++, j++) {
            listInt.set(i, j*2);
        }
        long finish17 = System.currentTimeMillis();
        long a17 = finish17 - start17;
        System.out.println("set for 1000 elements: " + a17);

        long start18 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i ++) {
            listInt.get(i);
        }
        long finish18 = System.currentTimeMillis();
        long a18 = finish18 - start18;
        System.out.println("get for 1000 elements: " + a18);

        long start19 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i ++) {
            listInt.remove(i);
        }
        long finish19 = System.currentTimeMillis();
        long a19 = finish19 - start19;
        System.out.println("remove for 1000 elements: " + a19);



        List<Integer> listInt3 = new LinkedList<>();

        long start20 = System.currentTimeMillis();
        for(int i = 0, j = 999 ; i < 10000; i ++, j++) {
            listInt1.add(j*3);
        }
        long finish20 = System.currentTimeMillis();
        long a20 = finish20 - start20;
        System.out.println("add for 1000 elements: " + a20);


        long start21 = System.currentTimeMillis();
        for(int i = 2, j = 999 ; i < 10000; i ++, j++) {
            listInt1.set(i, j*2);
        }
        long finish21 = System.currentTimeMillis();
        long a21 = finish21 - start21;
        System.out.println("set for 1000 elements: " + a21);

        long start22 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i ++) {
            listInt1.get(i);
        }
        long finish22 = System.currentTimeMillis();
        long a22 = finish22 - start22;
        System.out.println("get for 1000 elements: " + a22);

        long start23 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i ++) {
            listInt.remove(i);
        }
        long finish23 = System.currentTimeMillis();
        long a23 = finish23 - start23;
        System.out.println("remove for 1000 elements: " + a23);


        List<String> listStr2 = new ArrayList<>();

        long start24 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i ++) {
            listStr.add("aasd");
        }
        long finish24 = System.currentTimeMillis();
        long a24 = finish24 - start24;
        System.out.println("add for 1000 elements: " + a24);


        long start25 = System.currentTimeMillis();
        for(int i = 2; i < 10000; i ++) {
            listStr.set(i, "shtrhe");
        }
        long finish25 = System.currentTimeMillis();
        long a25 = finish25 - start25;
        System.out.println("set for 1000 elements: " + a25);

        long start26 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i ++) {
            listStr.get(i);
        }
        long finish26 = System.currentTimeMillis();
        long a26 = finish26 - start26;
        System.out.println("get for 1000 elements: " + a26);

        long start27 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i ++) {
            listStr.remove(i);
        }
        long finish27 = System.currentTimeMillis();
        long a27 = finish27 - start27;
        System.out.println("remove for 1000 elements: " + a27);


        List<String> listStr3 = new LinkedList<>();

        long start28 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i ++) {
            listStr1.add("aasd");
        }
        long finish28 = System.currentTimeMillis();
        long a28 = finish28 - start28;
        System.out.println("add for 1000 elements: " + a28);


        long start29 = System.currentTimeMillis();
        for(int i = 2; i < 10000; i ++) {
            listStr1.set(i, "shtrhe");
        }
        long finish29 = System.currentTimeMillis();
        long a29 = finish29 - start29;
        System.out.println("set for 1000 elements: " + a29);

        long start30 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i ++) {
            listStr1.get(i);
        }
        long finish30 = System.currentTimeMillis();
        long a30 = finish30 - start30;
        System.out.println("get for 1000 elements: " + a30);

        long start31 = System.currentTimeMillis();
        for(int i = 0; i < 1000; i ++) {
            listStr1.remove(i);
        }
        long finish31 = System.currentTimeMillis();
        long a31 = finish31 - start31;
        System.out.println("remove for 1000 elements: " + a31);
    }
}
