package Array;

import java.util.ArrayList;

import java.util.Collections;

public class arrayList {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(25);
        list.add(27);
        list.add(29);
        list.add(30);

        System.out.println(list.get(1));//1 index ka elements
        System.out.println(list.getLast());//last index ka element
        System.out.println(list.size());//size of arraylist
        list.set(1,69);//list ke index 1 ko 69 update..
        System.out.println(list);//pura arraylist print ho jayega...
        int n=list.size();//isme length ki jagah size() hota hai
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(int ele:list){
            System.out.print(ele+" ");
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
