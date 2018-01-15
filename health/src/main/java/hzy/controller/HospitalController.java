package hzy.controller;

import hzy.entity.Hospital;
import hzy.service.IHospitalSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("hospital")
/**
 * HospitalController class
 *
 * @author hzy
 * @date 2018/1/15
 */
public class HospitalController {
    @Autowired
    private IHospitalSer hospitalSer;

    @RequestMapping("selectAllRecord")
    @ResponseBody
    private List<Hospital> selectAllRecord(Hospital record){
        List<Hospital> result = hospitalSer.selectAllRecord(record);
        return result;
    }
}