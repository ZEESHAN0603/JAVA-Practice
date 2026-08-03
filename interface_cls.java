// Interface is just define the method name and rules only doesn't implement anything
interface Animal{
    void eat();
    void run();
    void sleep();
    void sound();
}
// interface cls is called by using implements keyword in the class and then we need to implement all the methods of interface in the class otherwise it will give error
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sound(){
        System.out.println("Dog is barking");
    }
    public void run(){
        System.out.println("Dog is running");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
    
}

class Cat implements Animal{
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void sound(){
        System.out.println("Cat is meowing");
    }
    public void run(){
        System.out.println("Cat is running");
    }
    public void sleep(){
        System.out.println("Cat is sleeping");
    }
}


public class interface_cls {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sound();
        dog.run();
        dog.sleep();

        Animal cat = new Cat();
        cat.eat();
        cat.sound();
        cat.run();
        cat.sleep();
    }
}
