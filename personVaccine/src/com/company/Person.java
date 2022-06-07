package com.company;

public class Person {
    private int id;
    private String name;
    private long timecode;

    public Person(int id, String name, long timecode) {
        this.id = id;
        this.name = name;
        this.timecode = timecode;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getTimecode() {
        return timecode;
    }
}
