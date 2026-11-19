package conditional;

public class if_else_ifLadder {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Fail");
        }
    }
}

//Grade A