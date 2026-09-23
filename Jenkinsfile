pipeline {

    agent any

    tools {
        maven 'Maven-3.9.16'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {

        success {
            echo 'Library Management System build completed successfully!'
        }

        failure {
            echo 'Library Management System build failed!'
        }
    }
}