package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/24/16.
 */
import java.util.ArrayList;
public class CardDeck {

    private ArrayList<Card> deck;
    public CardDeck(){
        deck = new ArrayList<Card>();
    }
    private String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs" };
    private String[] rank = {"Ace", "2", "3", "4","5","6","7","8","9","10","Jack","Queen","King" };

    public void buildDeck(){
        Card card;
        int s =0;
        int r = 0;
        for (int i = 0; i<52; i++){
            card = new Card(suits[s], rank[r]);
            deck.add(card);
            r++;
            if(r>12){
                r = 0;
                s++;
            }
        }
    }
    public void shuffleDeck(){
        for (int i = 0; i < deck.size(); i++){
            int index = (int)(Math.random() * deck.size());
            Card temp = deck.remove(index);
            deck.add(temp);
        }

    }
    public Card drawCard(){
        Card removedCard = deck.remove(0);
        return removedCard;
    }
    public ArrayList<Card> getDeck(){
        return deck;
    }
}
