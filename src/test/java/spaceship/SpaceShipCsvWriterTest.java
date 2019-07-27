package spaceship;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class SpaceShipCsvWriterTest {

    @Test
    public void doWrite() throws IOException {
        new SpaceShipCsvWriter().doWrite();
    }
}