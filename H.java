enum Season {
    WINTER, SPRING, RAINY, SUMMER;
}

class H {
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
