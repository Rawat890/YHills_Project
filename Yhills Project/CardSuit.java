public enum CardSuit {
    
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamond"),
    CLUBS("Clubs");

    private final String suitText;

    //Constructor CardSuit
    private CardSuit(String suitText){
        this.suitText=suitText;
    }

    public String printSuit()
    {
        return suitText;
    }
}
