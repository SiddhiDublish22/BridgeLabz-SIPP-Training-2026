import java.util.Scanner;

public class DeckOfCards {

  static String[] initializeDeck() {
    String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

    String[] ranks = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King", "Ace"
    };

    int numOfCards = suits.length * ranks.length;
    String[] deck = new String[numOfCards];

    int index = 0;

    for (int i = 0; i < suits.length; i++) {
      for (int j = 0; j < ranks.length; j++) {
        deck[index] = ranks[j] + " of " + suits[i];
        index++;
      }
    }

    return deck;
  }

  static String[] shuffleDeck(String[] deck) {
    int n = deck.length;

    for (int i = 0; i < n; i++) {
      int randomCardNumber = i + (int) (Math.random() * (n - i));

      String temp = deck[i];
      deck[i] = deck[randomCardNumber];
      deck[randomCardNumber] = temp;
    }

    return deck;
  }

  static String[][] distributeCards(String[] deck, int cards, int players) {
    if (cards % players != 0) {
      return null;
    }

    String[][] playerCards = new String[players][cards / players];

    int index = 0;

    for (int i = 0; i < players; i++) {
      for (int j = 0; j < cards / players; j++) {
        playerCards[i][j] = deck[index];
        index++;
      }
    }

    return playerCards;
  }

  static void printCards(String[][] playerCards) {
    for (int i = 0; i < playerCards.length; i++) {
      System.out.println("\nPlayer " + (i + 1) + " cards:");

      for (int j = 0; j < playerCards[i].length; j++) {
        System.out.println(playerCards[i][j]);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] deck = initializeDeck();
    deck = shuffleDeck(deck);

    System.out.print("Enter number of cards to distribute: ");
    int cards = sc.nextInt();

    System.out.print("Enter number of players: ");
    int players = sc.nextInt();

    if (cards > 52) {
      System.out.println("Only 52 cards are available.");
      return;
    }

    String[][] playerCards = distributeCards(deck, cards, players);

    if (playerCards == null) {
      System.out.println("Cards cannot be distributed equally.");
    } else {
      printCards(playerCards);
    }
  }
}