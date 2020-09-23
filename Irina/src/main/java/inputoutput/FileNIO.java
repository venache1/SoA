package inputoutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNIO {
    public static void main(String[] args) throws IOException {
        //writeToFileHowOftenWordRepeatsInOriginalFile(new File("Irina\\src\\wordlist[2305843009214056683].txt"), "lactonic");
        writeToFileHowOftenWordRepeatsAndLineNumber(new File("Irina\\src\\wordlist[2305843009214056683].txt"), "trophosomal");
    }

    public static Path writeToFileHowOftenWordRepeatsInOriginalFile(File file, String text) throws IOException {
        int number = countWordInFile(file, text);
        String content = text + " was found " + number + " times";
        Path resultFile = Paths.get("Irina\\src\\results.txt");
        byte[] contentBytes = content.getBytes();
        Files.write(resultFile, contentBytes);
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
        Path path = Paths.get(file.getPath());
        List<String> myList = Files.readAllLines(path);
        return myList;
    }

    public static Path writeToFileHowOftenWordRepeatsAndLineNumber(File file, String text) throws IOException {
        int number = countWordInFile(file, text);
        Map<String,List<Integer>> myMap = extractIntoMap(file, text);
        Path resultFile = Paths.get("Irina\\src\\results.txt");

        String content = text + " was found " + number + " times on lines: ";
        List<Integer> myLines;
        for( Map.Entry<String,List<Integer>> pair : myMap.entrySet()){
            myLines = pair.getValue();{
                for(int lineNumber : myLines){
                    content+=lineNumber;
                    content+=", ";
                }
            }
        }
        byte[] contentBytes = (content.substring(0,content.length()-2)).getBytes();
        Files.write(resultFile, contentBytes);
        return resultFile;
    }

    public static Map<String, List<Integer>> extractIntoMap(File file, String word) throws IOException {
        List<Integer> lines = getWordAllLines(file, word);
        Map<String, List<Integer>> map = new HashMap<>();
        map.put(word,lines);
        return map;
    }

    public static List<Integer> getWordAllLines(File file, String word) throws IOException {
        List<String> fullList = convertFileIntoList(file);
        List<Integer> listOfLineNumbers = new ArrayList<>();
        for ( int i = 0; i<fullList.size(); i++ ) {
            if (fullList.get(i).equals(word)) {
                int lineNumber = i + 1;
                listOfLineNumbers.add(lineNumber);
            }
        }
        return listOfLineNumbers;
    }
}