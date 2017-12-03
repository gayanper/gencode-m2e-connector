package org.gap.eclipse.plugins.m2e.gencode.core.pref;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.ListEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.gap.eclipse.plugins.m2e.gencode.core.Activator;

public class GenCodePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	private static final String[] EMPTY = new String[0];

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors() {
		addField(new ListEditor(Preferences.SOURCE_FOLDERS, "Source Folders", getFieldEditorParent()) {

			@Override
			protected String[] parseString(String stringList) {
				if (stringList != null) {
					return stringList.split(",");
				}
				return EMPTY;
			}

			@Override
			protected String getNewInputObject() {
				InputDialog dialog = new InputDialog(getShell(), "Source Directory",
						"Source directory relative to build directory", "generated-sources/java",
						new IInputValidator() {

							@Override
							public String isValid(String newText) {
								if (newText != null && !newText.isEmpty()) {
									return null;
								}
								return "Input cannot be empty";
							}
						});

				if (dialog.open() == InputDialog.OK) {
					return dialog.getValue();
				}
				return null;
			}

			@Override
			protected String createList(String[] items) {
				return Arrays.stream(items).collect(Collectors.joining(","));
			}
		});
	}

}
