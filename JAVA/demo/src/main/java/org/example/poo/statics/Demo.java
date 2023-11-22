package org.example.poo.statics;

public class Demo {

    @Override
    public String toString() {
        return "Demo{}";
    }

    public static void main(String[] args) {

        User user = new User();
        System.out.println(user);
        User user1 = new User("Jean-Michel");
        System.out.println(user1);

        int counter = User.getCounter();

        Employe e = new Employe();
        System.out.println(e);



    }
}
