
package hzy.serviceImpl;


import hzy.dao.BespeakMapper;
import hzy.service.IBespeakSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BespeakSer class
 *
 * @author hzy
 * @date 2018/01/15
 */
@Service
public class BespeakSer implements IBespeakSer {
    @Autowired
    private BespeakMapper bespeakMapper;
}
