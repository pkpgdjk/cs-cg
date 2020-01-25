import java.awt.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class Lab1 extends JPanel  {
    private static Graphics g;
    public static void main(String[] args) {
        Lab1 m = new Lab1();


       JFrame f = new JFrame();
       f.add(m);
       f.setTitle("CG");
       f.setSize(600,600);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);

    }

    @Override
    public void paintComponent(Graphics g){
        this.g = g;
        bresenhemLine(100, 100, 400, 200);
        bresenhemLine(400, 200, 100, 100);
        bresenhemLine(100, 100, 200, 400);
        plot(100, 100);
    }
    
    public static void naiveLine(int x1,int y1,int x2,int y2){
        g.setColor(Color.red);
        if(y2<y1){
            int tmp = x2;
            x2 = x1;
            x1 = tmp;

            tmp = y2;
            y2 = y1;
            y1 = tmp;
        }

        double dx = x2 - x1;
        double dy = y2 - y1;
        double b = (y1 - (dy/dx) * x1);
        for(int x = x1;x<=x2;x++){
            double y = ((dy/dx) * x + b);
            plot(x,(int) Math.round(y));
        }
    }

    public static void DDALine(int x1,int y1,int x2,int y2){
        g.setColor(Color.blue);
        if(y2<y1){
            int tmp = x2;
            x2 = x1;
            x1 = tmp;

            tmp = y2;
            y2 = y1;
            y1 = tmp;
        }

        double dx = x2 - x1;
        double dy = y2 - y1;

        double y = y1;
        double x = x1;
        double m = dy / dx;

        if(m<= 1 && m >=0){
            for(int xx = x1;xx<=x2;xx++){
                y =   (y + m);
                plot(xx,(int) Math.round(y));
            }
        }else if(m>=-1){
            for(int xx = x2;xx<=x1;xx++){
                y =   (y + m);
                plot(xx, (int) Math.round(y));
            }
        }else if(m > 1){
            for(int yy = y1;yy<=y2;yy++){
                x =   (x + 1/m);
                plot((int) Math.round(x), yy);
            }
        }else{
             for(int yy = y2;yy<=y1;yy++){
                x =   (int) Math.round(x + 1/m);
                plot((int) Math.round(x), yy);
            }
        }
    }

    public static void bresenhemLine(int x1,int y1,int x2,int y2){
        g.setColor(Color.green);
        if(y2<y1){
            int tmp = x2;
            x2 = x1;
            x1 = tmp;

            tmp = y2;
            y2 = y1;
            y1 = tmp;
        }
        
        double dx = x2 - x1;
        double dy = y2 - y1;
        double D = 2 * dy - dx;
        

        if(y2>x2){
            int x = x1;
            for(int y=y1;y<=y2;y++){
                plot(x, y);
                if(D>=0){
                    x = x+1;
                    D = D - 2 * dy;
                }
                D = D + 2 * dx;
            }
        }else{
            int y = y1;
            for(int x=x1;x<=x2;x++){
                plot(x, y);
                if(D>=0){
                    y = y+1;
                    D = D - 2 * dx;
                }
                D = D + 2 * dy;
            }
        }
        
    }

    public static void plot(int x,int y){
        Lab1.g.drawRect(x, y, 1, 1);
    }
}