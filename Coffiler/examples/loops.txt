public class Loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i = i + 1;
        }

        for (int j = 0; j < 2; j = j + 1) {
            System.out.println(j * 2);
        }
    }
}