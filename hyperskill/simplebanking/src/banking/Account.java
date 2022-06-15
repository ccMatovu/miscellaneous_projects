package banking;

public class Account {
    private Card card;

    public Account(){
        card = new Card();
    }
    public long cardNumber(){
        return card.getNumber();
    }

    public int cardPin(){
        return card.getPin();
    }
    public String toString(){
        return String.format("%s\n%s\n%d\n%s\n%d",
                "Your card has been created",
                "Your card number:",
                cardNumber(),
                "Your card PIN:",
                cardPin());
    }
}
