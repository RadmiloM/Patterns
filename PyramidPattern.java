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

    public static void displayPyramidPattern(int n) {
        if (n == 1) {
            System.out.println("*");
            return;
        }
        int spaces = n;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(spaces--) + "* ".repeat(i) + "\n");
        }
    }

}




