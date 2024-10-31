package service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import dto.gaode.BicyclingRouteReqDTO;
import dto.gaode.BicyclingRouteResponseDTO;
import dto.gaode.RouteResDTO;
import service.GaodeWebRouteService;
import util.GaoDeWebUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 路径规划
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/17 10:50
 */
public class RoutePlanningService implements GaodeWebRouteService {
    private static final Logger logger = Logger.getLogger(RoutePlanningService.class.getName());

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

        //3.处理路径规划结果
        if (!StrUtil.isBlank(planningResponse)) {
            BicyclingRouteResponseDTO responseDTO = JSONUtil.toBean(planningResponse, BicyclingRouteResponseDTO.class);
            switch (responseDTO.getStatus()) {
                case "1" ->
                    //路径规划成功
                        disposeBicyclingRouteResponse(responseDTO);
                case "0" ->
                    //路径规划失败
                        logger.log(Level.INFO, "路径规划接口处理失败");
            }
        }
        return null;
    }

    /**
     * 处理路径规划返回值
     *
     * @param responseDTO
     */
    private void disposeBicyclingRouteResponse(BicyclingRouteResponseDTO responseDTO) {
        RouteResDTO route = responseDTO.getRoute();
        //起点
        String origin = route.getOrigin();

        route.getPaths().forEach(path -> {

        });
    }
}
