package ru.danilov.oop.homework.hw3;

public class StreamComparator implements Comparable<Stream> {

    private Stream stream;

    @Override
    public int compareTo(Stream o) {
        if (this.stream.returnSizeGroups() > o.returnSizeGroups())
            return 1;
        else if (this.stream.returnSizeGroups() < o.returnSizeGroups())
            return -1;
        else
            return 0;
    }

    public StreamComparator(Stream A) {
        this.stream = A;
    }
}
