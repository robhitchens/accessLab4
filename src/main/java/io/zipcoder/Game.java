package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/24/16.
 */
public class Game {
    public static void main(String[] args){
        Game game = new Game(4);
    }
    private Human[] players;
    private CardDeck gameDeck;
    public Game(int numOfPlay){
        players = new Human[numOfPlay];
        gameDeck = new CardDeck();
        gameDeck.buildDeck();
        gameDeck.shuffleDeck();
        gameDeck.shuffleDeck();//double shuffle
        for(int i = 0; i<numOfPlay; i++){
            players[i] = new Human(i);
        }
        playGame(numOfPlay);
    }
    public void playGame(int numOfPlayers){
        int playerTurn = 0;
        Card temp = null;
        int allAceFound = 0;
        int round = 0;
        boolean keepGoing = true;
        while(keepGoing){

            if(!players[playerTurn].getAceStatus()) {
                temp = gameDeck.drawCard();
                players[playerTurn].addCard(temp);
            }
            if(temp.getSuit().equals("Ace")){
                players[playerTurn].changeAceFound();
                allAceFound++;
            }
            if(gameDeck.getDeck().isEmpty()){//if for whatever reason an ace doesn't appear in the deck
                break;
            }
            playerTurn++;
            if(playerTurn>=numOfPlayers){
                playerTurn = 0;
            }
            round++;
            System.out.println("end of round "+round+ " results: ");//there is something not working correctly
            for(int i = 0; i < numOfPlayers; i++){
                players[i].calcScore();
                System.out.println("player #"+i+" score is: "+players[i].getScore());
            }
            if(allAceFound == numOfPlayers){
                //keepGoing = false;
                break;
            }
        }
        int max = 0;
        Human winner = null;
        for(int i = numOfPlayers-1; i>=0; i--){
            if(players[i].getScore()>max) {
                max = players[i].getScore();
                winner = players[i];
            }
        }
        System.out.println("player #"+winner.getId() + " a winner is you!");

    }
}
