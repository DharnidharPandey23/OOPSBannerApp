import java.util.*;

class CharacterPattern {

    private Map<Character, String[]> patterns;

    public CharacterPattern() {
        patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patterns.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    public void printBanner(String text) {
        for (int row = 0; row < 5; row++) {
            for (char ch : text.toCharArray()) {
                System.out.print(patterns.get(ch)[row] + "  ");
            }
            System.out.println();
        }
    }
}

public class BannerApp {
    public static void main(String[] args) {
        CharacterPattern banner = new CharacterPattern();
        banner.printBanner("OOPS");
    }
}
