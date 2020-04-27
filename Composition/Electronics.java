public class Electronics {
    private int tv;
    private int socket;
    private int laptop;
    private int decorder;

    public Electronics(int tv, int socket, int laptop, int decorder) {

        this.tv = tv;
        this.socket = socket;
        this.laptop = laptop;
        this.decorder = decorder;
    }

    public int getTv() {
        return tv;
    }

    public int getSocket() {
        return socket;
    }

    public int getLaptop() {
        return laptop;
    }

    public int getDecorder() {
        return decorder;
    }
    public void watchTV(){
        System.out.println("watching tv");
    }
}
