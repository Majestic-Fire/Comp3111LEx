package Lab1;

public class mainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        System.out.println("Welcome to Scientific Calculator!");
        System.out.println("Program started ...");
        System.out.println(b+" to power "+n+" = "+ myLibrary.Power(b,n));
        System.out.println(n+"! = "+ myLibrary.factorial(n));
    }
}