package task7;

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;


public class Sy27 extends AircraftControl implements Features{

    private Scanner data = new Scanner(System.in);
    /**
     * Construct which determines the
     * maxSpeed, color, value of tank of the plane.
     * Also getting dimensions.
     *
     * @param maxSpeed
     * @param planeColor
     */
    public Sy27(int maxSpeed, String planeColor, int tankVal,
                int w, int h, int weight) {
        super(maxSpeed, planeColor, tankVal);
        super.setHeight(h);
        super.setWidth(w);
        super.setWeight(weight);
    }
    /**
     * Overrides the interface class,
     * which tells that plane is invisible during
     * the some time. This time being installed randomly.
     *
     */
    @Override
    public int StealthTechnology() {

        Random stelth = new Random();
        return (int) ( stelth.nextInt(40) );

    }

    /**
     * Overrides the interface class,
     * which displays the count of
     * nuclear bombs which to be drooped.
     *
     */

    @Override
    public int NuclearStrike(int Bomb) {

        return Bomb;

    }

    /**
     * Overrides the interface class
     * which shows the speed of the plane and is
     * bigger than maxSpeed.
     *
     */
    @Override
    public int TurboAcceleration() {
        Random acsSpeed = new Random();

        int accelerate = super.getMaxSpeed() + acsSpeed.nextInt(15);

        return accelerate - super.getMaxSpeed();
    }
    /**
     * Override methods after not landing.
     */
    @Override
    public void Takeoff() {

        super.Takeoff();

        // Initializing a field which holds data the console about the aircraft's moving.
        String moves = data.next();

        if(moves.equals("u") || moves.equals("l") || moves.equals("r") || moves.equals("d")) {

            moves(moves);

        } else if(moves.equals("t")){

            out.println("Добре.\n Отже, Ви готові до завдання."
                    + "Вам необхідно заховатись від радарів.\n "
                    + "Щоб включити режим 'StealthTechnology' натисніть y: ");

            String stelth = data.next();

            if(stelth.equals("y")) {
                this.atack(true, false);

            } else {
                this.atack(false, true);
            }
        }
        data.close();
    }
    /**
     * The method helps to control the aircraft.
     * @param moves
     */

    public void moves(String moves) {

        switch(moves) {
            case "u":
                out.println("Ви піднялися на висоту: " + super.moveUp() + " km.");
                out.println("Здійсніть маневр  в інші сторони "
                        + "- l(вліво) , r(право), d(вниз)"
                        + "\n або Ви можете перейти до завдання - t(task): ");
                String u = data.next();

                if(u.equals("u")){
                    moves(u);
                    break;
                }else taskAnswer(u);
            break;
            case "l":
                out.println("Ви повернули вліво на: " + super.moveLeft() + " m.");
                out.println("Здійсніть маневр  в інші сторони "
                        + "- u(вверх) , r(право), d(вниз)\n або Ви можете перейти до завдання - t(task): ");
                String l = data.next();

                if(l.equals("l")){
                    moves(l);
                    break;
                }else taskAnswer(l);
            break;
            case "r":
                out.println("Ви повернули вправо на: " + super.moveRight() + " m.");
                out.println("Здійсніть маневр  в інші сторони - u (вверх) , l(вліво), d(вниз)"
                        + "\n або Ви можете перейти до завдання - t(task): ");
                String r = data.next();

                if(r.equals("r")){
                    moves(r);
                    break;
                }else taskAnswer(r);
            break;
            case "d":
                out.println("Ви опустилися вниз на: " + super.moveDown() + " km.");
                out.println("Здійсніть маневр  в інші сторони - u (вверх) , l(вліво), r(право)"
                        + "\n або Ви можете перейти до завдання - t(task): ");
                String d = data.next();

                if(d.equals("d")){
                    moves(d);

                }else taskAnswer(d);
            break;
            default:
                out.println("Ви не здіснили маневру. ");
                super.Takeoff();
                break;
        }
        data.close();

    }

    /**
     * Answer for user action in the console.
     * @param an
     */
    private void taskAnswer(String an) {
        if(an.equals("t")) {

            out.println("Добре.\n Отже, Ви готові до завдання."
                    + " Вам необхідно заховатись від радарів.\n "
                    + " Щоб включити режим 'StealthTechnology' натисніть y: ");

            String stelth = data.next();

            if(stelth.equals("y")) {
                this.atack(true, false);

            } else {
                this.atack(false, true);

            }

        }else {
            moves(an);

        }
    }

    /**
     * The method describes attack using bombs.
     * @param yes
     * @param no
     */
    public void atack( boolean yes, boolean no ) {

        if(yes) {
            out.println("StealthTechnology увімкнено. Вас не буде видно радарам протягом " +
                    this.StealthTechnology()+ " хв.\n Тепер можна виконати завдання. "
                    + "Вкажіть скільки бомб необхідно скинути: ");
            int bomb = data.nextInt();
            if(bomb > 10) {
                out.print("Слідкуйте за датчиками. У Вас всього 10 бомб! ");
                this.Takeoff();
            }else {
                out.print("Ви скинули " + this.NuclearStrike(bomb) + " бомб.\n"
                        + " Завдання виконано успішно! Повертаємось!\n"
                        + " Необхідно включити прискорення. Натисність s: ");
                String speed = data.next();

                if(speed.equals("s")) {
                    out.print("Прискорення включено!\n Ваша швидкість більша за максимальну на: " +
                            this.TurboAcceleration() + " km/h\n");
                    out.print(" Ви наближаєтесь до посадкової смуги.\n "
                            + "Щоб посадити літак наберіть команду - land: ");
                    String land = data.next();
                    if(land.equals("land")) {
                        String info = "Ваш літак успішно приземлився!\n "
                                + "Не забудьте зайти за нагородою за виконане завдання!";
                        out.print(super.Landing(info));
                    } else {
                        this.Takeoff();
                    }


                } else {
                    out.print("Вас наздогнали та знищили. "
                            + "Для Вас - Game Over ");
                }
            }


        }else {
            out.print("Ви не увійшли в режим неведимки. Вас помітили та знищили. "
                    + "Для Вас - Game Over ");
        }
        data.close();
    }
}