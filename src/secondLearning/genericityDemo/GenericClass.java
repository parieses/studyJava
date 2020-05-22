package secondLearning.genericityDemo;

public class GenericClass<T> implements GenericInterFace<T> {
    public T name;

    public GenericClass(T name) {
        this.name = name;
    }

    public GenericClass() {

    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public void test(T name) {
        System.out.println(name + "泛型接口");
    }
}
