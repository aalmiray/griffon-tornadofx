package ${project_package}

import griffon.core.artifact.GriffonController
import griffon.core.controller.ControllerAction
import griffon.inject.MVCMember
import griffon.metadata.ArtifactProviderFor
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonController
import griffon.transform.Threading
import javax.annotation.Nonnull

@ArtifactProviderFor(GriffonController::class)
class ${project_class_name}Controller : AbstractGriffonController() {
    @set:[MVCMember Nonnull]
    lateinit var model: ${project_class_name}Model

    @ControllerAction
    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    fun click() {
        model.clickCount = model.clickCount + 1
    }
}