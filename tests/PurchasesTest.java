import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PurchasesTest {
    private Purchases purchases;
    private Electronic phone1;
    private Electronic phone2;
    private Electronic tv;
    private Electronic laptop;

    @BeforeEach
    void setUp() {
        purchases = new Purchases();
        phone1 = new Electronic("iPhone 12","cell phones","Apple",1129.00, 0.16);
        phone2 = new Electronic("S21 Ultra 5G","cell phones","Samsung",1649.99, 0.227);
        tv = new Electronic("Bravia OLED", "home theater","Sony",3299.99,23.6);
        laptop = new Electronic("Tornado F5", "computers","Eurocom",4149.00,2.92);
        purchases.addElectronic(phone1);
        purchases.addElectronic(phone2);
        purchases.addElectronic(tv);
        purchases.addElectronic(laptop);
    }

    @Test
    void getTotalPurchasePrice() {
        assertEquals(10227.98, purchases.getTotalPurchasePrice());
    }

    @Test
    void testConstructor()
    {
        purchases = new Purchases();
        ArrayList<Electronic> expResult = new ArrayList<>();
        assertEquals(expResult, purchases.getPurchases());
    }

    @Test
    void testConstructorAndAdd()
    {
        ArrayList<Electronic> expResult = new ArrayList<>();
        expResult.add(phone1);
        expResult.add(phone2);
        expResult.add(tv);
        expResult.add(laptop);
        assertEquals(expResult, purchases.getPurchases());
    }

    @Test
    void getTotalPurchasePriceEmpty() {
        purchases = new Purchases();
        assertEquals(0, purchases.getTotalPurchasePrice());
    }

    @Test
    void getNumberOfItemsEmpty() {
        purchases = new Purchases();
        assertEquals(0, purchases.getNumberOfItems());
    }

    @Test
    void getNumberOfItems() {
        assertEquals(4, purchases.getNumberOfItems());
    }

    @Test
    void getUniqueCategoriesInPurchase() {
        ArrayList<String> expResult = new ArrayList<>();
        expResult.addAll(Arrays.asList("cell phones", "home theater", "computers"));
        assertEquals(expResult,purchases.getUniqueCategoriesInPurchase());
    }

    @Test
    void getUniqueCategoriesInPurchaseEmptyList() {
        ArrayList<String> expResult = new ArrayList<>();
        purchases = new Purchases();
        assertEquals(expResult,purchases.getUniqueCategoriesInPurchase());
    }

    @Test
    void getTotalWeight() {
        assertEquals(26.91, purchases.getTotalWeight(),0.01);
    }

    @Test
    void getTotalWeightEmpty() {
        purchases = new Purchases();
        assertEquals(0, purchases.getTotalWeight());
    }

    @Test
    void testToString() {
        assertEquals("iPhone 12, S21 Ultra 5G, Bravia OLED, Tornado F5",purchases.toString());
    }

    @Test
    void testToStringEmpty() {
        purchases = new Purchases();
        assertEquals("no purchases",purchases.toString());
    }

    @Test
    void getMostExpensiveEmpty() {
        purchases = new Purchases();
        assertEquals(null, purchases.getMostExpensive());
    }

    @Test
    void getMostExpensive() {
        assertEquals(laptop, purchases.getMostExpensive());
    }

    @Test
    void getAvgWeightEmpty() {
        purchases = new Purchases();
        assertEquals(0, purchases.getAvgWeight());
    }

    @Test
    void getAvgWeight() {
        assertEquals(6.73, purchases.getAvgWeight(),0.01);
    }
}