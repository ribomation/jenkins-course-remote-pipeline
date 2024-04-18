def helper

pipeline {
    agent any
    environment {
        MESSAGE = 'Tjabba Habba'
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hi there, from a remote Jenkins pipeline'
                echo env.MESSAGE
            }
        }
        stage('helper') {
            steps {
                script {
                  helper = load 'helper.groovy'
                  helper.dummySteps('HoolaBandoola')
                }
            }
        }
    }
    post {
        success {
            echo 'Yup, we are done !!!'
        }
    }
}
