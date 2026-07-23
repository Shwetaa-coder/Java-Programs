enum Pizza {
    SMALL, MEDIUM, LARGE;
}

class E {
    public static void main(String[] args) {
        Pizza p = Pizza.SMALL;
        switch (p) {
            case SMALL:
                System.out.println("small");
                break;
            case MEDIUM:
                System.out.println("medium");
                break;
            case LARGE:
                System.out.println("large");
                break;

        }
    }
}
