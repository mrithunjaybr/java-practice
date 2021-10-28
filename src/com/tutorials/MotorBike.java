package com.tutorials;

public class MotorBike {

        private int speed;

        MotorBike(){
            this(5);
        }

        MotorBike(int speed){
            this.speed = speed;
        }

        public void setSpeed(int sp){
            if(sp>0){
                this.speed=sp;
            }

        }

        public int getSpeed(String v){
            System.out.printf("Speed of %s is", v).println();
            return this.speed;
        }

        public void increaseSpeed(){
            this.speed +=100;
        }

        public void decreaseSpeed(){
            setSpeed(this.speed - 100); // encapsulation level 2 - as you can see,
            // you use another method to hide working of this method

        }
        public void start(){
            System.out.println("Bike Started");
        }
}
