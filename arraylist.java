import java.util.ArrayList;
import java.util.Collections;
class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        
        //add elements

        list.add(1);
        list.add(2);
        list.add(4);

        //print

        System.out.println(list);

        //get elements

        int ele=list.get(0);
        System.out.println(ele);

        //add elements in-between

        list.add(2,3);               //(index,element)
        System.out.println(list);

        //set elements

        list.set(0,5);
        System.out.println(list);

        //delete elements

        list.remove(3);
        System.out.println(list);

        //find size

        int len=list.size();
        System.out.println("Size = "+len);

        //iterate

        for(int i=0;i<len;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sort

        Collections.sort(list);
        System.out.println(list);
    }
}