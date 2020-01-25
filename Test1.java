import java.awt.*;
import javax.swing.*;

public class Test1 extends JPanel  {
    private static Graphics g;
    public static void main(String[] args) {
        Test1 m = new Test1();


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
        int x1=0;
        int y1=0;
        int R=0;

        naiveLine(0,0,500,500);

        g.setColor(new Color(200,23,43));
        int r=150;
int d=(5/4)*r;
int x=0;
int y=r;
do
{
g.setColor(Color.red);
g.drawLine(y+200,x+200,y+200,x+200 );
g.drawLine(x+200,y+200,x+200,y+200);
g.drawLine(x+200,-y+200,x+200,-y+200);
g.drawLine(y+200,-x+200,y+200,-x+200 );
g.drawLine(-y+200,-x+200,-y+200,-x+200 );
g.drawLine(-x+200,-y+200,-x+200,-y+200 );
g.drawLine(-x+200,y+200,-x+200,y+200 );
g.drawLine(-y+200,x+200,-y+200,x+200 );


if(d<0)
{
d=d+2*x+3;
}
else
{
d=d+2*(x-y)+5;                         
y=y-1;              
}
x=x+1;
}
while (x<y);
      
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
        Test1.g.drawRect(x, y, 1, 1);
    }
}