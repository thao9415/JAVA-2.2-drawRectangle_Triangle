import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int width, height;
        int heightTriangle;
        do {
            System.out.println("MENU");
            System.out.println("1. Draw rectangle");
            System.out.println("2. Draw square triangle");
            System.out.println("3. Draw isosceles triangle");

            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter height: ");
                    height = input.nextInt();
                    System.out.print("Enter width: ");
                    width = input.nextInt();
                    drawRect(width, height);
                    break;
                case 2:
                    System.out.print("Enter height of square triangle : ");
                    heightTriangle = input.nextInt();
                    drawSquareTriangle2(heightTriangle);
                    break;
                case 3:
                    System.out.print("Enter height of isosceles triangle : ");
                    heightTriangle = input.nextInt();
                    drawIsoscelesTriangle(heightTriangle);
                    break;
                case 4:
                    System.exit(0);
            }

        } while (choice != 4);

    }


    public static void drawRect(int a, int b) {
        for (int j = 1; j <= a; j++) {
            for (int i = 1; i <= b; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void drawSquareTriangle1(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

    public static void drawSquareTriangle2(int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

    public static void drawIsoscelesTriangle(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }

    }

}
