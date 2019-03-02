package quickstart;

public class Math1 {
    public static void main(String args[]) {
        int res = 0;
        for (int x = 3; x < 6; x = x + 1) {
            res = res + x * x * x;
            System.out.print(res);
            System.out.print("\n");
        }
        int res2 = 6 * 6 * 6;
        if (res == res2) {
            System.out.print("OK,第1个算式相等！");
        }
        res = 0;
        for (int x = 6; x < 70; x = x + 1) {
            res = res + x * x * x;
            System.out.print(res);
            System.out.print("\n");
        }
        res2 = 180 * 180 * 180;
        if (res == res2) {
            System.out.print("OK,第2个算式相等！");
        }
    }

}
