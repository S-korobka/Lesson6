package abstract_classes;

import polymorphism.Solution3;

public class Solution2 {
    /*
    Extend classes Cat and Dog from Pet
    Implement all the necessary methods
    Classes Cat and Dog should not be abstract
     */

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{
        String name;
        public String getName(){
            return name;
        }
        public Pet getChild(){
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        String name;
        public String getName(){
            return name;
        }
        public Pet getChild(){
            return new Dog();
        }
    }
}
