package Task7.Commands;

import Task7.Request.Request;

public class PaintWalls implements Order {
    private Request<String> request;


    public PaintWalls(Request<String> request) {
        this.request = request;
    }

    @Override
    public String execute() {
       return request.paint();
    }


}
