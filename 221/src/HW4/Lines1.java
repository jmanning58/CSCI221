/**
 * Creating a Line to use with Point class
 *
 * @authorJacobManning
 * I, Jacob Manning, certify that this is my individual work.
 * CSCI 221, Spring 2020
 * HW 4 Part 2 - Line class
 *
 */

package HW4;

public class Lines1 {

    private Points1 start;
    private Points1 end;

    public Lines1() {
        this.start = null;
        this.end = null;
    }

    public Lines1(Points1 start, Points1 end) {
        if(start != null && end != null) {
            this.start = start;
            this.end = end;
        }
    }

    public Points1 getStart() {
        return this.start;
    }

    public Points1 getEnd() {
        return this.end;
    }

    public void setStart(Points1 start) {
        if (start != null) {
            this.start = start;
        }
    }

    public void setEnd(Points1 end) {
        if (end != null) {
            this.end = end;
        }
    }

    public boolean isValid() {
        if (start != null && end != null) {
            return true;
        } else {
            return false;
        }
    }
}
