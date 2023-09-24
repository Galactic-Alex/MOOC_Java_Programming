public class Timer {
    private ClockHand hundredthOfSecond = new ClockHand(100);
    private ClockHand seconds = new ClockHand(60);

    @Override
    public String toString() {
        return seconds + ":" + hundredthOfSecond;
    }

    public void advance() {
        hundredthOfSecond.advance();
        if (hundredthOfSecond.value() == 0) {
            seconds.advance();
        }
    }

}
