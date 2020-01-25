import java.awt.*;
import javax.swing.*;

public class Assignment2_60050239 extends JPanel{
    private Graphics g;
    
    /// Define Color 
    private Color BG = new Color(233,232,231);
    private Color BROWN = new Color(114,100,91);
    private Color SHADOW = new Color(214,212,211);
    //////////////////

    /// shadow offset
    private int y_offset = 5;
    
    public static void main(String[] args) {
        Assignment2_60050239 m = new Assignment2_60050239();

        JFrame f=new JFrame();
        f.add(m);
        f.setTitle("Assignment2_60050239");
        f.setSize(615,645);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        this.g = g;
        draw_bg();
        _60050239();
    }

    public void _60050239(){
        draw_triangle(461, 153+y_offset, 469, 144+y_offset, 467, 70+y_offset, SHADOW);
        draw_triangle(459, 162+y_offset, 465, 169+y_offset, 467, 151+y_offset, SHADOW);
        draw_triangle(459, 162+y_offset, 465, 169+y_offset, 459, 182+y_offset, SHADOW);
        draw_triangle(456, 170+y_offset, 454, 193+y_offset, 442, 218+y_offset, SHADOW);
        draw_triangle(442, 218+y_offset, 434, 208+y_offset, 456, 170+y_offset, SHADOW);
        draw_triangle(441, 219+y_offset, 433, 209+y_offset, 397, 219+y_offset, SHADOW);
        draw_triangle(430, 206+y_offset, 404, 212+y_offset, 422, 194+y_offset, SHADOW);
        draw_triangle(432, 204+y_offset, 439, 194+y_offset, 406, 161+y_offset, SHADOW);
        draw_triangle(427, 176+y_offset, 435, 184+y_offset, 448, 149+y_offset, SHADOW);
        draw_triangle(438, 155+y_offset, 452, 140+y_offset, 450, 116+y_offset, SHADOW);
        draw_triangle(440, 138+y_offset, 452, 106+y_offset, 443, 72+y_offset, SHADOW);
        draw_triangle(408, 172+y_offset, 395, 148+y_offset, 367, 134+y_offset, SHADOW);
        
        draw_triangle(461, 153, 469, 144, 467, 70, BROWN);
        draw_triangle(459, 162, 465, 169, 467, 151, BROWN);
        draw_triangle(459, 162, 465, 169, 459, 182, BROWN);
        draw_triangle(456, 170, 454, 193, 442, 218, BROWN);
        draw_triangle(442, 218, 434, 208, 456, 170, BROWN);
        draw_triangle(441, 219, 433, 209, 397, 219, BROWN);
        draw_triangle(430, 206, 404, 212, 422, 194, BROWN);
        draw_triangle(432, 204, 439, 194, 406, 161, BROWN);
        draw_triangle(427, 176, 435, 184, 448, 149, BROWN);
        draw_triangle(438, 155, 452, 140, 450, 116, BROWN);
        draw_triangle(440, 138, 452, 106, 443, 72, BROWN);
        draw_triangle(408, 172, 395, 148, 367, 134, BROWN);
        draw_triangle(428, 224, 384, 224, 372, 239, BROWN);
        draw_triangle(382, 224, 369, 240, 348, 234, BROWN);
        draw_triangle(369, 241, 346, 235, 348, 260, BROWN);
        draw_triangle(353, 227, 346, 223, 346, 230, BROWN);
        draw_triangle(356, 227, 345, 220, 358, 181, BROWN);
        draw_triangle(360, 176, 367, 178, 359 ,219, BROWN);
        draw_triangle(360, 172, 367, 173, 357, 152, BROWN);
        draw_triangle(344, 271, 341, 227, 321, 263, BROWN);
        draw_triangle(342, 274, 323, 268, 331, 280, BROWN);
        draw_triangle(327, 283, 319, 268, 312, 296, BROWN);
        draw_triangle(317, 268, 307, 268, 311, 294, BROWN);
        draw_triangle(329, 287, 336, 298, 316, 298, BROWN);
        draw_triangle(344, 278, 332, 285, 342, 302, BROWN);
        draw_triangle(324, 304, 314, 304, 320, 308, BROWN);
        draw_triangle(336, 304, 323, 310, 331, 318, BROWN);
        draw_triangle(338, 303, 333, 317, 341, 309, BROWN);
        draw_triangle(343, 313, 343, 330, 334, 321, BROWN);
        draw_triangle(329, 322, 318, 349, 311, 305, BROWN);
        draw_triangle(342, 335, 332, 324, 322, 354, BROWN);
        draw_triangle(341, 338, 320, 356, 329, 365, BROWN);
        draw_triangle(341, 341, 330, 364, 340, 358, BROWN);
        draw_triangle(320, 362, 320, 375, 326, 368, BROWN);
        draw_triangle(340, 363, 330, 370, 347, 422, BROWN);
        draw_triangle(347, 433, 319, 380, 327, 372, BROWN);
        draw_triangle(310, 318, 308, 354, 315, 354, BROWN);
        draw_triangle(315, 359, 311, 363, 309, 357, BROWN);
        draw_triangle(316, 369, 310, 366, 316, 361, BROWN); 
        draw_triangle(315, 371, 315, 377, 310, 371, BROWN);
        draw_triangle(314, 378, 309, 374, 303, 382, BROWN);
        draw_triangle(305, 358, 302, 360, 307, 366, BROWN);
        draw_triangle(308, 370, 302, 361, 302, 382, BROWN);
        draw_triangle(315, 381, 301, 387, 306, 391, BROWN);
        draw_triangle(304, 391, 300, 388, 300, 391, BROWN);
        draw_triangle(315, 385, 308, 393, 315, 491, BROWN);
        draw_triangle(308, 393, 301, 393, 315, 491, BROWN);
        

        
    }

    public void draw_bg(){
        this.draw_triangle(0, 0, 599, 0, 0, 599, BG);
        this.draw_triangle(599, 599, 599, 0, 0, 599, BG);
    }

    private void draw_triangle(int x1,int y1,int x2,int y2,int x3,int y3,Color c){
        this.g.setColor(c);
        int[] x = {x1,x2,x3};
        int[] y = {y1,y2,y3};
        int n = 3;
        Polygon p = new Polygon(x, y, n);

        this.g.fillPolygon(p);
    }

    private void draw_circle(int x,int y,int r,Color c){
        this.g.setColor(c);
        x = x-(r/2);
        y = y-(r/2);
        g.fillOval(x,y,r,r);
    }
}