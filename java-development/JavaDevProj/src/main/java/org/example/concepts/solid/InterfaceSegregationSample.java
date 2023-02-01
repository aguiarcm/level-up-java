package org.example.concepts.solid;

public class InterfaceSegregationSample {

    interface WrongBird {
        void eat();

        void fly();
    }

    class WrongChicken implements WrongBird {

        @Override
        public void eat() {

        }

        @Override
        public void fly() {
            throw new RuntimeException("I can't fly");
        }
    }


    interface FlyingBird {
        void eat();

        void fly();
    }

    interface NoFlyingBird {
        void eat();
    }

    class Chicken implements NoFlyingBird {

        @Override
        public void eat() {

        }
    }
}
