package com.day0508.PolyArray;

public class Main {
    public static void main(String[] args) {
        Person person[] = new Person[5];
        person[0] = new Teacher("zhangsan", 20);
        person[1] = new Person("libai", 17);
        person[2] = new Teacher("tom", 17);
        person[3] = new Student("jack", 11);
        person[4] = new Teacher("king", 27);

        for (int i = 0; i < 5; i++) {
            System.out.println(person[i].Say());

            if(person[i] instanceof Student)
            //判断person[i]的运行类型是不是Student
            {
                Student student = (Student)person[i];//向下转型
                student.study();
                //((Student) person[i]).study();
            }
            else if(person[i] instanceof Teacher) {
                ((Teacher) person[i]).teach();
            }

        }
    }
}
