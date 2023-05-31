package exercise1;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    private Card[] hand;
    private Random mix;
    Scanner input;
    
    public CardTrick(){
        hand = new Card[7];
        mix = new Random();
        input = new Scanner(System.in);
    }
    public void  startGame(){
        getCardsInHand();
        Card userCard = pickCards();
        while (true) {
            if (searchCard(userCard)) {
                System.out.println("The card matches.");
                break;
            } else {
                System.out.println("No match found.");
                System.out.println("Do you want to try again? (yes/no): ");
                String choice = input.nextLine();
                if (choice.equalsIgnoreCase("no")) {
                    break;
                }
                userCard = pickCards();
            }
        searchCard(userCard);
       }
    }
    private void getCardsInHand(){
        for (int i = 0; i < hand.length; i++){
            int rank = mix.nextInt(13) + 1;
            String suit = getRandomSuit();
            hand[i] = new Card(rank, suit);
        }
    }
        private  String getRandomSuit(){
            String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
            int index = mix.nextInt(suits.length);
            return suits[index];
        }
        private Card pickCards() {
            System.out.println("Pick whatever cards (rank 1-13): ");
            int rank = input.nextInt();
            input.nextLine();
            System.out.println("Choose the suit (Hearts, Diamonds, Spades, Clubs");
            String suit = input.nextLine();
            return new Card(rank, suit);
        }
        private boolean searchCard(Card card) {
        for (Card c : hand) {
            if (c.equals(card)) {
                return true;
            }
        }
        return false;
  }
        public static void main(String[] args) {
        CardTrick trick = new CardTrick();
        trick.startGame();
    }

     // @author Mykyta Varnikov May 2023
     
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");
      
    }
}
