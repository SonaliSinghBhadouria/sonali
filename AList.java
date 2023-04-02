import java.util.ArrayList; //to import array list
import java.util.Collections; // to import collection

public class AList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(); //integer list
        ArrayList<Boolean>list2 = new ArrayList<>(); //boolean list
        ArrayList<String>list3 = new ArrayList<>(); // string list


        // add elements
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(6);
        System.out.println(list); // print the elements added in integer list

        // get elements
        int element = list.get(1); // list.get(index)
        System.out.println(element);

        // add element in between
        list.add(1,3); //list.add(index , element)
        System.out.println(list);

        // set element
        list.set(3,7); //list.set(index , element)
        System.out.println(list);

        // delete element
        list.remove(4); // list.remove(index)
        System.out.println(list);

        //size
        int s = list.size();
        System.out.println(s);

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }

}
