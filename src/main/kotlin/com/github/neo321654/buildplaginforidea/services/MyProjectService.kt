package com.github.neo321654.buildplaginforidea.services

import com.github.neo321654.buildplaginforidea.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
