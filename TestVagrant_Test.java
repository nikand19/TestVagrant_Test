import java.util.*;

class Shopping {
    class Basket {
        String Product;
        float Unit_price;
        float Gst;
        float Quantity;
        String ProductWithMaxGST;
    }
        Basket(String Product, int Unit_price, float Gst, float Quantity){
            
        }

    public float FindGST(float Unit_price,int Quantity,float Gst){
            float GST=0;
            GST+=Unit_price*Quantity*Gst/100;
            return GST;
        
        }

    public float FindDiscount(float Unit_price,float Quantity){
            float Discount=0;
            Discount+=Unit_price*Quantity*5/100;
            return Discount;
        }

    public float FindMaxGST (float unit_price, float Quantity ){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<Product.length;i++){
            if(FindGST>max){
                max=FindGST;
            }
        }
        Amount_paid+=unit_price*Quantity+FindDiscount+FindGST;
        return Amount_paid;
        }

    public static void main(String[] args) {

    }
}
