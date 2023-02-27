package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Иван");
        User user2 = new User("Петр");
        User user3 = new User("Анна");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Чем занимаешься?");

        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "Пишу курсовую");
        user2.sendMessage(user1, "А ты чем?");

        user3.sendMessage(user1, "Привет!");
        user3.sendMessage(user1, "Как самочувствие?");
        user3.sendMessage(user1, "Какие планы?");

        user1.sendMessage(user3, "Привет!");
        user1.sendMessage(user3, "Уже лучше");
        user1.sendMessage(user3, "Пока не думал.");

        user3.sendMessage(user1, "Пойдем в кино?");

        MessageDatabase.showDialog(user1, user3);
    }
}
