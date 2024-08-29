pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Building the code...'
                    // Example tool: Maven
                    echo 'Tool: Maven'
                }
            }
        }
        stage('Unit and Integration Tests') {
            steps {
                script {
                    echo 'Running unit and integration tests...'
                    // Example tools: JUnit, TestNG
                    echo 'Tools: JUnit, TestNG'
                }
            }
        }
        stage('Code Analysis') {
            steps {
                script {
                    echo 'Analyzing the code...'
                    // Example tool: SonarQube
                    echo 'Tool: SonarQube'
                }
            }
        }
        stage('Security Scan') {
            steps {
                script {
                    echo 'Running security scans...'
                    // Example tool: OWASP Dependency Check
                    echo 'Tool: OWASP Dependency Check'
                }
            }
        }
        stage('Deploy to Staging') {
            steps {
                script {
                    echo 'Deploying to staging server...'
                    // Example: Deploy to AWS EC2
                    echo 'Deploy to: AWS EC2'
                }
            }
        }
        stage('Integration Tests on Staging') {
            steps {
                script {
                    echo 'Running integration tests on staging...'
                    // Example tools: Selenium, Cucumber
                    echo 'Tools: Selenium, Cucumber'
                }
            }
        }
        stage('Deploy to Production') {
            steps {
                script {
                    echo 'Deploying to production server...'
                    // Example: Deploy to AWS EC2
                    echo 'Deploy to: AWS EC2'
                }
            }
        }
    }

    post {
        success {
            mail to: 's223890542@deakin.edu.au',
                 subject: "Build Successful: ${env.JOB_NAME} - Build #${env.BUILD_NUMBER}",
                 body: "The build was successful. Logs are attached.",
                 attachLog: true
        }
        failure {
            mail to: 's223890542@deakin.edu.au',
                 subject: "Build Failed: ${env.JOB_NAME} - Build #${env.BUILD_NUMBER}",
                 body: "The build has failed. Logs are attached.",
                 attachLog: true
        }
    }
}
