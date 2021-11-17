package com.ninePrac;

public class NoNumberException extends MarketException{
    public NoNumberException(int message){
        super("Your number doesn't exist"+message);

    }

}
