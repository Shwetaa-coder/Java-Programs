class Students implements Comparable<Students> {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Students s) {
        return this.id - s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Students[] s = {
                new Students(3, "Ram"),
                new Students(1, "Riya"),
                new Students(2, "Roy")
        };
        java.util.Arrays.sort(s);
        for (Students x : s)
            System.out.println(x);
    }
}
