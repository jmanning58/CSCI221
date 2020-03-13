package HW5;

import java.io.*;
import java.util.*;

public class SalaryLookUp {

    public static void main(String[] args)  throws FileNotFoundException {
    
        PlayerSalaries ps1 = new PlayerSalaries("C:\\Users\\vampi\\eclipse-workspace\\221\\src\\HW5\\Salaries.csv");

        Scanner userInput = new Scanner(System.in);
        List<String> choiceOptions = Arrays.asList
                (" 1: See average salary in a specific year",
                 " 2: See a specific player's salary in a specific year",
                 " 3: See the highest salary in a specific year",
                 " 4: See the lowest salary in a specific year",
                 " 5: See the highest salary on a specific team in a specific year",
                 " 6: See the lowest salary on a specific team in a specific year",
                 " 7: See the highest salary in the league in a specific year",
                 " 8: See the lowest salary in the league in a specific year",
                 " 9:  Quit");
        System.out.println("Please enter your choice: ");

        for(int i = 0; i < 9; i++) {
            System.out.println(choiceOptions.get(i));
        }

        int choice = userInput.nextInt();
        String player;
        String team;

        if(choice == 1) {

            System.out.println("What year would you like to look in: ");
            choice = userInput.nextInt();
            int results = ps1.averageSalaryInYear(choice);

            System.out.println("The average salary in " + choice + " was: " + results);
        }

        if(choice == 2) {

            System.out.println("Which player would you like to view: ");
            player = userInput.next();

            System.out.println("Within what year: ");
            choice = userInput.nextInt();
            PlayerSalary results = ps1.findPlayerInYear(player, choice);

            System.out.println(player + "'s salary in year " + choice + " was: " + results);
        }

        if(choice == 3) {

            System.out.println("What year would you like to get the highest salary information on: ");
            choice = userInput.nextInt();
            PlayerSalary results = ps1.highestSalaryInYear(choice);

            System.out.println("The highest salary earned in year " + choice + " was: " + results);
        }

        if(choice == 4) {

            System.out.println("What year would you like to get the lowest salary information on: ");
            choice = userInput.nextInt();
            PlayerSalary results = ps1.lowestSalaryInYear(choice);

            System.out.println("The lowest salary earned in year " + choice + " was: " + results);
        }

        if(choice == 5) {

            System.out.println("What team would you like to review: ");
            team = userInput.next();

            System.out.println("Within what year: ");
            choice = userInput.nextInt();
            PlayerSalary results = ps1.highestSalaryInTeamInYear(team, choice);

            System.out.println("The highest salary earned in year " + choice + " on " + team + " was: " + results);
        }

        if(choice == 6) {

            System.out.println("What team would you like to review: ");
            team = userInput.next();

            System.out.println("Within what year: ");
            choice = userInput.nextInt();
            PlayerSalary results = ps1.lowestSalaryInTeamInYear(team, choice);

            System.out.println("The lowest salary earned in year " + choice + " on " + " was: " + results);
        }

        if(choice == 7) {

            System.out.println("Which team was in the league you would like to review: ");
            team = userInput.next();

            System.out.println("Within what year: ");
            choice = userInput.nextInt();
            PlayerSalary results = ps1.highestSalaryInLeagueInYear(team, choice);

            System.out.println("The highest salary earned in that league was: " + results);
        }

        if(choice == 8) {

            System.out.println("Which team was in the league you would like to review: ");
            team = userInput.next();

            System.out.println("Within what year: ");
            choice = userInput.nextInt();
            PlayerSalary results = ps1.lowestSalaryInLeagueInYear(team, choice);

            System.out.println("The lowest salary earned in that league was: " + results);
        }

        if(choice == 9) {

            System.out.println("OK, goodbye.");
        }
    }
}
 
