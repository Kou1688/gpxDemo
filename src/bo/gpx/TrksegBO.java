package bo.gpx;

import java.util.List;

/**
 * 路径点集合
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/31 17:49
 */
public class TrksegBO {
    private List<TrkpointBO> trkpt;

    public List<TrkpointBO> getTrkpt() {
        return trkpt;
    }

    public void setTrkpt(List<TrkpointBO> trkpt) {
        this.trkpt = trkpt;
    }
}
