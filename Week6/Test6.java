class NumRanExcep extends Exception {
    private int a, b;

    NumRanExcep(int c, int d) {
        a = c;
        b = d;
    }

    public String toString() {
        return "NumRanExcep:" + "a" + "b";
    }
}


public class Test6 {

    static int Add(int a1, int a2) throws NumRanExcep {
        int sum = 0;
        if (a1 < 1 || a2 > 10) {//求和的第一个数小于1或者第二个数大于10，抛异常
            NumRanExcep e = new NumRanExcep(a1, a2);
            throw e;
        }
        for (int i = a1; i <= a2; i++) {
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {
        try {
            int s1 = Add(3, 8);
            System.out.println("sum=" + s1);
            int s2 = Add(3, 20);
            System.out.println("sum=" + s2);
        } catch (NumRanExcep e) {
            System.out.println("捕获异常：" + e.toString());
        }
    }
}