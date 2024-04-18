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
    }
    post {
        success {
            echo 'Yup, we are done !!!'
        }
    }
}
