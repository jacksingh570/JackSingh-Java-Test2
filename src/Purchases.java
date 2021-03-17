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

        int  totalPrice = 0;
        for (int i=0; i<purchases.toArray().length; i++){
            totalPrice = totalPrice + Integer.getInteger(purchases.toString());
        }
        return totalPrice;
    }

    public int getNumberOfItems()
    {
        if (purchases.size() == 0){
            return 0;
        }else{
            return purchases.size();
        }

    }

    public ArrayList<String> getUniqueCategoriesInPurchase() {
        ArrayList<String> uCategory = new ArrayList<>();
        uCategory.add(String.valueOf(purchases));
        if(uCategory.isEmpty()){
            return uCategory;
        }else{
            return uCategory;
        }
    }
    public double getTotalWeight()
    {
        if (purchases.isEmpty()){
            return 0;
        }else{
            double list = 0;
            for (int i=0; i<= purchases.size(); i++){
                double weightArray = purchases.get(i).getPrice();
                list = weightArray + purchases.get(i).getPrice();
            }
            return list;
        }
    }

    public double getAvgWeight()
    {
        double weight = 0;
        double average = 0;
        if(purchases.isEmpty()){
            return 0;
        }else {

            for (int i = 0; i <= purchases.size(); i++) {
                weight = purchases.get(i).getWeight();
                weight += weight;
            }
            average = weight / 2;
        }
        return average;
    }

    public Electronic getMostExpensive()
    {
        double mostExpensive = 0;
        Electronic biggestPrice = null;
        for(int i=0; i<purchases.size(); i++){
            if(purchases.get(i).getPrice() > mostExpensive){
                mostExpensive = purchases.get(i).getPrice();
                biggestPrice = new Electronic(purchases.get(i).getName(), purchases.get(i).getCategory(), purchases.get(i).getBrand(), mostExpensive, purchases.get(i).getWeight());
            }
        }
        return biggestPrice;
    }

    public String toString()
    {
        String names = "";
        if(purchases.isEmpty()){
            return "No purchases";
        }else {
            for (int i = 0; i <= purchases.toArray().length; i++) {
                if (i == purchases.size()) {
                    names = names + purchases.get(i).getName();
                } else {
                    names = names + ", ";
                }
            }
        }
        return names;
    }
}
