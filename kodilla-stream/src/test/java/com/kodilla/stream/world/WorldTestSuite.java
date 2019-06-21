package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class WorldTestSuite {
    @Test
    public void testGetSandBeansQuantityWithReduce() {
        //Given
        Country poland = new Country(new BigDecimal("38430000"), "Poland");
        Country germany = new Country(new BigDecimal("82900000"), "Germany");
        Country france = new Country(new BigDecimal("66990000"), "France");

        Country japan = new Country(new BigDecimal("39000000"), "Japan");
        Country china = new Country(new BigDecimal("1306313813"), "China");
        Country turkey = new Country(new BigDecimal("76704412"), "Poland");

        Country usa = new Country(new BigDecimal("308878120"), "USA");
        Country canada = new Country(new BigDecimal("33989040"), "Canada");
        Country mexico = new Country(new BigDecimal("107563903"), "Mexico");

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("North America");

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(turkey);

        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        World world = new World();
        world.addContinents(europe);
        world.addContinents(asia);
        world.addContinents(northAmerica);


        //When
        BigDecimal peopleQuanity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuanity = new BigDecimal("2060769288");
        Assert.assertEquals(expectedQuanity, peopleQuanity);

    }
}
