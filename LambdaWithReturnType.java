interface A {

    int add(int i, int j);
}

public class LambdaWithReturnType {
    public static void main(String[] args) {
        A obj = (i, j) -> i + j;
        int result = obj.add(5, 7);
        System.out.println("Addition : " + result);

    }
}
