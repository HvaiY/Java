package R11OOP_Interface;

public class Brid implements FlayFunction , RunFunction {
    @Override
    public void flay() {
        System.out.println("С���ſ�����");
    }

    @Override
    public void run() {
        System.out.println("С����Ѿ����");
    }
}
