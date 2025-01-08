public class PizzaDelivery {

    public Stack deliveryGal;
    public Stack pizzaHouse;

    public PizzaDelivery() {
        deliveryGal = new Stack(5);
        pizzaHouse = new Stack();
    }

    public void assign(String [] pizzas) {
        for (String pizza : pizzas) {
            try {
              this.deliveryGal.push(pizza);
              System.out.println(pizza + " pizza added to deliveryGal stack.");

            } catch (Error e) {
              this.pizzaHouse.push(pizza);
              System.out.println("deliveryGal left to make deliveries! " + pizza + " pizza added to pizzaHouse stack.");
            }
        }

        System.out.println("\nDELIVERIES ARE UNDERWAY...\n");

    }

    public void deliver() {
        int numPizzas = this.deliveryGal.size;
        for (int i = 0; i < numPizzas; i++) {
            String pizzaType = this.deliveryGal.pop();
            System.out.println(pizzaType + " pizza delivered!");
        }

        System.out.println("\nDELIVERYGAL has delivered all her pizzas...\n");
    }

    public static void main(String[]args) {
        String [] pizzas = {"pepperoni","cheese","veggie","meat","hawaiian", "margherita"};
        PizzaDelivery pizzaDelivery = new PizzaDelivery();
        pizzaDelivery.assign(pizzas);
        pizzaDelivery.deliver();
    }
}