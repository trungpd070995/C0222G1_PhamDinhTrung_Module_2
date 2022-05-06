package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String[]> readFile(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader((fileReader));
            String line;
            List<String[]> list = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(arr);
            }
            bufferedReader.close();
            fileReader.close();
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


        public static void writeFile(String path, List<String> list) {
            File file = new File(path);

            try {
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for (String temp : list) {
                    bufferedWriter.write(temp);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
