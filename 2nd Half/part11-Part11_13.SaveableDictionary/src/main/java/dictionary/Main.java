package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary s = new SaveableDictionary("word.txt");
        s.load();
        s.delete("below");
        s.add("tieokone", "computer");
        s.save();
    }
}
