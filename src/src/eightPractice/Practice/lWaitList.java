package eightPractice.Practice;

import java.util.Collection;

public interface lWaitList<E> {
    void add(E element);
    E remove();

    boolean contains(E element);

    boolean containsAll(Collection<E> c);

    boolean isEmpty();
}
