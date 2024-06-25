public abstract class Person {
    protected Hand hand;
    protected String name;

    public abstract void drawCard(Deck deck);

    public abstract void haveTurn(Deck deck);

    public abstract String toString();
}
