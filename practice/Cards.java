

public class Cards {
    public static void main(String[] args) {
        String[] SUITS = {
            "♣", "♦",  "♥",  "♠"
        }; 
        
        String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K", "A"
        };
        
        String[] deck = new String[SUITS.length * RANKS.length];
        
        for(int i =  0; i < SUITS.length; i++){
            for(int j = 0; j < RANKS.length; j++){
                deck[RANKS.length * i + j] = RANKS[j]  + SUITS[i];
            }
        }

        for(int i =  0; i < deck.length; i++){
           int randomNumb =  (int)Math.round(Math.floor(Math.random() * deck.length));
           String temp = deck[i];
            deck[i]  = deck[randomNumb];
            deck[randomNumb] = temp;
        }
        for(int i =  0; i < deck.length; i++){
            System.out.print(deck[i] + "\t");
        }

    }
}