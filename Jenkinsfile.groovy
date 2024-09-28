pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'npm install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'npm test'
            }
        }

        stage('Code Quality Analysis') {
            steps {
                echo 'Running code quality analysis...'
                sh 'npm install eslint'
                sh './node_modules/.bin/eslint .'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Example for deploying with Docker or Heroku
                sh 'docker build -t node-js-sample .'
                sh 'docker run -d -p 3000:3000 node-js-sample'
            }
        }
    }
    post {
        always {
            echo 'Pipeline execution complete!'
        }
        failure {
            echo 'Pipeline failed!'
        }
        success {
            echo 'Pipeline succeeded!'
        }
    }
}
