package Task7.Main;

import Task7.Commands.LayTile;
import Task7.Commands.PaintWalls;
import Task7.Commands.PlasterWalls;
import Task7.Invoker.Executor;
import Task7.Request.Request;

public class Client {
    public static void main(String[] args) {
        Request<String> request = new Request<>();
        PlasterWalls plasterWalls = new PlasterWalls(request);
        LayTile layTile = new LayTile(request);
        PaintWalls paintWalls = new PaintWalls(request);
        Executor executor = new Executor();
        executor.takeOrder(plasterWalls);
        executor.takeOrder(paintWalls);
        executor.takeOrder(layTile);
        executor.executeOrders();
    }
}
