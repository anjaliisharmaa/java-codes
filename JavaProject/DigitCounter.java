import java.io.*;
public class DigitCounter {
    public static void main(String[] args) {
        String filePath = "C:/Users/anjali/OneDrive/Documents/contentdemo1.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int digitCount = 0;
            int character;
            while ((character = bufferedReader.read()) != -1) {
                if (Character.isDigit((char) character)) {
                    digitCount++;
                }
            }
            bufferedReader.close();
            System.out.println("Number of digits in the file: " + digitCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

