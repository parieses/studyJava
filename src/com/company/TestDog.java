class Animal{
    public void move(){
        System.out.println("��������ƶ�");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("�������ܺ���");
    }
    public void bark(){
        System.out.println("�����Էͽ�222");
    }
}

public class TestDog{
    public static void main(String args[]){
        Animal a = new Animal(); // Animal ����
        Dog b = new Dog(); // Dog ����

        a.move();// ִ�� Animal ��ķ���
        b.move();//ִ�� Dog ��ķ���
        b.bark();
    }
}