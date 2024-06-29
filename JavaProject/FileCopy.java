import java.io.*;
public class FileCopy {
    public static void main(String[] args) {
        String sourceFilePath = "C:/Users/anjali/OneDrive/Documents/contentdemo1.txt";
        String destinationFilePath = "C:/Users/anjali/OneDrive/Documents/contentdemo2.txt";
        try {
            FileReader fileReader = new FileReader(sourceFilePath);
            FileWriter fileWriter = new FileWriter(destinationFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add newline character
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}

