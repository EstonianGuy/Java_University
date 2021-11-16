package eightPractice.Practice;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

abstract public class WaitList<E> implements lWaitList<E>{
    protected ConcurrentLinkedQueue<E> content;
    WaitList(){
        this.content = new ConcurrentLinkedQueue<>();
    }
    WaitList(Collection <E> c){
        this.content = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public String toString() {
        return "WaitList:\n\t" + content.stream().map(Object::toString).collect(Collectors.joining("\n\t"));
    }

    @Override
    public void add(E element) {
        this.content.add(element);
    }

    @Override
    public E remove() {
        return this.content.remove();
    }

    @Override
    public boolean contains(E element) {
        return this.content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return this.content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return (this.content.size() == 0);
    }
}
