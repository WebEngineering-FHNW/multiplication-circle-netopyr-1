package ch.fhnw.webec.multiplicationcircle.controller;

import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;


class MultiplicationCircleControllerTest {

    @Test
    void testInitialValues() {
        // given
        final MultiplicationCircleController controller = new MultiplicationCircleController();

        // when
        final ModelAndView modelAndView = controller.getIndex(0, 0);

        // then
        assertThat(modelAndView.getModel()).containsEntry("lines", Collections.emptyList());
    }

    // TODO: Write unit tests to ensure that the controller behaves nicely when called with negative values

}
