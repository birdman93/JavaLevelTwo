package lssn1.hmw;

public class Road implements Obstacle {
    private int length;

    public Road (int length) {
        this.length = length;
    }

    @Override
    public void check(Actions actions) {
        if (actions.runDistance() >= length)
            System.out.println("Испытание пройдено. Персонаж преодолел дистанцию: " + length);
        else {
            System.out.println("Испытание провалено. Нужно было пробежать: " + length + ". Фактическая дистанция: " + actions.runDistance());
        }
    }

    @Override
    public boolean checkTwo(Actions actions) {
        if (actions.runDistance() >= length)
            return  true;
        else {
            return false;
        }
    }

}
