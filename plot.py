from PIL import Image

line_count = 1
sub_method = 1
split_file = True


im = Image.open('bg.jpg') # Can be many different formats.
pix = im.load()
width = im.size[0]
height = im.size[1]

count_pix = 0
last_color = (255,255,255)
start_pix_w = 0
start_pix_h = 0

f = open("java2.txt", "w")

for h in range(486):
    for w in range(730):
        #if(pix[w,h] != (255,255,255)):

        if w == 729:
            #print(count_pix,last_color,h)
            if last_color != (255,255,255) :
                if(line_count == 1):
                    f.write('public void sub_%d(Graphics g){\n'%sub_method)
                    sub_method = sub_method + 1;

                if(count_pix >1 ):
                    f.write("    this.line(g, %d, %d, %d, %d, new Color(%d,%d,%d)); \n " % (start_pix_w,start_pix_h,w-1,h,    last_color[0],last_color[1],last_color[2]))
                else:
                    f.write("    this.plot(g, %d, %d, new Color(%d,%d,%d)); \n" % (w-1,h,last_color[0],last_color[1],last_color[2]))
                line_count = line_count + 1

                if(line_count == 1000):
                    line_count = 1
                    f.write("} \n")

            start_pix_w = 0
            start_pix_h = h+1

            
        
        pixel = pix[w,h]
        if(last_color != pix[w,h]):

            if last_color != (255,255,255) :
                if(line_count == 1):
                    f.write('public void sub_%d(Graphics g){\n'%sub_method)
                    sub_method = sub_method + 1;

                if(count_pix >1 ):
                    f.write("    this.line(g, %d, %d, %d, %d, new Color(%d,%d,%d)); \n " % (start_pix_w,start_pix_h,w-1,h,    last_color[0],last_color[1],last_color[2]))
                else:
                    f.write("    this.plot(g, %d, %d, new Color(%d,%d,%d)); \n" % (w-1,h,last_color[0],last_color[1],last_color[2]))
                line_count = line_count + 1

                if(line_count == 1000):
                    line_count = 1
                    f.write("} \n")
            
            start_pix_w = w
            start_pix_h = h
            last_color = pix[w,h]
            count_pix = 1


        else:
            count_pix = count_pix + 1

f.write("} \n")
for sub in range(1,sub_method):
    print("this.sub_%d(g);"%sub)
            
