import java.util.ArrayList;

public class HandClass {

    protected ArrayList<Card> cards;

    // Constructor
    public HandClass()
   {
    cards= new ArrayList<Card>();
   }


   //clearing the cards flipped
   public void clear()
   {
    cards.clear();
   }

   //adding card function
   public void add(Card card)
   {
    cards.add(card);
   }

   public String ShowHandClass()
   {
    boolean allFaceUp=true;
    String str = " ";

    for (Card c : cards) {
        str+=c.toString();
        if (!c.isFaceUp) {
            allFaceUp =false;
        }
        
    }

    if (allFaceUp) {
        str+=" Total points: "+getTotalPoints()+" \n";
    }
    return str;
   }

   
   public void flipCards()
   {
    for (Card c : cards) {
        c.flipCard();
    }
   }

   //Giving card 
   public boolean Give(Card card, HandClass Other){
    if (!cards.contains(card)) {   //checking if the cards exist or not
        return false;
    }
    else{
        
        cards.remove(card);
        Other.add(card);
        return true;
    }

   }


   //return the total points of a hand
   public int getTotalPoints(){
    int total=0;

    boolean hasAce = false;

    //Getting points (any ace by default will be worth  value=1)
    for (int i = 0; i < cards.size(); i++) {
        total += cards.get(i).GetRank();

        //checking if the cards is ace
        if (cards.get(i).PrintRank()=="Ace") {
            hasAce=true;
        }

        if (hasAce && total <=13) {
            total +=12;
        }
    }
    return total;

   }

}
