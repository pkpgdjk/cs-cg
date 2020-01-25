from PIL import Image

line_count = 1


im = Image.open('minion.jpg') # Can be many different formats.
pix = im.load()
width = im.size[0]
height = im.size[1]


f = open("java2.txt", "w")
f.write('Color[] pixs = {')

for h in range(height):
    for w in range(width):
        f.write("     new Color(%d,%d,%d), \n" % ( pix[w,h][0],pix[w,h][1],pix[w,h][2]) )
f.write("}; \n")

print("""
    int width = %d;
    inth height = %d;
    for(int i=0;i<height;i++){
        for(int j=0;i<width;j++){
            this.plot(pixs(j,i,pixs[(width*i)+j]));
        }

    }
""" % (width,height))
