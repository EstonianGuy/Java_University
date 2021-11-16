package eightPractice.Practice;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {
    UnfairWaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    @Override
    public E remove() {
        return this.content.remove();
    }

    public void moveToBack(E seekingElement) {
        boolean found = false;

        int size = this.content.size();
        for (int i = 0; i < size; i++) {
            E currentElement = this.content.remove();

            if (currentElement.equals(seekingElement))
                found = true;
            else
                this.content.add(currentElement);
        }

        if (found)
            this.content.add(seekingElement);
    }
}
