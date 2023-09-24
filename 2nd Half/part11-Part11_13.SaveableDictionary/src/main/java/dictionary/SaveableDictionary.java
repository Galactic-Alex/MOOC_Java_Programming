package dictionary;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictionaryMap;
    private HashMap<String, String> dictionaryMapReverse;
    private String fileToRead;

    public SaveableDictionary() {
        dictionaryMap = new HashMap<>();
        dictionaryMapReverse = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        fileToRead = file;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(fileToRead))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                System.out.println(parts[0]);
                System.out.println(parts[1]);
                add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean save() {
        try (FileWriter printWriter = new FileWriter(fileToRead)) {
            for (String i : dictionaryMap.keySet()) {
                String temp = i + ":" + dictionaryMap.get(i) + "\n";
                printWriter.write(temp);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }

    public void add(String words, String translation) {
        if (dictionaryMap.containsKey(words)) {
            return;
        }
        dictionaryMap.put(words, translation);
        dictionaryMapReverse.put(translation, words);
    }

    public void delete(String word) {
        String tempWord = dictionaryMap.get(word);
        dictionaryMap.remove(dictionaryMapReverse.get(word));
        dictionaryMap.remove(word);
        dictionaryMapReverse.remove(tempWord);
        dictionaryMapReverse.remove(word);
    }

    public String translate(String word) {
        if (!dictionaryMap.containsKey(word) && !dictionaryMapReverse.containsKey(word)) {
            return null;
        }
        if (dictionaryMap.containsKey(word)) {
            return dictionaryMap.get(word);
        }
        return dictionaryMapReverse.get(word);
    }

}
