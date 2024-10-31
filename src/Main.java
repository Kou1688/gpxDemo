import service.GaodeWebRouteService;
import service.impl.RoutePlanningService;
import util.PropertiesLoaderUtils;

public class Main {
    public static void main(String[] args) {
        GaodeWebRouteService service = new RoutePlanningService();
        service.bicyclingRoutePlanning("116.466485,39.995197", "116.46424,40.020642");
    }
}