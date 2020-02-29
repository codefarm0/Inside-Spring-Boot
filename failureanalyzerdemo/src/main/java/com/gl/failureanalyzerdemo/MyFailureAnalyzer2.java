package com.gl.failureanalyzerdemo;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class MyFailureAnalyzer2 extends AbstractFailureAnalyzer<NoSuchBeanDefinitionException>{
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, NoSuchBeanDefinitionException cause) {
        return new FailureAnalysis("my custom no bean", rootFailure.getMessage(), cause);
    }
}
