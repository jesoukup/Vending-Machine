
public class Main {

    public static void main(String[] args) {
        VendingMachine vend = new VendingMachine(5);
        Item cheese = new Item(17, "cheese");
        Item grapes = new Item(4, "grapes");
        Item chips = new Item(20, "chips");
        Item chocolate = new Item(50, "chocolate");
        Item orange = new Item(1, "orange");
        
        vend.addItem(cheese);
        vend.addItem(grapes);
        vend.addItem(chips);
        vend.addItem(chocolate);
        vend.addItem(orange);
//        System.out.println(vend.getNextItem().getExpirationDay());
//        System.out.println(vend.dispenseItemAtIndex(1).getDescription());
//        System.out.println(vend.dispenseNextItem().getExpirationDay());
//        System.out.println(vend.dispenseNextItem().getExpirationDay());
//        System.out.println(vend.dispenseNextItem().getExpirationDay());
//        System.out.println(vend.dispenseNextItem().getExpirationDay());
        System.out.println(vend.getItemAtIndex(0).getExpirationDay());
        System.out.println(vend.getItemAtIndex(1).getExpirationDay());
        System.out.println(vend.getItemAtIndex(2).getExpirationDay());
        System.out.println(vend.getItemAtIndex(3).getExpirationDay());
        System.out.println(vend.getItemAtIndex(4).getExpirationDay());
    }
}
