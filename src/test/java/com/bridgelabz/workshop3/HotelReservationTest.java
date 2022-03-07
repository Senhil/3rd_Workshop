package com.bridgelabz.workshop3;


import com.bridgelabz.worshop3.HotelReservation;
import com.bridgelabz.worshop3.HotelReservationIF;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class HotelReservationTest {
    @Test
    public void givenHotelDetails_WhenSizeMatches_ShouldReturnTrue()
    {
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        int hotelListSize = hotelReservation.getHotelListSize();
        Assertions.assertEquals(3, hotelListSize);
    }
}
