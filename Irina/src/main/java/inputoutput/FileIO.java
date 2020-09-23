package inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    public static void main(String[] args) throws IOException {
        writeToFileHowOftenWordRepeatsInOriginalFile(new File("Irina\\src\\wordlist[2305843009214056683].txt"), "parceling");
    }

    public static File writeToFileHowOftenWordRepeatsInOriginalFile(File file, String text) throws IOException {
        int number = countWordInFile(file, text);
        File resultFile = new File("Irina\\src\\results.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile));
        writer.write(text + " was found " + number + " times");
        writer.close();
        return resultFile;
    }

    public static int countWordInFile(File file, String searchedWord) throws IOException {
        List<String> fullFileStrings = convertFileIntoList(file);
        int countWord = 0;
        for ( String elem : fullFileStrings ) {
            if (elem.equals(searchedWord)) {
                countWord++;
            }
        }
        return countWord;
    }

    public static List<String> convertFileIntoList(File file) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        while (line != null) {
            list.add(line);
            line = reader.readLine();
        }
        return list;
    }
}