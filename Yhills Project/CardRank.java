public enum CardRank {
    
    ACE(1,"Ace"), DEUCE(2, "Deuce"), THREE(3,"Three"), FOUR(4, "Four"), FIVE(5,"Five"),
    SIX(6, "Six"), SEVEN(7, "Seven"), EIGHT(8, "Eight"), NINE(9, "Nine"), TEN(10, "Ten"), JACK(11,"Jack"), QUEEN(12, "Queen"),
    KING(13, "King");
    
    private final int RankValue;
    private final String RankString;

    //constructor
    private CardRank(int RankValue, String RankString){
      this.RankValue=RankValue;
      this.RankString=RankString;
    }

    //public methods
    public int getRank()
    {
        return RankValue;
    }
    public String PrintRanks()
    {
        return RankString;
    }
}
