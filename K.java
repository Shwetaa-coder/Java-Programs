enum Direction {
    NORTH, WEST, SOUTH, EAST;

    void dis() {
        System.out.println("direction is ");
    }
}

public class K {
    public static void main(String[] args) {
        Direction.WEST.dis();
    }
}
