

public class Card{

    private CardSuit suit;
    private CardRank rank;
    protected boolean isFaceUp;

    //Constructor

    public Card(CardRank rank, CardSuit suit ){
        this.rank=rank;
        this.suit=suit;
        isFaceUp =false;
    }

    //public method
    public String GetSuit()
    {
        return suit.printSuit();
    }
    public int GetRank()
    {
        return rank.getRank();
    }

    //returning the card
    public String toString()
    {
        String str="";
        if (isFaceUp) {
           str+=rank.PrintRanks()+ " of "+ suit.printSuit()+" \n"; 
        }
        
      else{
        str= "Face down(Nothing to see here)";
      }
      return str;
    }


    public void flipCard()
    {
        isFaceUp=!isFaceUp;
    }


    //PRINT RANK
    public String PrintRank()
    {
        //GETTING RANK AS STRING
        return rank.PrintRanks();
    }


}