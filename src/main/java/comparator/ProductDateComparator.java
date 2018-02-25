
package comparator;


import java.util.Comparator;

import com.alan.hysupermarket.pojo.Product;


public class ProductDateComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getCREATEDATE().compareTo(p2.getCREATEDATE());
    }

}

