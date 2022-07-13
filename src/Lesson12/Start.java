package Lesson12;

import java.util.ArrayList;
import java.util.List;


public class Start {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Goods iphone = new Goods(1,"Iphone",10000);
        Goods samsung = new Goods(2,"Samsung",5000);
        Goods huawei = new Goods(3,"Huawei",15000);
        shop.add(iphone);
        shop.add(samsung);
        shop.add(huawei);

        for (Goods goods: shop.getGoodslist()){
            System.out.print(goods.getName() + " ");
            System.out.print(goods.getPrise() + "$");
            System.out.println(" ");
        }

    }
}
