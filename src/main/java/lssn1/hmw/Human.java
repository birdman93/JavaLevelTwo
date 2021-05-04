package lssn1.hmw;

public class Human implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;
    private boolean success = true;

    public Human(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Человек " + getName() + " пробегает " + getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Человек " + getName() + " прыгает " + getJumpHeight());
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int runDistance(){
        return this.runDistance;
    }

    @Override
    public int jumpHeight() {
        return this.jumpHeight;
    }

    // Геттеры и Сеттеры
    public String getName() {
        return name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public boolean getSuccess() {
        return success;
    }

    @Override
    public void setSuccess() {

    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

}
