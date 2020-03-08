package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    private String line;
    private String selector;
    private boolean isEmployee;


    public CSVReader(String selector) {
        this.selector = selector;
    }

    public CSVReader() {
        selector = ",";
    }

    private String[] parseHeader(String header) {

        return translateLine(header);
    }

    public ArrayList<String> readFile(File file) {

        isEmployee = false;
        ArrayList<String> strings = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            for (String str : parseHeader(br.readLine())) {
                if (str.contains("role")) {
                    isEmployee = true;
                    break;
                }
            }

            while ((line = br.readLine()) != null) {

                strings.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return strings;
    }

    public String[] translateLine(String string) {

        return string.split(selector);
    }

    public boolean isEmployee() {
        return isEmployee;
    }
}

