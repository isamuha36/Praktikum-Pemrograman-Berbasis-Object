public class Card {
    private Integer cardNumber;
    private TYPE cardType;

    public enum TYPE {
        DEBIT, CREDIT
    }

    private Integer cardSaldo;
    private Boolean isActive;
    Owner owner;
    private Integer pin;

    public void setCardPin(Integer cardPin) {
        this.pin = cardPin;
    }

    public void setCardSaldo(Integer cardSaldo) {
        this.cardSaldo = cardSaldo;
    }

    public void setCardActive(Boolean cardActive) {
        this.isActive = cardActive;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public Integer getCardSaldo() {
        return cardSaldo;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public Owner getOwner() {
        return owner;
    }

    public Integer getPin() {
        return pin;
    }

    public TYPE getCardType() {
        return cardType;
    }

    public Card(Integer cardNumber, Integer cardSaldo, Boolean isActive, Owner owner, Integer pin, TYPE cardType) {
        this.cardNumber = cardNumber;
        this.cardSaldo = cardSaldo;
        this.isActive = isActive;
        this.owner = owner;
        this.pin = pin;
        this.cardType = cardType;
    }

    public
}
