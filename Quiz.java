package cz.czechitas.tenis;

public class Quiz {

    int pointSUM = 0;

    public boolean playerWIN() {
        if (pointSUM >= 3) {
            return true;
        } else {
            return false;
        }

    }

    public void addAPoint() {
      pointSUM = pointSUM + 1;
    }
}
