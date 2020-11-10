package HW4;

import java.util.*;

/**
 * Using the Line and Point classes to generate 3 UI grids
 *
 * @authorJacobManning
 * I, Jacob Manning, certify that this is my individual work.
 * CSCI 221 Spring 2020
 * HW 4 part 3 - Grid Creation class
 *
 */

public class TestGridUI {

    public static void main(String[] args) {

    GridUI baseGrid = new GridUI();
    //GridUI gridWin = new GridUI();
    //GridUI lastGrid = new GridUI();
    Lines1 straight = new Lines1();

    Points1 baseP = new Points1(0, 0);
    Points1 endP = new Points1(0, 0);

    // For baseGrid borders
    for(int i = 0; 1 >= i; i++) {
        if(i == 0) {

            endP.setY(GridConstants.MAX_PANEL_HEIGHT); straight.setEnd(baseP);

            straight.setStart(baseP); straight.setEnd(endP);

            baseGrid.addLine(straight);

            //baseP.setX(GridConstants.MAX_PANEL_WIDTH); baseP.setY(i); straight.setEnd(baseP);
            //baseGrid.addLine(straight);
        }
//        if(i == 1) {
//            baseP.setX(i * GridConstants.MAX_PANEL_WIDTH); baseP.setY(i * GridConstants.MAX_PANEL_HEIGHT);
//            straight.setStart(baseP);
//            baseGrid.addLine(straight);
//        }
    }

    System.out.println("10 " + baseP.getY());

  /*  // Generating the standard points to be used as a base
    for(int i = 0; 2 >= i; i++) {

        // Sets vertical starting points from left to right
        if(i == 0) {
            baseP.setX(GridConstants.MAX_PANEL_WIDTH / 2);
            gridStartPoints.add(baseP);
            baseP.setX(GridConstants.MAX_PANEL_WIDTH);
            gridStartPoints.add(baseP);
        }
        // Sets vertical ending points along bottom from left to right
        if(i == 1) {
            baseP.setX(0);
            baseP.setY(GridConstants.MAX_PANEL_HEIGHT);
            gridEndPoints.add(baseP);
            baseP.setX(GridConstants.MAX_PANEL_WIDTH / 2);
            gridEndPoints.add(baseP);
            baseP.setX(GridConstants.MAX_PANEL_WIDTH);
            gridEndPoints.add(baseP);
        }
        // Sets horizontal starting and ending points
        if(i == 2) {
            baseP.setX(0);
            baseP.setY(0);
            gridStartPoints.add(baseP);
            baseP.setX(GridConstants.MAX_PANEL_WIDTH);
            gridEndPoints.add(baseP);
            baseP.setX(0);
            baseP.setY(GridConstants.MAX_PANEL_HEIGHT / 2);
            gridStartPoints.add(baseP);
            baseP.setX(GridConstants.MAX_PANEL_WIDTH);
            gridEndPoints.add(baseP);
        }
    }

    // Generating the standard lines to be used as a base
    for(int j = 0; gridStartPoints.size()-1 >= j; j++) {
        Line vert = new Line(gridStartPoints.get(j), gridEndPoints.get(j));

        System.out.println("2 " + vert.getStart());

        Line horizon = new Line(gridStartPoints.get(j), gridEndPoints.get(j));
        // Generates the vertical lines for the grid
        if(j < 3) {


            System.out.println(vert);
            //gridLines.add(vert);
        }
        // Generates the horizontal lines for the grid
        if(j > 2) {
            ;
            //gridLines.add(horizon);
        }
    }

    //for(int k = 0; gridLines.size()-1 >= k; k++) {

        //baseGrid.addLine(gridLines.get(k));
    //}
    System.out.println(gridStartPoints.get(0));
    System.out.println(gridEndPoints.get(0));
    //System.out.println(gridLines.get(0));
   // for(int i = 0; userInput > i; i++) {

    //}

  */
    }

} // end TestGrid
