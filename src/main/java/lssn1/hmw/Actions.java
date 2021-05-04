package lssn1.hmw;

public interface Actions {

    String name();
    void run();
    void jump();
    int  runDistance();
    int jumpHeight();
    boolean getSuccess ();
    void setSuccess();

}
