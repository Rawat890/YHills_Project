import java.util.Random;

public class DeckOfCard extends HandClass{
    
  Random rand= new Random();

    public void Populate()
    {
      for (CardSuit suit : CardSuit.values()) {
       for (CardRank rank  : CardRank.values()) {
         Card card = new Card(rank, suit);
         card.flipCard();
         this.add(card);
       }
      }
    }

    public void Shuffle()
    {
      for (int i = cards.size() -1; i > 0; i--) {
        //Swapping a random card between 1st and 2nd
        int pick = rand.nextInt(i);
        Card RandCard = cards.get(pick);
        Card LastCard = cards.get(i);
        cards.set(i, RandCard);
        cards.set(pick, LastCard);

      }
    }

    public void Deal(HandClass hand, int perHand){
    for (int i = 0; i < perHand; i++) {
      this.Give(cards.get(i), hand);
    }
    }

    public void flipCard(Card c){
      c.flipCard();
    }
}
