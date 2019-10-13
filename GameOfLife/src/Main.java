import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        String[][] square = initialSquare();
        printSquare(square);
        String coordinate = getCoordinate();
        System.out.println(coordinate);

    }

    public static String getCoordinate() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str, pattern = null;
        while (true) {
            System.out.println("Введите клетку: (Пример ввода: A4 или H10)");
            str = reader.readLine();
            if (str.length() == 2) {
                pattern = "([A-J][1-9])";
            } else if (str.length() == 3) {
                pattern = "([A-J]10)";
            }
            if (pattern != null) {
                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(str);
                if (m.find()) {
                    break;
                } else {
                    System.out.println("Некорректный ввод.");
                }
            }
            System.out.println("Некорректный ввод.");
        }
        reader.close();
        return str;
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
            if (i != 9) System.out.print((i + 1) + "  ");
            else System.out.print((i + 1) + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(str[i][j] + " ");
            }
            System.out.println();
        }
    }
}
