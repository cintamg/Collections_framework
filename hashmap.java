import java.util.*;
class HashMaps{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();

        //add elements

        map.put(1,"Apple");
        map.put(2,"Orange");
        map.put(3,"Grapes");
        map.put(2,"Mango");

        //print all elements
        System.out.println(map);

        //print a particular key
        System.out.println(map.get(1));

        //Check for key or value

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Apple"));

        //remove elements

        map.remove(1);
        System.out.println(map);
    }
}
