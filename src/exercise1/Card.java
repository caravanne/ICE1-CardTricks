package exercise1;
import java.util.Arrays;

// @author Mykyta Varnikov 2023
 
public class Card {

  public static int rank;
   public static String suit;

   public Card(int rank, String suit){
       this.rank=rank;
       this.suit=suit;
   }
   public boolean equals(Object obj){
       if (this == obj){
           return true;
       }
       if (obj == null || getClass() != obj.getClass()){
           return false;
       }
       Card other = (Card) obj;
       return rank == other.rank && suit.equals(other.suit);
   }
   public int Code(){
       return Arrays.hashCode(new Object[]{rank,suit});
   }
}
