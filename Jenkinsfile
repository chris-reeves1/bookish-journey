pipeline{
    agent any
     parameters {
    choice(name: 'DEPLOY_ENV', choices: ['dev', 'staging', 'prod'], description: 'Target env')
  }
    stages{
        stage("Making a directory"){
            steps{
                sh "mkdir ~/jenkins-test || true"       
            }
        }
        stage("Adding a file"){
            steps{
                runShell('echo Building project...')
                sh "touch ~/jenkins-test/file.txt"
            }
        }
        stage('Build both parts') {
            steps {
                deploy(params.DEPLOY_ENV)
                dir('frontend') { sh 'echo building FE; pwd' }
                dir('backend')  { sh 'echo building BE; pwd' }
            }
        }
        stage('Greet'){
            steps {
                sayHello('Jenkins')
                safeStage('Flaky') { sh 'exit 1' }
            }
        }
    }
}
