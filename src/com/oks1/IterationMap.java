package com.oks1;

import java.util.Map;

public class IterationMap <K, V> {
    public String GetIterationMap(Map<Integer, String> mapCollect, TypeMap type_Map) {
        StringBuilder result = new StringBuilder();

        if (type_Map == TypeMap.value) {
            for (String value : mapCollect.values()) {
                result.append(String.format("<%s>\n", value.toString()));
            }
        }
        if (type_Map == TypeMap.key) {
            for (Integer key : mapCollect.keySet()) {
                result.append(String.format("<%s>\n", key.toString()));
            }
        }
        // не работает
        /*for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }*/

        return result.toString();
    }
}

