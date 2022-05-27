package com.weixiao.controller;

        import com.weixiao.Pc;
        import com.weixiao.Service.PcService;
        import com.weixiao.dao.PcDao;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;

        import javax.servlet.http.HttpServletRequest;
        import java.util.List;

@Controller
public class PcController {
    //自动配装
    @Autowired
    private PcDao pcDao;

    //请求映射地址
    @RequestMapping("/select")
    public String Select(Pc pc , Model model){
        List<Pc> list = pcDao.selectPcByName(pc);
        model.addAttribute("pcList",list);
        return "pcList";

    }

}
