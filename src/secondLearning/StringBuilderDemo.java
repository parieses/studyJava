package secondLearning;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("abc");
        sb1.append(12);
        System.out.println(sb1);
        String res = sb1.toString();

    }
}
