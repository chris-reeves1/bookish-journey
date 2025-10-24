def call(String environment) {
    switch (environment) {
        case 'dev':
            echo "Deploying to Dev environment..."
            sh 'echo Simulating dev deploy'
            break
        case 'staging':
            echo "Deploying to Staging..."
            sh 'echo Simulating staging deploy'
            break
        case 'prod':
            input message: "Deploy to PROD?", ok: "Yes, deploy"
            sh 'echo Simulating prod deploy'
            break
        default:
            error "Unknown environment: ${environment}"
    }
}