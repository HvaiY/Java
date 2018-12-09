package R11OOP_Interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------");
        //�ӿ�ֻ��Լ������˵����һЩ����(��Ҫʵ��������ȥʵ��)
        //�� ���̳�(������Ҳ��) ���ӿ��ǿ��Զ��ʵ�ֵ�
        FlayFunction f = new Brid();
        f.flay();
        ((Brid) f).run();

        System.out.println("���� �ڲ���");
        //��������
        FlayFunction f2 = () -> System.out.println("�����ڲ���  �ķ�"); //��������
        f2.flay();
        //�����ڲ���
        System.out.println("--------------------------");
        String s = "����";
        EatFuction e = new EatFuction() {
            @Override
            public void eat() {
                System.out.println("С�ڳ�");
            }

            @Override
            public void eat(String s) {
                System.out.println("��" + s);
            }

            @Override
            public void bigEat() {
                System.out.println("��ڳ�");
            }
        };
        String str = "����";
        e.eat();
        e.bigEat();
        e.eat(str);

        // equals ���������Ƚ���������Ƿ�һ��  ��object ������

        //�鿴Animal �Ϳ��Կ���������toString��equals��ʵ��
        Animal a=new Animal();
        a.setAge(18);
        a.setName("xС�ɷ�");
        System.out.println(a.toString());
        Animal b=new Animal();
        b.setAge(18);
        b.setName("xС�ɷ�");

        System.out.println(a.equals(b));
        System.out.println(a==b); //������������������ͬ������ָ���ַ��ͬ ==  �ж�Ϊfalse

        // static ��̬��  ��̬�ķ��� �ֶ� ��  ���������ڶ�����ڵ� ��������ʱ���Ǿ����� �����������п���ֱ��ʹ������ ����.������
//        static ��Աֱ�ӿ���ͨ���������ã��� static ��ԱҪͨ��������ã�
//        static ��Ա��ֻ�ܷ��� static ��Ա������ֱ�ӷ��ʷ� static ��Ա��
//        �� static ��Ա���Է��� static ��Ա

//        static
//        {
//            ��̬����������һ�α�ʹ�õ�ʱ��ִ��һ�Σ��ڹ��캯��ִ��֮ǰִ�С�һ�����ڶ����
//            �г�ʼ�����Ժ����
//            ֻҪһ����ʼ���Ӵ�һ���ࡱ����̬��Ա��static �����ͻᱻִ��
//        }
    }
}
