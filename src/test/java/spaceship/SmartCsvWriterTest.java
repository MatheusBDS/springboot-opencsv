package spaceship;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class SmartCsvWriterTest {

    @Test
    public void writeSpaceships() throws CsvRequiredFieldEmptyException, IOException, CsvDataTypeMismatchException, InterruptedException {
        new SmartCsvWriter().writeSpaceships();
    }
}