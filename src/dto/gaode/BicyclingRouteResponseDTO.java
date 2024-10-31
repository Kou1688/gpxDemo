package dto.gaode;

/**
 * 骑行规划路径响应数据
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/17 17:48
 */
public class BicyclingRouteResponseDTO {
    /**
     * 本次 API 访问状态，如果成功返回1，如果失败返回0。
     */
    private String status;
    /**
     * 访问状态值的说明，如果成功返回"ok"，失败返回错误原因，
     */
    private String info;
    /**
     * 返回状态说明,10000代表正确
     */
    private String infocode;
    /**
     * 路线条数
     */
    private String count;
    /**
     * 路径信息
     */
    private RouteResDTO route;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public RouteResDTO getRoute() {
        return route;
    }

    public void setRoute(RouteResDTO route) {
        this.route = route;
    }
}
