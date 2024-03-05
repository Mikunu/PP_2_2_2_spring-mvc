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
    public List<Car> show(Integer count) {
        if (count == null || count >= 5) {
            return carDAO.getAllCars();
        }
        else {
            return carDAO.show(count);
        }
    }
}
