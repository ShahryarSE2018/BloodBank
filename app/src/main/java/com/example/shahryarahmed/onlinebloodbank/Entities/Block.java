package com.example.shahryarahmed.onlinebloodbank.Entities;

import java.util.List;

/**
 * Created by Shahryar Ahmed on 4/19/2018.
 */

public class Block {


    private int previousHash;
    private List<Staff> data;

    public Block(int previousHash, List<Staff> data) {
        this.previousHash = previousHash;
        this.data = data;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public List<Staff> getData() {
        return data;
    }

    public void setData(List<Staff> data) {
        this.data = data;
    }
}
