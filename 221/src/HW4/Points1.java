/**
 * Creating a Point to use
 *
 * @authorJacobManning
 * I, Jacob Manning, certify that this is my individual work.
 * CSCI 221, Spring 2020
 * HW 4 Part 1 - Point class
 *
 */

package HW4;

public class Points1 {

    private int xCoord;
    private int yCoord;

    public Points1() {
        this.xCoord = 0;
        this.yCoord = 0;
    }

    public Points1(Points1 point) {
        if(point != null) {
            if(point.getX() >= 0 && point.getX() <= GridConstants.MAX_PANEL_WIDTH) {
                this.xCoord = point.getX();
            }
            else {
                this.xCoord = 0;
            }
            if(point.getY() >= 0 && point.getY() <= GridConstants.MAX_PANEL_HEIGHT) {
                this.yCoord = point.getY();
            }
            else {
                this.yCoord = 0;
            }
        }
    }

    public Points1(int xPlane, int yPlane) {
        if(xPlane >= 0 && xPlane <= GridConstants.MAX_PANEL_WIDTH) {
            this.xCoord = xPlane;
        }
        if(yPlane >= 0 && yPlane <= GridConstants.MAX_PANEL_HEIGHT) {
            this.yCoord = yPlane;
        }
    }

    public int getX() {
        return xCoord;
    }

    public int getY() {
        return yCoord;
    }

    public void setX(int xCoord) {
        if(xCoord >= 0 && xCoord <= GridConstants.MAX_PANEL_WIDTH) {
            this.xCoord = xCoord;
        }
        else {
            this.xCoord = 0;
        }
    }

    public void setY(int yCoord) {
        if(yCoord >= 0 && yCoord <= GridConstants.MAX_PANEL_HEIGHT) {
            this.yCoord = yCoord;
        }
        else {
            this.yCoord = 0;
        }
    }

    public void setPoint(Points1 point) {
        if(point != null) {
            setX(point.getX());
            setY(point.getY());
        }
    }

}
