package az.workout.domain;

import java.io.Serializable;

public class Language implements Serializable {
    private  long id;
    private  String  name;

    public Language() {
        this.id = 0;
        this.name = "";
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
