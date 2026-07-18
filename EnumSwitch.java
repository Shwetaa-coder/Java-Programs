enum Status {
    RUNNING, FAILED, PENDING, SUCCESS;
}

public class EnumSwitch {
    public static void main(String[] args) {
        Status s = Status.RUNNING;
        switch (s) {
            case RUNNING:
                System.out.println("All good");
                break;
            case PENDING:
                System.out.println("Please Wait...");
                break;
            case SUCCESS:
                System.out.println("Done");
                break;
            default:
                System.out.println("Try again");
        }
    }

}
