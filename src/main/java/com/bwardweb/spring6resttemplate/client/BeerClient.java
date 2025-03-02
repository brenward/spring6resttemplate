package com.bwardweb.spring6resttemplate.client;

import com.bwardweb.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

public interface BeerClient {
    Page<BeerDTO> listBeers(String beerName);
}
