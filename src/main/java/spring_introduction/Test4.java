package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Dog;
import spring_introduction.Person;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Dog myDog = context.getBean("myPet", Dog.class);
////        myDog.setName("Белка");
//        Dog yourDog= context.getBean("myPet", Dog.class);
////        yourDog.setName("Стрелка");

//
//        System.out.println("Переменные ссылаются на один и тот же объект? " +
//                (myDog == yourDog));
////        System.out.println(myDog.getName());
////        System.out.println(yourDog.getName());
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person.getSurname() + " " + person.getAge());
        context.close();
    }
}
