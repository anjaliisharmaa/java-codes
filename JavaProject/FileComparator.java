import java.io.*;

public class FileComparator {
    public static void main(String[] args) {
        // File paths for the two files to compare
        String filePath1 = "C:/Users/anjali/OneDrive/Documents/contentdemo1.txt";
        String filePath2 = "C:/Users/anjali/OneDrive/Documents/contentdemo2.txt";

        try {
            // Create file readers for both files
            FileReader fileReader1 = new FileReader(filePath1);
            FileReader fileReader2 = new FileReader(filePath2);

            // Create buffered readers for both files
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

            // Variables to store the lines read from each file
            String line1, line2 = null;
            boolean areEqual = true;

            // Read and compare lines from both files
            while ((line1 = bufferedReader1.readLine()) != null && (line2 = bufferedReader2.readLine()) != null) {
                if (!line1.equals(line2)) {
                    areEqual = false;
                    break;
                }
            }

            // Check if both files have reached EOF
            if (line1 != null || line2 != null) {
                areEqual = false;
            }

            // Close readers
            bufferedReader1.close();
            bufferedReader2.close();

            // Print comparison result
            if (areEqual) {
                System.out.println("The contents of the two files are the same.");
            } else {
                System.out.println("The contents of the two files are different.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while comparing files: " + e.getMessage());
        }
    }
}
