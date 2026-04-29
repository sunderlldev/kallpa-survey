package com.proyecto.PI09.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "watson")
public class WatsonProperties {
    private String url;
    private String integrationId;
    private String region;
    private String serviceInstanceId;
    private Color color = new Color();

    @Data
    public static class Color {
        private String primary = "#0f62fe";
        private String primaryHover = "#0353e9";
        private String bgLight = "#ffffff";
        private String bgDark = "#f4f4f4";
        private String textPrimary = "#161616";
        private String textSecondary = "#525252";
        private String border = "#e0e0e0";
        private String badge = "#e81818";
    }
}