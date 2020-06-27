package com.oks1;

import java.util.Iterator;

public class IterationList <E> {
    public String GetIterationList(Iterator<E> iterator) {
        int num = -1;
        StringBuilder result = new StringBuilder();
        String type1 = "list";

        while (iterator.hasNext()) {
            num++;
            E element = iterator.next();
            if (type1 == "list") result.append(
                    System.out.printf("Result is index <%d> : value <%d>\n", num, element));
        }
        return result.toString();
    }
}


