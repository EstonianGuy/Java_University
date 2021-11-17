package com.ninePrac;

public class MarketException extends Exception{
    public MarketException(String message){
        super("Error" +message);

    }
}
