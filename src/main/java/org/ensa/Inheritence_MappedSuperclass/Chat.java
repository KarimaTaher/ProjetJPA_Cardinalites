package org.ensa.Inheritence_MappedSuperclass;

import jakarta.persistence.Entity;

@Entity
public class Chat extends Animal{
    private int id_chat;
    private String type_chat;

    public int getId_chat() {
        return id_chat;
    }

    public String getType_chat() {
        return type_chat;
    }

    public void setType_chat(String type_chat) {
        this.type_chat = type_chat;
    }
}
