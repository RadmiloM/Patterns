public class PyramidPattern {

    public static void displayReversePyramidPattern(int n) {
        if (n == 1) {
            System.out.println("*");
            return;
        }
        int index = 0;
        for (int i = n; i > 0; i--) {
            System.out.print(" ".repeat(index++) + "* ".repeat(i) + "\n");
        }
    }

    public static void main(String[] args) {
        displayReversePyramidPattern(5);
    }
}




