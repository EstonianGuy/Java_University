package com.ninePrac;

public class NoClientException extends MarketException{
    public NoClientException(String message){
        super("Error"+message);
    }
}
