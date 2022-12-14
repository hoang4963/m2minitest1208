package model;

import java.io.Serializable;

public class Nguoi implements Serializable {
    private String name;
    private long cmnd;
    private String birthDay;

    public Nguoi(String name, long cmnd, String birthDay) {
        this.name = name;
        this.cmnd = cmnd;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCmnd() {
        return cmnd;
    }

    public void setCmnd(long cmnd) {
        this.cmnd = cmnd;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", cmnd=" + cmnd +
                ", birthDay=" + birthDay +
                '}';
    }
}
