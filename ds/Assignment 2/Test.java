public class Test {

    /**
     * Charles Matovu
     * Prof. Abier Hassan
     * Data Structures
     * Assignment 2: 10/5/2020
     *
     */
    public static void main(String[] args) {
        //Creating the first Linkedbag(bag1) and adding Strings to it
        LinkedBag<String> bag1 = new LinkedBag<String>();
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
        //getting the bag's contents and printing them out
        Object[] bagContents = bag1.toArray();
        System.out.print("Bag1 Contents:  ");
        for(int i=0;i<bag1.getCurrentSize();i++){
            System.out.print(bagContents[i]+"\n\t\t\t\t");
        }

        //Creating the second Linkedbag(bag2) adding objects to it and printing them out
        LinkedBag<String> bag2 = new LinkedBag<String>();
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");
        bagContents = bag2.toArray();
        System.out.print("\nBag2 Contents:  ");
        for(int i=0;i<bag2.getCurrentSize();i++){
            System.out.print(bagContents[i]+"\n\t\t\t\t");
        }

        /**Creating the third Linkedbag(everything) that is the combination of  the first two bags
         * the method union is called that returns  the combination of bags 1 and 2
         * the contents of everything are then printed out
         */
        BagInterface<String> everything = bag1.union(bag2);
        bagContents = everything.toArray();
        System.out.print("\nEverything, both bags combined: ");
        for(int i=0;i<everything.getCurrentSize();i++) {
           System.out.print(bagContents[i] + "\n\t\t\t\t\t\t\t\t");
       }
    }
}
