package lyh7712.springbasic.user.test;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiple) {
        return new Dollar(amount * multiple);
    }

    public boolean equals(Object obj) {
        Dollar dollar = (Dollar) obj;
        return amount == dollar.amount;
    }

}
