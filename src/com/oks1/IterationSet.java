package com.oks1;

import java.util.Iterator;

public class IterationSet <E> {
    public String GetIterationSet(Iterator<E> iterator) {
        int num = -1;
        StringBuilder result = new StringBuilder();
        String type1 = "set";

        while (iterator.hasNext()) {
            num++;
            E element = iterator.next();
            if (type1 == "set") result.append(
                    System.out.printf("Result is this element <%d>\n", element));

        }
        return result.toString();
    }
}
