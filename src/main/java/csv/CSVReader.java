package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    private String line;
    private String selector;

    /**
     * @param selector alternative constructor if your csv file is not separated by commas.
     */
    public CSVReader(String selector) {
        this.selector = selector;
    }

    public CSVReader() {
        selector = ",";
    }


    /**
     * @param header string that will be parsed as header for the file.
     * @return the string in an array separated by commas.
     */
    private String[] parseHeader(String header) {

        return parseLine(header);
    }

    /**
     * @param file takes in a file that is processed in the method.
     * @return a list of Strings, that can then be converted using the parseLine() method.
     */
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

    /**
     * @param string takes in a String to be parsed by a selector.
     * @return the parsed String
     */
    public String[] parseLine(String string) {

        return string.split(selector);
    }

}

