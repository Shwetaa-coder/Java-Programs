enum Day {
    // MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    JANUARY, FEBRURAY, MARCH, APRIL, MAY, JUNE;
}

class S {
    public static void main(String[] args) {
        Day[] d = Day.values();
        for (Day days : d)
            System.out.println(days);
    }
}
