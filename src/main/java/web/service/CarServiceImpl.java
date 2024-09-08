package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carsCount(int number) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Camry", "White"));
        carList.add(new Car("Honda", "Civic", "Blue"));
        carList.add(new Car("Ford", "Mustang", "Red"));
        carList.add(new Car("Tesla", "Model S", "Black"));
        carList.add(new Car("Chevrolet", "Impala", "Silver"));

        if (number <= 0) {
            return new ArrayList<>();
        } else if (number > carList.size()) {
            return carList;
        }
        return carList.subList(0, number);
    }
}
