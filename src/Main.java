public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++){
            if ((i % 2) != 0 && (i % 5) != 0) {
                System.out.print(i);
            }
            if ((i % 2) == 0) {
                System.out.print("Baz");
            }
            if ((i % 5) == 0) {
                System.out.print("inga");
            }
            // Add a newline after each iteration for better formatting
            System.out.println();
        }
    }
}