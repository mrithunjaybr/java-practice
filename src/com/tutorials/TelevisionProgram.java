package com.tutorials;

public class TelevisionProgram {
    String tvshow = "";
    int time = 0;

    @Override
    public String toString() {
        return "TelevisionProgram{" +
                "tvshow='" + tvshow + '\'' +
                ", time=" + time +
                '}';
    }

    public String getTvshow() {
        return this.tvshow;
    }

    public int getTime() {
        return this.time;
    }

    public TelevisionProgram(String tvshow, int time) {
        this.tvshow = tvshow;
        this.time = time;
    }
}
