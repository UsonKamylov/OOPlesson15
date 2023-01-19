import java.util.Arrays;

public class Gruoppa {
    private String[] array;
    private String learn;
    private String data;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Gruoppa(String[] array, String learn, String data) {
        this.array = array;
        this.learn = learn;
        this.data = data;

    }

    @Override
    public String toString() {
        return "Gruoppa{" +
                "array=" + Arrays.toString(array) +
                ", learn='" + learn + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
