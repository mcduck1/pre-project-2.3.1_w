package web.model;

import org.springframework.stereotype.Component;

import java.util.List;

public interface CarService {
    List<Car> carsCount (int number);
}
