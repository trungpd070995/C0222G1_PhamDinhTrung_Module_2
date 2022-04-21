package _16_IO_text_file.exercise.read_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\_16_IO_text_file\\exercise\\read_files\\countries.csv"));

            while ((line = bufferedReader.readLine()) != null) {
                display(readLine(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readLine(String line) {
        List<String> listCountry = new ArrayList<>();
        if (line != null) {
            String[] strings = line.split(",");
            for (int i = 0; i < strings.length; i++) {
                listCountry.add(strings[i]);
            }
        }
        return listCountry;
    }

    private static void display(List<String> country) {
        System.out.println(
                "Đất nước [Mã : " + country.get(0)
                        + ", Tên viết tắt : " + country.get(1)
                        + " , Tên đất nước : " + country.get(2)
                        + "]");
    }
}
