package bai4_class_object.bai_tap;

public class test_2 {
    private long startTime;
    private long endTime;

    public test_2() {

    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        test_2 test2 = new test_2();
        test2.start();
        System.out.println(test2.getStartTime());
        for (int i = 0; i < 10000000; i++) {
            for (int j = 1; j < 100000000; j++) {
            }
        }
        test2.stop();
        System.out.println(test2.getEndTime());
        test2.getElapsedTime();
        System.out.println(test2.getElapsedTime());
    }
}