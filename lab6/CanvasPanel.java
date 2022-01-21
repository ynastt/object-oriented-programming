import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {
    private	int	aRadius = 20 ;
    private int	bRadius = 20 ;
    private	int	cRadius = 20 ;
    private boolean color = false;

    public void setARadius(int r) {
        this.aRadius = r;
        repaint(); //так же вызывает перерисовку компонента
    }
    public void setBRadius(int r) {
        this.bRadius = r;
        repaint();
    }
    public void setCRadius(int r) {
        this.cRadius = r;
        repaint();
    }
    public void setDifColor() {
        this.color = !color;
        repaint();
    }
    protected void paintComponent(Graphics g) {
        //getHeight() и getWidth() возвращают
        //высоту и ширину ограничивающего прямоугольника.
        int y = this.getHeight() / 2; //координаты центра рисунка
        int x = this.getWidth() / 2;
        int a = aRadius + bRadius;
        int b = bRadius + cRadius;
        int c = cRadius + aRadius;
        double p = (double)(a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        double h  =  (2 * s / a);
        int pt = (int)Math.sqrt(c * c - h * h);
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        if (color) g.setColor(Color.MAGENTA);
        g.drawOval( x - 2 * aRadius , y - aRadius , 2 * aRadius , 2 * aRadius);
        if (color) g.setColor(Color.GREEN);
        g.drawOval( x, y - bRadius, 2 * bRadius , 2 * bRadius);
        if (color) g.setColor(Color.CYAN);
        g.drawOval( x - cRadius - aRadius + pt , y - cRadius + (int)h  , 2 * cRadius , 2 * cRadius);
    }
}
