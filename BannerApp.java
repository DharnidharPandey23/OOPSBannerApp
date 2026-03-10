import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);
                System.out.print(pattern[row] + "   ");
            }

            System.out.println();
        }
    }
}
