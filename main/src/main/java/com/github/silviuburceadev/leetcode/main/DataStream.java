package com.github.silviuburceadev.leetcode.main;

public class DataStream {
    private final int value;
    private final int k;
    private int need;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        this.need = k;
    }

    public boolean consec(int num) {
        if (num != value) {
            need = k;
        } else if (need > 0) {
            need--;
        }
        return need == 0;
    }
}
