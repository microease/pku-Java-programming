//编写一个小的程序，其中定义一些接口、类、抽象类，定义它们的成员（字段及方法）， 要求使用使用setter/getter, static, final, abstract，@Override等语法要素，并写一个main函数来使用它们。这些类、接口可以是围绕以下选题之一
//飞翔世界：来一次飞翔接力（即多个可飞翔的对象依次调用）;
//动物世界：来一次吃西瓜大赛;
//图书馆：模拟一天的借阅过程;
//学校：模拟选课过程;
//等等
//要求写个简要说明。
package Week4;

interface Eat {
    void eat();
}

abstract class anmial implements Eat {
    public void eat() {
        System.out.println("可以吃西瓜");
    }//@Override
}

class Pig extends anmial {
    private String name;
    protected static final int ableEat = 10;

    public void eat() {
        System.out.println(this.name + "吃了" + ableEat + "个西瓜");
    }//@Override

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }
}

class Dog extends anmial {
    private String name;
    protected static final int ableEat = 6;

    public void eat() {
        System.out.println(this.name + "吃了" + ableEat + "个西瓜");
    }//@Override

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }
}


public class EatWatermelonGame {
    public static void main(String[] args) {
        System.out.println("吃西瓜比赛正式开始！");
        Dog wangcai = new Dog();
        wangcai.setName("旺财");
        wangcai.eat();

        Dog xiaobai = new Dog();
        xiaobai.setName("小白");
        xiaobai.eat();

        Dog xiaohei = new Dog();
        xiaohei.setName("小白");
        xiaohei.eat();

        Pig xiaohua = new Pig();
        xiaohua.setName("小花猪");
        xiaohua.eat();

        Pig xiaohei2 = new Pig();
        xiaohei2.setName("小黑猪");
        xiaohei2.eat();
        System.out.println("猪赢了！");
    }
}