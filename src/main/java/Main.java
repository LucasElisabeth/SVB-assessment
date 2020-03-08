import csv.CSVReader;

public class Main {

    public static void main(String[] args) {

        CSVReader reader = new CSVReader();

        Team amg = new Team("AMG");
        Team pgb = new Team("PGB");

        amg.populateEmployeeList(reader);
        pgb.populateEmployeeList(reader);

        System.out.println(amg.getEmployeeDescription(101));
        System.out.println(pgb.getEmployeeDescription(301));


    }
}
