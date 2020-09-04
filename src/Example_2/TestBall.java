package Example_2;

import javax.sound.midi.SysexMessage;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(100,100);
        Ball b2 = new Ball(150,200);
        System.out.println(b1);
        System.out.println(b2);
        b1.move(30,15);
        b2.move(40,10);
        System.out.println(b1);
        System.out.println(b2);
    }
}
