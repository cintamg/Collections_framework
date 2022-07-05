import java.util.*;
class HashSets{
    public static void main(String args[]){
        HashSet<Integer> sets=new HashSet<>();

        //add elements; duplicate elenents are removed
        sets.add(0);
        sets.add(0);
        sets.add(1);
        sets.add(1);
        sets.add(2);
        System.out.println(sets);

        //remove elements

        sets.remove(1);
        System.out.println(sets);

        //remove all elements

        sets.removeAll(sets);

        //ArrayList to HashSet

        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);

        HashSet<Integer> set=new HashSet<>(list);
        System.out.println(list);
        System.out.println(set);

        //Iterate over HashSet

        // Iterator<Integer> i=new set.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

        //size

        System.out.println("Size = "+set.size());
    }
}