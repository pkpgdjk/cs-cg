from PIL import Image

line_count = 1
sub_method = 1
split_file = True


im = Image.open('co-3.png') # Can be many different formats.
pix = im.load()
width = im.size[0]
height = im.size[1]


f = open("java2.txt", "w")

for h in range(height):
    for w in range(width):
        if(pix[w,h][3] != 0):
            if(line_count == 1):
                f.write('public void sub_%d(Graphics g){\n'%sub_method)
                sub_method = sub_method + 1;
			
            f.write("    this.plot(g, x+%d, y+%d, new Color(%d,%d,%d,%d)); \n" % (w,h,pix[w,h][0],pix[w,h][1],pix[w,h][2],pix[w,h][3]))
            line_count = line_count + 1
            if(line_count == 1000):
                line_count = 1
                f.write("} \n")
f.write("} \n")
for sub in range(1,sub_method):
    print("this.sub_%d(g);"%sub)
