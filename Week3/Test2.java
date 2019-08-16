public class Test2 {
    public static void main(String[] args) {
        int[] a = new int[10000];
        for (int i = 0; i < a.length; i++) {  //初试化数组,a[0]=2;
            a[i] = i + 2;
        }
        for (int m = 1; findi(a, m) * findi(a, m) < a.length; m++) {         //埃拉托斯特尼筛法:要得到自然数n以内的全部素                                                                      //数，必须把不大于
            for (int n = 0; n < a.length; n++) {                    //  的所有素数的倍数剔除，剩下的就是素数.
                if (findi(a, m) != 0) {                         //先判断分母不会0，再进行下一步
                    if (a[n] % (findi(a, m)) == 0 && a[n] != (findi(a, m))) {          //将能被m整除的数赋值为0（m                                                                              //本身除外）
                        a[n] = 0;
                    }
                } else break;
            }
        }
        printzheng(a);
    }

    public static int findi(int[] b, int m) {          //找出数组中第m个不为0的数
        int n = 0;
        int c = 0;
        for (int i = 0; n < m; i++) {
            c++;                        //先加，然后再进行判断。
            if ((b[i]) != 0) {
                n++;
            }
        }
        return b[c - 1];
    }

    public static void printzheng(int[] b) {               //输出数组中所有不为0的数
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                System.out.println(b[i]);
            }
        }
    }
}