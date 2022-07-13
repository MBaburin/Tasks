package Shop;

import java.util.Scanner;


public class Start {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        boolean work = true;
        while (work) {
            instructions();
            int i = sc.nextInt();
            if(i == 1) {
                System.out.println("Добавление товара");
                add(shop);
            } else if(i == 2) {
                System.out.println("Список товаров:");
                show(shop);
            } else if(i == 3) {
                System.out.println("Введите id товара которого вы хотите удалить");
                delete(shop);
            } else if(i == 4) {
                System.out.println("Выход");
                sc.close();
                work = false;}
        }
    }

    public static void instructions(){
        System.out.println(" ");
        System.out.println("Нажмите 1 чтобы добавить товар");
        System.out.println("Нажмите 2 чтобы просмотреть список товаров");
        System.out.println("Нажмите 3 чтобы удалить товар");
        System.out.println("Нажмите 4 чтобы выйти");
    }
    public static void add(Shop shop){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id");
        int id = sc.nextInt();
        System.out.println("Введите имя");
        String name = sc.next();
        System.out.println("Введите цену");
        int prise = sc.nextInt();
        Goods good = new Goods(id, name, prise);
        shop.add(good);
    }

    public static void show(Shop shop){
        for (Goods goods : shop.getGoodslist()) {
            System.out.print(goods.getId() + " Товар " +  goods.getName() + " " + " продаётся по цене " + goods.getPrise() + " $ " + "дата создания лота " + goods.getDate());
            System.out.println(" ");
        }
    }

    public static void delete(Shop shop){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        shop.remove(i);
    }

  


}