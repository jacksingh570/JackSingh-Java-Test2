import java.util.ArrayList;

public class Purchases {
    private ArrayList<Electronic> purchases;

    public Purchases()
    {
    }

    public ArrayList<Electronic> getPurchases() {
        return purchases;
    }

    public void addElectronic(Electronic newElectronic)
    {
    }

    public double getTotalPurchasePrice()
    {
        return -1;
    }

    public int getNumberOfItems()
    {
        return -1;
    }

    public ArrayList<String> getUniqueCategoriesInPurchase()
    {
        return null;
    }

    public double getTotalWeight()
    {
        return -1;
    }

    public double getAvgWeight()
    {
        return -1;
    }

    public Electronic getMostExpensive()
    {
        return new Electronic("Wazoo","computers","Acer",0.01,0.01);
    }

    public String toString()
    {
        return "";
    }
}
