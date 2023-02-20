package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;

    private static int countPlayers;
    public Player(int stamina) {

        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    public int getStamina() {
        return stamina;
    }
    public int getCountPeople() {
        return countPlayers;
    }
    public void run() {
        if (stamina == 0) {
            return;
        }
            stamina--;
            if (stamina == 0) {
                countPlayers--;
            }

    }
        public static void info() {
        if (countPlayers == 5) {
        System.out.println("Команды неполные. На поле еще есть 1 свободное место");
        }else if (countPlayers == 4) {
            System.out.println("Команды неполные. На поле еще есть 2 свободных места");
        } else if (countPlayers == 3) {
            System.out.println("Команды неполные. На поле еще есть 3 свободных места");
        }else if (countPlayers == 2) {
            System.out.println("Команды неполные. На поле еще есть 4 свободных места");
        }else if (countPlayers == 1) {
            System.out.println("Команды неполные. На поле еще есть 5 свободных мест");
        }else if (countPlayers == 0) {
            System.out.println("На поле нет ни одного игрока");
        }else if (countPlayers == 6) {
            System.out.println("Мест в командах больше нет");
        }
        }
}


