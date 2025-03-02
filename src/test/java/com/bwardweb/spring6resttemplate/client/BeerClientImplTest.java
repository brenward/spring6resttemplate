package com.bwardweb.spring6resttemplate.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeerClientImplTest {

    @Autowired
    BeerClientImpl beerClient;

    @Test
    public void testListBeersNoBeerName(){

        beerClient.listBeers(null);

    }

    @Test
    public void testListBeers(){

        beerClient.listBeers("ALE");

    }

}