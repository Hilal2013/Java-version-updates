package com.cydeo.Tasks;

import java.util.*;

public class PairsOfNumbersWithoutStream {
    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        String result="";
        for (int i = 0; i < numbers1.size(); i++) {

            for (int j = 0; j < numbers2.size(); j++) {
                result+="("+ numbers1.get(i)+","+numbers2.get(j)+") ";
            }
        }
        System.out.println(result.substring(0,result.lastIndexOf(" ")));
        String[] arr=result.split(" ");

        List<String[]> pairs=new ArrayList<>();
pairs.add(arr);
        System.out.println();


    }

}
/*

2. Given two lists of numbers, how would you return all pairs of numbers? For
example, given a list [1,2,3] and a list [3,4] you should return [(1,3),(1,4),(2,3),
(2,4),(3,3),(3,4)
• List<Integer> numbers1 = Arrays.asList(1,2,3);
• List<Integer> numbers2 = Arrays.asList(3,4);
• List<int[]> pairs = ????
 Map<Integer, ArrayList<Integer>> map=new HashMap<>();
 ArrayList<Integer> numbers1 =new ArrayList<>( Arrays.asList(1,2,3));
        ArrayList<Integer> numbers2 = new ArrayList<>( Arrays.asList(3,4));
        for (Integer each : numbers1) {
            map.put(each,numbers2);
        }
        System.out.println(map);  //{1=[3, 4], 2=[3, 4], 3=[3, 4]}
        for (Map.Entry<Integer, ArrayList<Integer>> eachPair : map.entrySet()) {
            for (Integer eachValue : eachPair.getValue()) {
                map.put(eachPair.getKey(),eachValue)
            }
        }


 */