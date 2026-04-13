package TwoD_Arrays;

import java.util.ArrayList;

public class ArrayListsUseUpdate {
    static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1); a.add(2); a.add(3); a.add(4);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(2); b.add(4); b.add(6);
        ArrayList<Integer> c=new ArrayList<>();
        c.add(3); c.add(6); c.add(9); c.add(10);
        ArrayList <ArrayList<Integer>> arr = new ArrayList <>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Other method using for Each Loop...");
        for(ArrayList<Integer> list : arr){
            for(Integer i : list){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
