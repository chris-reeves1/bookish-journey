def call() {
    echo "Build #${env.BUILD_NUMBER} for job ${env.JOB_NAME}"
    echo "Git branch: ${env.GIT_BRANCH ?: 'unknown'}"
    echo "Triggered by: ${currentBuild.rawBuild.getCauseOfAction(hudson.model.Cause$UserIdCause)?.userName ?: 'system'}"
}