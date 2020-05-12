package task3.Robot;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot( "робот ","працюю");
        CoffeRobot сoffeRobot = new CoffeRobot( "робот ","варю каву");
        RobotDancer robotDancer = new RobotDancer( "робот ","танцюю");
        RobotCoocker robotCooker = new RobotCoocker( "робот ","готую");

        String name = robot.getName();
        String move = robot.getMove();

        String сname = сoffeRobot.getName();
        String сmove = сoffeRobot.getMove();

        String dname = robotDancer.getName();
        String dmove = robotDancer.getMove();

        String сookername = robotCooker.getName();
        String сookermove = robotCooker.getMove();

        robot.work(name, move);
        сoffeRobot.work(сname, сmove);

        robotDancer.work(dname, dmove);
        robotCooker.work(сookername, сookermove);
    }
}
