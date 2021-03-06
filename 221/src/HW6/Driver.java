package HW6;

import java.awt.*;

/**
 * This driver program uses the MapDataDrawer class to
 * compute various statistics and paths given a grid of
 * elevation data for some territory.
 *
 * This code should not be changed in solving HW problem 6
 */
public class Driver
{
    
    public static void main(String[] args) throws Exception{

        final int COLS_COUNT = 844;
        final int ROWS_COUNT = 480;
        //construct DrawingPanel, and get its Graphics context
        DrawingPanel panel = new DrawingPanel(COLS_COUNT, ROWS_COUNT);
        //DrawingPanel panel = new DrawingPanel(100, 100);
        Graphics g = panel.getGraphics();
        
        //Test Step 1 - construct mountain map data
        MapDataDrawer map = new MapDataDrawer("Colorado_844x480.dat", ROWS_COUNT, COLS_COUNT);
        
        //Test Step 2 - min, max, minRow in col
        int min = map.findMin();
        System.out.println("Min value in map: "+min);
        
        int max = map.findMax();
        System.out.println("Max value in map: "+max);
        
        int minRow = map.indexOfMinRow(0);
        System.out.println("Row with lowest val in col 0: "+minRow);
        
        //Test Step 3 - draw the map
        map.drawMap(g);
        
        //Test Step 4 - draw a greedy path
        g.setColor(Color.WHITE); //can set the color of the 'brush' before drawing, then method doesn't need to worry about it
        int totalChange = map.drawLowestElevPath(g, minRow); //use minRow from Step 2 as starting point
        System.out.println("Lowest-Elevation-Change Path starting at row "+minRow+" gives total change of: "+totalChange);

        //Test Step 5 - draw the best path   
        g.setColor(Color.RED);
        int bestRow = map.indexOfLowestElevPath(g);
    

        g.setColor(Color.GREEN);
        totalChange = map.drawLowestElevPath(g, bestRow);
        System.out.println("The Best Lowest-Elevation-Change Path starts at row: "+bestRow+" and gives a total change of: "+totalChange);

    }
}
