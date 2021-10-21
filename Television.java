package television;
import java.util.Scanner;
public class Television {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TV t1 = new TV();
        t1.channel=70;
        t1.volumeLevel=5;
        t1.on=false;
        t1.channelUp();
        t1.turnOn();
        t1.volumeDown();
        System.out.println(t1.channel);
        System.out.println(t1.volumeLevel);
        System.out.println(t1.on);
        t1.setChannel(55);
        System.out.println(t1.channel);
    }
    
}
