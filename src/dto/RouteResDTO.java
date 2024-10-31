package dto;

/**
 * 规划方案列表
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/18 17:35
 */
public class RouteResDTO {
    /**
     * 起点
     */
    private String origin;
    /**
     * 终点
     */
    private String destination;
    /**
     * 路线列表
     */
    private PathsDTO paths;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public PathsDTO getPaths() {
        return paths;
    }

    public void setPaths(PathsDTO paths) {
        this.paths = paths;
    }
}
