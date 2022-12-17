package yenihoca4;

public class Example4Market {
    String nameOfPrdoduct;
    double priceOfPrdoduct;
    String lastDateOfPrdoduct;
    static int totalproduct;

    Example4Market(String nameOfPrdoduct, double priceOfPrdoduct,String lastDateOfPrdoduct){
        this.nameOfPrdoduct = nameOfPrdoduct;
        this.priceOfPrdoduct=priceOfPrdoduct;
        this.lastDateOfPrdoduct = lastDateOfPrdoduct;
totalproduct++;
    }
}
