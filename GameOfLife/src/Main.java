import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        String[][] square = initialSquare();
        printSquare(square);
       /* Thread.sleep(1000);

        square = initialSquare1();
        printSquare(square);
        Thread.sleep(1000);
        square = initialSquare2();
        printSquare(square);
        Thread.sleep(1000);
        Runtime.getRuntime().exec("clear");*/

    }


    public static String[][] initialSquare() {
        String[][] str = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                str[i][j] = "0";
            }
        }
        return str;
    }

    public static void printSquare(String[][] str) {
        System.out.println("   A B C D E F G H I J");
        for (int i = 0; i < 10; i++) {
            if (i != 9) System.out.print((i + 1) + "  "); else System.out.print((i + 1) + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
