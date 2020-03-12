package com.gl.failureanalyzerdemo;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class MyFailureAnalyzer2 implements FailureAnalyzer {
    @Override
    public FailureAnalysis analyze(Throwable failure) {
        return new FailureAnalysis("custom generic msg", "action to do", failure);
    }
}
