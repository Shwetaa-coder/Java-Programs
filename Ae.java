interface Read {
    void read();
}

interface Write {
    void show();
}

interface Print {
    void printr();
}

class Doc implements Read, Write, Print {
    public void read() {
        System.out.println("read");
    }

    public void show() {
        System.out.println("write");
    }

    public void printr() {
        System.out.println("print");
    }
}

class Ae {
    public static void main(String[] args) {
        Doc d = new Doc();
        d.read();
        d.show();
        d.printr();
    }
}
