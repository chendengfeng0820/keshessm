package cn.itcast.service.Imp;

import cn.itcast.dao.TeacherDao;
import cn.itcast.domain.AllBean;
import cn.itcast.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: cdf
 * @create: 2019-12-10 20:29
 **/

@Service("teacherService")
public class TeacherServiceImp implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public AllBean teacherenter(String tid) {
        return teacherDao.teacherenter(tid);
    }

    @Override
    public List<AllBean> finished() {
        return null;
    }

    @Override
    public List<AllBean> unfinished() {
        return null;
    }

    @Override
    public List<AllBean> studentdetails(String tid) {
        return null;
    }
}
