import csv.CSVReader;
import exceptions.EmptyTeamException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {

            CSVReader reader = new CSVReader();

            Team amg = new Team("AMG");
            Team pgb = new Team("PGB");
            List<Team> teams = new ArrayList<>();
            teams.add(amg);
            teams.add(pgb);

            amg.populateEmployeeList(reader);
            pgb.populateEmployeeList(reader);


            System.out.println(Team.generateReport(teams));
        } catch (EmptyTeamException e) {
            e.printStackTrace();
        }

    }
}
