// unary Operator

public class Unary_Opeartor {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Original value: " + a);
        System.out.println("Increment: " + (++a));
        System.out.println("Decrement: " + (--a));
        System.out.println("Unary minus: " + (-a));

        System.out.println("Pre-increment: " + (++a));
        System.out.println("Post-increment: " + (a++));
        System.out.println("Final value: " + a);
    }
}

/*
Original value: 10
Increment: 11
Decrement: 10
Unary minus: -10

Pre-increment: 11
Post-increment: 11
Final value: 12
*/
