class X {
    static int getElement(int[] arr, int i) {
        try {
            return arr[i];

        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 9 };
        System.out.println(getElement(arr, 1));
        System.out.println(getElement(arr, 10));

    }
}
