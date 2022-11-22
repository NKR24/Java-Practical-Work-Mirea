public abstract class Shape {
    protected int color;
    protected int posx;
    protected int posy;
    protected int h, w;
    protected int ra;

    public Shape() {
        this.color = (int)(Math.random() * 0x1000000);
        this.posx = (int)(Math.random()*472);
        this.posy = (int)(Math.random()*472);
        this.h = (int)(Math.random()*102);
        this.w = (int)(Math.random()*112);
        this.ra = (int)(Math.random()*4);


    }

    public Shape(int color, int posx, int posy, int h, int w, int ra) {
        this.color = color;
        this.posx = posx;
        this.posy = posy;
        this.h = h;
        this.w = w;
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public int getColor() {
        return color;
    }



    public int getPosx() {
        return posx;
    }



    public int getPosy() {
        return posy;
    }


}