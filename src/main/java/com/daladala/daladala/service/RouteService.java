package com.daladala.daladala.service;

import com.daladala.daladala.repository.RoutRepository;
import com.daladala.daladala.tables.Route;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class RouteService {
    private final RoutRepository routerepository;

    public void addRoute(Route route){
        routerepository.save(route);
    }

    public List<Route> getAll(){
        return routerepository.findAll();
    }

    public Route getById(int id){

        return routerepository.findById(id).get();
    }

    public void updateRoute(Route route){
        routerepository.save(route);
    }

    public void Delete(int id){
        routerepository.deleteById(id);
    }
}
