package Leson_6;

public class Menu {
    Kabab kabab;
    Meze meze;
    Ichki ichki;

    public Menu(Kabab kabab, Meze meze, Ichki ichki) {
        this.kabab = kabab;
        this.meze = meze;
        this.ichki = ichki;
    }



    public double TotalPrice(){
    return kabab.getPrice()+meze.getPrice()+ichki.getPrice();


}

    @Override
    public String toString() {
        return "Menu{" +
                "kabab=" + kabab +
                ", meze=" + meze +
                ", ichki=" + ichki +
                '}';
    }
}

