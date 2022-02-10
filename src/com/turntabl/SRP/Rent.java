package com.turntabl.SRP;

public class Rent {
        House house;

        public Rent(House house){
            this.house = house;
        }

        public void printHouse(){
            System.out.println(house.getName());
        }

        public void forRent(boolean rentStatus){
            if(rentStatus)
                System.out.println("House for rent ");
            else
                System.out.println("This house is not for rent ");
        }


}
