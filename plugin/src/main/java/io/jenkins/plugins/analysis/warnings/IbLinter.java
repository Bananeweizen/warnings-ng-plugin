package io.jenkins.plugins.analysis.warnings;

import edu.hm.hafner.analysis.parser.checkstyle.CheckStyleParser;

import org.kohsuke.stapler.DataBoundConstructor;
import org.jenkinsci.Symbol;
import hudson.Extension;

import io.jenkins.plugins.analysis.core.model.AnalysisModelParser;

/**
 * Provides a parser and customized messages for IbLinter. Delegates to {@link CheckStyleParser}.
 *
 * @author Paweł Madej
 */
public class IbLinter extends AnalysisModelParser {
    private static final long serialVersionUID = -1112001682237184947L;
    private static final String ID = "iblinter";

    /** Creates a new instance of {@link IbLinter}. */
    @SuppressWarnings("WeakerAccess")
    @DataBoundConstructor
    public IbLinter() {
        super();
        // empty constructor required for stapler
    }

    /** Descriptor for this static analysis tool. */
    @Symbol("ibLinter")
    @Extension
    public static class Descriptor extends AnalysisModelParserDescriptor {
        /** Creates the descriptor instance. */
        public Descriptor() {
            super(ID);
        }

        @Override
        public boolean canScanConsoleLog() {
            return false;
        }
    }
}
