package com.example.comment.client.models.exceptiuon;

public class DuplicateException  extends RuntimeException {
    public DuplicateException(String message) {
        super(message);
    }
}
