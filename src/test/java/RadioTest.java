import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.Radio;

public class RadioTest {

    //Тестирование методов выбора станции
    //Тестирование метода установки новой станции:
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "9, 9",
            "8, 8",
            "10, 0", //по умолчанию первоначальная станция 0
            "5, 5",
            "-1, 0" //по умолчанию первоначальная станция 0
    })

    public void shouldSetRadioStation(int newRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNewRadioStation(newRadioStation);
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    //Тестирование метода пролистования станций Next с граничными условиями:
    @ParameterizedTest
    @CsvSource({
            "4, 5",
            "8, 9",
            "9, 0",
            "0, 1",
            "1, 2"
    })

    public void shouldSetNextRadioStation (int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setNewRadioStation(currentStation);
        radio.next();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    //Тестирование метода пролистования станций Prev с граничными условиями:
    @ParameterizedTest
    @CsvSource({
            "4, 3",
            "9, 8",
            "0, 9",
            "1, 0",
            "8, 7"
    })

    public void shouldSetPrevRadioStation (int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setNewRadioStation(currentStation);
        radio.prev();
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(actual, expected);
    }

    //Тестирование методов громкости
    //Тестирования метода установки громкости - служебного метода для дальнейшего тестирования
    //Тест с учетом классов эквивалентности и граничными условиями
    @ParameterizedTest
    @CsvSource({
            "5, 5",
            "0, 0",
            "100, 100",
            "99, 99",
            "101, 0",
            "-1, 0",
            "1, 1"
    })
    public void shouldSetNewVolume (int newVolume, int expected){
        Radio radio = new Radio();
        radio.setNewVolume(newVolume);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    //Тестирование getCurrentVolume на значение по умолчанию
    @Test
    public void shouldGetCurrentVolume (){
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //Тестирование метода на повышение громкости с учетом граничных условий
    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "11, 12",
            "99, 100",
            "100, 100"
    })
    public void shouldSetVolumeOnePointUp (int currentVolume, int expected){
        Radio radio = new Radio();
        radio.setNewVolume(currentVolume);
        radio.setVolumeUpOnePointUp();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //Тестирование метода на снижение громкости с учетом граничных условий
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "12, 11",
            "7, 6",
            "99, 98",
            "100, 99"
    })
    public void shouldSetVolumeOnePointDown (int currentVolume, int expected){
        Radio radio = new Radio();
        radio.setNewVolume(currentVolume);
        radio.setVolumeOnePointDown();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}