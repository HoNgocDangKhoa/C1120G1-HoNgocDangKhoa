package bai4_class_object.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
    }

    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void star(){
        startTime=System.currentTimeMillis();
    }
    public void stop(){
        endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){

        return this.endTime-this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopwatch=new StopWatch();
        stopwatch.star();
        System.out.println("star: "+stopwatch.getStartTime());
        for(int i=0;i<500000;i++){
            for(int j=0;j<500000;j++){
            }
        }
        stopwatch.stop();
        System.out.println("stop: "+stopwatch.getEndTime());
        System.out.println("khoảng: "+ stopwatch.getElapsedTime());
    }
}
