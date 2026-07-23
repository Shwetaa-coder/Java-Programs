interface Camera {
    void click();
}

interface Music {
    void play();
}

class Phone implements Camera, Music {
    public void click() {
        System.out.println("click");
    }

    public void play() {
        System.out.println("play");
    }
}

public class Bq {

    public static void main(String[] args) {
        Phone p = new Phone();
        p.click();
        p.play();
    }
}