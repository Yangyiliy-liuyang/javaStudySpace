package com.day0508.Object.equals;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = a;
        /*
        == �Ƚ������
        �жϻ��������Ƿ����
        �ж��������͵�ַ�Ƿ����
        */
        System.out.println(a==b);//true
        System.out.println(a==c);//true

        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);

        //ctrl+b
        "hello".equals("abc");
        /*
        String��eauals��������ĬObject��eauals������д�ˣ�����˱Ƚ������ַ�����ֵ�Ƿ���ȡ�
        public boolean equals(Object anObject) {
        if (this == anObject) {//�����ͬһ������
            return true;
        }
        return (anObject instanceof String aString)//�ж�����
                && (!COMPACT_STRINGS || this.coder == aString.coder)//�ж��ַ��������
                && StringLatin1.equals(value, aString.value);//�ж��ַ����
    }
         */

        //Object
        /*
        public boolean equals(Object obj) {
            return (this == obj);
            //Object��eauals����Ĭ�Ͼ��ǱȽ϶����ַ�Ƿ����
            //Ҳ�����ж����������ǲ���ͬһ������
        }
        */

        Integer integer1 = new Integer(5);
        /*
        public boolean equals(Object obj) {
        if (obj instanceof Integer) {//�ж��ǲ���Integer
            return value == ((Integer)obj).intValue();//�ж�ֵ�Ƿ����
        }
        return false;
    }
         */
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        Integer integer2 = new Integer(5);
        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true
    }
}
class A{ }