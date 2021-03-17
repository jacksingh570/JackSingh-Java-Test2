import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ElectronicTest {

    private Electronic electronic;
    private List<String> categories = Arrays.asList("cell phones","home theater","computers");
    private List<String> brands = Arrays.asList("Acer","Apple","Dell","Eurocom","Google","Microsoft",
            "Samsung","Sony","Sonos");

    @BeforeEach
    void setUp() {
        electronic = new Electronic("iPhone 12","cell phones","Apple",
                1129.00, 0.16);
    }

    @Test
    void setName() {
        electronic.setName("Jdub's Phone");
        assertEquals("Jdub's Phone", electronic.getName());
    }

    @Test
    void setNameNeedsTrim() {
        electronic.setName("   Jdub's Phone  ");
        assertEquals("Jdub's Phone", electronic.getName());
    }

    @Test
    void setNameShort() {
        assertThrows(IllegalArgumentException.class, ()->
                electronic.setName("A"));
    }

    @Test
    void setNameShortWithSpaces() {
        assertThrows(IllegalArgumentException.class, ()->
                electronic.setName(" A "));
    }

    @Test
    void setNameLong() {
        assertThrows(IllegalArgumentException.class, ()->
                electronic.setName("ABCDEFGHIJKLMNOPQRSTU"));
    }

    @Test
    void setCategory() {
        for (String category:categories)
            electronic.setCategory(category);
        assertEquals("computers",electronic.getCategory());
    }

    @Test
    void setCategoryInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                electronic.setCategory("Car"));
    }

    @Test
    void setBrand() {
        for (String brand:brands)
            electronic.setBrand(brand);
        assertEquals("Sonos",electronic.getBrand());
    }

    @Test
    void setBrandInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                electronic.setBrand("JDub"));
    }

    //The brand should be "Apple", not "apple"
    @Test
    void setBrandInvalidCaseSensitive() {
        assertThrows(IllegalArgumentException.class, ()->
                electronic.setBrand("apple"));
    }

    @Test
    void setPrice() {
        electronic.setPrice(1092.30);
        assertEquals(1092.30, electronic.getPrice(),0.001);
    }

    @Test
    void setPriceInvalidLow() {
        assertThrows(IllegalArgumentException.class, ()->
                electronic.setPrice(-.01));
    }

    @Test
    void setPriceInvalidHigh() {
        assertThrows(IllegalArgumentException.class, ()->
                electronic.setPrice(10000.01));
    }

    @Test
    void setWeight() {
        electronic.setWeight(1.01);
        assertEquals(1.01, electronic.getWeight(),0.001);
    }

    @Test
    void setWeightInvalidLow() {
        assertThrows(IllegalArgumentException.class, ()->
                electronic.setWeight(0));
    }

    @Test
    void setWeightInvalidHigh() {
        assertThrows(IllegalArgumentException.class, ()->
                electronic.setWeight(500.01));
    }

    @Test
    void getString() {
        assertEquals("cell phones-iPhone 12, cost: $1129.00", electronic.toString());
    }
}