package com.bwardweb.spring6resttemplate.client;

import com.bwardweb.spring6resttemplate.model.BeerDTO;
import com.bwardweb.spring6resttemplate.model.BeerStyle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeerClientImplTest {

    @Autowired
    BeerClientImpl beerClient;

    @Test
    public void testListBeersNoBeerName(){

        beerClient.listBeers();

    }

    @Test
    public void testListBeers(){

        beerClient.listBeers("ALE", BeerStyle.ALE, true,1, 50);

    }

    @Test
    public void testGetBeerById(){

        Page<BeerDTO> beerDTOs = beerClient.listBeers();
        BeerDTO dto = beerDTOs.getContent().get(0);

        BeerDTO beerDTO = beerClient.getBeerById(dto.getId());

        assertNotNull(beerDTO);

    }

}