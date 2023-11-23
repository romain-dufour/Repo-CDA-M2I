package org.example.TpHeritage;

//import org.example.TpHeritage.Person;
import org.example.TpHeritage.Student;
import org.example.TpHeritage.Teacher;

public class Demo {
    public static void main(String[] args) {


                Person person = new Person();
        person.sayHello();
        Student student = new Student();
        student.setN(15);
        student.sayHello();
        student.GoToClasses();
       student.DisplayAge();
       Teacher teacher = new Teacher();
       teacher.sayHello();
       teacher.Explain();
    }
}
