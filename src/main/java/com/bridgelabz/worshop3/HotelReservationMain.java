package com.bridgelabz.worshop3;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import java.time.LocalDate;
import java.time.Month;

public class hotelReservationMain
{
    public static void main(String[] args)
    {
        System.out.println("Hotel Reservation System::");
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110,90);
        hotelReservation.addHotel("Bridgewood", 4, 150,50);
        hotelReservation.addHotel("Ridgewood", 5, 220,150);
        hotelReservation.printHotelList();
        LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 11);
        hotelReservation.getCheapestHotel(startDate, endDate);
    }
}
