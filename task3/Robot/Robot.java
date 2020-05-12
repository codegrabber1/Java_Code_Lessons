package task3.Robot;

public class Robot {

    private String name;
    private String move;

    public Robot(String name, String move){
        this.name = name;
        this.move = move;

    }

    public String getName() {
        return name;
    }

    public String getMove() {
        return move;
    }

    public void work(String name, String move) {
        System.out.println("Я " + name + " - я просто " + move);
    }
}
