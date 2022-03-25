package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {


    /**
     * Task 04. Copy list
     *
     * @param desc
     * @param src
     * @param <T>
     */
    public static <T> void copyList(List<? super T> desc, List<T> src) {

        for (T item : src) {
            desc.add(item);
        }
        System.out.println(desc);

    }


    /**
     * Task 03. Max Element
     *
     * @param list
     * @param comparator
     * @param <T>
     * @return
     */
    public static <T> T maxElem(List<T> list, Comparator<T> comparator) {
        T maxElem = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (comparator.compare(list.get(i), maxElem) > 0) {
                maxElem = list.get(i);
            }
        }
        return maxElem;
    }

    /**
     * Array convert to List
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> List<T> convertsList(T[] t) {
        List<T> list = new ArrayList<>();
        for (T item : t) {
            list.add(item);
        }
        return list;
    }

    /**
     * Task 01. Print any type list
     *
     * @param list
     * @param <T>
     */
    public static <T> void printList(List<T> list) {

        for (T item : list) {
            System.out.println(item);
        }

    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        List<Number> listCopy = new ArrayList<>();

//        printList(list);
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("x");
        list1.add("f");
        list1.add("b");
        list1.add("c");
//        printList(list1);

//        Integer[] arr = {1, 2,100, 3, 4, 5};
//
//        System.out.println(convertsList(arr));
//        System.out.println(maxElem(list1, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        }));

//        copyList(listCopy,list);

        DefaultPair<String,Integer> pair = new DefaultPair<>("Abc",45);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
        


    }
}
