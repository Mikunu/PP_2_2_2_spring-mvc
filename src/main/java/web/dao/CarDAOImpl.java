package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        String[] carBrands = {"Toyota", "Ford", "BMW", "Honda", "Mercedes-Benz"};
        for (int i = 0; i < 5; i++) {
            cars.add(new Car((long) i, carBrands[i], i*100));
        }
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> show(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
