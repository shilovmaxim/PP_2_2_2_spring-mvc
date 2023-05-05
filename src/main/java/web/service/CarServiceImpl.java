package web.service;

import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.DAO.CarDAOImpl;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private final CarDAO carDAO = new CarDAOImpl();
    @Override
    public List<Car> getListCars(int count) {
        return carDAO.getListCars(count);
    }
}
