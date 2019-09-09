package Task7.Invoker;

import Task7.Commands.Order;

import java.util.ArrayList;
import java.util.List;

public class Executor {

   private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order <?> order){
        orderList.add(order);
    }


    public void executeOrders(){
        for (Order order : orderList) {
            order.execute();
            System.out.println(order.execute());
        }
        orderList.clear();
    }
}
