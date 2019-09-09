package Task7.Request;

public class Request<S> {
    private String color = "white";

    public String paint (){
        String paint = "Walls have been painted in "+ color;
        return paint;
    }

    public String plaster (){
        String plaster = "Walls have been plastered";
        return plaster;
    }

    public String layTile (){
        String tile = "Tiles have been laid";
      return tile;
    }
}
