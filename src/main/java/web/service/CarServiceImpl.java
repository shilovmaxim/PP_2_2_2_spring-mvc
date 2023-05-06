package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDAOImpl carDAO;

    public CarServiceImpl(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getListCars(Integer count) {
        return carDAO.getListCars(count);
    }
}
