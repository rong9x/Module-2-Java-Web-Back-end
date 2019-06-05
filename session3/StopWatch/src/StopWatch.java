public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    long getStartTime() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    long getEndTime() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    long getElapsedTime() {
        return (this.endTime - this.startTime);
    }
}
