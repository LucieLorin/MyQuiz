package cz.czechitas.tenis;

public class Quiz {

    int pointSUM = 0;

    public boolean playerWIN()  {
        return pointSUM > 2;
    }

    public void addAPoint() {
      pointSUM = pointSUM + 1;
    }
}
