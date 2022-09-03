package interfaces;

public class Solution3 {
    /*
    There are interfaces Fly, Move, Eat.
    Add proper interfaces to the classes: Dog, Car, Duck, Airplane
     */

    interface Fly {
        void fly();
    }

    interface Move {
        void move();
    }

    interface Eat {
        void eat();
    }

    public class Dog implements Eat, Move {
        public void move() {
            System.out.println("can run");
        }

        public void eat() {
            System.out.println("can eat");
        }
    }

    public class Car implements Move {
        public void move() {
            System.out.println("drive to sunset");
        }
    }

    public class Duck implements Eat, Fly {
        public void fly() {
            System.out.println("fly in the sky");
        }

        public void eat() {
            System.out.println("can eat");
        }
    }

    public class Airplane implements Fly {
        public void fly() {
            System.out.println("fly in the sky");
        }
    }
}
