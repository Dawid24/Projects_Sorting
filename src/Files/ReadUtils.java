package Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadUtils {
    public static void readFromFile() {
        try {
            String line = null;
            BufferedReader input = Files.newBufferedReader(Paths.get(FileUtils.path));
            while ((line = input.readLine()) != null) {
                if (line.equals("BO") || line.equals("CHO")) {
                    FileUtils.bubbleOrInsert = line;
                } else
                    Data.list.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.getMessage();
        }
    }
}
