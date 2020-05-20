
import HW4.GridConstants;
//import HW4.Points1;

public class Tester {

    public class Points1 {

        // Instance variables
        private int xCoord;
        private int yCoord;

        // Base constructor
        public Points1() {
            this.xCoord = 0;
            this.yCoord = 0;
        }

        // User has a point object
        public Points1(HW4.Points1 point) {

            // Point cannot be null, if null does nothing
            if(point != null) {
                if((point.getX() >= 0) && (point.getX() <= GridConstants.MAX_PANEL_WIDTH)) {
                    this.xCoord = point.getX();
                }
                else {
                    this.xCoord = 0;
                }
                if((point.getY() >= 0) && (point.getY() <= GridConstants.MAX_PANEL_HEIGHT)) {
                    this.yCoord = point.getY();
                }
                else {
                    this.yCoord = 0;
                }
            }
        }

        // User has 'x' and 'y' coordinates
        public Points1(int xPlane, int yPlane) {
            if((xPlane >= 0) && (xPlane <= GridConstants.MAX_PANEL_WIDTH)) {
                this.xCoord = xPlane;
            }
            if((yPlane >= 0) && (yPlane <= GridConstants.MAX_PANEL_HEIGHT)) {
                this.yCoord = yPlane;
            }
        }

        // Getter methods for 'xCoord' and 'yCoord'
        public int getX() {
            return xCoord;
        }
        public int getY() {
            return yCoord;
        }

        // User creating a new 'xCoord', if value isn't within bounds value is zero
        public void setX(int xCoord) {
            if((xCoord >= 0) && (xCoord <= GridConstants.MAX_PANEL_WIDTH)) {
                this.xCoord = xCoord;
            }
            else {
                this.xCoord = 0;
            }
        }

        // User creating a new 'yCoord', if value isn't within bounds value is zero
        public void setY(int yCoord) {
            if((yCoord >= 0) && (yCoord <= GridConstants.MAX_PANEL_HEIGHT)) {
                this.yCoord = yCoord;
            }
            else {
                this.yCoord = 0;
            }
        }

        // User creating a new point
        public void setPoint(HW4.Points1 p) {
            if(p != null) {
                setX(p.getX());
                setY(p.getY());
            }
        }

    }

}
