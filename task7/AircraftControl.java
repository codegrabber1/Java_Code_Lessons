package task7;
import static java.lang.System.out;

import java.util.Random;

public class AircraftControl extends Plane {
    //How much fuel the plane used in an hour.
    protected static final int gasOnHour = 500;

    /**
     * Aircraft directions.
     */
    public AircraftControl(int maxSpeed, String planeColor, int tankVal) {
        super(maxSpeed, planeColor,tankVal);
    }


    // The plane moves up. The method shows the random distance.
    protected int moveUp()
    {
        Random distance = new Random();

        return (int) ( distance.nextInt(10) );
    }

    // The plane moves down. The method shows the random distance.
    protected int moveDown() {

        Random distance = new Random();
        return distance.nextInt(10);
    }

    // The plane turns to the left. The method shows the random distance.
    protected int moveLeft() {

        Random distance = new Random();
        return distance.nextInt(10);
    }

    // The plane turns to the right. The method shows the random distance.
    protected int moveRight() {

        Random distance = new Random();
        return distance.nextInt(10);
    }

    /**
     * Calculate the fuel consumption.
     * @return the count of kilometers.
     */

    public double getDictanceWithvalTank() {

        return (int) (getTankVal()/gasOnHour);
    }

    /**
     *
     */
    @Override
    public void StartingEngines() {
        out.print("Літак заведено! Стартуємо!");


        out.print("\n Ваш літак: " + this.getPlaneColor() +
                " кольору.\n"
                + "Максимальна швидкість літака " + getMaxSpeed()+
                "км./год.\n Вмісткість баку: " + getTankVal() + " л.\n ");

        out.print("Габаритти літака:\n Довжина: " +super.getWidth()+ " м.\n Висота: " + super.getHeight() + " м.\n "
                + "Вага: " +super.getWidth()
                + " т.\n");
        out.print("\n Якщо Ви готові злітати, натисніть y: ");
    }

    /**
     *
     */
    @Override
    public void Takeoff() {
        out.println("Злітаємо\n На датчиках: \n\tПалива: " + getTankVal() +
                " л. Така кількість палива дозволить Вам літати: "
                + getDictanceWithvalTank() + " годин\n "
                + " ");

        out.println("Тепер давайте поманевруємо.\n "
                + "Для маневрів використовуйте літери u(вверх),"
                + "l(ліво), r(право), d(вниз)\n"
                + "або ми можемо перейти до завдання - t: ");
    }

}