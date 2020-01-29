import java.util.*;
public class Stock{
    String  stock_name,stock_symbol;
    double prev_closing_price,curr_closing_price;
    Stock(String name,String symbol,double prev,double curr){
        stock_name=name;
        stock_symbol=symbol;
        prev_closing_price=prev;
        curr_closing_price=curr;
    }
    double getChangePercentage(){
        double diff_price=curr_closing_price-prev_closing_price;
         return (diff_price/prev_closing_price)*100;
    }
    public static void main(String[] args) {
            Stock TSLA=new Stock("TESLA", "TSLA", 100, 150);
            System.out.println(TSLA.getChangePercentage());
            }
}
