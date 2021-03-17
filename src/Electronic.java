/**
 * Jack Singh
 * 1141574
 */

import java.util.Arrays;
import java.util.List;

public class Electronic {
    private String name, category, brand;
    private double price, weight;

    public Electronic(String name, String category, String brand, double price, double weight) {
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 20) {
            name.trim();
        }else{
            throw new IllegalArgumentException("The name must be between 2 and 20 characters");
        }
    }

    public void setCategory(String category) {
        category.toLowerCase();
        List<String> categoryList = Arrays.asList("cell phones", "home theater", "computers");
        if (categoryList.contains(category)){
            this.category = category;
        }else{
            throw new IllegalArgumentException("The category must be one of the following three; cell phones, home theater or computers");
        }
    }

    public void setBrand(String brand) {
        brand.toLowerCase();
        brand.toUpperCase();
        List<String> brands = Arrays.asList("Acer", "Apple", "Dell", "Eurocom", "Google", "Microsoft", "Samsung", "Sony", "Sonos");
        if (brands.contains(brand)){
            this.brand = brand;
        }else{
            throw new IllegalArgumentException("You must enter a valid brand");
        }
    }

    public void setPrice(double price) {
        if(price >= 0 && price <= 10000){
            this.price =price;
        }else{
            throw new IllegalArgumentException("price need to be between 0 and 10000");
        }
    }

    public void setWeight(double weight) {
        if (weight >= 0 && weight <= 500){
            this.weight = weight;
        }else{
            throw new IllegalArgumentException("The weight must be between 1 and 500");
        }
    }

    public String toString()
    {
        return String.format("%s-%s, cost: $%.2f", category, name, price);

    }
}
