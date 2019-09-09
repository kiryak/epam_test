package Task7.Commands;
import Task7.Request.Request;

public class PlasterWalls implements Order {
    private Request<String> request;

    public PlasterWalls(Request<String> request) {
        this.request = request;
    }

    @Override
    public String execute() {
       return request.plaster();
    }

}
