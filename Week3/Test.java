import java.util.ArrayList;
import java.util.List;

public class Test {
    //    用“埃氏筛法”求2～100以内的素数。2～100以内的数，先去掉2的倍数，再去掉3的倍数，再去掉5的倍数，……依此类推，最后剩下的就是素数。
    //
    //    要求使用数组及增强的for语句。
    //
    //    请上传压缩后的源代码文件；
    //
    //    请注意代码风格：类名、变量名的命名，以及必要注释等等；（为防上传失败，请同时把代码贴到文本框中。）
    public static void main(String[] args) {
//        定义一个数组
        List<Integer> result = new ArrayList<Integer>();
//        生成这个数组中的数，从2到100的数，因为数总共有99个，所以写0到98
        for (int i = 0, j = 2; i <= 98; i++, j++) {
            result.add(i, j);
        }
//        测试打印数组
        System.out.println(result);
        for (int i = 0, j = 2; i < result.size(); i++, j++) {

            for (int k = 0; k < result.size(); k++) {
//                如果result数组中的值对j取余等于0的话,事实上j就是2到100的数,如果取余等于0的话就继续执行
                if (result.get(k) % j == 0) {
//                    判断result的值是否等于自身,如果是就继续执行,
                    if (result.get(k) == j) {
                        continue;
                    } else {
                        //数组中的值,能被其他数整除,又不等于自身,那么就直接删除.
                        result.remove(k);
                    }
                }
            }
            // 打印还剩下的数
//            System.out.print(result.get(i) + " ");
        }

    }

}