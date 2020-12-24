package bean;

import java.util.Objects;

public class Stock {
    String companyName;
    int minPrice;
    int maxPrice;
    int currentPrice;

    public Stock(String companyName, int minPrice, int maxPrice, int currentPrice) {
        this.companyName = companyName;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.currentPrice = currentPrice;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;

    }
    public int updatePrice(int newPrice){
        currentPrice = newPrice;
if (newPrice<minPrice);{
minPrice = newPrice;
}
if (newPrice>maxPrice);{
maxPrice = newPrice;
}
return newPrice;}
    public String printInformation(){
        return (companyName +", Price - " + currentPrice + "," + "Minimal Price - " + minPrice + "," + "MaximalPrice - " + maxPrice);

    }
    public static void main(String[] args) {
        System.out.println("Dod," + "Price - " + 5 + "," + "Minimal Price - " + 1 + "," + "MaximalPrice - " + 10);
}
}


