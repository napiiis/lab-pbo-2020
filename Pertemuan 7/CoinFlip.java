import java.util.Random;

public class CoinFlip {
     public static void main(String[] args){
         // 50% chance heads, 50% chance tails
         Random rand = new Random();//untuk deklarasi keyword random
         double chance = rand.nextDouble();//untuk mengacak
         if (chance < 0.5) {
             System.out.println("heads!");
         } else {
             System.out.println("tails!");
         }
     }
}

/* Class ini di buat untuk mengetes math random pada coin */