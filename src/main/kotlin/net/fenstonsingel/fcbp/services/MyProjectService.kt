package net.fenstonsingel.fcbp.services

import com.intellij.openapi.project.Project
import net.fenstonsingel.fcbp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }

}
