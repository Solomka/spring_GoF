package guru.springframework.gof.composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatalogComponentTest {

    @Test
    public void testPrint() throws Exception {


        /*Create primary products for main catalog*/
        CatalogComponent mJeanProduct=new ProductLeaf("M: Jeans 32", 65.00);
        CatalogComponent mTShirtProduct=new ProductLeaf("M: T Shirt 38", 45.00);

        /*Create a composite product catalog and add female products to it*/
        CatalogComponent newCatalog = new ProductCatalogComposite("Female Products");
        CatalogComponent fJeans=new ProductLeaf("F: Jeans 32", 65.00);
        CatalogComponent fTShirts=new ProductLeaf("F: T Shirt 38", 45.00);
        newCatalog.add(fJeans);
        newCatalog.add(fTShirts);

       /*Create a composite product catalog and add kid products to it*/
        CatalogComponent kidCatalog = new ProductCatalogComposite("Kids Products");
        CatalogComponent kidShorts=new ProductLeaf("Return Gift", 23.00);
        CatalogComponent kidPlayGears = new ProductLeaf("Summer Play Gear", 65.00);
        kidCatalog.add(kidShorts);
        kidCatalog.add(kidPlayGears);

        /*Create primary catalog and add primary products and new catalogs to it*/
        CatalogComponent mainCatalog=new ProductCatalogComposite("Primary Catalog");
        mainCatalog.add(mJeanProduct);
        mainCatalog.add(mTShirtProduct);
        mainCatalog.add(newCatalog);
        mainCatalog.add(kidCatalog);

        /*Print out product/catalog information*/
        mainCatalog.print();

    }
}