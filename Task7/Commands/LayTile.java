package Task7.Commands;

import Task7.Request.Request;

public class LayTile  implements Order {
    private Request<String> request;

    public LayTile(Request<String> request) {
        this.request = request;
    }

    @Override
    public String execute() {
        return request.layTile();
    }
}
