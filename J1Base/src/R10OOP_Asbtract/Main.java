package R10OOP_Asbtract;

public class Main {
    public  static void main(String[] atgs){
        //������  ���Ե��þ�̬����
      Person.speak2();
    //        ���󷽷�û�з����壬���շ����嶼����д��һ�����ж����˳��󷽷�������뱻����Ϊ����
    //        �������޷�ʵ����(new)��
    //        ���������û�г��󷽷���
    //        ��������������ʵ�ָ�������г��󷽷�����������Ҳ�ǳ�����
        Person p=new Chinese();
        p.setAge(15);
        p.run();
        p.speak();

    }
}
