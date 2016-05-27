package test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.sound.midi.ControllerEventListener;

/**
 * Created by han on 2016/4/26.
 */
public class StartContoller  implements Controller {

    @Override
    public ModelAndView  handleRequest(MultipartHttpServletRequest request,
                                       HttpServletResponse response)   throws Exception{
        System.out.println("controller is running.");
        return  null;

    }

}
