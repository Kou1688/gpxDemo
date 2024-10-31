package dto.gaode;

/**
 * 骑行路径规划请求参数
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/17 15:42
 */
public class BicyclingRouteReqDTO {
    /**
     * 高德key
     */
//    private String key;
    /**
     * 起始点
     * 经度在前，纬度在后，经度和纬度用","分割，经纬度小数点后不得超过6位。
     */
    private String origin;
    /**
     * 目的地点
     * 经度在前，纬度在后，经度和纬度用","分割，经纬度小数点后不得超过6位。
     */
    private String destination;
    /**
     * 返回结果控制
     * show_fields 用来筛选 response 结果中可选字段。show_fields 的使用需要遵循如下规则：<br/>
     * 1、具体可指定返回的字段类请见下方返回结果说明中的“show_fields”内字段类型；<br/>
     * 2、多个字段间采用“,”进行分割；<br/>
     * 3、show_fields 未设置时，只返回基础信息类内字段。<br/>
     */
    private String show_fields;
    /**
     * 返回方案条数
     */
    private String alternative_route;
    /**
     * 数字签名
     */
    private String sig;
    /**
     * 返回结果格式类型
     */
    private String output;
    /**
     * 回调函数
     */
    private String callback;

//    public String getKey() {
//        return key;
//    }
//
//    public void setKey(String key) {
//        this.key = key;
//    }

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

    public String getShow_fields() {
        return show_fields;
    }

    public void setShow_fields(String show_fields) {
        this.show_fields = show_fields;
    }

    public String getAlternative_route() {
        return alternative_route;
    }

    public void setAlternative_route(String alternative_route) {
        this.alternative_route = alternative_route;
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
