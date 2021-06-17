package com.github.ihave58.resolveintellijpath.services

import com.github.ihave58.resolveintellijpath.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
