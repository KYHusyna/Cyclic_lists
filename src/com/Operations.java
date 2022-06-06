package com;

public class Operations extends Main {
    private Info head;
    private Info tail;

    public Operations() {
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }


    public void addLast(char data) {
        Info temp = new Info(data);
        System.out.println("check if queue is empty");

        if (isEmpty()) {
            head = temp;
            tail = head;
            System.out.println(" queue is empty, first element: " + data);
        } else {
            System.out.println(" queue has elements, new element: " + data);
            tail.pNext = temp;
            temp.pPrevious = tail;
            tail = temp;
            tail.pNext = head;
        }

        System.out.println("make Bidirectional queue cyclic");
    }

    public void showFirst(){
        Info temp = head;
        if (head == null) {
            System.out.println("queue is empty, can't show");
        } else {
            System.out.println("first element: " + temp.data);
        }
    }

    public void sum(){
        Info temp = head;
        int sum= Integer.parseInt(String.valueOf(temp.data));
        if (head == null) {
            System.out.println("queue is empty, can't calc");
        } else {
            while(temp!=tail) {
                temp = temp.pNext;
                sum += Integer.parseInt(String.valueOf(temp.data));
            }
            System.out.println("calc: " + sum);
        }
    }

    public void deleteFirst() {
        Info temp = head;

        if (head == null) {
            System.out.println("queue is empty, can't delete");
        } else if (head.pNext == null) {
            head = null;
            System.out.println(" delete only element: " + temp.data);
        } else {
            System.out.println(" delete first element: " + temp.data);
            head = head.pNext;
        }
        head.pPrevious = null;
        tail.pNext = head;
        System.out.println("check Bidirectional queue cyclic");
    }

    public void twiced() {

        Info elcounts = head;
        Info first = tail;
        Info second = tail;
        System.out.println("make bifurcation Bidirectional cyclic queue ");

        int i = 1;

        while (elcounts != tail) {
            i++;
            elcounts = elcounts.pNext;
        }

        elcounts = head;
        int ost = i % 2;
        int fir = i / 2;
        i = 0;

        if (ost == 0) {
            System.out.println("first");
            while (i < fir) {
                first = elcounts;
                System.out.println(first.data);
                elcounts = elcounts.pNext;
                i++;
            }
            i = fir / 2;
            System.out.println("second");

            while (i <= fir) {
                second = elcounts;
                System.out.println(second.data);
                elcounts = elcounts.pNext;
                i++;
            }
            second.pNext = head;
            first.pNext = head;
            System.out.println("make Bidirectional queue's cyclic\n\n");
        } else
            System.out.println("not even number try add or delete");


    }


    public void print() {
        Info temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.pNext;
            if (temp == tail.pNext)
                temp = null;
        }
    }
}

