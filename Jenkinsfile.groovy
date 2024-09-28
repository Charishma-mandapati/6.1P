pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Charishma-mandapati/6.1P.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
                bat 'docker build -t node-js-sample .'
                

            }
        }
        stage('Test') {
            steps {
               
                echo 'Running tests...'
                bat 'npm install --save-dev supertest'
                bat 'npm test'
            }
        }
        stage('Code Quality Analysis') {
            steps {
                echo 'Running code quality analysis...'
                // Add your code quality tools here (e.g., ESLint)
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Add your deployment steps here
            }
        }
    }
    post {
        always {
            echo 'Cleaning up...'
            // Add any cleanup steps if necessary
        }
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
