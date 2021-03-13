package io.jenkins.plugins.analysis.warnings;

import edu.hm.hafner.analysis.IssueParser;
import edu.hm.hafner.analysis.parser.RfLintParser;
import edu.umd.cs.findbugs.annotations.NonNull;

import org.kohsuke.stapler.DataBoundConstructor;
import org.jenkinsci.Symbol;
import hudson.Extension;

import io.jenkins.plugins.analysis.core.model.AnalysisModelParser;
import io.jenkins.plugins.analysis.core.model.IconLabelProvider;
import io.jenkins.plugins.analysis.core.model.StaticAnalysisLabelProvider;

/**
 * Provides a parser and customized messages for RfLint.
 *
 * @author Ullrich Hafner
 */
public class RfLint extends AnalysisModelParser {
    private static final long serialVersionUID = -8395238803254856424L;
    private static final String ID = "rflint";
    private static final String ICON_NAME = "robot-framework";

    /** Creates a new instance of {@link RfLint}. */
    @DataBoundConstructor
    public RfLint() {
        super();
        // empty constructor required for stapler
    }

    /** Descriptor for this static analysis tool. */
    @Symbol("rfLint")
    @Extension
    public static class Descriptor extends AnalysisModelParserDescriptor {
        /** Creates the descriptor instance. */
        public Descriptor() {
            super(ID);
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return Messages.Warnings_RFLint_ParserName();
        }

        @Override
        public StaticAnalysisLabelProvider getLabelProvider() {
            return new IconLabelProvider(getDisplayName(), getId(), getDescriptionProvider(), ICON_NAME);
        }

    }
}
