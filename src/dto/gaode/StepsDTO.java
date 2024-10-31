package dto.gaode;

/**
 * 路线分段
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/18 17:44
 */
public class StepsDTO {
    /**
     * 骑行指示
     */
    private String instruction;
    /**
     * 进入道路方向
     */
    private String orientation;
    /**
     * 分段道路名称
     */
    private String road_name;
    /**
     * 分段距离信息
     */
    private Integer step_distance;
    /**
     * 分路段坐标点串，两点间用“,”分隔
     */
    private String polyline;

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getRoad_name() {
        return road_name;
    }

    public void setRoad_name(String road_name) {
        this.road_name = road_name;
    }

    public Integer getStep_distance() {
        return step_distance;
    }

    public void setStep_distance(Integer step_distance) {
        this.step_distance = step_distance;
    }

    public String getPolyline() {
        return polyline;
    }

    public void setPolyline(String polyline) {
        this.polyline = polyline;
    }
}
