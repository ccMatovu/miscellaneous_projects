public class Test {
    /**
     * Charles Matovu
     * Prof. Abier Hassan
     * Data Structures
     * Assignment 5: 11/2/2020
     *
     */
    public static void main(String[] args) {
        //Testing the first method
        System.out.println("The first method results");
        int number = 0;
        System.out.println("The factorial of 0 is = "+factorial1(number));

        number = 1;
        System.out.println("The factorial of 1 is = "+factorial1(number));

        number = 2;
        System.out.println("The factorial of 2 is = "+factorial1(number));

        number = 5;
        System.out.println("The factorial of 5 is = "+factorial1(number));

        number = 10;
        System.out.println("The factorial of 10 is = "+factorial1(number));


        //Testing the second method
        System.out.println("\n\nThe second method results");
        number = 0;
        System.out.println("The factorial of 0 is = "+factorial2(number));

        number = 1;
        System.out.println("The factorial of 1 is = "+factorial2(number));

        number = 2;
        System.out.println("The factorial of 2 is = "+factorial2(number));

        number = 5;
        System.out.println("The factorial of 5 is = "+factorial2(number));

        number = 10;
        System.out.println("The factorial of 10 is = "+factorial2(number));
    }
    //This method returns the factorial of a number passed in as a parameter using recursion
    public static int factorial1(int n){
        if(n ==0){  //The base case
            return 1;
        }else{
            return n*factorial1(n-1);
        }
    }

    //A second different method that also returns the factorial of a number using recursion
    public static int factorial2(int n){
        int factorial;
        if(n ==0){
            factorial =1;
        }else{
            factorial = n*factorial2(n-1);
        }
        return factorial;
    }
}
