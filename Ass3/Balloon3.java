import java.awt.*;
import javax.swing.*;

class Balloon3 extends Animation{

    long last = System.currentTimeMillis();
    Balloon3(int x,int y){
        this.x = x;
        this.y = y;

    }

    public void update(){
        long now = System.currentTimeMillis();
        if(now - last > 600){
            this.y -= 1;
            last = System.currentTimeMillis();
        }
    }

    public void display(Graphics g){
        this.sub_1(g);
    }

    public void sub_1(Graphics g){
        this.plot(g, x+4, y+0, new Color(201,182,174,1)); 
        this.plot(g, x+5, y+0, new Color(156,90,46,170)); 
        this.plot(g, x+6, y+0, new Color(115,58,27,149)); 
        this.plot(g, x+7, y+0, new Color(130,88,67,15)); 
        this.plot(g, x+4, y+1, new Color(211,146,96,63)); 
        this.plot(g, x+5, y+1, new Color(137,54,0,255)); 
        this.plot(g, x+6, y+1, new Color(119,46,5,255)); 
        this.plot(g, x+7, y+1, new Color(121,52,12,253)); 
        this.plot(g, x+8, y+1, new Color(126,73,43,111)); 
        this.plot(g, x+9, y+1, new Color(147,115,100,7)); 
        this.plot(g, x+3, y+2, new Color(232,182,134,3)); 
        this.plot(g, x+4, y+2, new Color(204,111,29,222)); 
        this.plot(g, x+5, y+2, new Color(130,53,7,255)); 
        this.plot(g, x+6, y+2, new Color(129,54,12,255)); 
        this.plot(g, x+7, y+2, new Color(132,56,11,255)); 
        this.plot(g, x+8, y+2, new Color(126,51,6,255)); 
        this.plot(g, x+9, y+2, new Color(125,59,22,220)); 
        this.plot(g, x+10, y+2, new Color(137,85,58,85)); 
        this.plot(g, x+11, y+2, new Color(139,95,73,24)); 
        this.plot(g, x+3, y+3, new Color(234,160,80,71)); 
        this.plot(g, x+4, y+3, new Color(182,84,7,255)); 
        this.plot(g, x+5, y+3, new Color(140,60,13,255)); 
        this.plot(g, x+6, y+3, new Color(139,60,13,255)); 
        this.plot(g, x+7, y+3, new Color(144,63,14,255)); 
        this.plot(g, x+8, y+3, new Color(144,64,15,255)); 
        this.plot(g, x+9, y+3, new Color(139,59,12,255)); 
        this.plot(g, x+10, y+3, new Color(132,53,7,255)); 
        this.plot(g, x+11, y+3, new Color(125,53,11,255)); 
        this.plot(g, x+12, y+3, new Color(123,60,27,173)); 
        this.plot(g, x+13, y+3, new Color(148,111,92,24)); 
        this.plot(g, x+2, y+4, new Color(227,180,136,3)); 
        this.plot(g, x+3, y+4, new Color(231,138,37,217)); 
        this.plot(g, x+4, y+4, new Color(185,87,15,255)); 
        this.plot(g, x+5, y+4, new Color(169,80,18,255)); 
        this.plot(g, x+6, y+4, new Color(160,73,17,255)); 
        this.plot(g, x+7, y+4, new Color(160,72,17,255)); 
        this.plot(g, x+8, y+4, new Color(159,72,18,255)); 
        this.plot(g, x+9, y+4, new Color(156,72,17,255)); 
        this.plot(g, x+10, y+4, new Color(151,69,17,255)); 
        this.plot(g, x+11, y+4, new Color(142,64,16,255)); 
        this.plot(g, x+12, y+4, new Color(130,54,8,255)); 
        this.plot(g, x+13, y+4, new Color(120,53,11,251)); 
        this.plot(g, x+14, y+4, new Color(137,96,73,68)); 
        this.plot(g, x+15, y+4, new Color(173,158,154,1)); 
        this.plot(g, x+2, y+5, new Color(223,161,100,51)); 
        this.plot(g, x+3, y+5, new Color(231,125,14,255)); 
        this.plot(g, x+4, y+5, new Color(204,105,23,255)); 
        this.plot(g, x+5, y+5, new Color(184,91,21,255)); 
        this.plot(g, x+6, y+5, new Color(174,83,19,255)); 
        this.plot(g, x+7, y+5, new Color(177,84,20,255)); 
        this.plot(g, x+8, y+5, new Color(176,84,20,255)); 
        this.plot(g, x+9, y+5, new Color(174,83,20,255)); 
        this.plot(g, x+10, y+5, new Color(170,81,20,255)); 
        this.plot(g, x+11, y+5, new Color(163,76,18,255)); 
        this.plot(g, x+12, y+5, new Color(152,70,18,255)); 
        this.plot(g, x+13, y+5, new Color(135,60,13,255)); 
        this.plot(g, x+14, y+5, new Color(112,47,7,255)); 
        this.plot(g, x+15, y+5, new Color(147,121,108,32)); 
        this.plot(g, x+2, y+6, new Color(226,153,62,149)); 
        this.plot(g, x+3, y+6, new Color(250,146,22,255)); 
        this.plot(g, x+4, y+6, new Color(215,115,26,255)); 
        this.plot(g, x+5, y+6, new Color(197,101,25,255)); 
        this.plot(g, x+6, y+6, new Color(194,98,24,255)); 
        this.plot(g, x+7, y+6, new Color(198,101,24,255)); 
        this.plot(g, x+8, y+6, new Color(198,100,25,255)); 
        this.plot(g, x+9, y+6, new Color(195,100,25,255)); 
        this.plot(g, x+10, y+6, new Color(191,96,25,255)); 
        this.plot(g, x+11, y+6, new Color(183,92,23,255)); 
        this.plot(g, x+12, y+6, new Color(172,83,21,255)); 
        this.plot(g, x+13, y+6, new Color(155,73,19,255)); 
        this.plot(g, x+14, y+6, new Color(132,58,12,255)); 
        this.plot(g, x+15, y+6, new Color(130,80,49,85)); 
        this.plot(g, x+1, y+7, new Color(204,162,139,2)); 
        this.plot(g, x+2, y+7, new Color(246,157,41,209)); 
        this.plot(g, x+3, y+7, new Color(251,153,31,255)); 
        this.plot(g, x+4, y+7, new Color(230,128,32,255)); 
        this.plot(g, x+5, y+7, new Color(216,116,29,255)); 
        this.plot(g, x+6, y+7, new Color(218,115,29,255)); 
        this.plot(g, x+7, y+7, new Color(222,116,30,255)); 
        this.plot(g, x+8, y+7, new Color(223,119,30,255)); 
        this.plot(g, x+9, y+7, new Color(222,119,31,255)); 
        this.plot(g, x+10, y+7, new Color(217,117,30,255)); 
        this.plot(g, x+11, y+7, new Color(208,111,29,255)); 
        this.plot(g, x+12, y+7, new Color(195,102,27,255)); 
        this.plot(g, x+13, y+7, new Color(177,89,23,255)); 
        this.plot(g, x+14, y+7, new Color(152,71,18,255)); 
        this.plot(g, x+15, y+7, new Color(129,59,17,126)); 
        this.plot(g, x+1, y+8, new Color(221,168,131,12)); 
        this.plot(g, x+2, y+8, new Color(254,166,37,253)); 
        this.plot(g, x+3, y+8, new Color(252,160,38,255)); 
        this.plot(g, x+4, y+8, new Color(241,140,38,255)); 
        this.plot(g, x+5, y+8, new Color(238,135,38,255)); 
        this.plot(g, x+6, y+8, new Color(242,137,37,255)); 
        this.plot(g, x+7, y+8, new Color(245,141,38,255)); 
        this.plot(g, x+8, y+8, new Color(245,140,39,255)); 
        this.plot(g, x+9, y+8, new Color(244,139,39,255)); 
        this.plot(g, x+10, y+8, new Color(244,139,39,255)); 
        this.plot(g, x+11, y+8, new Color(236,133,36,255)); 
        this.plot(g, x+12, y+8, new Color(224,124,34,255)); 
        this.plot(g, x+13, y+8, new Color(204,110,30,255)); 
        this.plot(g, x+14, y+8, new Color(175,88,23,255)); 
        this.plot(g, x+15, y+8, new Color(141,66,18,124)); 
        this.plot(g, x+1, y+9, new Color(233,163,89,42)); 
        this.plot(g, x+2, y+9, new Color(253,169,40,255)); 
        this.plot(g, x+3, y+9, new Color(251,169,48,255)); 
        this.plot(g, x+4, y+9, new Color(252,159,47,255)); 
        this.plot(g, x+5, y+9, new Color(255,158,47,255)); 
        this.plot(g, x+6, y+9, new Color(255,160,47,255)); 
        this.plot(g, x+7, y+9, new Color(255,162,48,255)); 
        this.plot(g, x+8, y+9, new Color(255,163,48,255)); 
        this.plot(g, x+9, y+9, new Color(254,163,50,255)); 
        this.plot(g, x+10, y+9, new Color(255,161,50,255)); 
        this.plot(g, x+11, y+9, new Color(253,156,47,255)); 
        this.plot(g, x+12, y+9, new Color(248,147,43,255)); 
        this.plot(g, x+13, y+9, new Color(234,134,39,255)); 
        this.plot(g, x+14, y+9, new Color(202,109,28,255)); 
        this.plot(g, x+15, y+9, new Color(166,91,38,107)); 
        this.plot(g, x+1, y+10, new Color(236,169,86,81)); 
        this.plot(g, x+2, y+10, new Color(255,184,49,255)); 
        this.plot(g, x+3, y+10, new Color(254,182,56,255)); 
        this.plot(g, x+4, y+10, new Color(253,174,56,255)); 
        this.plot(g, x+5, y+10, new Color(254,176,58,255)); 
        this.plot(g, x+6, y+10, new Color(254,178,59,255)); 
        this.plot(g, x+7, y+10, new Color(254,182,61,255)); 
        this.plot(g, x+8, y+10, new Color(254,184,62,255)); 
        this.plot(g, x+9, y+10, new Color(254,183,62,255)); 
        this.plot(g, x+10, y+10, new Color(254,182,62,255)); 
        this.plot(g, x+11, y+10, new Color(254,178,59,255)); 
        this.plot(g, x+12, y+10, new Color(255,170,55,255)); 
        this.plot(g, x+13, y+10, new Color(254,158,49,255)); 
        this.plot(g, x+14, y+10, new Color(230,131,36,255)); 
        this.plot(g, x+15, y+10, new Color(196,122,60,82)); 
        this.plot(g, x+1, y+11, new Color(241,177,85,127)); 
        this.plot(g, x+2, y+11, new Color(255,194,59,255)); 
        this.plot(g, x+3, y+11, new Color(254,190,64,255)); 
        this.plot(g, x+4, y+11, new Color(253,191,68,255)); 
        this.plot(g, x+5, y+11, new Color(254,194,71,255)); 
        this.plot(g, x+6, y+11, new Color(254,194,71,255)); 
        this.plot(g, x+7, y+11, new Color(254,206,77,255)); 
        this.plot(g, x+8, y+11, new Color(254,209,78,255)); 
        this.plot(g, x+9, y+11, new Color(254,208,79,255)); 
        this.plot(g, x+10, y+11, new Color(254,210,80,255)); 
        this.plot(g, x+11, y+11, new Color(254,203,77,255)); 
        this.plot(g, x+12, y+11, new Color(254,193,71,255)); 
        this.plot(g, x+13, y+11, new Color(255,180,62,255)); 
        this.plot(g, x+14, y+11, new Color(250,156,47,255)); 
        this.plot(g, x+15, y+11, new Color(220,142,70,68)); 
        this.plot(g, x+0, y+12, new Color(236,182,112,4)); 
        this.plot(g, x+1, y+12, new Color(248,189,80,175)); 
        this.plot(g, x+2, y+12, new Color(255,201,70,255)); 
        this.plot(g, x+3, y+12, new Color(253,191,69,255)); 
        this.plot(g, x+4, y+12, new Color(253,210,83,255)); 
        this.plot(g, x+5, y+12, new Color(254,207,79,255)); 
        this.plot(g, x+6, y+12, new Color(254,221,88,255)); 
        this.plot(g, x+7, y+12, new Color(254,238,99,255)); 
        this.plot(g, x+8, y+12, new Color(254,241,101,255)); 
        this.plot(g, x+9, y+12, new Color(255,247,107,255)); 
        this.plot(g, x+10, y+12, new Color(254,245,104,255)); 
        this.plot(g, x+11, y+12, new Color(254,236,99,255)); 
        this.plot(g, x+12, y+12, new Color(254,220,89,255)); 
        this.plot(g, x+13, y+12, new Color(254,203,78,255)); 
        this.plot(g, x+14, y+12, new Color(254,181,63,255)); 
        this.plot(g, x+15, y+12, new Color(237,160,82,60)); 
        this.plot(g, x+0, y+13, new Color(241,187,120,10)); 
        this.plot(g, x+1, y+13, new Color(252,202,81,215)); 
        this.plot(g, x+2, y+13, new Color(254,205,79,255)); 
        this.plot(g, x+3, y+13, new Color(253,204,81,255)); 
        this.plot(g, x+4, y+13, new Color(253,234,102,255)); 
        this.plot(g, x+5, y+13, new Color(254,233,97,255)); 
        this.plot(g, x+6, y+13, new Color(254,252,122,255)); 
        this.plot(g, x+7, y+13, new Color(255,255,130,255)); 
        this.plot(g, x+8, y+13, new Color(255,255,139,255)); 
        this.plot(g, x+9, y+13, new Color(255,255,151,255)); 
        this.plot(g, x+10, y+13, new Color(255,255,144,255)); 
        this.plot(g, x+11, y+13, new Color(255,255,130,255)); 
        this.plot(g, x+12, y+13, new Color(254,249,113,255)); 
        this.plot(g, x+13, y+13, new Color(254,229,98,255)); 
        this.plot(g, x+14, y+13, new Color(254,204,80,255)); 
        this.plot(g, x+15, y+13, new Color(240,183,98,54)); 
        this.plot(g, x+0, y+14, new Color(239,189,127,21)); 
        this.plot(g, x+1, y+14, new Color(253,204,83,247)); 
        this.plot(g, x+2, y+14, new Color(254,211,86,255)); 
        this.plot(g, x+3, y+14, new Color(254,232,104,255)); 
        this.plot(g, x+4, y+14, new Color(254,255,124,255)); 
        this.plot(g, x+5, y+14, new Color(255,255,140,255)); 
        this.plot(g, x+6, y+14, new Color(255,255,170,255)); 
        this.plot(g, x+7, y+14, new Color(255,255,187,255)); 
        this.plot(g, x+8, y+14, new Color(255,255,220,255)); 
        this.plot(g, x+9, y+14, new Color(254,255,227,255)); 
        this.plot(g, x+10, y+14, new Color(254,255,204,255)); 
        this.plot(g, x+11, y+14, new Color(254,255,167,255)); 
        this.plot(g, x+12, y+14, new Color(255,255,141,255)); 
        this.plot(g, x+13, y+14, new Color(255,251,119,255)); 
        this.plot(g, x+14, y+14, new Color(254,228,98,255)); 
        this.plot(g, x+15, y+14, new Color(249,202,96,49)); 
        this.plot(g, x+0, y+15, new Color(243,199,124,38)); 
        this.plot(g, x+1, y+15, new Color(254,219,97,255)); 
        this.plot(g, x+2, y+15, new Color(252,234,109,255)); 
        this.plot(g, x+3, y+15, new Color(247,232,111,255)); 
        this.plot(g, x+4, y+15, new Color(246,222,115,255)); 
        this.plot(g, x+5, y+15, new Color(244,212,119,255)); 
        this.plot(g, x+6, y+15, new Color(246,213,135,255)); 
        this.plot(g, x+7, y+15, new Color(250,229,174,255)); 
        this.plot(g, x+8, y+15, new Color(251,244,218,255)); 
        this.plot(g, x+9, y+15, new Color(253,248,239,255)); 
        this.plot(g, x+10, y+15, new Color(253,251,245,255)); 
        this.plot(g, x+11, y+15, new Color(254,255,235,255)); 
        this.plot(g, x+12, y+15, new Color(255,255,186,255)); 
        this.plot(g, x+13, y+15, new Color(255,255,146,255)); 
        this.plot(g, x+14, y+15, new Color(254,246,115,255)); 
        this.plot(g, x+15, y+15, new Color(244,209,113,47)); 
        this.plot(g, x+0, y+16, new Color(250,207,126,52)); 
        this.plot(g, x+1, y+16, new Color(247,209,94,255)); 
        this.plot(g, x+2, y+16, new Color(245,176,62,255)); 
        this.plot(g, x+3, y+16, new Color(247,151,42,255)); 
        this.plot(g, x+4, y+16, new Color(250,145,35,255)); 
        this.plot(g, x+5, y+16, new Color(251,155,37,255)); 
        this.plot(g, x+6, y+16, new Color(252,175,47,255)); 
        this.plot(g, x+7, y+16, new Color(252,217,70,255)); 
        this.plot(g, x+8, y+16, new Color(252,248,169,255)); 
        this.plot(g, x+9, y+16, new Color(253,249,240,255)); 
        this.plot(g, x+10, y+16, new Color(251,237,170,255)); 
        this.plot(g, x+11, y+16, new Color(248,217,148,255)); 
        this.plot(g, x+12, y+16, new Color(249,234,193,255)); 
        this.plot(g, x+13, y+16, new Color(254,255,178,255)); 
        this.plot(g, x+14, y+16, new Color(255,255,132,255)); 
        this.plot(g, x+15, y+16, new Color(243,211,123,40)); 
        this.plot(g, x+0, y+17, new Color(233,195,125,54)); 
        this.plot(g, x+1, y+17, new Color(248,187,67,255)); 
        this.plot(g, x+2, y+17, new Color(255,165,45,255)); 
        this.plot(g, x+3, y+17, new Color(255,161,42,255)); 
        this.plot(g, x+4, y+17, new Color(255,163,42,255)); 
        this.plot(g, x+5, y+17, new Color(254,167,46,255)); 
        this.plot(g, x+6, y+17, new Color(254,181,49,255)); 
        this.plot(g, x+7, y+17, new Color(254,234,151,255)); 
        this.plot(g, x+8, y+17, new Color(255,255,254,255)); 
        this.plot(g, x+9, y+17, new Color(255,255,255,255)); 
        this.plot(g, x+10, y+17, new Color(254,255,187,255)); 
        this.plot(g, x+11, y+17, new Color(253,217,63,255)); 
        this.plot(g, x+12, y+17, new Color(249,184,64,255)); 
        this.plot(g, x+13, y+17, new Color(248,198,98,255)); 
        this.plot(g, x+14, y+17, new Color(251,237,131,255)); 
        this.plot(g, x+15, y+17, new Color(250,243,167,30)); 
        this.plot(g, x+0, y+18, new Color(250,217,105,116)); 
        this.plot(g, x+1, y+18, new Color(254,208,79,255)); 
        this.plot(g, x+2, y+18, new Color(253,187,65,255)); 
        this.plot(g, x+3, y+18, new Color(253,180,58,255)); 
        this.plot(g, x+4, y+18, new Color(254,177,53,255)); 
        this.plot(g, x+5, y+18, new Color(254,180,57,255)); 
        this.plot(g, x+6, y+18, new Color(254,194,59,255)); 
        this.plot(g, x+7, y+18, new Color(254,243,180,255)); 
        this.plot(g, x+8, y+18, new Color(255,255,255,255)); 
        this.plot(g, x+9, y+18, new Color(255,255,255,255)); 
        this.plot(g, x+10, y+18, new Color(254,254,155,255)); 
        this.plot(g, x+11, y+18, new Color(254,225,81,255)); 
        this.plot(g, x+12, y+18, new Color(255,201,69,255)); 
        this.plot(g, x+13, y+18, new Color(254,193,59,255)); 
        this.plot(g, x+14, y+18, new Color(246,187,72,253)); 
        this.plot(g, x+15, y+18, new Color(240,213,159,26)); 
        this.plot(g, x+0, y+19, new Color(251,221,129,67)); 
        this.plot(g, x+1, y+19, new Color(254,218,92,255)); 
        this.plot(g, x+2, y+19, new Color(254,206,79,255)); 
        this.plot(g, x+3, y+19, new Color(253,196,72,255)); 
        this.plot(g, x+4, y+19, new Color(254,191,66,255)); 
        this.plot(g, x+5, y+19, new Color(254,192,67,255)); 
        this.plot(g, x+6, y+19, new Color(254,205,71,255)); 
        this.plot(g, x+7, y+19, new Color(254,240,163,255)); 
        this.plot(g, x+8, y+19, new Color(254,245,210,255)); 
        this.plot(g, x+9, y+19, new Color(254,246,217,255)); 
        this.plot(g, x+10, y+19, new Color(254,249,129,255)); 
        this.plot(g, x+11, y+19, new Color(254,221,79,255)); 
        this.plot(g, x+12, y+19, new Color(254,209,78,255)); 
        this.plot(g, x+13, y+19, new Color(254,214,81,255)); 
        this.plot(g, x+14, y+19, new Color(253,226,88,255)); 
        this.plot(g, x+15, y+19, new Color(248,222,130,51)); 
        this.plot(g, x+1, y+20, new Color(245,206,118,77)); 
        this.plot(g, x+2, y+20, new Color(253,209,83,255)); 
        this.plot(g, x+3, y+20, new Color(255,211,81,255)); 
        this.plot(g, x+4, y+20, new Color(254,206,77,255)); 
        this.plot(g, x+5, y+20, new Color(254,202,74,255)); 
        this.plot(g, x+6, y+20, new Color(254,209,79,255)); 
        this.plot(g, x+7, y+20, new Color(252,214,116,255)); 
        this.plot(g, x+8, y+20, new Color(251,233,170,255)); 
        this.plot(g, x+9, y+20, new Color(252,222,150,255)); 
        this.plot(g, x+10, y+20, new Color(254,227,107,255)); 
        this.plot(g, x+11, y+20, new Color(254,219,83,255)); 
        this.plot(g, x+12, y+20, new Color(254,219,83,255)); 
        this.plot(g, x+13, y+20, new Color(254,227,87,255)); 
        this.plot(g, x+14, y+20, new Color(252,234,112,217)); 
        this.plot(g, x+15, y+20, new Color(249,233,161,18)); 
        this.plot(g, x+2, y+21, new Color(245,203,123,18)); 
        this.plot(g, x+3, y+21, new Color(244,199,99,121)); 
        this.plot(g, x+4, y+21, new Color(249,203,86,220)); 
        this.plot(g, x+5, y+21, new Color(252,204,80,255)); 
        this.plot(g, x+6, y+21, new Color(254,206,78,255)); 
        this.plot(g, x+7, y+21, new Color(254,209,80,255)); 
        this.plot(g, x+8, y+21, new Color(253,216,99,255)); 
        this.plot(g, x+9, y+21, new Color(254,213,89,255)); 
        this.plot(g, x+10, y+21, new Color(253,216,83,255)); 
        this.plot(g, x+11, y+21, new Color(253,219,87,255)); 
        this.plot(g, x+12, y+21, new Color(253,228,98,243)); 
        this.plot(g, x+13, y+21, new Color(251,226,101,142)); 
        this.plot(g, x+14, y+21, new Color(251,222,151,12)); 
    } 
    

    public void plot(Graphics g,int x,int y,Color c){
        g.setColor(c);
        g.fillRect(x, y, 1, 1);
    }
}