package com.wcq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wcq.dao.StuMapper;
import com.wcq.pojo.Student;
import com.wcq.service.IStuService;
import org.springframework.stereotype.Service;


@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Student> implements IStuService {

}
