package org.example.concepts.solid;

public class SingleResponsibilitySample {

    // This class is being used for getting car info and perform database operations
     class WrongCar {
         String nameOfTheCar;
         void saveCar(){}
         String getNameOfTheCar(){return this.nameOfTheCar;}
     }

     class Car {
         String nameOfTheCar;
         String getNameOfTheCar(){return this.nameOfTheCar;}
     }
    class CarDAO {
        void saveCar(Car c){}
    }

}
