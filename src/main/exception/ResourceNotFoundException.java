package main.exception;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(){
        super("resource not found");
    }
}
