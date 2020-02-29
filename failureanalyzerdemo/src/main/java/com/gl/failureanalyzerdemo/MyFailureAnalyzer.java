package com.gl.failureanalyzerdemo;

import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class MyFailureAnalyzer implements FailureAnalyzer {
    @Override
    public FailureAnalysis analyze(Throwable failure) {
        return new FailureAnalysis("My custom message", failure.getMessage(), failure);
    }
}
