package cn.itcast.service.Imp;

import cn.itcast.dao.StudentDao;
import cn.itcast.domain.AllBean;
import cn.itcast.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: cdf
 * @create: 2019-12-10 20:29
 **/
@Service("studentService")
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public void register(AllBean allBean) {
        studentDao.register(allBean);
    }

    @Override
    public AllBean studententer(String sid) {
        return studentDao.studententer(sid);
    }

    @Override
    public void answer(AllBean allBean) {
         studentDao.answer(allBean);
    }

    @Override
    public AllBean orfinish(String sid) {
         return studentDao.orfinish(sid);
    }
}
