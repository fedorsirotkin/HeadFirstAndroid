package ru.fedorsirotkin.chapter11_workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("Ослабление конечностей",
                    "5 отжиманий\n10 приседаний\n15 подтягиваний"),
            new Workout("Основные тренировки",
                    "100 подтягиваний\n100 отжиманий\n100 приседаний\n100 приседаний"),
            new Workout("Для слабака",
                    "5 подтягиваний\n10 отжиманий\n15 приседаний"),
            new Workout("Сила и длина",
                    "Бег на 500 метров\n21 х 1,5 пуда качания гирями\n21 подтягиваний")
    };

    // Каждый Workout имеет имя и описание
    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
