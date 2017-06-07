package com.dchealth.service;

import com.dchealth.entity.YunUsers;
import com.dchealth.facade.common.BaseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.beans.Transient;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */
@Produces("application/json")
@Path("time")
@Service
public class TimeService {

    @Autowired
    private BaseFacade baseFacade ;

    @GET
    public Date getDate(){
        return new Date();
    }

    @GET
    @Path("users")
    public List<YunUsers> getAllUser(){
        return baseFacade.findAll(YunUsers.class);
    }

    @Path("add-users")
    @GET
    @Transactional
    public YunUsers addUser(){
        YunUsers users = new YunUsers();
        users.setId(11111111);
        users.setUserName("nihao test ");
        return baseFacade.merge(users);
    }
}
