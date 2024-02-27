package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDAOImpl carDAO;


    public CarServiceImpl(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }


    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    public List<Car> show(Integer count) {
        return carDAO.show(count);
    }
}
