enum Status {
    RUNNING, FAILED, PENDING, SUCCESS;
}

public class EnumDemo {
    public static void main(String[] args) {
        Status s = Status.RUNNING;
        System.out.println(s);
    }
}
