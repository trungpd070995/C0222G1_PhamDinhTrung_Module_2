package _16_IO_text_file.exercise.copy_file;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        List<String> strings = copyFile.readFile("src\\_16_IO_text_file\\exercise\\copy_file\\A.txt");

        for (String item : strings ) {
            copyFile.writeFile("src\\_16_IO_text_file\\exercise\\copy_file\\B.txt", item);
        }
    }
}
