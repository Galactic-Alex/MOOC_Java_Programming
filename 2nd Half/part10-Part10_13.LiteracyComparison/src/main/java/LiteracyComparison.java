
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String> literacyStats = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(string -> string.split(","))
                    .filter(strings -> strings.length >= 6)
                    .sorted(Comparator.comparing(strings -> strings[5]))
                    .map(strings -> strings[3] + " (" + strings[4] + ")," +
                            strings[2].substring(0, strings[2].indexOf(" (")) + ", " + strings[5])
                    .forEach(literacyStats::add);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        for (String i : literacyStats) {
            System.out.println(i);
        }
    }
}
