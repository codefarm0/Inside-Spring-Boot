package com.gl.failureanalyzerdemo;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class MyFailureAnalyzer extends AbstractFailureAnalyzer<NoSuchBeanDefinitionException>{
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, NoSuchBeanDefinitionException cause) {
        return new FailureAnalysis("no such bean found", "create the instance", rootFailure);
    }
}
