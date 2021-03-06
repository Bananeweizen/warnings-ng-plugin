package io.jenkins.plugins.analysis.core.model;

import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import javax.annotation.Nonnull;

import edu.hm.hafner.analysis.Report;

import hudson.model.Run;

/**
 * Empty build history.
 *
 * @author Ullrich Hafner
 */
public class NullAnalysisHistory implements History {
    @Override
    public Optional<ResultAction> getBaselineAction() {
        return Optional.empty();
    }

    @Override
    public Optional<AnalysisResult> getBaselineResult() {
        return Optional.empty();
    }

    @Override
    public Optional<AnalysisResult> getResult() {
        return Optional.empty();
    }

    @Override
    public Optional<Run<?, ?>> getBuild() {
        return Optional.empty();
    }

    @Override
    public Report getIssues() {
        return new Report();
    }

    @Nonnull
    @Override
    public Iterator<AnalysisResult> iterator() {
        return Collections.emptyIterator();
    }
}

