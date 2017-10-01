package controllers;

import com.google.inject.Inject;
import play.Logger;
import play.libs.Json;
import play.mvc.*;

import services.UtilityService;

import java.util.HashMap;
import java.util.Map;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


    @Inject
    private UtilityService utilityService;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result fetchCommaSepatedCount(String commaString) {
        Map<String, Integer> responseMap = null;
        try {
            Logger.info("Request Recieved");
            Integer count = utilityService.fetchCommaSeparatedCount(commaString);
            responseMap = new HashMap<>();
            responseMap.put("Count", count);
        } catch (Exception e) {
            Logger.error("Error fetching count");
            return internalServerError();
        }
        return ok(Json.toJson(responseMap));
    }


}
