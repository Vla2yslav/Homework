package module7;

import java.util.Comparator;

public class compare3 implements Comparator<Order>{

    @Override
    public int compare(Order o1, Order o2) {
        if (!o1.getItemName().equals(o2.getItemName()))
             return o1.getItemName().compareTo(o2.getItemName());
        else if (!o1.getShopIdentificator().equals(o2.getShopIdentificator()))
             return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        else return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
