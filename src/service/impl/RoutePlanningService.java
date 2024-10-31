package service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import dto.BicyclingRouteReqDTO;
import dto.BicyclingRouteResponseDTO;
import service.GaodeWebRouteService;
import util.GaoDeWebUtil;

/**
 * 路径规划
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/17 10:50
 */
public class RoutePlanningService implements GaodeWebRouteService {
    @Override
    public Object bicyclingRoutePlanning(String origin, String destination) {
        //1.构建请求参数
        BicyclingRouteReqDTO bicyclingRouteReqDTO = new BicyclingRouteReqDTO();
        bicyclingRouteReqDTO.setOrigin(origin);
        bicyclingRouteReqDTO.setDestination(destination);
        bicyclingRouteReqDTO.setShow_fields("polyline");
        bicyclingRouteReqDTO.setOutput("json");
        bicyclingRouteReqDTO.setAlternative_route("3");
        //2.调用路径规划接口
        String planningResponse = GaoDeWebUtil.invokeBicyclingRoutePlanning(bicyclingRouteReqDTO);

        if (!StrUtil.isBlank(planningResponse)){
            BicyclingRouteResponseDTO bicyclingRouteResponseDTO = JSONUtil.toBean(planningResponse, BicyclingRouteResponseDTO.class);

        }
        return null;
    }
}
