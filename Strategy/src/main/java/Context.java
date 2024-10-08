public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void useStartegy(int[] arr) {
        this.strategy.sort(arr);
    }
}
