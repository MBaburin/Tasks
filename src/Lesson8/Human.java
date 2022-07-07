package Lesson8;

import Lesson8.Jackets.Jacket;
import Lesson8.Pants.Pant;
import Lesson8.Sneakers.Sneakers;

public class Human {
       private String name;
       private Jacket jacket;
       private Pant pant;
       private Sneakers sneakers;

       public Human(String name, Jacket jacket, Pant pant, Sneakers sneakers){
               this.name = name;
               this.jacket = jacket;
               this.pant = pant;
               this.sneakers = sneakers;
       }


       public void putOn(){
               jacket.putOn();
               pant.putOn();
               sneakers.putOn();
       }

        public void putOf(){
                jacket.putOf();
                pant.putOf();
                sneakers.putOf();
        }

}
