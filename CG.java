import java.awt.*;
import javax.swing.*;

public class CG extends JPanel {
    private Graphics graphics;

    // Color
    private Color BG_COLOR = new Color(81,180,159);
    private Color TEXT_COLOR = new Color(252,246,230);
    private Color ICE_CREAM_1 = new Color(252,246,230);
    private Color ICE_CREAM_2 = new Color(249,234,201);
    private Color ICE_CREAM_3 = new Color(230,217,185);
    private Color ICE_CREAM_4 = new Color(232,182,131);
    private Color ICE_CREAM_5 = new Color(227,168,98);
    private Color SHADOW = new Color(76,168,148);

    // Shadow Offset
    private int offset_w = 7;
    private int offset_h = 5;



    public static void main(String[] args) {
        CG m = new CG();

        JFrame f=new JFrame();
        f.add(m);
        f.setTitle("First Swing");
        f.setSize(620,650);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        this.graphics = g;
        draw_background();
        draw_600502(122+offset_w, 43  + offset_h,  SHADOW);
        draw_600502(121+offset_w, 139 + offset_h,  SHADOW);

        draw_600502(122,43,TEXT_COLOR);
        draw_600502(121,139,TEXT_COLOR);
        draw_39();
        draw_82();
        draw_ice_cream();
    }

    private void draw_600502(int w,int h,Color c){
        //122,43
        // number 6
        draw_rect(w+0, h+0, w+37, h+75, c);
        draw_rect(w+15, h+15, w+37, h+29, BG_COLOR);
        draw_rect(w+15, h+45, w+22, h+59, BG_COLOR);

        // number 0
        draw_rect(w+46, h, w+82, h+74, c);
        draw_rect(w+61, h+15, w+67, h+59, BG_COLOR);

        // number 0
        draw_rect(w+90, h, w+127, h+74, c);
        draw_rect(w+106, h+15, w+112, h+59, BG_COLOR);

        // number 5
        draw_rect(w+135, h, w+172, h+74, c);
        draw_rect(w+151, h+15, w+172, h+29, BG_COLOR);
        draw_rect(w+135, h+45, w+157, h+59, BG_COLOR);

        // number 0
        draw_rect(w+180, h, w+217, h+74, c);
        draw_rect(w+196, h+15, w+202, h+59, BG_COLOR);

        // number 2
        draw_rect(w+225, h, w+262, h+74, c);
        draw_rect(w+225, h+15, w+247, h+29, BG_COLOR);
        draw_rect(w+241, h+45, w+262, h+59, BG_COLOR);

    }

    private void draw_39(){
        /// For draw shadow
        // number 3
        draw_rect(392+offset_w, 43+offset_h, 429+offset_w, 117+offset_h, SHADOW);
        draw_rect(392+offset_w, 58+offset_h, 414+offset_w, 72+offset_h, BG_COLOR);
        draw_rect(392+offset_w, 88+offset_h, 414+offset_w, 102+offset_h, BG_COLOR);

        // number 9
        draw_rect(437+offset_w, 43+offset_h, 474+offset_w, 117+offset_h, SHADOW);
        draw_rect(452+offset_w, 58+offset_h, 459+offset_w, 72+offset_h, BG_COLOR);
        draw_rect(437+offset_w, 88+offset_h, 459+offset_w, 102+offset_h, BG_COLOR);



        /// For draw the number
        // number 3
        draw_rect(392, 43, 429, 117, TEXT_COLOR);
        draw_rect(392, 58, 414, 72, BG_COLOR);
        draw_rect(392,88, 414, 102, BG_COLOR);

        // number 9
        draw_rect(437, 43, 474, 117, TEXT_COLOR);
        draw_rect(452, 58, 459, 72, BG_COLOR);
        draw_rect(437,88, 459, 102, BG_COLOR);


        
    }

    private void draw_82(){
        /// For draw shadow
         // number 8
         draw_rect(391+offset_w, 139+offset_h, 428+offset_w, 213+offset_h, SHADOW);
         draw_rect(406+offset_w, 154+offset_h, 413+offset_w, 168+offset_h, BG_COLOR);
         draw_rect(406+offset_w, 184+offset_h, 413+offset_w, 198+offset_h, BG_COLOR);
 
         // number 2
         draw_rect(436+offset_w, 139+offset_h, 473+offset_w, 213+offset_h, SHADOW);
         draw_rect(436+offset_w, 154+offset_h, 458+offset_w, 168+offset_h, BG_COLOR);
         draw_rect(452+offset_w, 184+offset_h, 473+offset_w, 198+offset_h, BG_COLOR);



        /// For draw the number
        // number 8
        draw_rect(391, 139, 428, 213, TEXT_COLOR);
        draw_rect(406, 154, 413, 168, BG_COLOR);
        draw_rect(406,184, 413, 198, BG_COLOR);

        // number 2
        draw_rect(436, 139, 473, 213, TEXT_COLOR);
        draw_rect(436, 154, 458, 168, BG_COLOR);
        draw_rect(452,184, 473, 198, BG_COLOR);
    }
    private void draw_ice_cream(){
        // For draw shadow
        
        //cream shadow
        draw_rect(294+offset_w, 366+offset_h, 304+offset_w, 377+offset_h, SHADOW);
        draw_rect(282+offset_w, 378+offset_h, 316+offset_w, 390+offset_h, SHADOW);
        draw_rect(270+offset_w, 391+offset_h, 328+offset_w, 401+offset_h, SHADOW);
        draw_rect(257+offset_w, 402+offset_h, 341+offset_w, 426+offset_h, SHADOW);
        draw_rect(245+offset_w, 427+offset_h, 353+offset_w, 449+offset_h, SHADOW);
        draw_rect(258+offset_w, 450+offset_h, 341+offset_w, 464+offset_h, SHADOW);
        draw_rect(294+offset_w, 366+offset_h, 304+offset_w, 377+offset_h, SHADOW);
        draw_rect(245+offset_w, 464+offset_h, 353+offset_w, 487+offset_h, SHADOW);

        //handle shadow
        draw_rect(245+offset_w, 488+offset_h, 353+offset_w, 523+offset_h, SHADOW);
        draw_rect(257+offset_w, 524+offset_h, 342+offset_w, 536+offset_h, SHADOW);
        draw_rect(270+offset_w, 537+offset_h, 330+offset_w, 572+offset_h, SHADOW);




        // draw cream
        draw_rect(294, 366, 304, 377, ICE_CREAM_1);
        draw_rect(282, 378, 316, 390, ICE_CREAM_1);
        draw_rect(270, 391, 328, 401, ICE_CREAM_1);
        draw_rect(257, 402, 341, 426, ICE_CREAM_1);
        draw_rect(245, 427, 353, 449, ICE_CREAM_1);
        draw_rect(258, 450, 341, 464, ICE_CREAM_1);
        draw_rect(294, 366, 304, 377, ICE_CREAM_1);
        draw_rect(245, 464, 353, 487, ICE_CREAM_1);

        // draw cream 2
        draw_rect(257, 414, 268, 425, ICE_CREAM_2);
        draw_rect(268, 426, 293, 439, ICE_CREAM_2);
        draw_rect(269, 463, 292, 475, ICE_CREAM_2);

        // draw cream 3
        draw_rect(318, 391, 328, 401, ICE_CREAM_3);
        draw_rect(293, 402, 317, 413, ICE_CREAM_3);
        draw_rect(330, 414, 341, 426, ICE_CREAM_3);
        draw_rect(305, 426, 330, 438, ICE_CREAM_3);
        draw_rect(293, 463, 329, 475, ICE_CREAM_3);
        draw_rect(330, 451, 341, 463, ICE_CREAM_3);


        // draw handle
        draw_rect(245, 488, 353, 523, ICE_CREAM_4);
        draw_rect(257, 524, 342, 536, ICE_CREAM_4);
        draw_rect(270, 537, 330, 572, ICE_CREAM_4);

        // draw handle 2
        draw_rect(257, 501, 269, 512, ICE_CREAM_5);
        draw_rect(282, 501, 293, 512, ICE_CREAM_5);
        draw_rect(307, 501, 318, 512, ICE_CREAM_5);
        draw_rect(331, 501, 343,512, ICE_CREAM_5);

        draw_rect(246, 513, 246+11, 513+11, ICE_CREAM_5);
        draw_rect(270, 513, 281, 536, ICE_CREAM_5);
        draw_rect(294, 513, 306, 536, ICE_CREAM_5);
        draw_rect(319, 513, 330, 536, ICE_CREAM_5);
        draw_rect(343, 513, 353, 523, ICE_CREAM_5);
        
        
    }

    private void draw_background(){
        for(int i=0;i<=600;i++){
            line(0, i, 600, i, BG_COLOR);
        }
    }

    private void plot(int x, int y,Color c){
        graphics.setColor(c);
        graphics.fillRect(x, y, 1, 1);
        graphics.setColor(Color.BLACK);
    }

    private void draw_rect(int w1,int h1,int w2,int h2,Color c){
        for(int i=h1;i<=h2;i++){
            line(w1, i, w2, i, c);
        }
    }
	
	private void line(int srcX,int srcY,int destX,int destY,Color c){
		graphics.setColor(c);
		graphics.drawLine(srcX, srcY, destX, destY);
		graphics.setColor(Color.BLACK);
    }
    

}