package com.bridgelabz.workshop3;

import com.bridgelabz.worshop3.Hotel;
import com.bridgelabz.worshop3.HotelReservation;
import com.bridgelabz.worshop3.HotelReservationIF;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class hotelReservationMainTest
{
    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelName(){
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 160);
        String hotelName = hotelReservation.getHotelList().get(0).getHotelName();
        assertEquals("Bridgewood", hotelName);
    }
    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelRating(){
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 160);
        int hotelRating = hotelReservation.getHotelList().get(0).getRating();
        assertEquals(4, hotelRating);
    }
    @Test
    public void givenHotelList_WhenAdded_shouldReturnRegularCustomerCost(){
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 160);
        int hotelRegularCustomerCost = (int) hotelReservation.getHotelList().get(0).getRegularCustomerCost();
        assertEquals(160, hotelRegularCustomerCost);
    }
    @Test
    public void givenHotelDetails_WhenSizeMatches_ShoulReturnTrue()
    {
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110);
        hotelReservation.addHotel("Bridgewood", 4, 160);
        hotelReservation.addHotel("Ridgewood", 5, 220);
        int hotelListSize = hotelReservation.getHotelListSize();
        assertEquals(3, hotelListSize);
    }
    @Test
    public void givenHotelDetails_shouldReturnCheapestHotel(){
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110);
        hotelReservation.addHotel("Bridgewood", 4, 160);
        hotelReservation.addHotel("Ridgewood", 5, 220);
        LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 11);
        Hotel hotel = hotelReservation.getCheapestHotel(startDate, endDate);
        assertEquals("Lakewood", ((Hotel) hotel).getHotelName());
    }
}
