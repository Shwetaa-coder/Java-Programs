enum Status {
    RUNNING, FAILED, PENDING, SUCCESS;
}

public class EnumIfAndElse {
    public static void main(String[] args) {
        Status s = Status.RUNNING;
        if (s == Status.RUNNING) {
            System.out.println("All good");
        }
        if (s == Status.PENDING) {
            System.out.println("Please Wait...");
        }
        if (s == Status.SUCCESS) {
            System.out.println("Done");
        }
        if (s == Status.FAILED) {
            System.out.println("Try again");
        }
    }
}
