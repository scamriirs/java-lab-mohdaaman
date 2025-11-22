package exam;

public class Result {
    public int m1, m2, m3;

    public Result(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;
    }

    public int total() {
        return m1 + m2 + m3;
    }
}
