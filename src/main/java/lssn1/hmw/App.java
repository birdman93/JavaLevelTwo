package lssn1.hmw;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        // Генерация рандомных значений для дистанции бега и высоты прыжка
        int humanDist = (int) ((Math.random()+4)*1000);
        int humanHeight = (int) ((Math.random()+1)*3);
        int catDist = (int) ((Math.random()+1)*1000);
        int catHeight = (int) ((Math.random()+1)*7);
        int robotDist = (int) ((Math.random()+9)*1000);
        int robotHeight = (int) ((Math.random()+1)*2);

        // Создание Массива участников соревнования
        Actions [] actions = new Actions[3];
        actions[0] = new Human("Иван", humanDist, humanHeight);
        actions[1] = new Cat("Барсик", catDist, catHeight);
        actions[2] = new Robot("Бэндер", robotDist, robotHeight);

        // Создание массива препятствий
        Obstacle [] obstacles = new Obstacle[6];
        obstacles[0] = new Road((int) ((Math.random()+1)*1000));
        obstacles[1] = new Wall((int) ((Math.random()+1)*2));
        obstacles[2] = new Road((int) ((Math.random()+1)*2000));
        obstacles[3] = new Wall((int) ((Math.random()+1)*3));
        obstacles[4] = new Road((int) ((Math.random()+1)*5000));
        obstacles[5] = new Wall((int) ((Math.random()+1)*5));


        System.out.println("Старт состязания!");
        for (int i = 0; i < actions.length; i++) {
            System.out.println("На арене: " + actions[i].name());
            for (int j = 0; j < obstacles.length; j++) {
                if(obstacles[j].checkTwo(actions[i])) {
                    obstacles[j].check(actions[i]);
                } else {
                    System.out.println("Участник " + actions[i].name() + " провали испытание и выбыл из состязания.");
                    break;
                }
            }
        }


    }
}
