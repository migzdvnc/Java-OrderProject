import java.util.*;
public class PlaceAnOrder {
    public static void main(String[] args) throws OrderException {
        Scanner k = new Scanner(System.in);
        int code,nm=4;
        try{
            System.out.println("Item Number\t\tPrice($)");
            System.out.println("111\t\t\t$0.89");
            System.out.println("222\t\t\t$1.47");
            System.out.println("333\t\t\t$2.43");
            System.out.println("444\t\t\t$5.99");
            
            System.out.print("Eneter Item Number: ");
            int item = k.nextInt();
            System.out.print("Enter Quantity: ");
            int qty = k.nextInt();
            double price[] = {0.89,1.47,2.43,5.99};
            
            if (item == 111){
                nm = 0;
            }
            
            else if(item == 222){
                nm = 1;

            }
            
            else if(item == 333){
                nm = 2;

            }
            
            else if(item == 444){
                nm = 3;

            }
            if(qty < 13 && qty > 0){
                double cost = price[nm]*qty;
                System.out.println("The total price is: $" +cost);
            }
            
            check(item, qty);
        }
        
        catch(InputMismatchException ex){
            System.out.println(OrderMessages.message[1]);
        }
        catch(OrderException Error){
            System.out.println("Data out of range");
            System.out.println(Error.getMessage());
        }
    }
    public static void check(int Item, int Qty)throws OrderException
    {
        int pos;
        if(Item < 0){
            pos=2;
            System.out.println(OrderMessages.message[pos]);
        }
        if(Item > 9999){
            pos=3;
            System.out.println(OrderMessages.message[pos]);
        }
        if(Qty <= 1){
            pos=4;
            System.out.println(OrderMessages.message[pos]);
        }
        if(Qty > 12){
            pos=5;
            System.out.println(OrderMessages.message[pos]);
        }
        if(Item > 444){
            pos=6;
            throw(new OrderException(OrderMessages.message[pos]));
   }
}
}

