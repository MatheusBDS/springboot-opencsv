package spaceship;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvCustomBindByPosition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
    @CsvBindByPosition(position = 0)
    private Integer id;
    @CsvBindByPosition(position = 2)
    private String name;
    @CsvBindByPosition(position = 1)
    private Integer crew;
    @CsvCustomBindByPosition(position = 3, converter = LocalDateConverter.class)
    private LocalDate launchdate;
}
