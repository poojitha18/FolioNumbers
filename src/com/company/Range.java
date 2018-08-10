package com.company;

public class Range {
    int start;
    int end;

    public Range(int start, int end){
        this.start = start;
        this.end = end;
    }

    public boolean isOverlap(Range r2){
        return ((this.start <= r2.end)&&(r2.start<=this.end));
    }

    public boolean isCompletelySmaller(Range r2){
        return (this.end < r2.start);
    }

    public boolean isCompletelyBigger(Range r2){
        return (this.start > r2.end);
    }
}
