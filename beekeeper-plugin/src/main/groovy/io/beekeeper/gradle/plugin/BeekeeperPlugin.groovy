package io.beekeeper.gradle.plugin

import org.gradle.api.Plugin;
import org.gradle.api.Project
import io.beekeeper.formatting.FormatterPlugin

public class BeekeeperPlugin implements Plugin<Project> {

	@Override
	void apply(Project project) {
		applyConfigToProject(project)
	}

	void applyConfigToProject(Project project) {
		project.pluginManager.apply(FormatterPlugin.class)
	}
}
