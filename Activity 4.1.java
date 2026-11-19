public class WhileLoopDemo {
    public static void main(String[] args) {
        // Example 1: countdown from the textbook (prints 4321)
        int i = 4;
        while (i > 0) {
            System.out.print(i);
            i--; // without this line the loop would never terminate
        }
        System.out.println();

        // Example 2: flowchart in Figure 4.0 (prints Number 1 ... Number 5)
        int count = 1;
        while (count <= 5) {
            System.out.println("Number " + count);
            count++;
        }
    }
}
