package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CarDAOImpl implements CarDAO{
    private static int CAR_IDs;
    private final List<Car> cars;

    public CarDAOImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_IDs,"Lada", 10));
        cars.add(new Car(++CAR_IDs,"BMW", 7));
        cars.add(new Car(++CAR_IDs,"BMW", 5));
        cars.add(new Car(++CAR_IDs,"Exeed", 5));
        cars.add(new Car(++CAR_IDs,"Haval", 7));
    }

    @Override
    public List<Car> getListCars(int count) {
        return IntStream.range(0, Math.min(count, 5))
                .mapToObj(cars::get)
                .collect(Collectors.toList());
    }
}
