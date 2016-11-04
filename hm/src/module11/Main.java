package module11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String replacer(Map<String, String> map)throws IOException{
       String file = "";
        file = map.values().toString();
       return file;
    }

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br;
        try {
           FileReader fileReader = new FileReader("/Users/Vladislav/Desktop/java.txt");
           br = new BufferedReader(fileReader);
       }
       catch (FileNotFoundException e){
           System.out.println("File not found");
           return;
       }

        String line =  br.readLine();
        String word;

        while (line!=null){
            line =  br.readLine();
            word = br1.readLine();
            map.put(line, word);
        }

        System.out.println(replacer(map));




    }
}
