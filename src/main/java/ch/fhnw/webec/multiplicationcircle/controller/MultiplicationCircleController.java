package ch.fhnw.webec.multiplicationcircle.controller;

import ch.fhnw.webec.multiplicationcircle.model.Line;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MultiplicationCircleController {

    private static final int RADIUS = 200;

    public ModelAndView getIndex(int segmentCount, int multiplier) {
        final Map<String, Object> model = new HashMap<>();
        // TODO: Add the missing data

        // TODO: Calculate the lines
        model.put("lines", Collections.<Line>emptyList());
        return new ModelAndView("index", model);
    }

    private static double calcX(int segment, int segmentCount) {
        return Math.cos(2 * Math.PI * segment / segmentCount) * RADIUS;
    }

    private static double calcY(int segment, int segmentCount) {
        return Math.sin(2 * Math.PI * segment / segmentCount) * RADIUS;
    }

}
