package secondLearning;

public class StaticTest {
    public static void main(String[] args) {
        Student.room = "12";
        Student student = new Student("张三", 12);
//        student.room = "12121";
        Student student1 = new Student("张三2", 122);
        System.out.println(student.toString());
        System.out.println(student1.toString());
    }
}

class Student {
    //静态不能直接访问非静态
    //现有静态后有非静态  静态方法不能使用this
    static String room;
    static int count = 0;

    //优先于构造函数
    //用于一次性的对静态成员赋值
    static {
        System.out.println("第一次使用,执行唯一的一次");
    }

    public String name;
    public int age;
    private int id;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++count;
    }

    public Student() {
        this.id = ++count;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", room=" + room + '\'' +
                '}';
    }
}
