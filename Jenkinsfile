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

        stage('Deploy') {
            steps {
                bat '''
                taskkill /F /IM java.exe >nul 2>&1 || exit 0
                start "LibraryManagement" /B cmd /c "java -jar target\\LibraryManagementSystem-1.0-SNAPSHOT.jar --server.port=8081"
                '''
            }
        }
    }

    post {
        success {
            echo 'Library Management System deployed successfully!'
            echo 'Open: http://localhost:8081'
        }

        failure {
            echo 'Library Management System pipeline failed.'
        }
    }
}