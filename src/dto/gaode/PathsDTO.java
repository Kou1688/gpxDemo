package dto.gaode;

import java.util.List;

/**
 * 算路方案详情
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/18 17:39
 */
public class PathsDTO {
    /**
     * 方案距离，单位：米
     */
    private String distance;
    /**
     * 线路耗时，包括方案总耗时及分段step中的耗时
     */
    private String duration;
    /**
     * 路线分段
     */
    private List<StepsDTO> steps;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<StepsDTO> getSteps() {
        return steps;
    }

    public void setSteps(List<StepsDTO> steps) {
        this.steps = steps;
    }
}
