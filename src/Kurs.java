import java.util.Arrays;

public class Kurs {
    private String name;
    private int nomer;
    private String NameTeacher;
    private String[] gr;

    public Kurs(String name, int nomer, String nameTeacher, String[] gr) {
        this.name = name;
        this.nomer = nomer;
        NameTeacher = nameTeacher;
        this.gr = gr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getNameTeacher() {
        return NameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        NameTeacher = nameTeacher;
    }

    public String[] getGr() {
        return gr;
    }

    public void setGr(String[] gr) {
        this.gr = gr;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "name='" + name + '\'' +
                ", nomer=" + nomer +
                ", NameTeacher='" + NameTeacher + '\'' +
                ", gr=" + Arrays.toString(gr) +
                '}';
    }
}
