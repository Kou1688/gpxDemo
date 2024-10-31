package util;

import cn.hutool.core.bean.BeanUtil;
import dto.gaode.BicyclingRouteReqDTO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 高德Web服务相关方法
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/17 11:27
 */
public class GaoDeWebUtil {

    private static final Logger logger = Logger.getLogger(GaoDeWebUtil.class.getName());

    public static String invokeBicyclingRoutePlanning(BicyclingRouteReqDTO reqDTO) {
        HttpClient httpClient = HttpClient.newHttpClient();
        URI uri = URI.create(PropertiesLoaderUtils.getProperty("bicycling.route.planning"));
        //遍历reqDto的每个字段,如果有值就拼接在uri中
        StringBuilder sb = new StringBuilder();
        sb.append("?key=").append(PropertiesLoaderUtils.getProperty("gaode.key"));
        Map<String, Object> beanedToMap = BeanUtil.beanToMap(reqDTO, false, false);
        beanedToMap.forEach((k, v) -> {
            if (v != null) {
                sb.append("&").append(k).append("=").append(v);
            }
        });
        uri = URI.create(uri + sb.toString());
        logger.log(Level.INFO, "uri:" + uri + sb);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Content-Type", "application/json")
                .GET()
                .build();
        try {
            // 发送请求并获取响应
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            // 处理响应结果
            logger.log(Level.INFO, "Status code: " + response.statusCode());
            logger.log(Level.INFO, "Response headers: " + response.headers());
            logger.log(Level.INFO, "Response body: " + response.body());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
