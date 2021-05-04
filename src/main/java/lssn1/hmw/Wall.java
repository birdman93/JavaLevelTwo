package lssn1.hmw;

public class Wall implements Obstacle {
    private int height;

    public Wall (int height) {
        this.height = height;
    }

    @Override
    public void check(Actions actions) {
        if (actions.jumpHeight() >= height)
            System.out.println("Испытание пройдено. Персонаж подпрыгнул на высоту: " + height);
        else
            System.out.println("Испытание провалено. Нужно было пробежать: " + height + ". Фактическая дистанция: " + actions.jumpHeight());
    }

    @Override
    public boolean checkTwo(Actions actions) {
        if (actions.jumpHeight() >= height)
            return  true;
        else {
            return false;
        }
    }

}



