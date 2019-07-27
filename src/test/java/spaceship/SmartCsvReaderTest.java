package spaceship;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.Assert.*;

public class SmartCsvReaderTest {

    @Test
    public void readCsvFile() throws FileNotFoundException {
        List<SpaceShip> spaceShips = new SmartCsvReader().readCsvFile();

        spaceShips.forEach(spaceship -> System.out.println(spaceship));
    }
}