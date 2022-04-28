package _16_IO_text_file.pratice.read_and_write_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size() ; i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src\\_16_IO_text_file\\pratice\\read_and_write_file\\numbers.csv");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src\\_16_IO_text_file\\pratice\\read_and_write_file\\result.csv", maxValue);
        System.out.println(maxValue);
    }
}