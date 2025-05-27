public class ifstmt {
    public static void main(String[] args) {
        int age = 18;

        // Check if age is enough to vote
        String canVote = (age >= 18) ? "Yes, can vote" : "No, too young";

        System.out.println("Age: " + age);
        System.out.println("Can vote? " + canVote);

    }
}
