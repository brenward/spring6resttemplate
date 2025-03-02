package com.bwardweb.spring6resttemplate.client;

import com.bwardweb.spring6resttemplate.model.BeerDTO;
import com.bwardweb.spring6resttemplate.model.BeerStyle;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface BeerClient {
    Page<BeerDTO> listBeers(String beerName, BeerStyle beerStyle, Boolean showInventory, Integer pageNumber, Integer pageSize);

    Page<BeerDTO> listBeers();

    BeerDTO getBeerById(UUID id);

    BeerDTO createBeer(BeerDTO beer);

    BeerDTO updateBeer(BeerDTO beer);
}
