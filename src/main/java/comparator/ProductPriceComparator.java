package comparator;


import java.util.Comparator;

import com.alan.hysupermarket.pojo.Product;

public class ProductPriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return (int) (p1.getPROMOTEPRICE() - p2.getPROMOTEPRICE());
    }

}

