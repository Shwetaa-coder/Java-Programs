enum Status {
    RUNNING, FAILED, PENDING, SUCCESS;
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Status[] statuses = Status.values();
        for (Status s : statuses)
            System.out.println(s + "at index " + s.ordinal());
    }
}
