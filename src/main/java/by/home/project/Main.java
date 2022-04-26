package by.home.project;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    private static final String INPUT_FILE = "data\\input.json";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

//        Ship ship =  mapper.readValue(new File(INPUT_FILE),Ship.class);
//        System.out.println(ship);
        Ships shipsWrapper = mapper.readValue(new File(INPUT_FILE),Ships.class);

       List<Ship> ships = shipsWrapper.getShips();
        ships.stream().forEach(System.out::println);
    }
}
