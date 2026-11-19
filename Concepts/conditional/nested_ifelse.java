package conditional;

public class nested_ifelse {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Allowed to vote");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Not eligible");
        }
    }
}

//Allowed to vote