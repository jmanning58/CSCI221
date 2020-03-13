/**
 * Salary for baseball players is stored.
 *
 */

package HW5;

public class PlayerSalary {

    //Constructor for objects of class PlayerSalary
    private int yearID;
    private String teamID;
    private String leagueID;
    private String playerID;
    private int salary;
    
    public PlayerSalary(int yearID, String teamID, String leagueID, String playerID, int salary) {

        // initialize instance variables
        this.yearID = yearID;
        this.teamID = teamID;
        this.leagueID = leagueID;
        this.playerID = playerID;
        this.salary = salary;
    }
    
    /**
     * returns a String representation of a PlayerSalary object
     */

    public String toString() {
        
        return "Year:" + yearID
           + "\nTeam:" + teamID
           + "\nLeague:" + leagueID
           + "\nPlayer:" + playerID
           + "\nSalary:" + salary
           + "\n";
    }
    
    public int getYearID() {return yearID;}

    public String getTeamID() {return teamID;}

    public String getLeagueID() {return leagueID;}

    public String getPlayerID() {return playerID;}

    public int getSalary() {return salary;}

}
