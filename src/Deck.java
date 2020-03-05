import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        for (String rank : Card.RANK) {
            for (String suit : Card.SUIT) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList<Card> getDeck(){
        return deck;
    }

    public int getLength(){
        return deck.size();
    }

    public Card getCard(int num){
        return deck.get(num);
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }
    public String toString(){
        String result = "";
        for(int i = 0; i<deck.size();i++){
            result+= deck.get(i).toString() + "\n";
        }
        return result;
    }
    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println(d.getDeck());
        d.shuffle();
        System.out.println(d.getDeck());
    }
}
