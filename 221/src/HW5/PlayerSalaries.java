package HW5;

//import HW5.PlayerSalary;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/*
 * PlayerSalaries database 
 */

public class PlayerSalaries {

    ArrayList<PlayerSalary> salaries;

    public PlayerSalaries(String filename) throws FileNotFoundException {

        //Gets the scanner instance - this will read in lines from file
        Scanner scanner = new Scanner(new File(filename));

        // Processes CSV file -
        // reading each line of text, then scanning the text for tokens
        // delimited by commas or end of the line
         
        // Reads the first int in the file that indicates how many
        // records follow
        int howMany = scanner.nextInt(); 
        
        // Instantiates/allocates salaries list uses the
        // first number in the file to set the list capacity
        salaries = new ArrayList<>(howMany);
   
        // Consumes the rest of line 1
        scanner.nextLine(); 
        scanner.nextLine(); // Consumes line 2

        // Reads each line/record in the file
        // Currently, only reads in 2 lines, so you can see what is happening.
        // When you are comfortable processing all the data in the file,
        // change 3 to howMany
        for(int lineNum = 1; lineNum < howMany; lineNum++) {

            // Creates a PlayerSalary object and adds it to the database
            //PlayerSalary profile;

            // Instantiates a temporary list
            ArrayList<String> stats = new ArrayList<String>();

            // Reads entire line into a String
            String line = scanner.nextLine();

            // Associates a Scanner with the String
            Scanner lineScanner = new Scanner(line);

            // States that commas will be the delimiter/separator -
            // since the data is a CSV file
            lineScanner.useDelimiter(",");

            // The following code demonstrates how to pull words out of a file
            //System.out.println("\nThis is what is on line " + lineNum);

            while(lineScanner.hasNext()) { // parses a line

                // Appending each cell/value to the stats list
                stats.add(lineScanner.next());
            }

            // Temp variables
            int year = Integer.parseInt(stats.get(0));
            String team;
            System league;
            String player;
            int salary = Integer.parseInt(stats.get(4));


            // Creates a PlayerSalary object
            salaries.add(new PlayerSalary(year, (String)(stats.get(1)), (String)(stats.get(2)),
                    (String)(stats.get(3)), salary));

            // Appending each profile/object to the salaries list
            //salaries.add(profile);
        }
    }

    public int averageSalaryInYear(int year) {

        // Storage variable for total Salary
        long aveSal = 0;
        int amount = 0;

        //For loop running length of ArrayList salaries
        for(int i = 0; i < salaries.size(); i++) {

            // If statement validating the year, if so add salary to aveSal
            if(salaries.get(i).getYearID() == year) {
                aveSal += salaries.get(i).getSalary();
                amount += 1;
            }
            else{
                i = salaries.size();
            }
        }
        aveSal = aveSal / amount;
        int finalSal = (int)(aveSal);

        return finalSal;
    }
    
    public PlayerSalary findPlayerInYear(String player, int year) {

        // For loop for searching through list
        for (int i = 0; i < salaries.size(); i++) {

            if(salaries.get(i).getYearID() == year && salaries.get(i).getPlayerID() == player)
                    return salaries.get(i);

            if(i == salaries.size() - 1 && salaries.get(i).getPlayerID() != player)
                return null;
        }
        return null;
    }
    
    public PlayerSalary highestSalaryInYear(int year) {

        PlayerSalary topSal = null;

        // Locating first instance in year
        for(int i = 0; i < salaries.size(); i++) {
            if(salaries.get(i).getYearID() == year) {
                topSal = salaries.get(i);
                i = salaries.size();
            }
        }
        // For loop comparing each Player in year
        for(int i = 0; i < salaries.size(); i++) {
            if (salaries.get(i).getYearID() == year)
                if (salaries.get(i).getSalary() >= topSal.getSalary())
                    topSal = salaries.get(i);
        }
        return topSal;
    }
    
    public PlayerSalary lowestSalaryInYear(int year) {

        PlayerSalary lowestSal = null;

        // Locating first instance with year parameter
        for(int i = 0; i < salaries.size(); i++) {
            if(salaries.get(i).getYearID() == year) {
                lowestSal = salaries.get(i);
                i = salaries.size();
            }
        }
        // For loop comparing each Player in year
        for(int i = 0; i < salaries.size(); i++) {
            if (salaries.get(i).getYearID() == year)
                if (salaries.get(i).getSalary() <= lowestSal.getSalary())
                    lowestSal = salaries.get(i);
        }
        return lowestSal;
    }
    
    public PlayerSalary highestSalaryInTeamInYear(String team, int year) {

        PlayerSalary topSalInTeam = null;

        // Locating first instance that is in the
        // correct year and team
        for(int i = 0; i < salaries.size(); i++) {
            if(salaries.get(i).getYearID() == year)
                if(salaries.get(i).getTeamID() == team) {
                    topSalInTeam = salaries.get(i);
                    i = salaries.size();
                }
        }
        // Loop comparing within the same year,
        // then the same team
        for(int i = 0; i < salaries.size(); i++) {
            if(salaries.get(i).getYearID() == year)
                if(salaries.get(i).getTeamID() == team)
                    if(salaries.get(i).getSalary() >= topSalInTeam.getSalary())
                        topSalInTeam = salaries.get(i);
        }
        return topSalInTeam;
    }
    
    public PlayerSalary lowestSalaryInTeamInYear(String team, int year) {

        PlayerSalary lowestSalInTeam = null;

        // Locating first instance that is in the
        // correct year and team
        for(int i = 0; i < salaries.size(); i++) {
            if(salaries.get(i).getYearID() == year)
                if(salaries.get(i).getTeamID() == team) {
                    lowestSalInTeam = salaries.get(i);
                    i = salaries.size();
                }
        }
        // Loop comparing within the same year,
        // then the same team
        for(int i = 0; i < salaries.size(); i++) {
            if (salaries.get(i).getYearID() == year)
                if (salaries.get(i).getTeamID() == team)
                    if (salaries.get(i).getSalary() <= lowestSalInTeam.getSalary())
                        lowestSalInTeam = salaries.get(i);
        }
        return lowestSalInTeam;
    }
    
    public PlayerSalary highestSalaryInLeagueInYear(String team, int year) {

        PlayerSalary topSalInLeagueInYear = null;

        // Locating first instance that is in the
        // correct year and team
        for(int i = 0; i < salaries.size(); i++) {
            if(salaries.get(i).getYearID() == year)
                if(salaries.get(i).getTeamID() == team) {
                    topSalInLeagueInYear = salaries.get(i);
                    i = salaries.size();
                }
        }
        // Loop comparing within the same year,
        // then within the same league
        for(int i = 0; i < salaries.size(); i++) {
            if (salaries.get(i).getYearID() == year)
                if (salaries.get(i).getLeagueID() == topSalInLeagueInYear.getLeagueID())
                    if (salaries.get(i).getSalary() <= topSalInLeagueInYear.getSalary())
                        topSalInLeagueInYear = salaries.get(i);
        }
        return topSalInLeagueInYear;
    }
    
    public PlayerSalary lowestSalaryInLeagueInYear(String team, int year) {

        PlayerSalary lowSalInLeagueInYear = null;

        // Locating first instance that is in the
        // correct year and team
        for(int i = 0; i < salaries.size(); i++) {
            if(salaries.get(i).getYearID() == year)
                if(salaries.get(i).getTeamID() == team) {
                    lowSalInLeagueInYear = salaries.get(i);
                    i = salaries.size();
                }
        }

        // Loop comparing within the same year,
        // then within the same league
        for(int i = 0; i < salaries.size(); i++) {
            if (salaries.get(i).getYearID() == year)
                if (salaries.get(i).getLeagueID() == lowSalInLeagueInYear.getLeagueID())
                    if (salaries.get(i).getSalary() <= lowSalInLeagueInYear.getSalary())
                        lowSalInLeagueInYear = salaries.get(i);
        }
        return lowSalInLeagueInYear;
    }
    
    public void displayAllSalaries() {

        for (int i = 0; i < salaries.size(); i++)

           // Note, this depends on the PlayerSalary class
           // having a toString method
           System.out.println(salaries.get(i));
    }
}
