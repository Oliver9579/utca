package hu.street.controller;

import hu.street.model.domain.House;

import java.util.List;

public class HouseService {


    private final List<House> houses;

    public HouseService(List<House> houses) {
        this.houses = houses;
    }

    public int getSoldHousesCount() {
        return houses.size();
    }
}
