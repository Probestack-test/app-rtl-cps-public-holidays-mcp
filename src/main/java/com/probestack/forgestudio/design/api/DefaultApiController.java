package com.probestack.forgestudio.design.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import java.util.List;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.DefaultService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:19:06.704605700Z[GMT]")
@Controller
@RequestMapping("${openapi.publicHolidaysMCP.base-path:/api/v3}")
public class DefaultApiController implements DefaultApi {

    private static final Logger log = LoggerFactory.getLogger(DefaultApiController.class);

    private final DefaultService defaultService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public DefaultApiController(DefaultService defaultService, GeneratedRequestValidator generatedRequestValidator) {
        this.defaultService = defaultService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<List<Object>> getUpcomingPublicHolidays(@PathVariable() String countryCode) {
        log.info("Processing getUpcomingPublicHolidays request");
        try {
            var response = defaultService.getUpcomingPublicHolidays(countryCode);
            log.info("getUpcomingPublicHolidays completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getUpcomingPublicHolidays: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<Object>> listPublicHolidays(@PathVariable() Integer year, @PathVariable() String countryCode) {
        log.info("Processing listPublicHolidays request");
        try {
            var response = defaultService.listPublicHolidays(year, countryCode);
            log.info("listPublicHolidays completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listPublicHolidays: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<Object>> listSupportedCountries() {
        log.info("Processing listSupportedCountries request");
        try {
            var response = defaultService.listSupportedCountries();
            log.info("listSupportedCountries completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listSupportedCountries: {}", e.getMessage(), e);
            throw e;
        }
    }
}
