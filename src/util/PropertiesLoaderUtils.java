package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * 配置文件加载类
 *
 * @author: Chaojie.Kou
 * @since: 2024/10/17 10:51
 */
public class PropertiesLoaderUtils {

    private static final Properties properties = new Properties();

    static {
        loadProperties();
    }

    public static void loadProperties() {
        byte[] bytes;
        try {
            bytes = Files.readAllBytes(Paths.get("resource/config.properties").toAbsolutePath());
        } catch (IOException e) {
            System.out.println("加载配置文件失败");
            e.printStackTrace();
            return;
        }
        if (bytes.length > 0) {
            String content = new String(bytes);
            try {
                System.out.println(content);
                properties.load(new java.io.ByteArrayInputStream(content.getBytes()));
            } catch (IOException e) {
                System.out.println("load配置文件失败");
                e.printStackTrace();
            }
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
