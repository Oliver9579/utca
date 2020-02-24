package hu.street.model.service;

import hu.street.model.domain.House;

import java.util.List;
import java.util.stream.Collectors;

public class DataParser {


    public List<House> parse(List<String> lines) {
        return lines.stream()
                .map(this::createHouse)
                .collect(Collectors.toList());

    }

    private House createHouse(String line) {
        String[] items = line.split(" ");
        boolean uneven = getValue(items[0]) == 1;
        int fenceLength = getValue(items[1]);
        String color = items[2];
        return new House(uneven, fenceLength, color);

    }

    private int getValue(String text) {
        return Integer.parseInt(text);
    }
}
