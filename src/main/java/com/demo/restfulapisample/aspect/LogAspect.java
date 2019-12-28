//package com.demo.restfulapisample.aspect;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.danke.commons.sso.context.SsoContext;
//import com.danke.commons.sso.entity.SsoUserPrincipal;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpSession;
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.web.multipart.MultipartFile;
//
///**
// * 日志切面
// *
// * @author zhangwei10
// * @date 2019-05-16 9:27 PM
// * @since 1.0.0
// */
//@Aspect
//@Slf4j
//@Order(4)
//@Component("operationLogAspect")
//public class LogAspect {
//
//  @Pointcut("execution(public * com.danke.infra.number.admin.*Controller.*(..))")
//  public void annotationPointCut() {
//    log.info("开始切入");
//  }
//
//  /**
//   * 拦截 rest方法，记录操作时长
//   *
//   * @param joinPoint 切入点
//   * @return 执行结果
//   * @throws Throwable 异常
//   */
//  @Around("annotationPointCut()")
//  public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
//    long start = System.currentTimeMillis();
//
//    Throwable t = null;
//    Object result = null;
//    try {
//      result = joinPoint.proceed();
//    } catch (Throwable var19) {
//      t = var19;
//    }
//
//    try {
//      long end = System.currentTimeMillis();
//      log.info(
//          "调用时长:[{}],类名称:[{}.{}],操作人:[{}]方法入参:[{}],方法出参:[{}]",
//          end - start,
//          joinPoint.getSignature().getDeclaringTypeName(),
//          joinPoint.getSignature().getName(),
//          getOperator(),
//          getArgs(joinPoint),
//          JSON.toJSONString(result));
//    } catch (Exception ex) {
//      log.info("打印日志异常", ex);
//    }
//
//    if (t != null) {
//      log.error("异常信息", t);
//      throw t;
//    } else {
//      return result;
//    }
//  }
//
//  private String getOperator() {
//    SsoUserPrincipal ssoUserInfo = SsoContext.getPrincipal();
//    if (ssoUserInfo != null) {
//      return ssoUserInfo.getName() + "(" + ssoUserInfo.getUserId() + ")";
//    }
//    return "";
//  }
//
//  private String getArgs(ProceedingJoinPoint joinPoint) {
//    Object[] args = joinPoint.getArgs();
//    Object[] arguments = new Object[args.length];
//    for (int i = 0; i < args.length; i++) {
//      if (args[i] instanceof ServletRequest
//          || args[i] instanceof ServletResponse
//          || args[i] instanceof MultipartFile
//          || args[i] instanceof HttpSession) {
//        continue;
//      }
//      arguments[i] = args[i];
//    }
//    String paramter = "";
//    if (arguments != null) {
//      try {
//        paramter = JSONObject.toJSONString(arguments);
//      } catch (Exception e) {
//        paramter = arguments.toString();
//      }
//    }
//    return paramter;
//  }
//}
