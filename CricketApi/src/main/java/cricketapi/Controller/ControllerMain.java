package cricketapi.Controller;
import cricketapi.service.CricketService;
import cricketapi.seriesdetail.Series;
import cricketapi.service.Duo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMain {
    @Autowired
    private CricketService cricketService;



    @RequestMapping(method = RequestMethod.POST, value = "/Cricket/Series")
    public void addSeries(@RequestBody Duo duo)
    {
        cricketService.addService(duo);
    }

}
