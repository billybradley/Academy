import com.enigma.model.Heroes;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  {
        Heroes gundala = new Heroes(100,100,12);
        Heroes saintama = new Heroes(100,100,11);

        gundala.attack(saintama);
        System.out.println("Saintama==="+saintama.print());
        System.out.println("Gundala==="+gundala.print());

    }
}


//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Choose Your Hero type ");
//        System.out.print("Mage/Tank/Marksman = ");
//        String playerherotype = reader.readLine();
//        Mage babi = new  Mage("Mage");
//        Heroes babi2 = new Heroes(playerherotype);
//        System.out.println(babi2.setPlayerHeroType(playerherotype));
//        System.out.println("Choose Your Enemy Hero type ");
//        System.out.print("Mage/Tank/Marksman = ");
//        String enemyherotype = reader.readLine();
//
