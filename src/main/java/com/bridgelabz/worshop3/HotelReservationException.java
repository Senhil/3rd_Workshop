package com.bridgelabz.worshop3;

public class HotelReservationException extends RuntimeException
{
    public enum ExceptionType{
        ENTERED_NULL, ENTERED_EMPTY;
    }

    public ExceptionType type;

    public HotelReservationException(ExceptionType type, String message) {

        super(message);
        this.type = type;

    }
}
