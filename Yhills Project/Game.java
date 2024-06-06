//PROJECT- CREATING DECK OF CARD GAME  --> INTERNSHIP PROJECT
public class Game {
 
   //MAIN GAME CLASS IN WHICH WE CREATE THE CARDS AND PLAY THE GAME
    public static void main(String[] args) {
        
        Card c1, c2;
        c1= new Card(CardRank.KING, CardSuit.HEARTS);
        c2= new Card(CardRank.JACK, CardSuit.HEARTS);

        

        //FLIPPING THE CARDS
        c1.flipCard();
        c2.flipCard();

     /*    if (c1.GetRank() > c2.GetRank()) {
            System.out.println(c1.toString()+ " is greater than "+c2.toString());
        }else{
            System.out.println(c1.toString()+ " is not greater than "+c2.toString());
        }

        if (c1.GetSuit()==c2.GetSuit()) {
            System.out.println(c1.toString()+ " has same suit as that of "+c2.toString());
        }
        else{
            System.out.println(c1.toString()+ " has not same suit as that of "+c2.toString());
        }

        System.out.println("After flipping card 1: "+c1.toString());
        System.out.println("After flipping card 2: "+c2.toString());


        //CREATING HAND
        HandClass h1 = new HandClass();
        HandClass h2 = new HandClass();
        h1.add(c1);
        h1.add(c2);
        System.out.println(h1.ShowHandClass());

        h1.Give(c1, h2);
        System.out.println("Hand 1 is : "+h1.ShowHandClass()+"\nHand 2 is : "+h2.ShowHandClass());
*/
        //CREATING A DECK
        DeckOfCard d1= new DeckOfCard();
        d1.Populate();
        System.out.println("Deck has the following cards BEFORE SHUFFLED : \n"+d1.ShowHandClass());
   
        d1.Shuffle();
        System.out.println("\nDeck has now following cards AFTER SHUFFLED: \n"+d1.ShowHandClass());
   
        HandClass h1, h2, h3;
        HandClass dealer;
        h1=new HandClass();
        h2=new HandClass();
        h3=new HandClass();
        dealer=new HandClass();

        HandClass[] hand= {h1,h2,h3};


        //Deal cards to the hands
        d1.Deal(dealer, 2);

        d1.Deal(dealer, 2);

        //show players hand
        for (int i = 0; i < hand.length; i++) {
            hand[i].flipCards();
            System.out.println(hand[i].ShowHandClass());
        }
   
    }
}
