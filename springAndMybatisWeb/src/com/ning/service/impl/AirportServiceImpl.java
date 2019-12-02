package com.ning.service.impl;

import com.ning.mapper.AirportMapper;
import com.ning.pojo.Airport;
import com.ning.service.AirportService;

import java.util.List;

public class AirportServiceImpl implements AirportService {
    private AirportMapper airportMapper;

    public AirportMapper getAirportMapper() {
        return airportMapper;
    }

    public void setAirportMapper(AirportMapper airportMapper) {
        this.airportMapper = airportMapper;
    }

    @Override
    public List<Airport> show() {
        return airportMapper.selAll();
    }
}
