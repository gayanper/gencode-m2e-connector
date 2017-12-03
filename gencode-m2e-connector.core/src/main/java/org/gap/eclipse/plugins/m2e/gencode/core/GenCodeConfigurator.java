package org.gap.eclipse.plugins.m2e.gencode.core;

import java.io.File;
import java.util.Arrays;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;
import org.eclipse.m2e.jdt.AbstractSourcesGenerationProjectConfigurator;
import org.gap.eclipse.plugins.m2e.gencode.core.pref.Preferences;

public class GenCodeConfigurator extends AbstractSourcesGenerationProjectConfigurator {
	@Override
	protected File[] getSourceFolders(ProjectConfigurationRequest request, MojoExecution mojoExecution,
			IProgressMonitor monitor) throws CoreException {
		return Arrays
				.stream(Activator.getDefault().getPreferenceStore().getString(Preferences.SOURCE_FOLDERS).split(","))
				.map(p -> new File(request.getMavenProject().getBuild().getDirectory(), p))
				.filter(f -> f.exists())
				.toArray(size -> new File[size]);
	}

}
