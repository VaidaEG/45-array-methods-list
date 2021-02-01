/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarasai;

/**
 *
 * @author 37067
 */
public class Sarasai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
//        MyList ml = new MyList();
        ml.printAll();
        System.out.println(ml.size());
        ml.add("Hello");
        System.out.println(ml);
        ml.add("World");
        System.out.println(ml);
        ml.add("!");
        System.out.println(ml);
        System.out.println(ml.get(2));
        ml.set(0, "Congratulations");
        System.out.println(ml);
        System.out.println(ml.size());
        ml.remove(1);
        System.out.println(ml);
        ml.insert(2, "!");
        System.out.println(ml);
        System.out.println(ml.size());
        ml.printAll();
        ml.toString();
        System.out.println(ml);
    } 
}
