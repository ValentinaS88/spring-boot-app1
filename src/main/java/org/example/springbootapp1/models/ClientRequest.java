package org.example.springbootapp1.models;

public class ClientRequest {
    private String id;
    private Client data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client getData() {
        return data;
    }

    public void setData(Client data) {
        this.data = data;
    }
}
