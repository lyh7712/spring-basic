package lyh7712.springbasic.user.test;

public class Dollar extends Money {

    private int amount;

    public Dollar() {
    }

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

    public static void main(String[] args) {
        Dollar dollar = new Dollar();
        System.out.println(dollar.number);

    }

}
