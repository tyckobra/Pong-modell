public class Ball {
    private int x = 6;
    private int y = 8;
    private int vx;
    private int vy;
    private int -vx;
    private int -vy;

    //Bollen
    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        this.vx = 0;
        this.vy = 0;
    }
//Hastighet och riktning
    public void move() {
        vx = 1;
        -vx = -1;
        vy = 0,5;
        -vy = -0,5;
    }

    public void bouncePaddle(int p1, int p2) {
        p1 = move(vx);
        p2 = move(-vx);
    }

    public void bounce() {
        //när spelarna studsar bollen
        if bouncePaddle(p1.Ball) {
            move(vx);
        }
        if bouncePaddle(p2.Ball) {
            move(-vx);
        }
    }
}
