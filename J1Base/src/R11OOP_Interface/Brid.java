package R11OOP_Interface;

public class Brid implements FlayFunction , RunFunction {
    @Override
    public void flay() {
        System.out.println("小鸟张开翅膀飞");
    }

    @Override
    public void run() {
        System.out.println("小鸟撒丫子跑");
    }
}
