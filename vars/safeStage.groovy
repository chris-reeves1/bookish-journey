def call(String name, Closure body) {
    stage(name) {
        try {
            body()
        } catch (err) {
            currentBuild.result = 'UNSTABLE'
            echo "Stage '${name}' failed but build will continue: ${err}"
        }
    }
}