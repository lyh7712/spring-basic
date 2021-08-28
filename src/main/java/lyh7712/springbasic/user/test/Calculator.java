package lyh7712.springbasic.user.test;

public class Calculator {

    private int left, right;

    public void setNumber(int left, int right) {
        this.left = left;
        this.right = right;
    }

    private int sum() {
        return left + right;
    }

    public void plus() {
        System.out.println(sum());
    }
}
