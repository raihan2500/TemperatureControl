import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class RangeInputTest {
    RangeInput passengerTemperature1, passengerTemperature2, Driver1, Driver2;

    @BeforeEach
    void setUp() {
        passengerTemperature1 = new RangeInput(30, 80);
        passengerTemperature2 = new RangeInput(40, 100);
        Driver1 = new RangeInput();
        Driver2 = new RangeInput(150, 200);
    }

    @Test
    void getCurrentTemperatureForPassenger1(){
        passengerTemperature1.down();
        passengerTemperature1.up();
        passengerTemperature1.up();
        passengerTemperature1.down();
        passengerTemperature1.up();
        passengerTemperature1.up();
        passengerTemperature1.up();
        assertEquals(58, passengerTemperature1.getCurrentTemperature());
    }
    @Test
    void getCurrentTemperatureForPassenger2(){
        for(int i = 0; i < 8; i++){
            passengerTemperature2.up();
        }
        assertEquals(78, passengerTemperature2.getCurrentTemperature());
    }
    @Test
    void getCurrentTemperatureForDriver1(){
        for(int i = 0; i < 50; i++){
            Driver1.down();
        }
        assertEquals(60, Driver1.getCurrentTemperature());

    }
    @Test
    void getCurrentTemperatureForDriver2(){
        for(int i = 0; i < 500; i++){
            Driver2.up();
        }
        assertEquals(500, Driver2.getCurrentTemperature());
    }
}