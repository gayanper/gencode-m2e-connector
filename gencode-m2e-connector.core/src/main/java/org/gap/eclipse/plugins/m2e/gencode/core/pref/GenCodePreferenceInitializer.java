package org.gap.eclipse.plugins.m2e.gencode.core.pref;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class GenCodePreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		final IPreferenceStore preferenceStore = org.gap.eclipse.plugins.m2e.gencode.core.Activator.getDefault()
				.getPreferenceStore();
		preferenceStore.setDefault(Preferences.SOURCE_FOLDERS, "generated-sources/java");
	}

}
