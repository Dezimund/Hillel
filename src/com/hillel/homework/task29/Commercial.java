package homework.task29;



public class Commercial extends Tax {


    private double revenue;

    public Commercial(double square, double taxK,double revenue) {
        super(square, taxK);
        this.revenue = revenue;
    }

    double calcRev(){
        double revenue = this.revenue;
        if(revenue < 100){
            return 0;
        }else{return square * taxK;}
    }

    public String toPrint(double calcRev){
        return "Налог за торговлю :" + calcRev;
    }



}
