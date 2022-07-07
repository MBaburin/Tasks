package Lesson8;

import Lesson8.Jackets.AdidasJacket;
import Lesson8.Jackets.Jacket;
import Lesson8.Jackets.NikeJacket;
import Lesson8.Jackets.PumaJacket;
import Lesson8.Pants.AdidasPants;
import Lesson8.Pants.NikePants;
import Lesson8.Pants.Pant;
import Lesson8.Pants.PumaPants;
import Lesson8.Sneakers.AdidasSneakers;
import Lesson8.Sneakers.NikeSneakers;
import Lesson8.Sneakers.PumaSneakers;
import Lesson8.Sneakers.Sneakers;

import java.util.Scanner;

public class Start {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Jacket nikeJacket = new NikeJacket();
        Jacket adidasJacket = new AdidasJacket();
        Jacket pumaJacket = new PumaJacket();

        Pant nikePants = new NikePants();
        Pant adidasPants = new AdidasPants();
        Pant pumaPants = new PumaPants();

        Sneakers nikeSneakers = new NikeSneakers();
        Sneakers adidasSneakers = new AdidasSneakers();
        Sneakers pumaSneakers = new PumaSneakers();




        Human Lexa = new Human("Lexa", adidasJacket,pumaPants,nikeSneakers);

        if(a==1){
            Lexa.putOn();
        } else{ Lexa.putOf();}

    }
}
