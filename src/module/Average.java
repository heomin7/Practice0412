package module;

/**
 * Created by she3547 on 2017-04-12.
 */
public class Average {
    private String yearId;
    private long average;

    public Average() {
    }

    public Average(String yearId, long average) {
        this.yearId = yearId;
        this.average = average;
    }

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public long getAverage() {
        return average;
    }

    public void setAverage(long average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Average{" +
                "yearId='" + yearId + '\'' +
                ", average=" + average +
                '}';
    }
}
