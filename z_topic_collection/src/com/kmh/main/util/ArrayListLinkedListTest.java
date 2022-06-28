package com.kmh.main.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListLinkedListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        
        System.out.println("= 순차적으로 추가하기 =");
        System.out.println("ArrayList : " + addl(arrayList));
        System.out.println("LinkedList : " + addl(linkedList));
        System.out.println();
        
        
        System.out.println("= 중간에 추가하기 =");
        System.out.println("ArrayList : " + add2(arrayList));
        System.out.println("LinkedList : " + add2(linkedList));
        System.out.println();
        
        
        System.out.println("= 중간에서 삭제하기 =");
        System.out.println("ArrayList : " + remove2(arrayList));
        System.out.println("LinkedList : " + remove2(linkedList));
        System.out.println();
        
        
        System.out.println("= 순차적으로 삭제하기 =");
        System.out.println("ArrayList : " + remove1(arrayList));
        System.out.println("LinkedList : " + remove1(linkedList));
        System.out.println();
        
        
        System.out.println("= 인덱스로 값 조회 =");
        System.out.println("ArrayList : " + indexOf(arrayList));
        System.out.println("LinkedList : " + indexOf(linkedList));
    }

    public static long addl(List list) {//순차적으로 추가
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i+"");
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long add2(List list) {//중간에 추가하기
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.add(500, "X");
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove1(List list) {//순차적으로 삭제
        long start = System.currentTimeMillis();

        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove2(List list) {//중간에서 삭제
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
    
    public static long indexOf(List list) {//index of
        
        for (int i = 0; i < 1000000; i++) {
            list.add(i+"");
        }
        
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
        	list.indexOf(i);
		}
        long end = System.currentTimeMillis();
        return end - start;
    }
}