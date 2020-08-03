package com.cits.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ログ出力AOPクラス
 * @author imagepit
 */
@Aspect
@Component
public class LoggingAdvice {
	// ログオブジェクト
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// com.cits.controller以下の全てのクラスのすべてのメソッドが処理される前後に処理を差し込む
	@Around("execution(* com.cits.controller.*.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		String className = joinPoint.getSignature().getDeclaringType().getSimpleName();
        logger.info("============ 処理前:" + className + "." +  joinPoint.getSignature().getName()+"()"+"==============");
        for (Object o : joinPoint.getArgs()){ logger.info("引数の値:" + o); }
        Object result = joinPoint.proceed();
        logger.info("戻り値:"+result);
        logger.info("============ 処理後:" + className + "." + joinPoint.getSignature().getName()+"()"+"==============");
        return result;
	}
}
