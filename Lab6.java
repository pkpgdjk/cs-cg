
import java.awt.*;
import javax.swing.*;

public class Lab6 extends JPanel implements Runnable{
    private Graphics g;
    

    double circleMove = 0;

    public static void main(String[] args) {
        Lab6 m = new Lab6();

        JFrame f=new JFrame();
        f.add(m);
        f.setTitle("First Swing");
        f.setSize(615,645);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBackground(Color.WHITE);
        f.setVisible(true);

        (new Thread(m)).start();
    }


    @Override
    public void run() {
        double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime;
        double startTime = System.currentTimeMillis();

        


        while (true){
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;


            //TODO: update logics
            circleMove += 50.0 * elapsedTime / 1000.0;


            //Display
            repaint();
            lastTime = currentTime;


            //take a little nap: 60fps
            try{
                Thread.sleep(1000/60);
            }
            catch (InterruptedException e){
                System.err.println(e);
            }
        }
    }


    @Override
    public void paintComponent(Graphics g){
        this.g = g;

        Graphics2D g2 = (Graphics2D) g;
        g2.translate(circleMove, 0);
        g.drawOval(0, 0, 100, 100);
    }

}