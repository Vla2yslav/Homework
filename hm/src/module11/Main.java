package module11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String replacer(Map<String, String> map)throws IOException{
        BufferedReader br;
        FileReader fileReader = new FileReader("/Users/Vladislav/Desktop/java.txt");
        br = new BufferedReader(fileReader);
        String line =  br.readLine();
        StringBuilder res = new StringBuilder();

        while (line!=null){
            res.append(line);
            res.append(System.lineSeparator());
            line =  br.readLine();
        }

        String s = res.toString();

        for (Map.Entry<String,String> entry : map.entrySet()){
            s = s.replaceAll(entry.getKey(),entry.getValue());
        }
        return s;
    }

   public static File fileContentReplacer(Map<String, String> map)throws IOException{
        FileReader fileReader = new FileReader("/Users/Vladislav/Desktop/java.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line =  br.readLine();
        StringBuilder res = new StringBuilder();

        while (line!=null){
            res.append(line);
            res.append(System.lineSeparator());
            line =  br.readLine();
        }

        String s = res.toString();

       for (Map.Entry<String,String> entry : map.entrySet()){
           s = s.replaceAll(entry.getKey(),entry.getValue());
       }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/Vladislav/Desktop/java.txt"));
        bufferedWriter.write(s);
        bufferedWriter.close();
        return  new File("/Users/Vladislav/Desktop/java.txt");
    }

    public static File fileContentMerger(Map<String, String> map)throws IOException{
        FileReader fileReader = new FileReader("/Users/Vladislav/Desktop/java.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line =  br.readLine();
        StringBuilder res = new StringBuilder();

        while (line!=null){
            res.append(line);
            res.append(System.lineSeparator());
            line =  br.readLine();
        }

        String s = res.toString();

        for (Map.Entry<String,String> entry : map.entrySet()){
            s = s.replaceAll(entry.getKey(),entry.getValue());
        }
        FileWriter fileWriter = new FileWriter("/Users/Vladislav/Desktop/java.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.append(s);
        bufferedWriter.close();
        return new File("/Users/Vladislav/Desktop/java.txt");
    }

    public static int checkWord (String word){
        int checkWord = 0;
        String line;
        BufferedReader bufferedReader = null;
        try {

            bufferedReader = new BufferedReader(new FileReader("/Users/Vladislav/Desktop/java.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while ((line = bufferedReader.readLine()) != null){
                if (line.equals(word)){
                    checkWord++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return checkWord;
    }

    public static int checkWord1(String word) throws IOException {
        int checkWord = 0;
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/Vladislav/Desktop/java.txt"))){
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(word)) {
                    checkWord++;
                }
            }
        }
        return checkWord;
    }

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("java", "IDE");
        map.put("test", "good");

        //System.out.println(replacer(map));
        //fileContentReplacer(map);
        //fileContentMerger(map);
        System.out.println(checkWord("pop"));
        System.out.println(checkWord1("test"));
    }
}
