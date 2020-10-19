package ch.fhnw.webec.multiplicationcircle.controller;

import ch.fhnw.webec.multiplicationcircle.model.Line;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class MultiplicationCircleController {

    private static final int RADIUS = 200;

    @GetMapping
    public ModelAndView getIndex(@RequestParam(defaultValue = "0") int segmentCount, @RequestParam(defaultValue = "0") int multiplier) {
        final Map<String, Object> model = new HashMap<>();
        // TODO: Add the missing data
        model.put("radius", RADIUS);
        model.put("segmentCount", segmentCount);
        model.put("multiplier", multiplier);

        // TODO: Calculate the lines
        final List<Line> lines = IntStream.range(0, segmentCount)
                .mapToObj(i -> new Line(
                        calcX(i, segmentCount),
                        calcY(i, segmentCount),
                        calcX(i * multiplier, segmentCount),
                        calcY(i * multiplier, segmentCount)
                ))
                .collect(Collectors.toList());
        model.put("lines", lines);

        return new ModelAndView("index", model);
    }

    private static double calcX(int segment, int segmentCount) {
        return Math.cos(2 * Math.PI * segment / segmentCount) * RADIUS;
    }

    private static double calcY(int segment, int segmentCount) {
        return Math.sin(2 * Math.PI * segment / segmentCount) * RADIUS;
    }

}
