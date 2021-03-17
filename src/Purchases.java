import java.util.ArrayList;

public class Purchases {
    private ArrayList<Electronic> purchases;

    public Purchases()
    {
        purchases = new ArrayList<Electronic>();
    }

    public ArrayList<Electronic> getPurchases() {
        return purchases;
    }

    public void addElectronic(Electronic newElectronic)
    {
        purchases.add(newElectronic);
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
        int  totalPrice = 0;
        for (int i=0; i<purchases.toArray().length; i++){
            totalPrice = totalPrice + Integer.getInteger(purchases.toString());
        }
        return totalPrice;
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
