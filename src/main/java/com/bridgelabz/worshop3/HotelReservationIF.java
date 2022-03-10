package com.bridgelabz.worshop3;

import java.util.ArrayList;

import java.util.ArrayList;

public interface HotelReservationIF
{
    public void addHotel(String hotelName,int rate, double weekDayRate,double weekendRate);
    public int getHotelListSize();
    public void printHotelList();
    public ArrayList<Hotel> getHotelList();
}

