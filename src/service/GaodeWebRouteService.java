package service;

/**
 * 高德地图webservice
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/17 10:34
 */
public interface GaodeWebRouteService {
    /**
     * 骑行路径规划
     *
     * @param origin      起点经纬度 经度在前，纬度在后，经度和纬度用","分割，经纬度小数点后不得超过6位。
     * @param destination 重点经纬度 经度在前，纬度在后，经度和纬度用","分割，经纬度小数点后不得超过6位。
     * @return
     */
    Object bicyclingRoutePlanning(String origin, String destination);
}
