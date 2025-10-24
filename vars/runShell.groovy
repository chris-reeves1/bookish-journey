def call(String command) {
    echo "[runShell] Executing: ${command}"
    try {
        sh script: command, returnStdout: true
    } catch (err) {
        error "[runShell] Failed: ${err}"
    }
}
