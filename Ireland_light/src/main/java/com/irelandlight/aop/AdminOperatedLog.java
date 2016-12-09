package com.irelandlight.aop;

import com.alibaba.fastjson.JSON;
import com.irelandlight.dao.POperatinonLogMapper;
import com.irelandlight.model.Productor;
import com.irelandlight.model.ProductorLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by mac on 2016/12/6.
 */
@Component(value = "adminOperatedLog")
@Aspect
public class AdminOperatedLog{
    @Autowired
    private POperatinonLogMapper pOperatinonLogMapper;

    private static final Logger logger= LoggerFactory.getLogger(AdminOperatedLog.class);

    @Pointcut("execution(* com.irelandlight.service.*.*(..))")     //service层的切入点
    public void serviceAspect(){}
    @Pointcut("execution(* com.irelandlight.controller.*.*(..))")     //controller层的切入点
    public void controllerAspect(){}

    //前置通知，在连接点方法执行之前执行
    @Before(value = "serviceAspect()")
    public void doBefore(JoinPoint jp){
        System.out.println(jp.getSignature().getName());
        ServletRequestAttributes servletRequestAttributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        //获取请求对象

        //从请求对象中获取session对象
        if(servletRequestAttributes==null){
            System.out.println("未查获的servletRequestAttributes对象");
            logger.info("未查获的servletRequestAttributes对象");
        }else{
            HttpServletRequest request=servletRequestAttributes.getRequest();
            HttpSession session=request.getSession();
            //从HttpSession对象中获得管理员的id或者获得整个管理员对象
            Productor productor=(Productor) session.getAttribute("CURRENT_PRODUCTOR");
            if(productor!=null){
                //获取远程调用者的ip地址
                String ip=request.getRemoteAddr();
                String operation=jp.getSignature().getName();
                StringBuffer para=new StringBuffer();
                if(jp.getArgs()!=null&&jp.getArgs().length>0){
                    for(int i=0;i<jp.getArgs().length;i++){
                        para.append(JSON.toJSONString(jp.getArgs()[i])+"/");
                    }
                }
                String info="Requestor:"+productor.getUserName()+"--Address:"+ip+"--Operation:"+operation+"--Parem:"+para;
                logger.info(info);
                ProductorLog productorLog=new ProductorLog();
                productorLog.setContent(info);
                productorLog.setProductorId(productor.getId());
                pOperatinonLogMapper.insertOperation(productorLog);
            }
        }

    }

    //后置通知，在连接点方法正常执行完成之后执行，若产生异常则不执行
    public void doAfterReturing(JoinPoint jp,Object val){}

    //最终通知，在连接点方法执行完成之后执行
    public void doAfter(JoinPoint jp){}

    //异常通知，在连接点方法体抛出异常后执行
    public void doAfterThrowing(JoinPoint jp,Throwable ex){}

    //环绕通知，在连接点方法体执行外围执行
    public void doAround(ProceedingJoinPoint pjp){

    }


}
