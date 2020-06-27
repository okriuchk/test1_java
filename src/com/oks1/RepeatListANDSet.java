package com.oks1;

import java.util.*;

public class RepeatListANDSet<Integer> {
    public List Elements(List<Integer> listA, List<Integer> listB) {
        List listAB = new ArrayList();

        for (int i = 0; i < listA.size(); i++) {
            for (int j = 0; j < listB.size(); j++) {
                if (listA.get(i).equals(listB.get(j)))
                    break;

                if (j == listB.size() - 1)
                    listAB.add(listA.get(i));
            }
        }
        return listAB;
    }

    public Collection <Integer> repeatinglist(ArrayList <Integer> col1, ArrayList <Integer> col2) {
        Collection <Integer> Rest = new ArrayList<>();
        Iterator <Integer> iteration1 = col1.iterator();

        while (iteration1.hasNext()) {
            Integer col11 = iteration1.next();
            Iterator<Integer> iteration2 = col2.iterator();
            while (iteration2.hasNext()) {
                Integer col22 = iteration2.next();
                if (col11.equals(col22)) {
                    Rest.add(col22);
                    break;
                }
            }
        }
        return Rest;
    }

    public Collection<Integer> repeatingset(Set<Integer> col1, Set<Integer> col2) {
        Collection<Integer> Rest1 = new ArrayList<>();
        Iterator<Integer> iteration1 = col1.iterator();

        while (iteration1.hasNext()) {
            Integer col11 = iteration1.next();
            Iterator<Integer> iteration2 = col2.iterator();
            while (iteration2.hasNext()) {
                Integer col22 = iteration2.next();
                if (col11.equals(col22)) {
                    Rest1.add(col22);
                    break;
                }
            }
        }
        return Rest1;
    }
}