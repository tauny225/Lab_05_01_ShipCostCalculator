public class Main {

    public static void main(String[] args) {
        double Price = 175;
        double shippingCost = 0;
        double totalPrice = 0;

        if (Price >= 100)
            {
                System.out.println("The shipping cost is free, and the total price is:" + Price);
            }
        else
            {
                shippingCost = (Price * 2)/100;
                totalPrice = shippingCost + Price;
                System.out.println("The shipping cost is:" + shippingCost + " and the total price is:" + totalPrice);
            }

        // write your code here
    }
}
