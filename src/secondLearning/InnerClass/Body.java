package secondLearning.InnerClass;

/**
 * 定义类的时候的权限修饰符
 * 1.外部类 public/(default)
 * 2.成员内部类  public/protected/default/private
 * 3.局部内部类 什么都不能写
 */
public class Body {
    int num = 10;
    private String name;

    public void methodBody() {
        name = "达瓦大";
        System.out.println("外部类方法");
        Heart heart = new Heart();
        heart.beat();
    }

    public void testClass() {
        final int num1 = 50; //只要局部变量事实不变 那么final 关键字可以省略
        class Inner {
            int num = 40;

            public void test() {
                System.out.println(num);
                System.out.println(num1);
            }
        }
        Inner inner = new Inner();
        inner.test();
    }

    public class Heart {
        int num = 20;

        public void beat() {
            System.out.println("内部类方法");
            System.out.println(name);
        }

        public void getNum() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);
        }
    }
}
