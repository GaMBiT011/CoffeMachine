/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Currency;
import java.util.Map;

/**
 *
 * @author student1
 */
public abstract class Node {

    protected Node next;
    protected int notesNumber;

    public void setNext(Node cvor) {
        next = cvor;
    }

    public Node getNext() {
        return next;
    }

    public abstract void getCurrency(Currency currency, Map<String, Integer> map) throws Exception;

    public void addNotes(int notesNumber) {
        this.notesNumber += notesNumber;
    }

    public int getNotesNumber() {
        return notesNumber;
    }

    @Override
    public String toString() {
        return this.getClass() + " ";
    }
}
