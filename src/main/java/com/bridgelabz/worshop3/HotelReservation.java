package com.bridgelabz.worshop3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HotelReservation  implements HotelReservationIF
{
    ArrayList<Hotel> hotelList = new ArrayList<>();
    Hotel hotel;

    public void addHotel(String hotelName, int rating, double regularCustomerRate) {

        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRating(rating);
        hotel.setRegularCustomerCost(regularCustomerRate);
        hotelList.add(hotel);
    }

    public int getHotelListSize() {
        return hotelList.size();
    }

    public void printHotelList() {
        System.out.println(hotelList);
    }

    public ArrayList<Hotel> getHotelList(){
        return hotelList;
    }

    @Override
    public void addHotel() {

    }

    public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate) {

        Optional<Hotel> resultList = hotelList.stream().min(Comparator.comparing(Hotel::getRegularCustomerCost));
        return resultList.get();
    }
}


