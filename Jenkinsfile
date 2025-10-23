pipeline{
    agent any
    stages{
        stage("Making a directory"){
            steps{
                sh "mkdir ~/jenkins-test || true"       
            }
        }
        stage("Adding a file"){
            steps{
                sh "touch ~/jenkins-test/file.txt"
            }
        }
        stage('Build both parts') {
            steps {
                dir('frontend') { sh 'echo building FE; pwd' }
                dir('backend')  { sh 'echo building BE; pwd' }
            }
        }
        stage('Greet'){
            steps {
                sayHello('Jenkins')
            }
        }
    }
}
