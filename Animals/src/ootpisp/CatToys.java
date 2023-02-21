package ootpisp;

public class CatToys {
    private final int xCoord;
    private final int yCoord;

    public CatToys(int x, int y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    public void print() {
        System.out.println(xCoord + yCoord);
    }
}
