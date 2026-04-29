package com.proyecto.PI09.controller;

import com.proyecto.PI09.config.WatsonProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/watson")
public class WatsonController {

	private final WatsonProperties watsonProperties;

	public WatsonController(WatsonProperties watsonProperties) {
		this.watsonProperties = watsonProperties;
	}

	@GetMapping("/config")
	public ResponseEntity<Map<String, String>> getConfig() {
	    WatsonProperties.Color c = watsonProperties.getColor();
	    Map<String, String> config = new java.util.HashMap<>();
	    config.put("integrationId",     watsonProperties.getIntegrationId());
	    config.put("region",            watsonProperties.getRegion());
	    config.put("serviceInstanceId", watsonProperties.getServiceInstanceId());
	    config.put("primary",           c.getPrimary());
	    config.put("primaryHover",      c.getPrimaryHover());
	    config.put("bgLight",           c.getBgLight());
	    config.put("bgDark",            c.getBgDark());
	    config.put("textPrimary",       c.getTextPrimary());
	    config.put("textSecondary",     c.getTextSecondary());
	    config.put("border",            c.getBorder());
	    config.put("badge",             c.getBadge());
	    return ResponseEntity.ok(config);
	}
}