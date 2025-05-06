import java.util.Objects;

public class _002_Personel {

    private int id;
    private String name;

    public _002_Personel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;

        _002_Personel personel = (_002_Personel) o;

        return this.id == personel.id;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "_002_Personel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
