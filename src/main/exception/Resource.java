package main.exception;

public class Resource {

    int id;

    public Resource(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public boolean checkId() {
        if (id == 10){
            return true;
        }
        return false;
    }
}
