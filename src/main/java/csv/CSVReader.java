package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    private String line;
    private String selector;

    public CSVReader(String selector) {
        this.selector = selector;
    }

    public CSVReader() {
        selector = ",";
    }

    private String[] parseHeader(String header) {

        return parseLine(header);
    }

    public ArrayList<String> readFile(File file) {

        ArrayList<String> strings = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            // Dealing with the header line will be dealt underneath, currently not implemented.
            String[] header = parseHeader(br.readLine());


            while ((line = br.readLine()) != null) {

                strings.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return strings;
    }

    public String[] parseLine(String string) {

        return string.split(selector);
    }

}

