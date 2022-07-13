package Lesson12;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Goods> goodslist = new ArrayList<>();

    public Shop() {

    }

    public List<Goods> getGoodslist() {
        return goodslist;
    }

    public void setGoodslist(List<Goods> goodslist) {
        this.goodslist = goodslist;
    }

    public void add(Goods goods) {
        if (!goodslist.contains(goods)) {
            goodslist.add(goods);
        }
    }

    public void remove (int id){
        goodslist.removeIf(Goods -> Goods.getId() == id);
    }

    public void edit (Goods goods){
        for (Goods item : goodslist) {
            if (item.getId()==goods.getId()){
                item.setName(goods.getName());
                item.setPrise(goods.getPrise());
            }
        }
    }

}
