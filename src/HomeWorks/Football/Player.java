package HomeWorks.Football;

public class Player {
    private int stamina;
    static private int countPlayers = 0;
    static final private int MAX_STAMINA = 10;
    static final private int MIN_STAMINA = 0;


    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        stamina--;
        System.out.println(this);
        if (stamina == 0) {
            countPlayers--;
            System.out.println("Игрок ушёл с поля отдыхать");
        } else {
            stamina = MIN_STAMINA;
            System.out.println("Игрок отдыхает");
        }
    }

    public void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. Свободных мест: " + countPlayers);
        } else if (countPlayers == 6) {
            System.out.println("Команды полные, игроков на поле: " + countPlayers);
        } else {
            countPlayers--;
            System.out.println("Вышел лишний игрок, убираем одного игрока");
        }
    }

    @Override
    public String toString() {
        return "Выносливость: " + stamina;
    }
}
