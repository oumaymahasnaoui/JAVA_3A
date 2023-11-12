package tn.esprit.exception;

public class ZooFullException extends Exception {
    public ZooFullException() {
        super("The zoo is full. Cannot add more animals.");
    }
}