package Task6.SubTask1;

public class Application1 {
    public static void main() {
        Input input = new Input();
        Reversed reversed = new Reversed();
        Output output = new Output();
        input.readFile("/Users/mariia/Desktop/epam/src/Task6/File.txt");
        reversed.getReversed();
        output.getOutput("/Users/mariia/Desktop/epam/src/Task6/File.txt");
    }
}
