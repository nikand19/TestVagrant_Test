import java.util.*;

public class Bucket {
    public String maximumGSTProduct(String[] product, int[] price, int[] gst, int[] quan) {
        int maxGST = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < product.length; i++) {
            int currentMaxGST = price[i] * quan[i] * gst[i];
            if (currentMaxGST > maxGST) {
                maxGST = currentMaxGST;
                maxIndex = i;
            }
        }
        return product[maxIndex];
    }

    public int totalAmount(int[] price, int[] gst, int[] quan) {
        int total = 0;
        for (int i = 0; i < price.length; i++) {
            int current;
            if (price[i] > 500) {
                current = ((price[i] * (100 + gst[i]) * quan[i]) / 100) - 0.05 * ((price[i] * (100 + gst[i]) * quan[i]) / 100);
            } else {
                current = (price[i] * (100 + gst[i]) * quan[i]) / 100;
            }
            total += current;
        }
        return total;
    }

    public static void main(String[] args) {
        Example e = new Example();
        String[] product = {"Leather Wallet", "Umbrella", "Cigarette", "Honey"};
        int[] price = {1100, 900, 200, 100};
        int[] gst = {18, 12, 28, 0};
        int[] quan = {1, 4, 3, 2};

        System.out.println("Maximum GST product is: " + e.maximumGSTProduct(product, price, gst, quan));
        System.out.println("Total Amount Paid to Shopkeeper is: " + e.totalAmount(price, gst, quan));
    }
}
