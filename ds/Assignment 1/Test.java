public class Test {
    /**
     * Charles Matovu
     * Prof. Abier Hassan
     * Data Structures
     * Assignment 1: 9/28/2020
     *
     */
    public static void main(String[] args) {
        //Creating the first bag(bag1) and adding Strings to it
        BagInterface<String> bag1 = new ResizableArrayBag<String>();
        bag1.add("Charles");
        bag1.add("Matovu");
        bag1.add("Data structures");
        //getting the bag's contents and printing them out
        Object[] bagContents = bag1.toArray();
        System.out.print("Bag1 Contents:  ");
        for(int i=0;i<bag1.getCurrentSize();i++){
            System.out.print(bagContents[i]+"\n\t\t\t\t");
        }


        //Creating the second bag(bag2) adding objects to it and printing them out
        BagInterface<String > bag2 = new ResizableArrayBag<String>();
        bag2.add("Assignment 1");
        bag2.add("Test");
        bag2.add("More stuff");
        bagContents = bag2.toArray();
        System.out.print("\nBag2 Contents:  ");
        for(int i=0;i<bag2.getCurrentSize();i++){
            System.out.print(bagContents[i]+"\n\t\t\t\t");
        }


        /**Creating the third bag(everything) that is the combination of  the first two bags
         * the method union is called that returns  the combination of bags 1 and 2
         * the contents of everything are then printed out
         */
        BagInterface<String> everything = bag1.union(bag2);
        bagContents = everything.toArray();
        System.out.print("\nEverything, both bags combined: ");
        for(int i=0;i<everything.getCurrentSize();i++){
            System.out.print(bagContents[i]+"\n\t\t\t\t\t\t\t\t");
        }

    }
}
