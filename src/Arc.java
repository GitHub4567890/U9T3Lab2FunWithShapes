import java.awt.*;

public class Arc extends Shape{
    private int arcAngle;
    private int startAngle;

    public Arc() {
        super();
        arcAngle = 70;
        startAngle = 30;
    }

    @Override
    public void draw(Graphics a) {
        a.setColor(getColor());
        a.drawArc(getMinX(),getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }
}
