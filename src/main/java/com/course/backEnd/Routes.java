package com.course.backEnd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Routes {

    private List<Route> routes;

    public Routes() {
        this.routes = new ArrayList<Route>();
    }

    public Routes(List<Route> routes) {
        this.routes = routes;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public Route getById(Long id){
        for (var el : routes) {
            if (el.getId() == id) return el;
        }
        return null;
    }

    public boolean add(Route route){
        if (getById(route.getId()) != null) return false;
        return routes.add(route);
    }

    public boolean remove(long id) {
        if (routes == null || getById(id) == null) return false;
        return routes.remove(getById(id));
    }

    public int getLength() {
        return routes.size();
    }

    public Routes sortById(){
        Comparator<Route> comparator = Comparator.comparing(Route::getId);
        Routes routes = new Routes(this.routes);
        routes.routes.sort(comparator);
        return routes;
    }

    public Routes sortByType(){
        Comparator<Route> comparator = Comparator.comparing(Route::getTypeOfTransport);
        Routes routes = new Routes(this.routes);
        routes.routes.sort(comparator);
        return routes;
    }

    public Routes sortByLength(){
        Comparator<Route> comparator = Comparator.comparing(Route::getLength);
        Routes routes = new Routes(this.routes);
        routes.routes.sort(comparator);
        return routes;
    }
}
